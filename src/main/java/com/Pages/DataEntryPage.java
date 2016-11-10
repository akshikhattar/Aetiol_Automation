package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.DataEntryPageElements;
import com.PageObjectRepository.HomePageElement;

public class DataEntryPage extends ActionDriver{

	public static String subjId,siteId;
	public DataEntryPage(WebDriver driver) {
		super(driver);
	}
	public DataEntryPage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		//windowHandles();	
		acceptAlert();
		Thread.sleep(500);
		return new DataEntryPage(driver);
	}
	public DataEntryPage openDataEntry(){
		click(DataEntryPageElements.DataEntryLnk);
		return new DataEntryPage(driver);
	}
	public DataEntryPage AddSubject() throws InterruptedException{
		scrollDown();
		Thread.sleep(1000);
		mouseOver(DataEntryPageElements.DEaddSubjectBtn);
		Thread.sleep(1000);
		click(DataEntryPageElements.DEaddSingleSubject);
		Thread.sleep(1000);
		subjId=getText(DataEntryPageElements.subjectId);
		System.out.println("Subj Id: "+subjId);
		type(DataEntryPageElements.subjectInitialsTxt, "sam");
		selectDropDownByIndex(DataEntryPageElements.statusDD, 1);
		selectDropDownByIndex(DataEntryPageElements.siteDD, 1);
		siteId=getSelectedOptionDD(DataEntryPageElements.siteDD);
		selectDropDownByIndex(DataEntryPageElements.groupDD, 1);
		click(DataEntryPageElements.createBtn);
		Thread.sleep(1000);
		By subjIdToBeClicked=By.xpath("//a[contains(text(),'"+subjId+"')]");
		scrollDown();
		Thread.sleep(1000);
		click(subjIdToBeClicked);
		
		return new DataEntryPage(driver);
	}
	public DataEntryPage formDataEntry(){
		
		System.out.println();
		return new DataEntryPage(driver);
	}
	public String getSubId() {
		System.out.println("subjId: "+subjId);		
	     return subjId;
	}
	public String getSiteId() {
		System.out.println("siteId: "+siteId);		
	     return siteId;
	}

}
