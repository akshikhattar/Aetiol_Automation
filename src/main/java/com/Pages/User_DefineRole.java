package com.Pages;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.UserPageElement;
import com.PageObjectRepository.User_DefineRolePageElement;


public class User_DefineRole extends ActionDriver{

	static Logger log = Logger.getLogger(User_DefineRole.class.getName());
	public User_DefineRole(WebDriver driver) {
		super(driver);
	}
	
	//Go to Define Role Page
	public User_DefineRole defineRolePage(){
		click(UserPageElement.getUser);
		click(UserPageElement.getDefineRole);
		return new User_DefineRole(driver);
	}
	
	//Add Communication Groups
	public User_DefineRole addCommunicationGroups(String groupName){
		click(User_DefineRolePageElement.getAddCommunicationGroupBtn);
		type(User_DefineRolePageElement.getAddCommGroupNameTxt, groupName);
		click(User_DefineRolePageElement.getAddcommGpSaveBtn);
		acceptAlert();
		return new User_DefineRole(driver);
	}
	
	//Click on cancel when communication groups are added
	public User_DefineRole addCommunicationGroupsCancel(){
	click(User_DefineRolePageElement.getAddcommGpCancelBtn);
	return new User_DefineRole(driver);
	}
	
	//Add duplicate communication group
	public User_DefineRole addDuplicateCommGp(){
		//click(User_DefineRolePageElement.getAddCommunicationGroupBtn);
		type(User_DefineRolePageElement.getAddCommGroupNameTxt, "Heart");
		click(User_DefineRolePageElement.getAddcommGpSaveBtn);
		System.out.println("Alert Text: "+getAlertText());
		acceptAlert();
		return new User_DefineRole(driver);
	}
	
	//Blank communication group
	public User_DefineRole blankCommGp(){

		click(User_DefineRolePageElement.getAddcommGpSaveBtn);
		System.out.println("Alert Text: "+getAlertText());
		acceptAlert();
		/*click(User_DefineRolePageElement.getAddPrivilegelnk);//Click on add privilege link to open popup
		click(User_DefineRolePageElement.getAddPrivilegelnk);*/
		//1. check privilege and 2.click save then 3.click add group and 4.check 5.save
		return new User_DefineRole(driver);
	}
	
	//Add new Role
	public User_DefineRole addNewRole(String roleName){
		click(User_DefineRolePageElement.getaddBtn);
		type(User_DefineRolePageElement.getEnterRoleTxt,roleName);//type role name in Enter Role textbox	
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		return new User_DefineRole(driver);		
	}
	
