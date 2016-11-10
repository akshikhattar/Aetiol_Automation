package com.PageObjectRepository;

import org.openqa.selenium.By;

public class User_DefineRolePageElement {

	private static String addCommunicationGroupBtn="//button[@id='btnAddComGroup']";
	private static String addBtn="//button[@id='btnAdd']";
	private static String addCommGroupNameTxt="//input[@id='ComGroup']";
	private static String addcommGpSaveBtn="//TD/BUTTON[1]";
	private static String addcommGpCancelBtn="//TD/BUTTON[2]";
	private static String enterRoletxt="//input[@id='RoleName']";
	private static String addPrivilegelnk="//a[@id='lnkPlg']";
	private static String selectGroupLnk="//a[@id='lnkPlg1']";
	private static String saveImgBtn="//img[contains(@alt, 'Save')]";
	private static String listOfAllPrivileges="//*[@id='privilegetable']//tr";
	private static String listOfAllPrivilegesLbls="//table[@id='privilegetable']//tr//span[2]";
	private static String allPrivilegesChbvalues="//table[@id='privilegetable']//tr//span[2]/following-sibling::input";
	private static String addPrivilegeSaveBtn="//table[@id='privilegetable']//tr[18]//button[1]";
	private static String selectGpLbls="//table[@id='tblGrp']//input";
	private static String selectGpAndSaveBtn="//button[@id='btnSave']";
		
	public static By getAddCommunicationGroupBtn=By.xpath(addCommunicationGroupBtn);
	public static By getaddBtn=By.xpath(addBtn);
	public static By getAddCommGroupNameTxt=By.xpath(addCommGroupNameTxt);
	public static By getAddcommGpSaveBtn=By.xpath(addcommGpSaveBtn);
	public static By getAddcommGpCancelBtn=By.xpath(addcommGpCancelBtn);
	public static By getEnterRoleTxt=By.xpath(enterRoletxt);
	public static By getAddPrivilegelnk=By.xpath(addPrivilegelnk);
	public static By getSelectGroupLnk=By.xpath(selectGroupLnk);
	public static By getSaveImgBtn=By.xpath(saveImgBtn);
	public static By getListOfAllPrivileges=By.xpath(listOfAllPrivileges);
	public static By getListOfAllPrivilegesLbls=By.xpath(listOfAllPrivilegesLbls);
	public static By getAllPrivilegesChbvalues=By.xpath(allPrivilegesChbvalues);
	public static By getAddPrivilegeSaveBtn=By.xpath(addPrivilegeSaveBtn);
	public static By getSelectGpLbls=By.xpath(selectGpLbls);
	public static By getSelectGpAndSaveBtn=By.xpath(selectGpAndSaveBtn);
	public static By editaddprivilegechb=By.xpath("//*[@id='cb1']");
	public static By editaddprivilegechb1=By.xpath("//*[@id='CommGrpId110']");
	public static By noOfPages=By.xpath("//*[@id='pageNavPosition']/a[@id]");
	public static By noOfRowsInRoles=By.xpath("//*[@id='tblRoles']/tbody/tr");
	public static By defineRoleNxtBtn=By.xpath("//input[@value='Next']");
	public static By auditLogLnk=By.xpath("//a[contains(text(),'Audit Logs')]");
	public static By helpLnk=By.xpath("//a[(text()='Help?')]");
	public static By SaveRsnForchangeBtn=By.xpath("//*[@id='btnSaveReason']");
	public static By auditLogcloseBtn=By.xpath(".//*[@id='auditlog-popup']/a");
	public static By HelpCloseBtn=By.xpath("//*[@id='cboxClose']");
}
