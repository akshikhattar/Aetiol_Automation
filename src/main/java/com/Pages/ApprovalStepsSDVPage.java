package com.Pages;

import org.openqa.selenium.WebDriver;

import com.GenericLib.ActionDriver;
import com.PageObjectRepository.ApprovalStepsPageElements;
import com.PageObjectRepository.HomePageElement;

public class ApprovalStepsSDVPage extends ActionDriver{

	public ApprovalStepsSDVPage(WebDriver driver) {
		super(driver);
	}
	public ApprovalStepsSDVPage clickSelectStudyDropdown(String studyName) throws Exception{
		Thread.sleep(1000);
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		acceptAlert();
		//windowHandles();	
		Thread.sleep(500);
		return new ApprovalStepsSDVPage(driver);
	}
	
	public ApprovalStepsSDVPage openApprovalSteps(){
		click(ApprovalStepsPageElements.dataEntrySDVVerifyLnk);
		return new ApprovalStepsSDVPage(driver);
	}

	public ApprovalStepsSDVPage approvalStepsSDVVerify() throws InterruptedException{
		click(ApprovalStepsPageElements.clickSubj1Lnk);
		click(ApprovalStepsPageElements.visitOneExpand);
		click(ApprovalStepsPageElements.visit1form1Lnk);
		Thread.sleep(1000);	
		Boolean isPresent=isElementPresent(ApprovalStepsPageElements.verifyFormBtn);
		System.out.println("Abc "+isPresent);
		if(isPresent=true){
		click(ApprovalStepsPageElements.verifyFormBtn);
		}
		return new ApprovalStepsSDVPage(driver);
	}
	
	public ApprovalStepsSDVPage approvalStepsSDVVerifyAllForms() throws InterruptedException{
		int size=sizeOfElements(ApprovalStepsPageElements.allSubjectsLnk);
		System.out.println("Size of all subjects: "+size);
		//click on subject 1(loop for subjects)
		for(int i=1;i<=size;i++){
			Thread.sleep(500);
			click("(//*[@id='idRPDEtbl']//td[1]/a)["+i+"]");
			Thread.sleep(500);
			//int sizeOfExpand=sizeOfElements(ApprovalStepsPageElements.expandAll);
			//Expand from 1 till size
			/*for(int j=1;j<=sizeOfExpand;j++){
				click("(//th[contains(text(),'+')])["+j+"]");
				Thread.sleep(500);*/
				int sizeofForms=sizeOfElements(ApprovalStepsPageElements.allFormLnk);
				//click on forms and verify
				for(int k=1;k<=sizeofForms;k++){
					click("(//a[@class='anchor-link'])["+i+"]");
					Thread.sleep(2000);
					Boolean isPresent=isElementPresent(ApprovalStepsPageElements.verifyFormBtn);
					System.out.println("Verify form Btn is Presend or not :"+isPresent);
					if(isPresent=true){
						System.out.println("Inside");
						click(ApprovalStepsPageElements.verifyFormBtn);
						Thread.sleep(1000);
						acceptAlert();
						click(ApprovalStepsPageElements.backBtn);
					}
					else{System.out.println("O");
						scrollDown();
						click(ApprovalStepsPageElements.backBtn);
					}
				} 
			}   
		//}
		return new ApprovalStepsSDVPage(driver);
	}
	
}
