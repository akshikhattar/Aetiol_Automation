package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.MSPageElement;

public class Ms_DocumentMgmtPage extends ActionDriver{

	public Ms_DocumentMgmtPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		windowHandles();
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public Ms_DocumentMgmtPage openManageStudy(){
		click(MSPageElement.ManageStudyLnk);	
		return new Ms_DocumentMgmtPage(driver);
	}
	public Ms_DocumentMgmtPage openDocumentMgmt(){
		click(MSPageElement.documentMgmtLnk);
		return new Ms_DocumentMgmtPage(driver);
	}
	public Ms_DocumentMgmtPage uploadDocument() throws InterruptedException, IOException{
		click(MSPageElement.browserFile);Thread.sleep(2000);
		//Upload files using AutoIT
		Runtime.getRuntime().exec("D:/AutoIt/DocMgmtFileUploadChrome.exe");
		Thread.sleep(2000);
		click(MSPageElement.uploadBtn);
		return new Ms_DocumentMgmtPage(driver);
	}
}
