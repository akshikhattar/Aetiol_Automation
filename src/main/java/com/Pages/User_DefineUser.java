package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.UserPageElement;
import com.PageObjectRepository.User_DefineUserPageElement;

public class User_DefineUser extends ActionDriver{
	public User_DefineUser(WebDriver driver) {
		super(driver);
	}
	//Go to Define Role Page
	public User_DefineUser defineUserPage() throws InterruptedException{
		click(UserPageElement.getUser);
		Thread.sleep(2000);
		click(UserPageElement.getDefineUser);
		return new User_DefineUser(driver);
	}
	//Add User
	public User_DefineUser addUser(String userName,String address,String emailId,String role) throws InterruptedException{
		click(User_DefineUserPageElement.getAddUserBtn);
		type(User_DefineUserPageElement.getUserNameTxt, userName);
		type(User_DefineUserPageElement.getAddressTxt, address);
		type(User_DefineUserPageElement.getEmailIdTxt, emailId);
		selectDropDown(User_DefineUserPageElement.getRoleDD, role);
		click(User_DefineUserPageElement.getAddUserImgBtn);
		Thread.sleep(3000);
		acceptAlert();		
		return new User_DefineUser(driver);
	}
	//Delete User
	public User_DefineUser deleteUser() throws InterruptedException{
		String username ="Tisha8";
		click(User_DefineUserPageElement.getAddUserBtn);
		type(User_DefineUserPageElement.getUserNameTxt, username);
		type(User_DefineUserPageElement.getAddressTxt, "123");
		type(User_DefineUserPageElement.getEmailIdTxt, "tisha8@yopmail.com");
		selectDropDownByIndex(User_DefineUserPageElement.getRoleDD, 1);
		click(User_DefineUserPageElement.getAddUserImgBtn);
		Thread.sleep(2000);
		acceptAlert();
		//Deleting
			List<WebElement> allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
			int allPagesSize=allpages1.size();
			int allrows=sizeOfElements(User_DefineUserPageElement.noOfRowsInUsers);
			System.out.println("Pages: "+allPagesSize +"Rows: "+allrows);
			for(int i=1; i<allPagesSize; i++)
		    {
		           for(int row=2; row<=allrows;)
		           {
		        	   String name = driver.findElement(By.xpath("//table[@id='tblUser']/tbody/tr["+row+"]/td[3]")).getText();
		                System.out.println("Name: "+name);                     
		               if(name.contains(username))
		               {
		            	   By deletebutton = By.xpath("//table[@id='tblUser']//tr["+row+"]/td[7]//img[4]");
		                   click(deletebutton);
		                   acceptAlert();
		                   getAlertText();
		                   System.out.println("Get Alert Text: "+getAlertText());
		                   acceptAlert();
		                   break;
		               }
		               else{
		            	   row++;
		               }
		                   allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);            
		           }
		            allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
		            allpages1.get(i).click();
		     }		
		return new User_DefineUser(driver);
	}
	
	//Edit User
	public User_DefineUser editUser() throws InterruptedException{
		String username ="Suhas";
		click(User_DefineUserPageElement.getAddUserBtn);
		type(User_DefineUserPageElement.getUserNameTxt, username);
		type(User_DefineUserPageElement.getAddressTxt, "123");
		type(User_DefineUserPageElement.getEmailIdTxt, username+"@yopmail.com");
		selectDropDownByIndex(User_DefineUserPageElement.getRoleDD, 1);
		click(User_DefineUserPageElement.getAddUserImgBtn);
		Thread.sleep(2000);
		acceptAlert();
		
	//Edit
		List<WebElement> allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
		int allPagesSize=allpages1.size();
		int allrows=sizeOfElements(User_DefineUserPageElement.noOfRowsInUsers);
		System.out.println("Pages: "+allPagesSize +"Rows: "+allrows);
		for(int i=1; i<allPagesSize; i++)
	    {
	           for(int row=2; row<=allrows;)
	           {
	        	   String name = driver.findElement(By.xpath("//table[@id='tblUser']/tbody/tr["+row+"]/td[3]")).getText();
	               System.out.println("Name: "+name);                     
	               if(name.contains(username))
	               {
	            	   By editbutton = By.xpath("//table[@id='tblUser']//tr["+row+"]/td[7]//img[1]");
	                   click(editbutton);
	                   type(User_DefineUserPageElement.getAddressTxt, "Park Street-"+username);
	                   selectDropDownByIndex(User_DefineUserPageElement.getRoleDD, 2);
	                   By editImgSaveBtn=By.xpath("//table[@id='tblUser']/tbody/tr["+row+"]/td[7]//img[2]");
	                   click(editImgSaveBtn);
	                   getAlertText();
	                   System.out.println("Get Alert Text: "+getAlertText());
	                   acceptAlert();
	                   break;
	               }
	               else{
	            	   row++;
	               }
	                   allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);            
	           }
	            allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
	            allpages1.get(i).click();
	     }		
		return new User_DefineUser(driver);
	}
		
	//Search
	public User_DefineUser searchUser() throws InterruptedException{
		String username="Vinika"; 
		String address="Global";
		String role="DM";
		click(User_DefineUserPageElement.getAddUserBtn);
		type(User_DefineUserPageElement.getUserNameTxt, username);
		type(User_DefineUserPageElement.getAddressTxt, address);
		type(User_DefineUserPageElement.getEmailIdTxt, username+"@yopmail.com");
		selectDropDownByIndex(User_DefineUserPageElement.getRoleDD, 1);
		click(User_DefineUserPageElement.getAddUserImgBtn);
		acceptAlert();
		Thread.sleep(2000);
	//Search Username
		type(User_DefineUserPageElement.searchUN,username);
		click(User_DefineUserPageElement.searchBtn);
		System.out.println("Search for UserName"+username+"successful !");
		click(User_DefineUserPageElement.searchReset);
	//Search address
		type(User_DefineUserPageElement.searchAdd,address);
		click(User_DefineUserPageElement.searchBtn);
		System.out.println("Search for Address"+address+"successful !");
		click(User_DefineUserPageElement.searchReset);
	//Search Role
		selectDropDown(User_DefineUserPageElement.searchRole, role);
		click(User_DefineUserPageElement.searchBtn);
		System.out.println("Search for Role"+role+" successful !");
		click(User_DefineUserPageElement.searchReset);
		return new User_DefineUser(driver);
	}
	
	//Duplicate Username or email
	public User_DefineUser addDuplicateUser() throws InterruptedException{
		String username ="Amrit";
		click(User_DefineUserPageElement.getAddUserBtn);
		type(User_DefineUserPageElement.getUserNameTxt, username);
		type(User_DefineUserPageElement.getAddressTxt, "123");
		type(User_DefineUserPageElement.getEmailIdTxt, username+"@yopmail.com");
		selectDropDownByIndex(User_DefineUserPageElement.getRoleDD, 1);
		click(User_DefineUserPageElement.getAddUserImgBtn);
		Thread.sleep(2000);
		acceptAlert();
		
	//Duplicate
		click(User_DefineUserPageElement.getAddUserBtn);
		type(User_DefineUserPageElement.getUserNameTxt, username);
		type(User_DefineUserPageElement.getAddressTxt, "123");
		type(User_DefineUserPageElement.getEmailIdTxt, username+"@yopmail.com");
		selectDropDownByIndex(User_DefineUserPageElement.getRoleDD, 1);
		click(User_DefineUserPageElement.getAddUserImgBtn);
		getAlertText();
        System.out.println("Get Alert Text: "+getAlertText());
        acceptAlert();
        return new User_DefineUser(driver);
	}
	
	//Delete assigned user
	public User_DefineUser deleteAssignedUser(String username) throws Exception{
		System.out.println("UN in pages: "+username);
		List<WebElement> allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
		int allPagesSize=allpages1.size();
		int allrows=sizeOfElements(User_DefineUserPageElement.noOfRowsInUsers);
		System.out.println("Pages: "+allPagesSize +"Rows: "+allrows);
		lab1:for(int i=1; i<allPagesSize; i++)
	    {
	           for(int row=2; row<=allrows;)
	           {
	        	   String name = driver.findElement(By.xpath("//table[@id='tblUser']/tbody/tr["+row+"]/td[3]")).getText();
	               System.out.println("Name: "+name);                     
	               if(name.contains(username))
	               {
	            	   By deletebutton = By.xpath("//table[@id='tblUser']//tr["+row+"]/td[7]//img[4]");
	                   click(deletebutton);
	                   acceptAlert();
	                   getAlertText();
	                   System.out.println("Get Alert Text: "+getAlertText());
	                   acceptAlert();
	                   break lab1;
	               }
	               else{
	            	   row++;
	               }
	                   allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);            
	           }
	            allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
	            allpages1.get(i).click();
	     }		
		return new User_DefineUser(driver);
	}
	
	//Edit Assigned Role
	public User_DefineUser editAssignedRole(String username){
		System.out.println("UN in pages: "+username);
		List<WebElement> allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
		int allPagesSize=allpages1.size();
		int allrows=sizeOfElements(User_DefineUserPageElement.noOfRowsInUsers);
		System.out.println("Pages: "+allPagesSize +"Rows: "+allrows);
		lbl1:for(int i=1; i<allPagesSize; i++)
	    {
	           for(int row=2; row<=allrows;)
	           {
	        	   String name = driver.findElement(By.xpath("//table[@id='tblUser']/tbody/tr["+row+"]/td[3]")).getText();
	               System.out.println("Name: "+name);                     
	               if(name.contains(username))
	               {
	            	   By editbutton = By.xpath("//table[@id='tblUser']//tr["+row+"]/td[7]//img[1]");
	                   click(editbutton);
	                   type(User_DefineUserPageElement.getAddressTxt, "Park Street-"+username);
	                   selectDropDownByIndex(User_DefineUserPageElement.getRoleDD, 2);
	                   By editImgSaveBtn=By.xpath("//table[@id='tblUser']/tbody/tr["+row+"]/td[7]//img[2]");
	                   click(editImgSaveBtn);
	                   getAlertText();
	                   System.out.println("Get Alert Text: "+getAlertText());
	                   acceptAlert();
	                   break lbl1;
	               }
	               else{
	            	   row++;
	               }
	                   allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);            
	           }
	            allpages1 = driver.findElements(User_DefineUserPageElement.noOfPages);
	            allpages1.get(i).click();
	     }		
		return new User_DefineUser(driver);
	}
	
	//Previous Button
	public User_DefineRole previousBtn(){
		click(User_DefineUserPageElement.previouBtn);
		return new User_DefineRole(driver);
	}
	
	//Communication group List
	public User_DefineRole commGpList(){
		click(User_DefineUserPageElement.commGpListBtn);
		return new User_DefineRole(driver);
	}
	
	//Audit Log 
	public User_DefineRole auditLog(){
		click(User_DefineUserPageElement.auditLogLnk);
		return new User_DefineRole(driver);
	}
			
	//Help
	public User_DefineRole help(){
		click(User_DefineUserPageElement.helpLnk);
		return new User_DefineRole(driver);
	}
}
