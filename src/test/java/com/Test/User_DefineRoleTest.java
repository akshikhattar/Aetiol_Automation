package com.Test;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.DataProvider.DataProviderForUser_DefineRole;
import com.GenericLib.OpenAndCloseBrowser;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.User_DefineRolePageElement;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.StudyConfiguration;
import com.Pages.User_DefineRole;

public class User_DefineRoleTest extends OpenAndCloseBrowser{
	static Logger log = Logger.getLogger(User_DefineRoleTest.class.getName());
	public String ChbId,id;
	//UserLogin
	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		//driver.findElement(By.id(password)).sendKeys("abc");
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
	
	//Go to User>Define Role Page
	@Test(priority=1)
	public void defineRolePage(){
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.defineRolePage();
	}
	//Add Communication Group
	public static final String reproStepsAddCommGp="1. Click on User<br>"
			+ "2. Click on Define User<br>"
			+ "3. Click on Add Communication Group";
	@Test(priority=2,description=reproStepsAddCommGp,dataProviderClass=DataProviderForUser_DefineRole.class,dataProvider="communicationGpNameProvider")
	public void addCommunicationGroup(String groupName) throws Exception{
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.addCommunicationGroups(groupName);
	}
	
	//Add duplicate communication group
	public static final String reproStepsAddDupCommGp="1. Click on User<br>"
			+ "2. Click on Define User<br>"
			+ "3. Click on Add Communication Group"
			+ "4. Add already existing Communication group"
			+ "5. Alert message - Communication group already exist";
	@Test(priority=3,description=reproStepsAddDupCommGp)
	public void addDuplicateCommGp(){
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.addDuplicateCommGp();
	}
	//Add blank communication group
	public static final String reproStepsblankCommGp="1. Click on User<br>"
			+ "2. Click on Define User<br>"
			+ "3. Click on Add Communication Group"
			+ "4. Click on save without entering any name"
			+ "5. Alert message - Please enter communication group name";
	@Test(priority=4,description=reproStepsblankCommGp)
	public void blankCommGp(){
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.blankCommGp();
	}
	//Click on cancel when communication groups are added
	@Test(priority=5)
	public void addCommunicationGroupsCancel(){
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.addCommunicationGroupsCancel();
	}
	
	//Add Role
	public static final String reproStepsAddNewRole="1. Click on User<br>"
			+ "2. Click on Define Role<br>"
			+ "3. Click on Add <br>"
			+ "4. A new row will be added to add Role name,Select Privilege,Select communication group";
	@Test(priority=6,description=reproStepsAddNewRole,dataProviderClass=DataProviderForUser_DefineRole.class,dataProvider="AddRole")
	public void addNewRole(String roleName,String addPrivilege,String addGroupName) throws Exception{
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.addNewRole(roleName);
		//String ChbId = null,id = null;
		//List of all Privileges in add Privilege link
		Thread.sleep(1000);
		List<WebElement> allPrivilegesNames=driver.findElements(User_DefineRolePageElement.getListOfAllPrivilegesLbls);
		/*	
		  This loop will iterate through the privileges and when privilege matches the value from excel then
			1.It will get Id of that privilege
			2.Replace spnplgName with cb to generate checkbox Id to be checked.
		*///System.out.println("Size of privil: "+allPrivilegesNames.size());
		for(WebElement value:allPrivilegesNames)
		{
			//System.out.println("Privilege"+addPrivilege);
			System.out.println("values: "+value.getText());
			if(value.getText().contains(addPrivilege)){
				System.out.println("GetText: "+value.getText());
				System.out.println("Inside");
				String index =value.getAttribute("id");
				System.out.println(index);
				ChbId=index.replace("spnplgName", "cb");
				break;
			}
			else{
				System.out.println("Add privilege not found. Please check for spaces");
			}
		}
		System.out.println("J out: "+ChbId);
		defineRole.checkPrivilege(ChbId);
		List<WebElement> allGroupsNamesClickable=driver.findElements(User_DefineRolePageElement.getSelectGpLbls);
		//This will get attribute id from the input tag which matches the data from excel 
		//and then will send that id to be checked.
		for(WebElement value:allGroupsNamesClickable){
			System.out.println("values: "+value.getAttribute("name"));
			if(value.getAttribute("name").equalsIgnoreCase(addGroupName)){
				id=value.getAttribute("id");
				System.out.println("id onclick: "+id);
			}
			/*else{
				System.out.println("Group not found");
			}*/
		}
		defineRole.selectGroup(id);
	}
	
