package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.ReportPageElements;

public class Reports_QueriesRprtPage extends ActionDriver{

	public Reports_QueriesRprtPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();
		//windowHandles();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public Reports_QueriesRprtPage openReports(){
		click(ReportPageElements.reportsLnk);	
		return new Reports_QueriesRprtPage(driver);
	}
	public Reports_QueriesRprtPage openQueriesRprt(){
		click(ReportPageElements.QueriesRprtLnk);
		return new Reports_QueriesRprtPage(driver);
	}
	public Reports_QueriesRprtPage generateReports() throws InterruptedException{
		Thread.sleep(1000);
		selectDropDownByIndex(ReportPageElements.QRvisitDD, 1);
		selectDropDownByIndex(ReportPageElements.QRformsDD, 1);
		selectDropDownByIndex(ReportPageElements.QRassignedGpDD, 1);
		selectDropDownByIndex(ReportPageElements.QRqueryTypeDD, 0);
		click(ReportPageElements.QRgenerateBtn);
		return new Reports_QueriesRprtPage(driver);
	}
	public Reports_QueriesRprtPage downloadReports(){
		//Excel
		selectDropDownByIndex(ReportPageElements.QRfileFormatDD, 0);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//CSV
		selectDropDownByIndex(ReportPageElements.QRfileFormatDD, 1);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Text
		selectDropDownByIndex(ReportPageElements.QRfileFormatDD, 2);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//Pdf
		selectDropDownByIndex(ReportPageElements.QRfileFormatDD, 3);
		click(ReportPageElements.SDSRDownloadRprtBtn);
		//XML
		selectDropDownByIndex(ReportPageElements.QRfileFormatDD, 4);
		click(ReportPageElements.QRdownloadRprtBtn);
		return new Reports_QueriesRprtPage(driver);
	}
}
