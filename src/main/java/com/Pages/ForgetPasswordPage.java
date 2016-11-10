package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.LoginPageElement;

public class ForgetPasswordPage extends ActionDriver{

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}
	public ForgetPasswordPage changePassword(String username,String Password) throws InterruptedException{
		click(LoginPageElement.getForgetPassword);
		type(LoginPageElement.forgetPasswordUN,username);
		type(LoginPageElement.ForgetPasswordEmail, Password);
		click(LoginPageElement.ForgetPasswordSubmitBtn);
		Thread.sleep(500);
		driver.get("http://www.yopmail.com/en/");
		type(LoginPageElement.yopMailEmailtxt, username);
		click(LoginPageElement.yopMailClickBtn);
		String emailtext=getText(LoginPageElement.yopMailGetEmailText);
		System.out.println("Email Text: "+emailtext);
		return new ForgetPasswordPage(driver);
		
	}

}
