package com.Test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.Reports_AMLRPage;

public class Reports_AMLRTest extends OpenAndCloseBrowser{

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
		Reports_AMLRPage AMLR=new Reports_AMLRPage(driver);
		AMLR.clickSelectStudyDropdown(studyName);
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void openReports() throws InterruptedException{
		Reports_AMLRPage AMLR=new Reports_AMLRPage(driver);
		AMLR.openReports();
		Thread.sleep(500);
	}
	
	//This step is functional only if default CRF is available
	public static final String reproStepsMS_DocMGMT="1. Click on Manage STudy<br>"
			+ "2. Click on Document Management<br>" 
			+ "(Only to upload documents in .jpg,.jpeg, .gif, .png, .csv, .xlsx, .xls, .doc, .docx, .txt, .pdf formats)<br>";
	@Test(priority=3,description=reproStepsMS_DocMGMT)
	public void documentMGMT() throws InterruptedException, IOException{
		Reports_AMLRPage AMLR=new Reports_AMLRPage(driver);
		AMLR.openAMLR();
		Thread.sleep(500);
		AMLR.generateReports();
		AMLR.downloadReports();
	}
	
}
