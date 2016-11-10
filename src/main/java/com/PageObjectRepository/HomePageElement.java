package com.PageObjectRepository;

import org.openqa.selenium.By;

public class HomePageElement {

	public static By verifyUser=By.xpath("//div[@class='welcome-txt']//a");
	public static By studyNameLable=By.xpath("((//table[@class='header-top']//td)[4]");
	public static By SelectStudydropdown=By.id("stdname");
	public static By noOfQueriesLnk=By.xpath("//a[@href='/Aetiol/QueryListing/QueryListing']");
	public static By noOfsubjectsLnk=By.xpath("//a[@href='/Aetiol/DataEntry/SubjectList']");
	public static By noOfStudies=By.xpath("//a[@href='/Aetiol/Study/StudyList']");
	public static By allLinksOnHomePage=By.xpath("//a[@href][not(contains(.,'Log-Out'))]");
	public static By themesLnk=By.xpath("//a[contains(text(),'Themes')]");
	public static By changePswdLnk=By.xpath("//a[contains(text(),'Change Password')]");
	public static By needHelpLnk=By.xpath("//a[contains(text(),'Need Help?')]");
	public static By companyHomeLnk=By.xpath("//a[@id='IdCM']");
	public static By UserLnk=By.xpath("//a[@id='IdUs']");
	public static By defineRoleLnk=By.xpath("//a[@id='IdDF']");
	public static By defineUserLnk=By.xpath("//a[@id='IdDU']");
	public static By StudyConfigLnk=By.xpath("//a[@id='IdStudyConfiguration']");
	public static By createStudyLnk=By.xpath("//a[@id='Idcs']");
	public static By studyListLnk=By.xpath("//a[@id='Idsl']");
	public static By createSiteLnk=By.xpath("//a[contains(text(),'Create Site')]");
	public static By assignUserLnk=By.xpath("//a[@id='idcAU']");
	public static By createGroupLnk=By.xpath("//a[@id='idcCG']");
	public static By createVisitLnk=By.xpath("//a[@id='idcCV']");
	public static By CRFdesignLnk=By.xpath("//a[@id='idCD']");
	public static By approvalStepsLnk=By.xpath("//a[@id='IdAP']");
	public static By queryMgmtLnk=By.xpath("//*[@id='idQueryManagement']/a");
	public static By automaticQueryLnk=By.xpath("//a[@id='IdAutomatic']");
	public static By skipQueryLnk=By.xpath("//a[@id='IdSkip']");
	public static By customQueryLnk=By.xpath("//a[@id='IdCustom']");
	public static By dataEntryLnk=By.xpath("//a[@id='IdDE']");
	public static By manageStudyLnk=By.xpath("//a[@id='IdMS']");
	public static By reportsLnk=By.xpath("//a[@id='IdRep']");
	public static By exportLnk=By.xpath("//a[@id='IdExp']");
	public static By HomePageSubjIdLnk=By.xpath("//*[@id='01']/a");
	
}
