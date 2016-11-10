package com.PageObjectRepository;

import org.openqa.selenium.By;

public class ApprovalStepsPageElements {

	public static By approvalStepsLnk=By.xpath("//*[@id='IdAP']");
	public static By yesRadioBtn=By.xpath("//*[@id='rd1']");
	public static By noRadioBtn=By.xpath("//*[@id='rd2']");
	public static By reasonforChangeBtn=By.xpath("//button[@id='btnSaveReason']");
	public static By auditLogBtn=By.xpath("//a[contains(text(),'Audit')]");
	public static By helpBtn=By.xpath("//a[text()='Help?']");
	public static By auditlogClose=By.xpath("//*[@id='auditlog-popup']/a[@class='close-auditlog-popup']");
	
	//SDV 
	public static By editSDVRowBtn=By.xpath("//*[@id='imgadd0']");
	public static By SDVcomplMandatoryDD=By.xpath("//*[@id='GCompletionMandatory']");
	public static By SDVSignatureDD=By.xpath("//*[@id='GRequireSignature']");
	public static By SDVsigningLineTxt=By.xpath("//*[@id='txtSigningLine']");
	public static By SDVPartialAppDD=By.xpath("//*[@id='GPartialApproval']");
	public static By SDVAllowOpenQueriesDD=By.xpath("//*[@id='GAllowOpenQueries']"); 
	public static By SDVselectFormLnk=By.xpath("//*[@id='btnGetAssignForms0']");
	public static By SDVselectFormDD=By.xpath("//*[@id='FormType']");
	public static By SDVselFormSaveBtn=By.xpath("//*[@id='btnSave']");
	public static By SDVsaveImgBtn=By.xpath("//*[@id='imgedit0']");
	public static By dataEntrySDVVerifyLnk=By.xpath("//*[@id='IdDE']");
	public static By clickSubj1Lnk=By.xpath("(//*[@id='idRPDEtbl']//a)[1]");
	public static By allSubjectsLnk=By.xpath("(//*[@id='idRPDEtbl']//td[1]/a)");
	public static By visitOneExpand=By.xpath("(//th[contains(text(),'+')])[1]");
	public static By expandAll=By.xpath("(//th[contains(text(),'+')])");
	public static By visit1form1Lnk=By.xpath("(//a[@class='anchor-link'])[1]");
	public static By allFormLnk=By.xpath("(//a[@class='anchor-link'])");
	public static By verifyFormBtn=By.xpath("//a[contains(text(),'Verify Form')]");
	public static By backBtn=By.xpath("//a[contains(text(),'Back')]");
	
	//DM
	public static By editDMRowBtn=By.xpath("//*[@id='imgadd1']");
	public static By DMcomplMandatoryDD=By.xpath("//*[@id='GCompletionMandatory']");
	public static By DMSignatureDD=By.xpath("//*[@id='GRequireSignature']");
	public static By DMsigningLineTxt=By.xpath("//*[@id='txtSigningLine']");
	public static By DMPartialAppDD=By.xpath("//*[@id='GPartialApproval']");
	public static By DMAllowOpenQueriesDD=By.xpath("//*[@id='GAllowOpenQueries']"); 
	public static By DMselectFormLnk=By.xpath("//*[@id='btnGetAssignForms1']");
	public static By DMselectFormDD=By.xpath("//*[@id='FormType']");
	public static By DMselFormSaveBtn=By.xpath("//*[@id='btnSave']");
	public static By DMsaveImgBtn=By.xpath("//*[@id='imgedit1']");
	
	//SignOff
	public static By editSORowBtn=By.xpath("//*[@id='imgadd2']");
	public static By SOcomplMandatoryDD=By.xpath("//*[@id='GCompletionMandatory']");
	public static By SOSignatureDD=By.xpath("//*[@id='GRequireSignature']");
	public static By SOsigningLineTxt=By.xpath("//*[@id='txtSigningLine']");
	public static By SOPartialAppDD=By.xpath("//*[@id='GPartialApproval']");
	public static By SOAllowOpenQueriesDD=By.xpath("//*[@id='GAllowOpenQueries']"); 
	public static By SOselectFormLnk=By.xpath("//*[@id='btnGetAssignForms2']");
	public static By SOselectFormDD=By.xpath("//*[@id='FormType']");
	public static By SOselFormSaveBtn=By.xpath("//*[@id='btnSave']");
	public static By SOsaveImgBtn=By.xpath("//*[@id='imgedit2']");
}
