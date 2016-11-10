package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.LoginPageElement;

public class LoginPage extends ActionDriver{
	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
	}
	
	public HomePage signIn(String username,String password) throws Exception{
		type(LoginPageElement.getUsername, username);
		type(LoginPageElement.getPassword, password);
		click(LoginPageElement.getRememberMeChkBx);
		click(LoginPageElement.getSignInBtn);
		return new HomePage(driver);
	}
	
	public HomePage signOut() throws Exception{
		click(LoginPageElement.signOutArrow);
		click(LoginPageElement.logoutBtn);
		return new HomePage(driver);
	}
	
}
