package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.StudyConfigurationPageElement;
import com.PageObjectRepository.UserPageElement;

public class PrivilegesPage extends ActionDriver{

	public PrivilegesPage(WebDriver driver) {
		super(driver);
	}
	public PrivilegesPage defineUserPage() throws InterruptedException{		
		click(UserPageElement.getUser);
		click(UserPageElement.getDefineUser);
		return new PrivilegesPage(driver);
	} 
	//assign user
	public PrivilegesPage assignUsers() throws InterruptedException{
		click(StudyConfigurationPageElement.assignUserLnk);
		Thread.sleep(1000);
		click(StudyConfigurationPageElement.assignUserBtn);
		Thread.sleep(1000);
		int size=sizeofdropdown(StudyConfigurationPageElement.selectRoleDD);
		for(int i=1;i<size;i++){
			selectDropDownByIndex(StudyConfigurationPageElement.selectRoleDD, i);
			selectDropDownByIndex(StudyConfigurationPageElement.selectUserNameDD, 1);click(StudyConfigurationPageElement.siteListLnk);
			Thread.sleep(1500);
			click(StudyConfigurationPageElement.siteListFirstChb);
			click(StudyConfigurationPageElement.siteListSaveBtn);
			Thread.sleep(500);
			click(StudyConfigurationPageElement.assignUserImgBtn);
			acceptAlert();
			Thread.sleep(2000);
		}
		return new PrivilegesPage(driver);		
	}

}
