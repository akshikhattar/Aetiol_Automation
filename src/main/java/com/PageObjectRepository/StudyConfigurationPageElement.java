package com.PageObjectRepository;

import org.openqa.selenium.By;

public class StudyConfigurationPageElement {

	public static By studyConfigLnk=By.xpath("//a[@id='IdStudyConfiguration']");
	public static By CreateStudyLnk=By.xpath("//a[@id='Idcs']");
	public static By StudyListLnk=By.xpath("//a[@id='Idsl']");
	public static By CreateSiteLnk=By.xpath("//a[@id='idcsite']");
	public static By assignUserLnk=By.xpath("//a[@id='idcAU']");
	public static By CreateGroupLnk=By.xpath("//a[@id='idcCG']");
	public static By CreateVisitLnk=By.xpath("//a[@id='idcCV']");
	
	//Create Study
	public static By StudyNameTxt=By.xpath("//input[@id='StudyName']");
	public static By InvestigatorDD=By.xpath("//select[@id='PrincipalInvestigator']");
	public static By SponsorTxt=By.xpath("//input[@id='StudySponser']");
	public static By StudyPhaseDD=By.xpath("//select[@id='StudyPhase']");
	public static By CollaboratorsTxt=By.xpath("//input[@id='Collaborators']");
	public static By NoOfSitesTxt=By.xpath("//input[@id='NoofSites']");
	public static By TimeZoneDD=By.xpath("//select[@id='TimeZone']");
	public static By ProtocolIdTxt=By.xpath("//input[@id='UniqueProtocolId']");
	public static By SummaryTxt=By.xpath("//textarea[@id='StudySummary']");
	public static By StartDateCal=By.xpath("(//*[@id='createstudyfrm']//img)[1]");
	public static By StartDateMonthDD=By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]");
	public static By StartDateYearDD=By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]");
	public static By startDateValue=By.xpath("//*[@id='ui-datepicker-div']//tr[3]/td[4]/a");
	public static By CompletionDateCal=By.xpath("(//*[@id='createstudyfrm']//img)[2]");
	public static By completionDateValue=By.xpath("//*[@id='ui-datepicker-div']//tr[3]/td[4]/a");
	public static By StudyStatusDD=By.xpath("//select[@id='StudyStatus']");
	public static By NoOfSubjectsTxt=By.xpath("//input[@id='NoofSubjects']");
	public static By SubjectIdentifierDD=By.xpath("//select[@id='SubjectIdentifier']");
	public static By SaveStudyBtn=By.xpath("//*[@id='createstudyfrm']//tr[2]//button[1]");
	
	//Create Site
	public static By AddSiteBtn=By.xpath("//a[@id='idDisabled']");
	public static By SiteNameTxt=By.xpath("//input[@id='txtSiteName']");
	public static By SiteinvestigatorDD=By.xpath("//*[@id='txtInvestigator']");
	public static By addressTxt=By.xpath("//input[@id='txtAddress']");
	public static By countryTxt=By.xpath("//input[@id='txtCountry']");
	public static By SiteEnrollmentTargetTxt=By.xpath("//input[@id='txtEnrollmentTarget']");
	public static By SiteEnrollmentLimitTxt=By.xpath("//input[@id='txtEnrollmentLimit']");
	public static By CreateSiteImgBtn=By.xpath("//img[@id='imgUseradd']");
	public static By createSiteNxtBtn=By.xpath("//*[@id='tblgridpaging']//td[2]/button[1]");
	
	//Assign User
	public static By assignUserBtn=By.xpath("//a[@id='idDisabled']");
	public static By selectRoleDD=By.xpath("//select[@id='GRole']");
	public static By selectUserNameDD=By.xpath("//select[@id='GSUser']");
	public static By siteListLnk=By.xpath("//a[@id='btnAddAssignSites']");
	public static By siteListAllChb=By.xpath(".//*[@id='tblSites']//input");
	public static By siteListFirstChb=By.xpath("(//*[@id='tblSites']//input)[1]");
	public static By siteListSaveBtn=By.xpath("//*[@id='btnSave']");
	public static By assignUserImgBtn=By.xpath("//img[@id='imgUseradd']");
	
	//Create Group 
	public static By createGroupAddBtn=By.xpath("//button[@id='btnGroup']");
	public static By groupNameTxt=By.xpath("//input[@id='txtGroupName']");
	public static By GroupEnrollmentTargetTxt=By.xpath("//input[@id='txtEnrollmentTarget']");
	public static By groupEnrollmentLimitTxt=By.xpath("//input[@id='txtEnrollmentlimit']");
	public static By addGroupImgBtn=By.xpath("//img[@id='imggroupadd']");
	public static By createGroupNextBtn=By.xpath("//*[@id='tblgridpager']//button[1]");
	
	//Create Visit
	public static By addVisitBtn=By.xpath("//span[contains(text(),'Add')]");
	public static By addMultipleVisitLnk=By.xpath("//*[@id='btnMultipleVisit']");
	public static By visitNametxt=By.xpath("//*[@id='txtVisitName']");
	public static By addVisitImgBtn=By.xpath("//*[@id='imgVisitadd']");
	
	
}
