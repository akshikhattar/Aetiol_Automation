package com.Pages;

import org.openqa.selenium.WebDriver;
import com.PageObjectRepository.HomePageElement;
import com.GenericLib.ActionDriver;

public class HomePage extends ActionDriver {
	public HomePage(WebDriver driver) throws Exception {
		super(driver);
		if(!isElementPresent(HomePageElement.verifyUser)){
			throw new Exception("This is not the correct login page instead the page is: "+ getTitle());
		}
	}
	public HomePage clickSelectStudyDropdown() throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,"Audiogram");
		acceptAlert();
		//windowHandles();
		return new HomePage(driver);
	}
	
	public HomePage navigateOnHomePageLinks() throws Exception{
	//	NavigateAndBack(HomePageElement.verifyUser);
	//	NavigateAndBack(HomePageElement.themesLnk);
	//	NavigateAndBack(HomePageElement.changePswdLnk);
	//	NavigateAndBack(HomePageElement.needHelpLnk);
		NavigateAndBack(HomePageElement.companyHomeLnk);
		NavigateAndBack(HomePageElement.UserLnk);
		NavigateAndBack(HomePageElement.defineRoleLnk);
		NavigateAndBack(HomePageElement.defineUserLnk);
		NavigateAndBack(HomePageElement.StudyConfigLnk);
		NavigateAndBack(HomePageElement.createStudyLnk);
		NavigateAndBack(HomePageElement.studyListLnk);
		Thread.sleep(1000);
		clickSelectStudyDropdown();
		Thread.sleep(2000);
		NavigateAndBack(HomePageElement.createSiteLnk);
		NavigateAndBack(HomePageElement.assignUserLnk);
		NavigateAndBack(HomePageElement.createGroupLnk);
		NavigateAndBack(HomePageElement.createVisitLnk);
		NavigateAndBack(HomePageElement.CRFdesignLnk);
		NavigateAndBack(HomePageElement.approvalStepsLnk);
		NavigateAndBack(HomePageElement.queryMgmtLnk);
		NavigateAndBack(HomePageElement.automaticQueryLnk);
		NavigateAndBack(HomePageElement.skipQueryLnk);
		NavigateAndBack(HomePageElement.customQueryLnk);
		NavigateAndBack(HomePageElement.dataEntryLnk);
		NavigateAndBack(HomePageElement.manageStudyLnk);
		NavigateAndBack(HomePageElement.reportsLnk);
		NavigateAndBack(HomePageElement.companyHomeLnk);
		clickSelectStudyDropdown();
		//NavigateAndBack(HomePageElement.HomePageSubjIdLnk);
		NavigateAndBack(HomePageElement.noOfQueriesLnk);
		NavigateAndBack(HomePageElement.noOfsubjectsLnk);
		NavigateAndBack(HomePageElement.noOfStudies);		
		NavigateAndBack(HomePageElement.exportLnk);
		return this;
	}
}
