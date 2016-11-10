package com.Pages;

import org.openqa.selenium.WebDriver;
import com.GenericLib.ActionDriver;
import com.PageObjectRepository.HomePageElement;
import com.PageObjectRepository.MSPageElement;

public class Ms_StudyManagementOptionsPage extends ActionDriver{

	public Ms_StudyManagementOptionsPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();
		//windowHandles();	
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public Ms_StudyManagementOptionsPage openManageStudy(){
		click(MSPageElement.ManageStudyLnk);	
		return new Ms_StudyManagementOptionsPage(driver);
	}
	public Ms_StudyManagementOptionsPage openStudyMgmt(){
		click(MSPageElement.studyMgmtOptionsLnk);
		return new Ms_StudyManagementOptionsPage(driver);
	}
	public Ms_StudyManagementOptionsPage BulkApprovals() throws InterruptedException{
		click(MSPageElement.bulkApprovalLnk);
		//Thread.sleep(2000);
		selectDropDownByIndex(MSPageElement.selectApprovalStepDD, 1);
		click(MSPageElement.expandSite);
		Thread.sleep(1000);
		click(MSPageElement.expandSubject1);
		Thread.sleep(1000);
		click(MSPageElement.subj1Visit1chb);
		Thread.sleep(500);
		scrollDown();Thread.sleep(500);
		click(MSPageElement.bulkApprovalApplyBtn);
		return new Ms_StudyManagementOptionsPage(driver);
	}
	public Ms_StudyManagementOptionsPage Approvals() throws InterruptedException{
		click(MSPageElement.approvalLnk);
		selectDropDownByIndex(MSPageElement.approvalsSitesDD, 2);
		selectDropDownByIndex(MSPageElement.approvalsSubjStatusDD, 1);
		selectDropDownByIndex(MSPageElement.approvalsSubjIdDD, 1);
		selectDropDownByIndex(MSPageElement.approvalsApprovalsDD, 1);
		selectDropDownByIndex(MSPageElement.approvalsVisitsDD, 1);Thread.sleep(500);
		selectDropDownByIndex(MSPageElement.approvalsFormsDD, 1);
		selectDropDownByIndex(MSPageElement.approvalsFormStatusDD, 1);Thread.sleep(2000);
		click(MSPageElement.approvalsApplyBtn);
		return new Ms_StudyManagementOptionsPage(driver);
	}
}
