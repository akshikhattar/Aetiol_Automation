package com.PageObjectRepository;

import org.openqa.selenium.By;

public class DataEntryPageElements {

	public static By DataEntryLnk=By.xpath("//a[@id='IdDE']");
	public static By DESubjIdTxt=By.xpath("//input[@id='SubjectIdentifier']");
	public static By DESiteDD=By.xpath("//select[@id='SiteId']");
	public static By DEStatusDD=By.xpath("//*[@id='SubjectStatus']");
	public static By DESearchBtn=By.xpath("//button[contains(text(),'Search')]");
	public static By DEaddSubjectBtn=By.xpath("//*[text()='Add Subject']");
	public static By DEaddSingleSubject=By.xpath("//*[text()='Single Subject']");
	public static By DEaddMultipleSubjects=By.xpath("//*[text()='Multiple Subjects']");
	//Add Subject
	public static By subjectId=By.xpath("//*[@id='SubjectIdentifier']");
	public static By subjectIdentifierDD=By.xpath("//*[@id='SiteId1']");//In case of custom Identifier
	public static By subjectInitialsTxt=By.xpath("//*[@id='SubjectInitial']");
	public static By statusDD=By.xpath("//*[@id='SubjectStatus']");
	public static By siteDD=By.xpath("//*[@id='SiteId']");
	public static By groupDD=By.xpath("//*[@id='GroupId']");
	public static By createBtn=By.xpath("//*[@id='btnSave']");
	public static By subjId1=By.xpath("(//*[@id='idRPDEtbl']//a)[1]");
	public static By expandAllVisits=By.xpath("//th[contains(text(),'+')]");
	public static By allFormsLink=By.xpath("//a[@class='anchor-link']");
	public static By firstForm=By.xpath("(//a[@class='anchor-link'])[1]");
	
	//Fill Form
	public static By encoderFormTxt1=By.xpath("//*[@id='txt1']");
	public static By encoderFormTxt2=By.xpath("//*[@id='txt2']");
	public static By fillFormSaveBtn=By.xpath("//*[@id='btnSave']");
	
	//FillForm Tabular
	public static By encoderFormTxt1R1C1=By.xpath("//*[@id='tbl0txt10']");
	public static By encoderFormTxtR2C1=By.xpath("//*[@id='tbl0txt20']");
	public static By encoderFormTxt2R1C2=By.xpath("//*[@id='tbl0txt11']");
	public static By encoderFormTxt2R2C2=By.xpath("//*[@id='tbl0txt21']");
	public static By fillFormSaveBtnTab=By.xpath("//*[@id='btnSave']");
	
}
