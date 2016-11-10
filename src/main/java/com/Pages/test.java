package com.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.UserPageElement;
import com.PageObjectRepository.User_DefineRolePageElement;

public class test extends ActionDriver{
	public String ChbId,id;
	public test(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//UserLogin
	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
		
	//Go to User>Define Role Page
	@Test(priority=1)
	public test defineRolePage() throws Exception{
		click(UserPageElement.getUser);
		click(UserPageElement.getDefineRole);
		click(User_DefineRolePageElement.getaddBtn);
		type(User_DefineRolePageElement.getEnterRoleTxt,"Enter Data");//type role name in Enter Role textbox	
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		Thread.sleep(1000);
		//String ChbId = null,id = null;
		//List of all Privileges in add Privilege link
		List<WebElement> allPrivilegesNames=driver.findElements(User_DefineRolePageElement.getListOfAllPrivilegesLbls);
		System.out.println("Size of privil: "+allPrivilegesNames.size());
		for(WebElement value:allPrivilegesNames)
		{
			//System.out.println("Privilege"+addPrivilege);
			System.out.println("values: "+value.getText());
		}
		return new test(driver);
	}

}
