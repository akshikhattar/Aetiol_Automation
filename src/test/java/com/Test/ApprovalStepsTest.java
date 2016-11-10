package com.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.ApprovalStepsPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class ApprovalStepsTest extends OpenAndCloseBrowser{

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
			ApprovalStepsPage approvalStepsPage=new ApprovalStepsPage(driver);
			approvalStepsPage.clickSelectStudyDropdown(studyName);		
		}
	
	@Test(priority=2)
	public void openApprovalStepsPage() throws InterruptedException{
		ApprovalStepsPage approvalStepsPage=new ApprovalStepsPage(driver);
		approvalStepsPage.openApprovalSteps();
		Thread.sleep(500);
	}
	
	//Configure approval steps-Yes
	public static final String reproStepsApprovalSteps="1. Click on Approval Steps<br>"
			+ "2. Click Yes radio btn<br>";
	@Test(priority=3,description=reproStepsApprovalSteps)
	public void approvalStepsYes() throws InterruptedException{
		ApprovalStepsPage approvalStepsPage=new ApprovalStepsPage(driver);
		approvalStepsPage.approvalStepsYes();
	}
	
	//Configure approval steps-No
	public static final String reproStepsApprovalStepsNo="1. Click on Approval Steps<br>"
			+ "2. Click No radio btn<br>";
	@Test(priority=3,description=reproStepsApprovalSteps)
	public void approvalStepsNo() throws InterruptedException{
		ApprovalStepsPage approvalStepsPage=new ApprovalStepsPage(driver);
		approvalStepsPage.approvalStepsNo();
	}
	
	//Approval Steps - Audit Log
	public static final String reproStepsApprovalStepsAuditLog="1. Click on Approval Steps<br>"
			+ "2. Click on Audit Log<br>";
	@Test(priority=3,description=reproStepsApprovalStepsAuditLog)
	public void approvalStepsAuditLog() throws InterruptedException{
		ApprovalStepsPage approvalStepsPage=new ApprovalStepsPage(driver);
		approvalStepsPage.approvalStepsNo();
	}
		
}