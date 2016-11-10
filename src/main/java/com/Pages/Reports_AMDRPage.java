package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.ReportPageElements;

public class Reports_AMDRPage extends ActionDriver{

	public Reports_AMDRPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();
		//windowHandles();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public Reports_AMDRPage openReports(){
		click(ReportPageElements.reportsLnk);	
		return new Reports_AMDRPage(driver);
	}
	public Reports_AMDRPage openAMDR(){
		click(ReportPageElements.A_MissingDataRprtLnk);
		return new Reports_AMDRPage(driver);
	}
	public Reports_AMDRPage generateReports() throws InterruptedException{
		Thread.sleep(2000);
		selectDropDownByIndex(ReportPageElements.AMDRsiteDD, 1);
		selectDropDownByIndex(ReportPageElements.AMDRgroupDD, 1);
		selectDropDownByIndex(ReportPageElements.AMDRvisitDD, 1);
		selectDropDownByIndex(ReportPageElements.AMDRformsDD, 1);
		selectDropDownByIndex(ReportPageElements.AMDRsubjectDD, 1);
		click(ReportPageElements.AMDRgenerateBtn);
		return new Reports_AMDRPage(driver);
	}
	public Reports_AMDRPage downloadReports(){
		//Excel
		selectDropDownByIndex(ReportPageElements.AMDRfileFormatDD, 0);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//CSV
		selectDropDownByIndex(ReportPageElements.AMDRfileFormatDD, 1);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Text
		selectDropDownByIndex(ReportPageElements.AMDRfileFormatDD, 2);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Pdf
		selectDropDownByIndex(ReportPageElements.AMDRfileFormatDD, 3);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//XML
		selectDropDownByIndex(ReportPageElements.AMDRfileFormatDD, 4);
		click(ReportPageElements.AMDRdownloadRprtBtn);
		return new Reports_AMDRPage(driver);
	}
}
