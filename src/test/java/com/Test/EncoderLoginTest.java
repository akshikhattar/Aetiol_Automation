package com.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.DataProvider.DataProviderForLoginPage;
import com.GenericLib.OpenAndCloseEncoder;
import com.Pages.CRFDesignPage;
import com.Pages.DataEntryPage;
import com.Pages.EncoderLoginPage;
import com.Pages.EncoderPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;

public class EncoderLoginTest extends OpenAndCloseEncoder{
	
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
	}
	//Classify, De-classify/Reclassify Verbatim Terms
	@Test(priority=2,enabled=false)
	public void classifyandDe_ReClassifyVt() throws InterruptedException{
		DataEntryPage a=new DataEntryPage(driver);
		String siteId=a.getSiteId();
		String subjectId=a.getSubId();
		EncoderPage ep=new EncoderPage(driver);
		String Domain=ep.getDomain();
		String visit=ep.getVisit();
		String formname=ep.getFormName();
		EncoderLoginPage encoderLogin=new EncoderLoginPage(driver);
		encoderLogin.OpenclassifyVTs(siteId,subjectId,Domain,visit,formname);
		encoderLogin.classifyVTs();
		encoderLogin.De_ReClassifyVTs(siteId,subjectId,Domain,visit,formname);
		encoderLogin.OpenDEclassifyVTs();		
	}
	//Classify, De-classify/Reclassify Verbatim Terms
	@Test(priority=2)
	public void classifyandDe_ReClassifyVtTabular() throws InterruptedException{
		DataEntryPage a=new DataEntryPage(driver);
		String siteId=a.getSiteId();
		String subjectId=a.getSubId();
		EncoderPage ep=new EncoderPage(driver);
		String Domain=ep.getDomain();
		String visit=ep.getVisit();
		String formname=ep.getFormName();
		EncoderLoginPage encoderLogin=new EncoderLoginPage(driver);
		encoderLogin.OpenclassifyVTs(siteId,subjectId,Domain,visit,formname);
		encoderLogin.classifyVTsTabular();
		encoderLogin.De_ReClassifyVTsTabular(siteId,subjectId,Domain,visit,formname);
		encoderLogin.OpenDEclassifyVTs();		
	}
	//Reports
	@Test(priority=3,enabled=false)
	public void reports() throws InterruptedException{
		EncoderLoginPage encoderLogin=new EncoderLoginPage(driver);
		encoderLogin.Reports();
	}
	//Query Listing
	@Test(priority=4)
	public void queryListing(){
		EncoderLoginPage encoderLogin=new EncoderLoginPage(driver);
		encoderLogin.QueryListing();
	}
	

}
