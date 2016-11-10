package com.Test;

import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.DataProvider.DataProviderForStudyConfiguration;
import com.GenericLib.OpenAndCloseBrowser;
import com.PageObjectRepository.HomePageElement;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.PrivilegesPage;
import com.Pages.User_DefineRole;

public class PrivilegesTest extends OpenAndCloseBrowser{

	//UserLogin
	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
		
	//Go to User>Define Role Page
	@Test(priority=1)
	public void defineRolePage() throws Exception{
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.defineRolePage();
		User_DefineRoleTest defineRoleTest= new User_DefineRoleTest();
		defineRoleTest.addCommunicationGroup("Vascular");
		defineRoleTest.addCommunicationGroupsCancel();
		defineRoleTest.addNewRole("Sign OFF", "Form Sign Off", "Vascular");
		defineRoleTest.addNewRole("Monitor/SDV", "Monitor Forms", "Vascular");
		defineRoleTest.addNewRole("DM/DataManager", "Data Manager", "Vascular");
		/*defineRoleTest.addNewRole("Data Entry", "Enter Data", "Vascular");
		defineRoleTest.addNewRole("Offline Data entry", "Offline Data Entry", "Vascular");
		defineRoleTest.addNewRole("Study Documents", "Study Documents", "Vascular");
		defineRoleTest.addNewRole("Configure Study", "Configure Study", "Vascular");
		defineRoleTest.addNewRole("Admin", "All Access", "Vascular");
		defineRoleTest.addNewRole("Close Queries", "Close Queries", "Vascular");
		defineRoleTest.addNewRole("Read Only", "Read Only", "Vascular");
		defineRoleTest.addNewRole("Reports", "Reports", "Vascular");
		defineRoleTest.addNewRole("Manage Users", "Manage Users", "Vascular");		
		defineRoleTest.addNewRole("Coding", "Coding", "Vascular");
		defineRoleTest.addNewRole("Lock", "Lock", "Vascular");
		defineRoleTest.addNewRole("Unlock", "Unlock", "Vascular");
		defineRoleTest.addNewRole("Enroll Subjects", "Enroll Subjects", "Vascular");
		defineRoleTest.addNewRole("Export", "ExportData", "Vascular");*/
	}
		
	//Go to User>Define User Page
	@Test(priority=2)
	public void defineUserPage() throws Exception{
		PrivilegesPage privilegesPage=new PrivilegesPage(driver);
		privilegesPage.defineUserPage();
		User_DefineUserTest defineUserTest= new User_DefineUserTest();
		defineUserTest.addUser("Faiz", "1234", "faiz@yopmail.com", "Sign OFF");
		defineUserTest.addUser("Meeza", "1234", "meeza@yopmail.com", "Monitor/SDV");
		defineUserTest.addUser("Dip", "1234", "dip@yopmail.com", "DM/DataManager");
		/*defineUserTest.addUser("Emilly", "1234", "emilly@yopmail.com", "Data Entry");
		defineUserTest.addUser("Ram", "1234", "Ram@yopmail.com", "Offline Data entry");
		defineUserTest.addUser("Satishss", "1234", "Satishss@yopmail.com", "Study Documents");
		defineUserTest.addUser("Charley", "1234", "Charley@yopmail.com", "Configure Study");
		defineUserTest.addUser("Alishaa", "1234", "alishaa@yopmail.com", "Admin");
		defineUserTest.addUser("Carls", "1234", "carls@yopmail.com", "Close Queries");
		defineUserTest.addUser("Ryaan", "1234", "ryaan@yopmail.com", "Read Only");
		defineUserTest.addUser("Ryleen", "1234", "ryleen@yopmail.com", "Reports");
		defineUserTest.addUser("Rakin", "1234", "rakin@yopmail.com", "Manage Users");		
		defineUserTest.addUser("Carlaa", "1234", "carlaa@yopmail.com", "Coding");
		defineUserTest.addUser("Loshin", "1234", "loshin@yopmail.com", "Lock");
		defineUserTest.addUser("Ubikaa", "1234", "ubikaa@yopmail.com", "Unlock");
		defineUserTest.addUser("Ebadatt", "1234", "ebadatt@yopmail.com", "Enroll Subjects");
		defineUserTest.addUser("Ezah", "1234", "ezah@yopmail.com", "Export");*/
		defineUserTest.addUser("Isha", "1234", "Isha@yopmail.com", "Investigator");
		defineUserTest.addUser("Daizz", "1234", "Daizz@yopmail.com", "DM");
		defineUserTest.addUser("Manavi", "1234", "Manavi@yopmail.com", "Monitor");
	}
		
	//Create Study
	@Test(priority=3,dataProviderClass=DataProviderForStudyConfiguration.class,dataProvider="CreateStudy")
	public void studyCreation(String studyName,String investigator,String sponsor,String StudyPhase,
		String collaborators,String noOfSites,String TimeZone,String protocolId,String summary,String studyStatus,
		String noOfSubjects,String subIdentifier) throws Exception{
		StudyConfigurationTest studyconfigTest = new StudyConfigurationTest();
		studyconfigTest.studyConfiguration();
		studyconfigTest.createStudy(studyName, investigator, sponsor, StudyPhase, collaborators, noOfSites, TimeZone, protocolId, summary, studyStatus, noOfSubjects, subIdentifier);
		studyconfigTest.selectStudyDropdown(studyName);
		studyconfigTest.createSite();
	}
		
	//Assign User
	@Test(priority=4)
	public void assignUser() throws InterruptedException{
		PrivilegesPage privilegPage=new PrivilegesPage(driver);
		privilegPage.assignUsers();
	}
		
	//Create group, create visit
	@Test(priority=5)
	public void createGpoupVisit() throws InterruptedException{
		StudyConfigurationTest studyconfigTest = new StudyConfigurationTest();
		studyconfigTest.createGroup();
		Thread.sleep(1000);
		studyconfigTest.createVisit();
	}
		
	//Create CRF
	@Test(priority=6)
	public void CRFDesign() throws InterruptedException{
		CRFDesignTest crfDesignTest=new CRFDesignTest();
		//CRFDesignPage crfDesign=new CRFDesignPage(driver);
		Thread.sleep(1000);
		crfDesignTest.openCRFPage();
		crfDesignTest.createCRF("F10", "form");		
		
		crfDesignTest.mapEcrf();
	}
		
	//Approval Steps
	@Test(priority=7)
	public void approvalSteps() throws InterruptedException{
		ApprovalStepsTest approvalStepsTest=new ApprovalStepsTest();
		approvalStepsTest.openApprovalStepsPage();
		approvalStepsTest.approvalStepsYes();
	}
		
		
}
