package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.ApprovalStepsPageElements;
import com.PageObjectRepository.HomePageElement;

public class ApprovalStepsPage extends ActionDriver{

	public ApprovalStepsPage(WebDriver driver) {
		super(driver);
	}
	public ApprovalStepsPage clickSelectStudyDropdown(String studyName) throws Exception{
		Thread.sleep(1000);
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();
		//windowHandles();	
		Thread.sleep(500);
		return new ApprovalStepsPage(driver);
	}
	
	public ApprovalStepsPage openApprovalSteps(){
		click(ApprovalStepsPageElements.approvalStepsLnk);
		return new ApprovalStepsPage(driver);
	}

	public ApprovalStepsPage approvalStepsYes() throws InterruptedException{
		click(ApprovalStepsPageElements.yesRadioBtn);
		acceptAlert();
		acceptAlert();
		//SDV-Step1
		click(ApprovalStepsPageElements.editSDVRowBtn);
		selectDropDownByIndex(ApprovalStepsPageElements.SDVcomplMandatoryDD, 0);
		selectDropDownByIndex(ApprovalStepsPageElements.SDVSignatureDD, 0);
		type(ApprovalStepsPageElements.SDVsigningLineTxt,"SDV Done!");
		selectDropDownByIndex(ApprovalStepsPageElements.SDVPartialAppDD, 0);
		selectDropDownByIndex(ApprovalStepsPageElements.SDVAllowOpenQueriesDD, 0);
		click(ApprovalStepsPageElements.SDVsaveImgBtn);Thread.sleep(1000);
		click(ApprovalStepsPageElements.reasonforChangeBtn);Thread.sleep(1000);
		acceptAlert();
		Thread.sleep(1000);
		//DM Review-Step2
		click(ApprovalStepsPageElements.editDMRowBtn);
		selectDropDownByIndex(ApprovalStepsPageElements.DMcomplMandatoryDD, 0);
		selectDropDownByIndex(ApprovalStepsPageElements.DMSignatureDD, 0);
		type(ApprovalStepsPageElements.DMsigningLineTxt,"DM review Done!");
		selectDropDownByIndex(ApprovalStepsPageElements.DMPartialAppDD, 0);
		selectDropDownByIndex(ApprovalStepsPageElements.DMAllowOpenQueriesDD, 0);
		click(ApprovalStepsPageElements.DMsaveImgBtn);Thread.sleep(1000);
		click(ApprovalStepsPageElements.reasonforChangeBtn);Thread.sleep(1000);
		acceptAlert();
		Thread.sleep(1000);
		//Sign off-Step3
		click(ApprovalStepsPageElements.editSORowBtn);
		selectDropDownByIndex(ApprovalStepsPageElements.SOcomplMandatoryDD, 0);
		selectDropDownByIndex(ApprovalStepsPageElements.SOSignatureDD, 0);
		type(ApprovalStepsPageElements.SOsigningLineTxt,"SignOff Done!");
		selectDropDownByIndex(ApprovalStepsPageElements.SOPartialAppDD, 0);
		selectDropDownByIndex(ApprovalStepsPageElements.SOAllowOpenQueriesDD, 0);
		click(ApprovalStepsPageElements.SOsaveImgBtn);Thread.sleep(1000);
		click(ApprovalStepsPageElements.reasonforChangeBtn);Thread.sleep(1000);
		acceptAlert();
		Thread.sleep(1000);
		return new ApprovalStepsPage(driver);
	}
	public ApprovalStepsPage approvalStepsNo(){
		click(ApprovalStepsPageElements.noRadioBtn);
		acceptAlert();
		return new ApprovalStepsPage(driver);
	}
	public ApprovalStepsPage approvalStepsAuditLog(){
		click(ApprovalStepsPageElements.auditLogBtn);
		click(ApprovalStepsPageElements.auditlogClose);
		return new ApprovalStepsPage(driver);
	}
}
