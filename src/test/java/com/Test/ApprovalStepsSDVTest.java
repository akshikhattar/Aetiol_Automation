package com.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.DataProvider.DataProviderForApprovalSteps;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.ApprovalStepsSDVPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class ApprovalStepsSDVTest extends OpenAndCloseBrowser{

	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForApprovalSteps.class,dataProvider="credentialsProvider")
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
			ApprovalStepsSDVPage approvalStepsSDVPage=new ApprovalStepsSDVPage(driver);
			approvalStepsSDVPage.clickSelectStudyDropdown(studyName);		
		}
	
	@Test(priority=2)
	public void openApprovalStepsPage() throws InterruptedException{
		ApprovalStepsSDVPage approvalStepsSDVPage=new ApprovalStepsSDVPage(driver);
		approvalStepsSDVPage.openApprovalSteps();
		Thread.sleep(1000);
	}
	
	//SDV Verify for visit 1 form 1
	public static final String reproStepsApprovalStepsSDV="1. Click on Data Entry<br>"
			+ "2. Expand Visit and click on form<br>";
	@Test(priority=3,description=reproStepsApprovalStepsSDV)
	public void approvalStepsYes() throws InterruptedException{
		ApprovalStepsSDVPage approvalStepsSDVPage=new ApprovalStepsSDVPage(driver);
		approvalStepsSDVPage.approvalStepsSDVVerifyAllForms();
		//approvalStepsSDVPage.approvalStepsSDVVerify();
	}		
}