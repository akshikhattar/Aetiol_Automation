package com.PageObjectRepository;

import org.openqa.selenium.By;

public class User_DefineUserPageElement {

	private static String addUserBtn="//a[contains(text(),'Add User')]";
	private static String userNameTxt="//input[@id='txtName']";
	private static String addressTxt="//input[@id='txtAddress']";
	private static String emailIdTxt="//input[@id='txtEmailID']";
	private static String roleDD="//select[@id='txtRole']";
	private static String addUserImgBtn="//img[@id='imgUseradd']";
	
	public static By getAddUserBtn=By.xpath(addUserBtn);
	public static By getUserNameTxt=By.xpath(userNameTxt);
	public static By getAddressTxt=By.xpath(addressTxt);
	public static By getEmailIdTxt=By.xpath(emailIdTxt);
	public static By getRoleDD=By.xpath(roleDD);
	public static By getAddUserImgBtn=By.xpath(addUserImgBtn);
	public static By cancelAddUserImgBtn=By.xpath("//*[@id='imgUserCancel']");
	public static By noOfPages=By.xpath("//*[@class='pagination']/a");
	public static By noOfRowsInUsers=By.xpath("//table[@id='tblUser']//tr");
	public static By editAddImgBtn=By.xpath("//*[@id='imgedit6']");
	public static By searchUID=By.xpath("//*[@id='SOID']");
	public static By searchUN=By.xpath("//*[@id='SUsername']");
	public static By searchAdd=By.xpath("//*[@id='SAddress']");
	public static By searchRole=By.xpath("//*[@id='SRole']");
	public static By searchBtn=By.xpath("//*[@id='btnSearch']");
	public static By searchReset=By.xpath("//*[@id='btnReset']");
	public static By auditLogLnk=By.xpath("//a[contains(text(),'Audit Logs')]");
	public static By helpLnk=By.xpath("//a[(text()='Help?')]");
	public static By previouBtn=By.xpath("//button[contains(text(),'Previous')]");
	public static By commGpListBtn=By.xpath("//a[contains(text(),'Communication Group List')]");
}
