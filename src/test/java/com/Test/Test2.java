package com.Test;

import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.test;

public class Test2 extends OpenAndCloseBrowser{
		//UserLogin
		public static final String reproSteps="1. Type valid credentials<br>"
				+ "2. Click on login button";
		@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
		public void verifyLogin(String username,String password) throws Exception{
			com.Pages.LoginPage loginPage=new com.Pages.LoginPage(driver);
			com.Pages.HomePage homePage=loginPage.signIn(username, password);
			assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
		}		
		//Go to User>Define User Page
		@Test(priority=1)
		public void defineUserPage() throws Exception{
			test defineUser=new test(driver);
			defineUser.defineRolePage();
		}
		
}
