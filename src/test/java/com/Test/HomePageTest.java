package com.Test;

import org.testng.annotations.Test;
import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.HomePage;

public class HomePageTest extends OpenAndCloseBrowser{

	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		com.Pages.LoginPage loginPage=new com.Pages.LoginPage(driver);
		com.Pages.HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
	/*public static final String reproStepsHome="1. Select change study dropdown<br>"
			+ "2. Click on Audiogram";
	//Provide study name from TestNG in below parameter's value
	@Parameters("studyName")
	@Test(priority=2,description=reproStepsHome)
	public void selectStudyDropdown(String studyName) throws Exception{
		HomePage homePage=new HomePage(driver);
		homePage.clickSelectStudyDropdown(studyName);
	}*/
	//Navigate on all links of HomePage
	@Test(priority=1)
	public void navigateOnLinks() throws Exception{
		HomePage homePage=new HomePage(driver);
		homePage.navigateOnHomePageLinks();
	}
}
