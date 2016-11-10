package com.Test;

import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.ExportPage;

public class ExportTest extends OpenAndCloseBrowser{

	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		com.Pages.LoginPage loginPage=new com.Pages.LoginPage(driver);
		com.Pages.HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
	@Test(priority=1)
	public void navigateOnLinks() throws InterruptedException{
		ExportPage export=new ExportPage(driver);
		export.openExport();
		export.exportFunctionality();
	}
}
