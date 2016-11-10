package com.Test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.Ms_StudyManagementOptionsPage;

public class MS_StudyManagementOptionsTest extends OpenAndCloseBrowser{

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
		Ms_StudyManagementOptionsPage MS_SMO=new Ms_StudyManagementOptionsPage(driver);
		MS_SMO.clickSelectStudyDropdown(studyName);		
	}
	
	@Test(priority=2)
	public void openManageStudy() throws InterruptedException{
		Ms_StudyManagementOptionsPage MS_SMO=new Ms_StudyManagementOptionsPage(driver);
		MS_SMO.openManageStudy();
		Thread.sleep(500);
	}
	
	//This step is functional only if default CRF is available
	public static final String reproStepsMS_DocMGMT="1. Click on Manage STudy<br>"
			+ "2. Click on Document Management<br>" 
			+ "(Only to upload documents in .jpg,.jpeg, .gif, .png, .csv, .xlsx, .xls, .doc, .docx, .txt, .pdf formats)<br>";
	@Test(priority=3,description=reproStepsMS_DocMGMT)
	public void studyMgmtOptions() throws InterruptedException, IOException{
		Ms_StudyManagementOptionsPage MS_SMO=new Ms_StudyManagementOptionsPage(driver);
		MS_SMO.openStudyMgmt();
		Thread.sleep(500);
		//MS_SMO.BulkApprovals();
		MS_SMO.Approvals();
	}
	
}
