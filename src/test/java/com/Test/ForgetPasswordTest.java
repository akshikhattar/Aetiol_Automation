package com.Test;

import org.testng.annotations.Test;


import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.ForgetPasswordPage;

public class ForgetPasswordTest extends OpenAndCloseBrowser {
	
	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(description=reproSteps,dataProviderClass=com.DataProvider.DataProviderForLoginPage.class,dataProvider="forgetPassword")
	public void verifyLogin(String username,String email) throws Exception{
		ForgetPasswordPage forgetPswd=new ForgetPasswordPage(driver);
		forgetPswd.changePassword(username, email);
	}
}