	//Check on privileges
	public User_DefineRole checkPrivilege(String ChbId) throws InterruptedException{		
		check(ChbId);
		click(User_DefineRolePageElement.getAddPrivilegeSaveBtn);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSelectGroupLnk);
		return new User_DefineRole(driver);	
	}
	
	//Click and Select communication group
	public User_DefineRole selectGroup(String chbId) throws InterruptedException{
		check(chbId);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSelectGpAndSaveBtn);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSaveImgBtn);Thread.sleep(2000);
		acceptAlert();Thread.sleep(2000);
		//pageRefresh();Thread.sleep(1000);
		//System.out.println(getAlertText());
		return new User_DefineRole(driver);	
	}
	
	//Editing role
	/*
	 * To edit a role we will first add a role
	 * then we will get the no of pages and no of rows after adding
	 * the loop will iterate through every row and page to find the role added
	 * when it finds the role it will click edit and edit function will be performed and saved
	 */
	//Edit Role,Edit Privilege and edit communication group
	public User_DefineRole editRole() throws InterruptedException{
		Thread.sleep(3000);
		log.info("Editing define User");
		String rolename = "QA";
		log.info("Entering new role to be edited");
		//Adding user for editing
		
		click(User_DefineRolePageElement.getaddBtn);
		type(User_DefineRolePageElement.getEnterRoleTxt,rolename);
		log.info("Role name Entered");
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		check("cb2");
		click(User_DefineRolePageElement.getAddPrivilegeSaveBtn);
		log.info("Privilege Entered and saved");
		Thread.sleep(500);
		click(User_DefineRolePageElement.getSelectGroupLnk);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.editaddprivilegechb1);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSelectGpAndSaveBtn);
		Thread.sleep(1000);
		log.info("Communication group Entered and saved");
		click(User_DefineRolePageElement.getSaveImgBtn);
		log.info(rolename+"Role created Successfully");
		acceptAlert();
		Thread.sleep(3000);
		//__________________________________________________________________________//
		
		//Editing
		String newRolename="QA Engg";
		log.info("Editing: "+rolename);
		List<WebElement> allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
		int allPagesSize=allpages1.size();
		int allrows=sizeOfElements(User_DefineRolePageElement.noOfRowsInRoles);
		for(int i=0; i<allPagesSize; i++)
        {
            for(int row=1; row<=allrows; row++)
                {
                    System.out.println("Total rows :" +allrows); 
                    String name = driver.findElement(By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[3]")).getText();
                                     
                    if(name.contains(rolename))
                        {
                            WebElement editbutton = driver.findElement(By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[6]/a[2]"));
                            By roleNameTxt=By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[3]/input");
                            By privilegelnk=By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[4]/a");
                           // By gpLnk=By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[4]/a");
                            By saveImgLnk=By.xpath("//*[@id='tblRoles']/tbody/tr[4]/td[6]/a[1]");
                            editbutton.click();
                            type(roleNameTxt,newRolename);
                            log.info("New role name: "+newRolename);
                    		click(privilegelnk);
                    		check("cbe3");
                    		Thread.sleep(2000);
                    		click(User_DefineRolePageElement.getAddPrivilegeSaveBtn);
                    		log.info("Edited Privilege");
                    		Thread.sleep(500);
                    		click(saveImgLnk);
                    		Thread.sleep(500);
                    		click(User_DefineRolePageElement.SaveRsnForchangeBtn);
                    		Thread.sleep(500);
                    		acceptAlert();
                    		log.info(rolename+"Role edited successfully to: "+newRolename);
                            break;
                        }
                    else
                    {
                    	log.info("Role to be edited does not exist");
                        System.out.println("Element doesn't exist");
                    }
                    allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);             
                }
            allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
            allpages1.get(i).click();
        }		
		return new User_DefineRole(driver);	
	}
	
	
	//Delete role
	/*
	 * We will first add the role to be deleted
	 * we will get the name of role to be deleted 
	 * Then we will get the total no of pages and total no of rows
	 * The loop will iterate through every row and every page and when it finds the row to be deleted
	 * then delete action will be performed and alert message appears saying - Role deleted successfully
	 */
	//Delete role
	public User_DefineRole deleteRole() throws InterruptedException{
		String rolename = "T76";
		log.info("Entering new role to be deleted");
		//Adding role for deleting
		
		click(User_DefineRolePageElement.getaddBtn);
		type(User_DefineRolePageElement.getEnterRoleTxt,rolename);
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		check("cb2");
		click(User_DefineRolePageElement.getAddPrivilegeSaveBtn);
		Thread.sleep(500);
		click(User_DefineRolePageElement.getSelectGroupLnk);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.editaddprivilegechb1);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSelectGpAndSaveBtn);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSaveImgBtn);
		acceptAlert();
		Thread.sleep(3000);
		//__________________________________________________________________________//
		
		//Deleting
		List<WebElement> allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
		int allPagesSize=allpages1.size();
		int allrows=sizeOfElements(User_DefineRolePageElement.noOfRowsInRoles);
		for(int i=0; i<allPagesSize; i++)
        {
            for(int row=1; row<=allrows;)
                {
                   String name = driver.findElement(By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[3]")).getText();
                                     
                    if(name.contains(rolename))
                        {
                            By deletebutton = By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[6]/a[3]");
                            click(deletebutton);
                    		acceptAlert();
                    		getAlertText();
                    		System.out.println("Get Alert Text: "+getAlertText());
                    		acceptAlert();
                            break;
                        }
                    else
                    {
                    	row++;
                    }
                    allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);             
                }
            allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
            allpages1.get(i).click();
        }		
		return new User_DefineRole(driver);	
	}
	
	//Deleting assigned role
	/*
	 * Here we will assign the role first in User_DefineRoleTest class
	 * we will get the name of role to be deleted from User_DefineRoleTest class
	 * Then we will get the total no of pages and total no of rows
	 * The loop will iterate through every row and every page and when it finds the row to be deleted
	 * then delete action will be performed and error message should appear saying Assigned role can't be deleted
	 */
	public User_DefineRole deleteAssignedRole(String role) throws InterruptedException{
		System.out.println("abc in pages "+role);
		Thread.sleep(1000);
		List<WebElement> allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
		int allPagesSize=allpages1.size();
		int allrows=sizeOfElements(User_DefineRolePageElement.noOfRowsInRoles);
		System.out.println("No of Pages: "+allPagesSize+" No of Rows: "+allrows);
		lab1:for(int i=1; i<allPagesSize; i++)
        {
            for(int row=1; row<=allrows;row++){            	
            	String name = driver.findElement(By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[3]")).getText();
                System.out.println("name: "+name);                
                if(name.contains(role)){
                	By deletebutton = By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[6]/a[3]");
                	click(deletebutton);
                	acceptAlert();
                	getAlertText();
                	System.out.println("Get Alert Text: "+getAlertText());
                	acceptAlert();
                	break lab1;
                }             
                allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);             
            }
            allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
            allpages1.get(i).click();
        }		
		return new User_DefineRole(driver);
	}
	
	//Add Duplicate Role
	/*
	 * Adding Duplicate role should give an error message that role already exist and 
	 * duplicate role will not be entered
	 * So we are adding DM role and as soon as we click on save we get alert message-role already exist
	 * We will edit the assigned role- editing should be successful
	 */
	public User_DefineRole addDuplicateRole() throws InterruptedException{
		//deleting assigned role
		click(User_DefineRolePageElement.getaddBtn);
		type(User_DefineRolePageElement.getEnterRoleTxt,"DM");
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		click(User_DefineRolePageElement.getAddPrivilegelnk);
		check("cb2");
		click(User_DefineRolePageElement.getAddPrivilegeSaveBtn);
		Thread.sleep(500);
		click(User_DefineRolePageElement.getSelectGroupLnk);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.editaddprivilegechb1);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSelectGpAndSaveBtn);
		Thread.sleep(1000);
		click(User_DefineRolePageElement.getSaveImgBtn);
		System.out.println("Alert message text: "+getAlertText());
		acceptAlert();		
		return new User_DefineRole(driver);
	}
	
	//Edit assigned role
		/*
		 * Adding Duplicate role should give an error message that role already exist and 
		 * duplicate role will not be entered
		 * So we are adding DM role and as soon as we click on save we get alert message-role already exist
		 * We will edit the assigned role- editing should be successful
		 */
	public User_DefineRole editAssignedRole() throws InterruptedException{			
	List<WebElement> allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
	int allPagesSize=allpages1.size();
	int allrows=sizeOfElements(User_DefineRolePageElement.noOfRowsInRoles);
	System.out.println("No of pages: "+allPagesSize+" No of rows: "+allrows);
	for(int i=1; i<allPagesSize; i++)
	{
		for(int row=1; row<=allrows; row++)
		{
			System.out.println("Total rows :" +allrows); 
			String name = driver.findElement(By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[3]")).getText();	
	        if(name.contains("DM"))
	        {
	        	By editbutton = By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[6]/a[2]");
	        	click(editbutton);
	        	By roleNameTxt=By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[3]/input");
	        	By privilegelnk=By.xpath("//*[@id='tblRoles']/tbody/tr["+row+"]/td[4]/a");
	        	By saveImgLnk=By.xpath("//*[@id='tblRoles']/tbody/tr[4]/td[6]/a[1]");
	        	
	        	type(roleNameTxt,"Data Manager");                      
	            click(privilegelnk);
	            check("cbe17");
	            Thread.sleep(2000);
	            click(User_DefineRolePageElement.getAddPrivilegeSaveBtn);
	            log.info("Edited Privilege");
	            Thread.sleep(500);
	            click(saveImgLnk);
	            acceptAlert();
	            break;
	         }
	         else
	         {
	            row++;
	         }
	            allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);             
	         }
	            allpages1 = driver.findElements(User_DefineRolePageElement.noOfPages);
	            allpages1.get(i).click();
	        }
			return new User_DefineRole(driver);
		}
		
		//Define Role next button
		public User_DefineRole nextButton(){
			click(User_DefineRolePageElement.defineRoleNxtBtn);
			return new User_DefineRole(driver);
		}
		
		//Audit Log 
		public User_DefineRole auditLog(){
			click(User_DefineRolePageElement.auditLogLnk);
			click(User_DefineRolePageElement.auditLogcloseBtn);
			return new User_DefineRole(driver);
		}
		
		//Help
		public User_DefineRole help(){
			click(User_DefineRolePageElement.helpLnk);
			click(User_DefineRolePageElement.HelpCloseBtn);
			return new User_DefineRole(driver);
		}
}
