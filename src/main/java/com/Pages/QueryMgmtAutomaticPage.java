package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.QueryMgmtPageElements;

public class QueryMgmtAutomaticPage extends ActionDriver{

	public QueryMgmtAutomaticPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		windowHandles();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	
	public QueryMgmtAutomaticPage openQueryMgmt(){
		click(QueryMgmtPageElements.queryMgmtLnk);
		return new QueryMgmtAutomaticPage(driver);
	}
	
	public QueryMgmtAutomaticPage automaticQuery() throws InterruptedException{
		click(QueryMgmtPageElements.automaticQuery);
		selectDropDownByIndex(QueryMgmtPageElements.automaticSelectFormDD, 1);Thread.sleep(2000);
		click(QueryMgmtPageElements.firstElementCalorTxt);
		return new QueryMgmtAutomaticPage(driver);
	}
	public QueryMgmtAutomaticPage hardCheck(){
		click(QueryMgmtPageElements.hardcheckEditImgBtn);
		type(QueryMgmtPageElements.hardCheckMaxtxt,"8");
		type(QueryMgmtPageElements.hardCheckMintxt,"1");
		click(QueryMgmtPageElements.hardCheckalertChb);
		click(QueryMgmtPageElements.hardcheckQueryChb);
		selectDropDownByIndex(QueryMgmtPageElements.hardcheckCommGpDD, 1);
		type(QueryMgmtPageElements.hardcheckmessageTxt,"Name can't be left blank. Entyer name in range of 1 to 8");
		selectDropDownByIndex(QueryMgmtPageElements.hardcheckStatusDD, 1);
		click(QueryMgmtPageElements.hardcheckSaveImgBtn);
		acceptAlert();
		return new QueryMgmtAutomaticPage(driver);
	}
	public QueryMgmtAutomaticPage softCheck(){
		click(QueryMgmtPageElements.softcheckEditImgBtn);
		type(QueryMgmtPageElements.softCheckMaxtxt,"8");
		type(QueryMgmtPageElements.softCheckMintxt,"1");
		click(QueryMgmtPageElements.softCheckalertChb);
		click(QueryMgmtPageElements.softcheckQueryChb);
		selectDropDownByIndex(QueryMgmtPageElements.softcheckCommGpDD, 1);
		type(QueryMgmtPageElements.softcheckmessageTxt,"Name can't be left blank. Entyer name in range of 1 to 8");
		selectDropDownByIndex(QueryMgmtPageElements.softcheckStatusDD, 1);
		click(QueryMgmtPageElements.softcheckSaveImgBtn);
		acceptAlert();
		return new QueryMgmtAutomaticPage(driver);
	}
	public QueryMgmtAutomaticPage skipMissing(){
		click(QueryMgmtPageElements.skipMissingEditImgBtn);
		click(QueryMgmtPageElements.skipMissingalertChb);
		click(QueryMgmtPageElements.skipMissingQueryChb);
		selectDropDownByIndex(QueryMgmtPageElements.skipMissingCommGpDD, 1);
		type(QueryMgmtPageElements.skipMissingmessageTxt,"Name can't be left blank. Entyer name in range of 1 to 8");
		selectDropDownByIndex(QueryMgmtPageElements.skipMissingStatusDD, 1);
		click(QueryMgmtPageElements.skipMissingSaveImgBtn);
		acceptAlert();
		return new QueryMgmtAutomaticPage(driver);
	}

}
