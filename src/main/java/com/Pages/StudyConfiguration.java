package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.StudyConfigurationPageElement;

public class StudyConfiguration extends ActionDriver{

	public String role,username;
	public StudyConfiguration(WebDriver driver) {
		super(driver);
	}
	//Click on study Configuration
	public StudyConfiguration studyConfigClick(){
		click(StudyConfigurationPageElement.studyConfigLnk);		
		return new StudyConfiguration(driver);
	}
	//Create Study
	public StudyConfiguration createStudy(String studyName,String investigator,String sponsor,String StudyPhase,
			String collaborators,String noOfSites,String TimeZone,String protocolId,String summary,String studyStatus,
			String noOfSubjects,String subIdentifier) throws InterruptedException
	{
		click(StudyConfigurationPageElement.CreateStudyLnk);
		type(StudyConfigurationPageElement.StudyNameTxt, studyName);
		
		//selectDropDown(StudyConfigurationPageElement.InvestigatorDD, investigator);
		type(StudyConfigurationPageElement.SponsorTxt, sponsor);
		selectDropDownByIndex(StudyConfigurationPageElement.StudyPhaseDD, 1);
		type(StudyConfigurationPageElement.CollaboratorsTxt, collaborators);
		type(StudyConfigurationPageElement.NoOfSitesTxt, noOfSites);
		selectDropDownByIndex(StudyConfigurationPageElement.TimeZoneDD, 5);
		type(StudyConfigurationPageElement.ProtocolIdTxt,protocolId);
		type(StudyConfigurationPageElement.SummaryTxt, summary);
		Thread.sleep(1000);
		click(StudyConfigurationPageElement.StartDateCal);
		Thread.sleep(1000);
		selectDropDownByIndex(StudyConfigurationPageElement.StartDateMonthDD, 10);
		selectDropDown(StudyConfigurationPageElement.StartDateYearDD, "2016");
		click(StudyConfigurationPageElement.startDateValue);
		Thread.sleep(1000);
		click(StudyConfigurationPageElement.CompletionDateCal);
		Thread.sleep(1000);
		selectDropDownByIndex(StudyConfigurationPageElement.StartDateMonthDD, 11);
		selectDropDown(StudyConfigurationPageElement.StartDateYearDD, "2017");
		click(StudyConfigurationPageElement.completionDateValue);
		Thread.sleep(1000);
		selectDropDownByIndex(StudyConfigurationPageElement.StudyStatusDD, 0);
		type(StudyConfigurationPageElement.NoOfSubjectsTxt, noOfSubjects);
		selectDropDownByIndex(StudyConfigurationPageElement.SubjectIdentifierDD, 4);
		click(StudyConfigurationPageElement.SaveStudyBtn);
		acceptAlert();
		click(StudyConfigurationPageElement.StudyListLnk);
		Thread.sleep(1000);
		return new StudyConfiguration(driver);
	}
	
	public StudyConfiguration clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		Thread.sleep(1000);
		acceptAlert();
		//windowHandles();
		Thread.sleep(500);
		return new StudyConfiguration(driver);
	}
	
	public StudyConfiguration createSite() throws InterruptedException
	{
		click(StudyConfigurationPageElement.CreateSiteLnk);
		click(StudyConfigurationPageElement.AddSiteBtn);
		type(StudyConfigurationPageElement.SiteNameTxt, "Dahisar");
		Thread.sleep(500);
		selectDropDownByIndex(StudyConfigurationPageElement.SiteinvestigatorDD, 1);
		type(StudyConfigurationPageElement.addressTxt, "123-A,Park Street");
		type(StudyConfigurationPageElement.countryTxt, "India");
		type(StudyConfigurationPageElement.SiteEnrollmentTargetTxt, "8");
		type(StudyConfigurationPageElement.SiteEnrollmentLimitTxt, "10");
		click(StudyConfigurationPageElement.CreateSiteImgBtn);
		acceptAlert();
		Thread.sleep(500);		
		return new StudyConfiguration(driver);
	}
	public StudyConfiguration assignUser() throws InterruptedException{
		click(StudyConfigurationPageElement.assignUserLnk);
		click(StudyConfigurationPageElement.assignUserBtn);
		//Role DM
		selectDropDownByIndex(StudyConfigurationPageElement.selectRoleDD, 1);
		role=getSelectedOptionDD(StudyConfigurationPageElement.selectRoleDD);//Using on define role page for deleting assigned role
		System.out.println("Selected option DD: "+role);
		selectDropDownByIndex(StudyConfigurationPageElement.selectUserNameDD, 1);
		username=getSelectedOptionDD(StudyConfigurationPageElement.selectUserNameDD);//using on define user page to delete assigned user
		click(StudyConfigurationPageElement.siteListLnk);
		Thread.sleep(1500);
		click(StudyConfigurationPageElement.siteListFirstChb);
		click(StudyConfigurationPageElement.siteListSaveBtn);
		Thread.sleep(500);
		click(StudyConfigurationPageElement.assignUserImgBtn);
		acceptAlert();
		Thread.sleep(2000);
		//Role Investigator
		click(StudyConfigurationPageElement.assignUserBtn);
		selectDropDownByIndex(StudyConfigurationPageElement.selectRoleDD, 2);
		selectDropDownByIndex(StudyConfigurationPageElement.selectUserNameDD, 1);
		click(StudyConfigurationPageElement.siteListLnk);
		Thread.sleep(1500);
		click(StudyConfigurationPageElement.siteListFirstChb);
		click(StudyConfigurationPageElement.siteListSaveBtn);
		Thread.sleep(500);
		click(StudyConfigurationPageElement.assignUserImgBtn);
		acceptAlert();
		Thread.sleep(2000);
		//Role Monitor
		click(StudyConfigurationPageElement.assignUserBtn);
		selectDropDownByIndex(StudyConfigurationPageElement.selectRoleDD, 3);
		selectDropDownByIndex(StudyConfigurationPageElement.selectUserNameDD, 1);
		click(StudyConfigurationPageElement.siteListLnk);
		Thread.sleep(5000);
		click(StudyConfigurationPageElement.siteListFirstChb);
		click(StudyConfigurationPageElement.siteListSaveBtn);
		Thread.sleep(500);
		click(StudyConfigurationPageElement.assignUserImgBtn);
		Thread.sleep(500);
		acceptAlert();
		return new StudyConfiguration(driver);
	}
	public StudyConfiguration createGroup() throws InterruptedException{
		click(StudyConfigurationPageElement.CreateGroupLnk);
		click(StudyConfigurationPageElement.createGroupAddBtn);
		type(StudyConfigurationPageElement.groupNameTxt, "Region");
		type(StudyConfigurationPageElement.GroupEnrollmentTargetTxt,"12");
		type(StudyConfigurationPageElement.groupEnrollmentLimitTxt, "15");
		click(StudyConfigurationPageElement.addGroupImgBtn);
		Thread.sleep(1000);
		acceptAlert();		
		return new StudyConfiguration(driver);
	}
	public StudyConfiguration createVisit() throws InterruptedException{
		click(StudyConfigurationPageElement.CreateVisitLnk);
		Thread.sleep(1000);
		mouseOver(StudyConfigurationPageElement.addVisitBtn);
		Thread.sleep(1000);
		click(StudyConfigurationPageElement.addMultipleVisitLnk);
		Thread.sleep(500);
		type(StudyConfigurationPageElement.visitNametxt, "Screening,Baseline");
		click(StudyConfigurationPageElement.addVisitImgBtn);
		Thread.sleep(500);
		acceptAlert();
		return new StudyConfiguration(driver);
	}
}
