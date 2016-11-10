package com.Test;

import java.util.Set;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseBrowser;
import com.Pages.CRFDesignPage;
import com.Pages.DataEntryPage;
import com.Pages.EncoderPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class EncoderTest extends OpenAndCloseBrowser{
	String formName="EncoderForm1";
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
	public void openCRF(String studyName) throws Exception{
		CRFDesignPage crfDesignPage=new CRFDesignPage(driver);
		crfDesignPage.clickSelectStudyDropdown(studyName);		
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		crfDesign.openCRFPage();
		Thread.sleep(500);
	}
	
	@Test(priority=3)
	public void createCRFPage() throws InterruptedException {
		CRFDesignPage crfDesign=new CRFDesignPage(driver);
		EncoderPage encoderPage = new EncoderPage(driver);
		crfDesign.createCRFPage();
		Thread.sleep(1000);
		String parentWin=driver.getWindowHandle();
		System.out.println("p in manage: "+parentWin);
		Set<String> allWin=driver.getWindowHandles();
		for(String child:allWin){
			System.out.println("ECRF designer tool: "+child);
			if(!child.equalsIgnoreCase(parentWin)){
				System.out.println("C: "+child);
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				if(driver.getTitle().equalsIgnoreCase("ECRF Designer Tool")){
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					encoderPage.createECRFForm(formName, "Form for test","AE");
					//encoderPage.createECRFtabular(formName, "Form for test","AE"); //Also uncomment in data entry
				}
				else{System.out.println("In parent");
					driver.switchTo().window(parentWin);
				}
			}
		}
	}
	@Test(priority=4) //,enabled=false
	public void manageCRF() throws InterruptedException{
		EncoderPage encoderPage = new EncoderPage(driver);
		encoderPage.manageCRF();
	}
	@Test(priority=5)
	public void mapCRF() throws InterruptedException{
		Thread.sleep(2000);
		EncoderPage encoderPage = new EncoderPage(driver);		
		encoderPage.mapCRF(formName);
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void DataEntry() throws InterruptedException{
		DataEntryPage dataEntry = new DataEntryPage(driver);		
		dataEntry.openDataEntry();Thread.sleep(500);
		dataEntry.AddSubject();
		dataEntry.getSubId();
	}
	@Test(priority=7) //,enabled=false
	public void DataEntryFillForm() throws InterruptedException{
		EncoderPage encoderPage = new EncoderPage(driver);
		encoderPage.fillForm(formName);
		//encoderPage.fillFormTabular(formName);
	}

}
