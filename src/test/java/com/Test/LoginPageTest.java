package com.Test;

import org.testng.annotations.Test;


import com.GenericLib.OpenAndCloseBrowser;

public class LoginPageTest extends OpenAndCloseBrowser {
	
	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(description=reproSteps,dataProviderClass=com.DataProvider.DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		com.Pages.LoginPage loginPage=new com.Pages.LoginPage(driver);
		com.Pages.HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
}
