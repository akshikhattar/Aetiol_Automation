package com.PageObjectRepository;

import org.openqa.selenium.By;

public class LoginPageElement {

	private static String username="//*[@id='UserName']";
	private static String password="//*[@id='Password']";
	private static String SignInBtn="//*[@id='btnSubmit']";
	private static String RememberMeCheckbox="//*[@id='RememberMe']";
	private static String forgetPassword="Forgot Password?";
	private static String needHelp="Need Help?";
	private static String wrapperText="(//*[@id='login-wrapper']//p)[2]";
	private static String imageAetiol="//*[@id='login-wrapper']//img";
	public static By signOutArrow=By.xpath("//a[@class='account']");
	public static By logoutBtn=By.xpath("//a[contains(text(),'Log-Out')]");
	
	
	public static By getUsername=By.xpath(username);
	public static By getPassword=By.xpath(password);
	public static By getSignInBtn=By.xpath(SignInBtn);
	public static By getRememberMeChkBx=By.xpath(RememberMeCheckbox);
	public static By getForgetPassword=By.linkText(forgetPassword);
	public static By getNeedHelp=By.linkText(needHelp);
	public static By getWrapperText=By.xpath(wrapperText);
	public static By getImageAetiol=By.xpath(imageAetiol);
	public static By getErrorMessage=By.xpath("//*[@id='form1']//tr[4]//span");
	
	//Forget Password
	public static By forgetPasswordUN=By.xpath("//*[@id='UserName']");
	public static By ForgetPasswordEmail=By.xpath("//*[@id='Email']");
	public static By ForgetPasswordSubmitBtn=By.xpath("//*[@id='btnSubmit']");
	
	//YopMail
	public static By yopMailEmailtxt=By.xpath("//*[@id='login']");
	public static By yopMailClickBtn=By.xpath("//input[@value='Check Inbox']");
	public static By yopMailGetEmailText=By.xpath(".//*[@id='mailmillieu']/div[2]");
	
}