	//Edit Role,Edit Privilege and edit communication group
	public static final String reproStepsEditRole="1. Click on User<br>"
			+ "2. Click on Actions<br>"
			+ "3. Click on Edit <br>"
			+ "4. Edit Role,Edit Privilege and edit communication group <br>"
			+ "5. Click on Save";
	@Test(priority=7,description=reproStepsEditRole)
	public void editRole() throws InterruptedException{
		log.info("Editing roles,privileges and group");
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.editRole();
	}
		
	//Deleted Role
	public static final String reproStepsDeleteRole="1. Click on User<br>"
			+ "2. Click on Actions<br>"
			+ "3. Click on Delete <br>";
	@Test(priority=8,description=reproStepsDeleteRole)
	public void deleteRole() throws InterruptedException{
		log.info("Deleting Role");
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.deleteRole();
	}
	
	//Deleted Assigned  Role
	public static final String reproStepsDeleteAssignedRole="1. Click on User<br>"
			+ "2. Click on Actions<br>"
			+ "3. Click on Delete <br>";
	@Test(priority=9,description=reproStepsDeleteAssignedRole)
	public void deleteAssignedRole() throws Exception{			
		log.info("Deleting Assigned Role");			
		StudyConfiguration studyconfig = new StudyConfiguration(driver);			
		studyconfig.clickSelectStudyDropdown("Epilepsy");
		studyconfig.studyConfigClick();
		Thread.sleep(1100);
		studyconfig.assignUser();
		String abc=studyconfig.role;
		System.out.println("abc: "+abc);
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.defineRolePage();
		defineRole.deleteAssignedRole(abc);
	}
	
	//Add Duplicate Role
	public static final String reproStepsAddDuplicateRole="1. Click on User<br>"
			+ "2. Click on Actions<br>"
			+ "3. Click on Add(Add existing Role) <br>"
			+ "4. An error message should come:Role already exists";
	@Test(priority=10,description=reproStepsAddDuplicateRole)
	public void addDuplicateRole() throws InterruptedException{
		log.info("Adding duplicate Role");
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.addDuplicateRole();
	}
	
	
	
	//Edit assigned role
	public static final String reproStepsEditAssignedRole="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on edit"
				+ "4. Record updated successfuly";
	@Test(priority=11,description=reproStepsEditAssignedRole)
	public void editAssignedRole() throws InterruptedException{
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.editAssignedRole();		
	}
	
	//Audit Log
	public static final String reproStepsRoleAuditLog="1. Click on User<br>"
			+ "2. Click on Audit Log<br>"
			+ "3. A tabular view of Audit log will be displayed";
	@Test(priority=12,description=reproStepsRoleAuditLog)
	public void DR_AuditLog() throws InterruptedException{
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.auditLog();	
	}
		
	//Help
	public static final String reproStepsRoleHelp="1. Click on User<br>"
			+ "2. Click on Help for information<br>";
	@Test(priority=13,description=reproStepsRoleHelp)
	public void DR_Help() throws InterruptedException{
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.help();	
		Thread.sleep(1000);
	}
	
	//Define Role next button functionality
	public static final String reproStepsnextButton="1. Click on User<br>"
			+ "2. Click on Define User<br>"
			+ "3. Click on Next Button"
			+ "4. User should be navigated to Define USer Page";
	@Test(priority=14,description=reproStepsnextButton)
	public void nextButton(){
		User_DefineRole defineRole=new User_DefineRole(driver);
		defineRole.nextButton();
	}
}
