package com.Test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.DataEntryPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class DataEntryTest extends OpenAndCloseBrowser{

	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
	public static final String reproStepsHome="1. Select change study dropdown<br>"
			+ "2. Click on Audiogram";
	//Provide study name from TestNG in below parameter's value
	@Parameters("studyName")
	@Test(priority=1,description=reproStepsHome)
	public void selectStudyDropdown(String studyName) throws Exception{
		DataEntryPage dataEntry=new DataEntryPage(driver);
		dataEntry.clickSelectStudyDropdown(studyName);
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void openReports() throws InterruptedException{
		DataEntryPage dataEntry=new DataEntryPage(driver);
		dataEntry.openDataEntry();
		Thread.sleep(500);
	}
	
	//This step is for creating new subject
	public static final String reproStepsMS_DataEntry="1. Click on Data Entry<br>"
			+ "2. Click on Add Subject<br>";
	@Test(priority=3,description=reproStepsMS_DataEntry)
	public void AddSubject() throws InterruptedException, IOException{
		DataEntryPage dataEntry=new DataEntryPage(driver);
		dataEntry.AddSubject();
		Thread.sleep(500);
	}
	
}
