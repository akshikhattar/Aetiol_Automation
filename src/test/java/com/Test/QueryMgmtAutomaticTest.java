package com.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.QueryMgmtAutomaticPage;

public class QueryMgmtAutomaticTest extends OpenAndCloseBrowser{

	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
	//Select study from DropDown
	public static final String reproStepsSelectStudyDD="1. Select change study dropdown<br>"
					+ "2. Click on study";
	@Parameters("studyName")
	@Test(priority=1,description=reproStepsSelectStudyDD)
	public void selectStudyDropdown(String studyName) throws Exception{
		QueryMgmtAutomaticPage automaticQM=new QueryMgmtAutomaticPage(driver);
		automaticQM.clickSelectStudyDropdown(studyName);		
	}
	
	@Test(priority=2)
	public void openQueryMgmt() throws InterruptedException{
		QueryMgmtAutomaticPage automaticQM=new QueryMgmtAutomaticPage(driver);
		automaticQM.openQueryMgmt();
		Thread.sleep(500);
	}
	
	//This step is functional only if default CRF is available
	public static final String reproStepsAutomaticQM="1. Click on Query Manangement<br>"
			+ "2. Click on Automatic<br>"
			+ "3. Select any form<br>"
			+ "4. Click on any field and add query<br>"
			+ "(Test to add hard check,soft check,missing)";
	@Test(priority=3,description=reproStepsAutomaticQM)
	public void automaticQuery() throws InterruptedException{
		QueryMgmtAutomaticPage automaticQM=new QueryMgmtAutomaticPage(driver);
		automaticQM.automaticQuery();
		automaticQM.hardCheck();
		automaticQM.softCheck();
		automaticQM.skipMissing();
	}
		
}
