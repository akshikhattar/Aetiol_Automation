package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.ReportPageElements;

public class Reports_sdsPage extends ActionDriver{

	public Reports_sdsPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();
		//windowHandles();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public Reports_sdsPage openReports(){
		click(ReportPageElements.reportsLnk);	
		return new Reports_sdsPage(driver);
	}
	public Reports_sdsPage openSDS(){
		click(ReportPageElements.subjDataSmryRprtLnk);
		return new Reports_sdsPage(driver);
	}
	public Reports_sdsPage generateReports() throws InterruptedException{
		Thread.sleep(1000);
		selectDropDownByIndex(ReportPageElements.SDSRsiteDD, 1);
		selectDropDownByIndex(ReportPageElements.SDSRsubjectDD, 2);
		selectDropDownByIndex(ReportPageElements.SDSRstatusDD, 1);
		selectDropDownByIndex(ReportPageElements.SDSRVisitsDD, 1);
		selectDropDownByIndex(ReportPageElements.SDSRformsDD, 1);
		click(ReportPageElements.SDSRgenerateBtn);
		return new Reports_sdsPage(driver);
	}
	public Reports_sdsPage downloadReports(){
		//Excel
		selectDropDownByIndex(ReportPageElements.SDSRfileformatDD, 0);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//CSV
		selectDropDownByIndex(ReportPageElements.SDSRfileformatDD, 1);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Text
		selectDropDownByIndex(ReportPageElements.SDSRfileformatDD, 2);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Pdf
		selectDropDownByIndex(ReportPageElements.SDSRfileformatDD, 3);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//XML
		selectDropDownByIndex(ReportPageElements.SDSRfileformatDD, 4);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		return new Reports_sdsPage(driver);
	}
}
