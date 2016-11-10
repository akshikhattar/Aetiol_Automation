package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.QueryMgmtPageElements;

public class QueryMgmtSkipPage extends ActionDriver{

	public QueryMgmtSkipPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	
	public QueryMgmtSkipPage openQueryMgmt(){
		click(QueryMgmtPageElements.queryMgmtLnk);
		return new QueryMgmtSkipPage(driver);
	}

	public QueryMgmtSkipPage skipQuery(){
		click(QueryMgmtPageElements.skipQuery);
		return new QueryMgmtSkipPage(driver);
	}
	
	public QueryMgmtSkipPage addSkipQuery(){
		click(QueryMgmtPageElements.addSkipQueryBtn);
		selectDropDownByIndex(QueryMgmtPageElements.skipSelectFormDD, 3);
		selectDropDownByIndex(QueryMgmtPageElements.skipSlectVisitDD, 0);
		type(QueryMgmtPageElements.skipNameTxt, "Skip subject initials when site id is 1");
		selectDropDownByIndex(QueryMgmtPageElements.skipSelVariableDD, 1);
		type(QueryMgmtPageElements.skipSelectValueTxt, "Dan");
		selectDropDownByIndex(QueryMgmtPageElements.selectSkipVarDD, 2);
		click(QueryMgmtPageElements.skipAddImgBtn);
		return new QueryMgmtSkipPage(driver);
	}
}
