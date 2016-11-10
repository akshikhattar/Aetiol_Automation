package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.ReportPageElements;

public class Reports_AFSRPage extends ActionDriver{

	public Reports_AFSRPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		//windowHandles();	
		acceptAlert();
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public Reports_AFSRPage openReports(){
		click(ReportPageElements.reportsLnk);	
		return new Reports_AFSRPage(driver);
	}
	public Reports_AFSRPage openAFSR(){
		click(ReportPageElements.A_FieldStatusRprtLnk);
		return new Reports_AFSRPage(driver);
	}
	public Reports_AFSRPage generateReports() throws InterruptedException{
		Thread.sleep(2000);
		selectDropDownByIndex(ReportPageElements.AFSRsiteDD, 1);
		selectDropDownByIndex(ReportPageElements.AFSRgroupDD, 1);
		selectDropDownByIndex(ReportPageElements.AFSRVisitsDD, 1);
		selectDropDownByIndex(ReportPageElements.AFSRformsDD, 1);
		selectDropDownByIndex(ReportPageElements.AFSRsubjectsDD, 1);
		selectDropDownByIndex(ReportPageElements.AFSRfieldStatusDD, 1);
		click(ReportPageElements.AFSRgenerateBtn);
		return new Reports_AFSRPage(driver);
	}
	public Reports_AFSRPage downloadReports(){
		//Excel
		selectDropDownByIndex(ReportPageElements.AFSRfileformatDD, 0);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//CSV
		selectDropDownByIndex(ReportPageElements.AFSRfileformatDD, 1);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Text
		selectDropDownByIndex(ReportPageElements.AFSRfileformatDD, 2);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Pdf
		selectDropDownByIndex(ReportPageElements.AFSRfileformatDD, 3);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//XML
		selectDropDownByIndex(ReportPageElements.AFSRfileformatDD, 4);
		click(ReportPageElements.AFSRDownloadRprtBtn);
		return new Reports_AFSRPage(driver);
	}
}
