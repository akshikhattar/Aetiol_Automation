package com.PageObjectRepository;

import org.openqa.selenium.By;

public class UserPageElement {

	private static String user="//a[@id='IdUs']";
	private static String defineRole="//a[@id='IdDF']";
	private static String defineUser="//a[@id='IdDU']";
	
	public static By getUser=By.xpath(user);
	public static By getDefineUser=By.xpath(defineUser);
	public static By getDefineRole=By.xpath(defineRole);
	
}
