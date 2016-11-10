package com.Test;

import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.DataProvider.DataProviderForUser_DefineUser;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.StudyConfiguration;
import com.Pages.User_DefineUser;

public class User_DefineUserTest extends OpenAndCloseBrowser{
		//UserLogin
		public static final String reproSteps="1. Type valid credentials<br>"
				+ "2. Click on login button";
		@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
		public void verifyLogin(String username,String password) throws Exception{
			com.Pages.LoginPage loginPage=new com.Pages.LoginPage(driver);
			com.Pages.HomePage homePage=loginPage.signIn(username, password);
			assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
		}		
		//Go to User>Define User Page
		@Test(priority=1)
		public void defineUserPage() throws InterruptedException{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.defineUserPage();
		}
		//Add User(Fields- UserName,address,emailId,Role
		public static final String reproStepsAddUser="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on Add User button";
		@Test(priority=2,description=reproStepsAddUser,dataProviderClass=DataProviderForUser_DefineUser.class,dataProvider="addUser")
		public void addUser(String userName,String address,String emailId,String role) throws Exception{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.addUser(userName, address, emailId, role);
		}
		//Delete User
		public static final String reproStepsdeleteUser="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on Delete User button";
		@Test(priority=3,description=reproStepsdeleteUser)
		public void deleteUser() throws Exception{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.deleteUser();
		}
		//Delete User
		public static final String reproStepsdEditUser="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on Delete User button";
		@Test(priority=4,description=reproStepsdEditUser)
		public void editUser() throws Exception{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.editUser();
		}
		
		//Search User	
		public static final String reproStepsdSearchUser="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on Delete User button";
		@Test(priority=5,description=reproStepsdEditUser)
		public void searchUser() throws Exception{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.searchUser();
		}
				
		//Delete User
		public static final String reproStepsdAddDupUser="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on Delete User button";
		@Test(priority=6,description=reproStepsdEditUser)
		public void addDuplicateUser() throws Exception{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.addDuplicateUser();
		}
		
		//Delete assigned role
		public static final String reproStepsdDelAssignedUser="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on Delete User button";
		@Test(priority=6,description=reproStepsdDelAssignedUser)
		public void deleteAssignedUser() throws Exception{
			StudyConfiguration studyconfig = new StudyConfiguration(driver);			
			studyconfig.clickSelectStudyDropdown("Epilepsy");
			studyconfig.studyConfigClick();
			Thread.sleep(1100);
			studyconfig.assignUser();
			String UN=studyconfig.username;
			System.out.println("abc: "+UN);
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.defineUserPage();
			defineUser.deleteAssignedUser(UN);
		}
		
		//Edit Assigned Role
		public static final String reproStepsdEditAssignedUser="1. Click on User<br>"
				+ "2. Click on Define User<br>"
				+ "3. Click on Delete User button";
		@Test(priority=6,description=reproStepsdEditAssignedUser)
		public void editAssignedUser() throws Exception{
			StudyConfiguration studyconfig = new StudyConfiguration(driver);			
			studyconfig.clickSelectStudyDropdown("Epilepsy");
			studyconfig.studyConfigClick();
			Thread.sleep(1100);
			studyconfig.assignUser();
			String UN=studyconfig.username;
			System.out.println("abc: "+UN);
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.defineUserPage();
			defineUser.editAssignedRole(UN);
		}
		
		//Previous Button
		public static final String reproStepsRolePreviousBtn="1. Click on User<br>"
				+ "2. Click on previous button<br>";
		@Test(priority=12,description=reproStepsRoleAuditLog)
		public void DU_PreviousBtn() throws InterruptedException{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.previousBtn();	
		}
		//Communication group List
		public static final String reproStepsRoleCommGpList="1. Click on User<br>"
				+ "2. Click on Communication group list<br>";
		@Test(priority=12,description=reproStepsRoleAuditLog)
		public void DU_CommGpList() throws InterruptedException{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.commGpList();	
		}
		//Audit Log 
		public static final String reproStepsRoleAuditLog="1. Click on User<br>"
				+ "2. Click on Audit Log<br>"
				+ "3. A tabular view of Audit log will be displayed";
		@Test(priority=12,description=reproStepsRoleAuditLog)
		public void DU_AuditLog() throws InterruptedException{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.auditLog();	
		}
		
		//Help
		public static final String reproStepsRoleHelp="1. Click on User<br>"
				+ "2. Click on Help for information<br>";
		@Test(priority=12,description=reproStepsRoleHelp)
		public void DU_Help() throws InterruptedException{
			User_DefineUser defineUser=new User_DefineUser(driver);
			defineUser.auditLog();	
		}
}
