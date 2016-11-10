package com.Test;

import java.util.Set;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.DataProvider.DataProviderForCRFDesign;
import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.CRFDesignPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class CRFDesignTest extends OpenAndCloseBrowser{

	public static final String reproSteps="1. Type valid credentials<br>"
			+ "2. Click on login button";
	@Test(priority=0,description=reproSteps,dataProviderClass=DataProviderForLoginPage.class,dataProvider="credentialsProvider")
	public void verifyLogin(String username,String password) throws Exception{
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=loginPage.signIn(username, password);
		assert homePage.textIsEquals(com.PageObjectRepository.HomePageElement.verifyUser, username):"Expected Results: User is logged in";
	}
	//Select study from DropDown
	public static final String reproStepsSelectStudyDD="1. Select change study dropdown<br>"
			+ "2. Click on study";
	@Parameters("studyName")
	@Test(priority=1,description=reproStepsSelectStudyDD)
	public void selectStudyDropdown(String studyName) throws Exception{
		CRFDesignPage crfDesignPage=new CRFDesignPage(driver);
		crfDesignPage.clickSelectStudyDropdown(studyName);		
	}
	
	@Test(priority=2)
	public void openCRFPage() throws InterruptedException{
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.openCRFPage();
		Thread.sleep(500);
	}
	
	//This step is functional only if default CRF is available
	public static final String reproStepsCreateCRF="1. Click on CRF Design<br>"
			+ "2. Click on Create CRF<br>";
	@Test(priority=3,description=reproStepsCreateCRF,dataProviderClass=DataProviderForCRFDesign.class,dataProvider="CreateCRFDefaultTemplate")
	public void createCRF(String EcrfName,String formDescription) throws InterruptedException{
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.createCRFPage();
		Thread.sleep(1000);
		String parentWin=driver.getWindowHandle();
		System.out.println("p: "+parentWin);
		Set<String> allWin=driver.getWindowHandles();
		for(String child:allWin){
			System.out.println("A: "+child);
			if(!child.equalsIgnoreCase(parentWin)){
				System.out.println("C: "+child);
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				if(driver.getTitle().equalsIgnoreCase("ECRF Designer Tool")){
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					crfDesign.createECRFForm(EcrfName, formDescription);
				}
				else{System.out.println("In parent");
					driver.switchTo().window(parentWin);
				}
			}
		}
	}
	
	//Manage CRF-to freeze all the forms
	public static final String reproStepsManageCRF="1. Click on CRF Design<br>"
			+ "2. Click on Manage CRF<br>";
	@Test(priority=4,description=reproStepsManageCRF)
	public void manageCRF() throws InterruptedException{
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.OpenManageCRFPage();
		Thread.sleep(500);
		String parentWin=driver.getWindowHandle();
		System.out.println("p: "+parentWin);
		Set<String> allWin=driver.getWindowHandles();
		for(String child:allWin){
			System.out.println("A: "+child);
			if(!child.equalsIgnoreCase(parentWin)){
				System.out.println("C: "+child);
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				if(driver.getTitle().equalsIgnoreCase("Manage ECRF")){
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					crfDesign.ManageCRFPage();
				}
				else{System.out.println("In parent");
					driver.switchTo().window(parentWin);
				}
			}
		}
	}
	
	//Print functionality
	public static final String reproStepsPrintEcrf="1. Click on CRF Design<br>"
			+ "2. Click on Save and next button<br>"
			+ "3. Hover mouse on Print ECRF button<br>";
	@Test(priority=4,description=reproStepsPrintEcrf)
	public void printEcrf() throws InterruptedException{
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.printECRF();
	}
	//CRF Mapping
	public static final String reproStepsMapEcrf="1. Click on CRF Design<br>"
			+ "2. Select any form and visit<br> "
			+ "3. Click on Save and next button<br>";
	@Test(priority=4,description=reproStepsMapEcrf)
	public void mapEcrf() throws InterruptedException{
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.mapEcrf();
	}
	//Cdash
	public static final String reproStepsCDASH="1. Click on CRF Design<br>"
			+ "2. Create a form with all variables in CDASH<br> "
			+ "3. Click Preview form<br>"
			+ "4. Click on variable<br>"
			+ "5. Apply CDASH on the individual variables and save";
	@Test(priority=5,description=reproStepsCDASH)
	public void CDASHVariable() throws InterruptedException{
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.createCRFPage();
		Thread.sleep(1000);
		String parentWin=driver.getWindowHandle();
		System.out.println("p: "+parentWin);
		Set<String> allWin=driver.getWindowHandles();
		for(String child:allWin){
			System.out.println("A: "+child);
			if(!child.equalsIgnoreCase(parentWin)){
				System.out.println("C: "+child);
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				if(driver.getTitle().equalsIgnoreCase("ECRF Designer Tool")){
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					crfDesign.CDASHVariable();
				}
				else{System.out.println("In parent");
					driver.switchTo().window(parentWin);
				}
			}
		}
	}
	//Cdash
	public static final String reproStepsCDASHtabular="1. Click on CRF Design<br>"
			+ "2. Create a form with all variables in CDASH<br> "
			+ "3. Click Preview form<br>"
			+ "4. Click on variable<br>"
			+ "5. Apply CDASH on the tabular variables and save";
	@Test(priority=6,description=reproStepsCDASH)
	public void CDASHtabular() throws InterruptedException{
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.createCRFPage();
		Thread.sleep(1000);
		String parentWin=driver.getWindowHandle();
		System.out.println("p: "+parentWin);
		Set<String> allWin=driver.getWindowHandles();
		for(String child:allWin){
			System.out.println("A: "+child);
			if(!child.equalsIgnoreCase(parentWin)){
				System.out.println("C: "+child);
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				if(driver.getTitle().equalsIgnoreCase("ECRF Designer Tool")){
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					crfDesign.CDASHtabular();
				}
				else{System.out.println("In parent");
					driver.switchTo().window(parentWin);
				}
			}
		}
	}	
	
}
