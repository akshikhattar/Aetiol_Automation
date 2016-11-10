package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.QueryMgmtPageElements;

public class QueryMgmtCustomPage extends ActionDriver{

	public QueryMgmtCustomPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	
	public QueryMgmtCustomPage openQueryMgmt(){
		click(QueryMgmtPageElements.queryMgmtLnk);
		return new QueryMgmtCustomPage(driver);
	}
	public QueryMgmtCustomPage customQuery(){
		click(QueryMgmtPageElements.customQuery);
		return new QueryMgmtCustomPage(driver);
	}
	public QueryMgmtCustomPage createCustomQuery(){
		click(QueryMgmtPageElements.addCustomqueryBtn);
		selectDropDownByIndex(QueryMgmtPageElements.customCommGpDD, 1);
		type(QueryMgmtPageElements.customQueryNameTxt, "Query1");
		type(QueryMgmtPageElements.customDescriptionTxt, "Custom if name is equal in screen and baseline");
		selectDropDownByIndex(QueryMgmtPageElements.customStatusDD, 0);
		selectDropDownByIndex(QueryMgmtPageElements.customSelFormDD, 2);
		selectDropDownByIndex(QueryMgmtPageElements.customSelVarDD, 0);
		selectDropDownByIndex(QueryMgmtPageElements.customSelVisitDD, 0);
		selectDropDownByIndex(QueryMgmtPageElements.customCondition1DD, 1);
		selectDropDownByIndex(QueryMgmtPageElements.customSelForm1DD, 3);
		selectDropDownByIndex(QueryMgmtPageElements.customSelVar1DD, 4);
		selectDropDownByIndex(QueryMgmtPageElements.customSelVisit1DD, 0);
		click(QueryMgmtPageElements.addCndtnImgBtn1);
		selectDropDownByIndex(QueryMgmtPageElements.customSelFormDD, 2);//Due to bug selecting form again. Remove it once resolved
		selectDropDownByIndex(QueryMgmtPageElements.customCondition2DD, 1);
		selectDropDownByIndex(QueryMgmtPageElements.customSelForm2DD, 4);
		selectDropDownByIndex(QueryMgmtPageElements.customSelVar2DD, 16);
		selectDropDownByIndex(QueryMgmtPageElements.customSelVisit2DD, 0);
		click(QueryMgmtPageElements.SaveCustomQryBtn);
		acceptAlert();
		return new QueryMgmtCustomPage(driver);
	}

}
