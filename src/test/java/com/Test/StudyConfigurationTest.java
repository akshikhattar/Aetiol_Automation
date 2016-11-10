package com.Test;

import java.util.logging.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.DataProvider.DataProviderForLoginPage;
import com.DataProvider.DataProviderForStudyConfiguration;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.StudyConfiguration;

public class StudyConfigurationTest extends OpenAndCloseBrowser{

	static Logger log = Logger.getLogger(StudyConfigurationTest.class.getName());
	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		com.Pages.LoginPage loginPage=new com.Pages.LoginPage(driver);
		com.Pages.HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
	
	@Test(priority=1)
	public void studyConfiguration(){
		StudyConfiguration studyConfig=new StudyConfiguration(driver);
		studyConfig.studyConfigClick();
	}
	//Create study
	public static final String reproStepsAddCommGp="1. Click on Study Configuration<br>"
			+ "2. Click on Create Study<br>";
	@Test(priority=2,description=reproStepsAddCommGp,dataProviderClass=DataProviderForStudyConfiguration.class,dataProvider="CreateStudy")
	public void createStudy(String studyName,String investigator,String sponsor,String StudyPhase,
			String collaborators,String noOfSites,String TimeZone,String protocolId,String summary,String studyStatus,
			String noOfSubjects,String subIdentifier) throws Exception
	{
		
	    log.info("Hello this is an info message");
		StudyConfiguration studyConfig=new StudyConfiguration(driver);
		studyConfig.createStudy(studyName, investigator, sponsor, StudyPhase, collaborators, 
				noOfSites, TimeZone, protocolId, summary, studyStatus, noOfSubjects, subIdentifier);
	}
	
	//Select study from DropDown
	public static final String reproStepsSelectStudyDD="1. Select change study dropdown<br>"
					+ "2. Click on study";
	@Parameters("studyName")
	@Test(priority=3,description=reproStepsSelectStudyDD)
	public void selectStudyDropdown(String studyName) throws Exception{
		StudyConfiguration studyConfig=new StudyConfiguration(driver);
		studyConfig.clickSelectStudyDropdown(studyName);		
	}
	@Test(priority=4)
	public void createSite() throws InterruptedException{
		StudyConfiguration studyConfig=new StudyConfiguration(driver);
		studyConfig.createSite();
	}
	@Test(priority=5)
	public void assignUser() throws InterruptedException{
		StudyConfiguration studyConfig=new StudyConfiguration(driver);
		studyConfig.assignUser();
	}
	@Test(priority=6)
	public void createGroup() throws InterruptedException{
		StudyConfiguration studyConfig=new StudyConfiguration(driver);
		studyConfig.createGroup();
	}
	@Test(priority=7)
	public void createVisit() throws InterruptedException{
		StudyConfiguration studyConfig=new StudyConfiguration(driver);		
		studyConfig.createVisit();
	}
	
}
