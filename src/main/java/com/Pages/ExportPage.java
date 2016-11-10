package com.Pages;

import org.openqa.selenium.WebDriver;
import com.GenericLib.ActionDriver;
import com.PageObjectRepository.ExportPageElement;
import com.PageObjectRepository.HomePageElement;

public class ExportPage extends ActionDriver{

	public ExportPage(WebDriver driver) {
		super(driver);
	}

	public ExportPage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		windowHandles();	
		Thread.sleep(500);
		return new ExportPage(driver);
	}
	public ExportPage openExport() throws InterruptedException{
		click(ExportPageElement.exportLnk);	
		Thread.sleep(1000);
		return new ExportPage(driver);
	}
	public ExportPage exportFunctionality(){
		selectDropDownByIndex(ExportPageElement.studyDD, 1);
		selectDropDownByIndex(ExportPageElement.siteDD, 1);
		selectDropDownByIndex(ExportPageElement.investigatorDD,1);
		selectDropDownByIndex(ExportPageElement.subjectDD,1);
		selectDropDownByIndex(ExportPageElement.visitDD,1);
		selectDropDownByIndex(ExportPageElement.visitDateDD,1);
		selectDropDownByIndex(ExportPageElement.fileFormatDD,1);
		click(ExportPageElement.exportBtn);
		return new ExportPage(driver);
	}
}
