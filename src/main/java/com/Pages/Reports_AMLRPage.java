package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.ReportPageElements;

public class Reports_AMLRPage extends ActionDriver{

	public Reports_AMLRPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();
		//windowHandles();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public Reports_AMLRPage openReports(){
		click(ReportPageElements.reportsLnk);	
		return new Reports_AMLRPage(driver);
	}
	public Reports_AMLRPage openAMLR(){
		click(ReportPageElements.A_monitorLogRprtLnk);
		return new Reports_AMLRPage(driver);
	}
	public Reports_AMLRPage generateReports() throws InterruptedException{
		Thread.sleep(2000);
		selectDropDownByIndex(ReportPageElements.AMLRsiteDD, 1);
		selectDropDownByIndex(ReportPageElements.AMLRgroupDD, 1);
		selectDropDownByIndex(ReportPageElements.AMLRvisitDD, 1);
		click(ReportPageElements.AMLRgenerateBtn);
		return new Reports_AMLRPage(driver);
	}
	public Reports_AMLRPage downloadReports(){
		//Excel
		selectDropDownByIndex(ReportPageElements.AMLRfileFormatDD, 0);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//CSV
		selectDropDownByIndex(ReportPageElements.AMLRfileFormatDD, 1);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Text
		selectDropDownByIndex(ReportPageElements.AMLRfileFormatDD, 2);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Pdf
		selectDropDownByIndex(ReportPageElements.AMLRfileFormatDD, 3);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//XML
		selectDropDownByIndex(ReportPageElements.AMLRfileFormatDD, 4);
		click(ReportPageElements.AMLRdownloadRprtBtn);
		return new Reports_AMLRPage(driver);
	}
}
