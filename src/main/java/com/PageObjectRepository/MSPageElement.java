package com.PageObjectRepository;

import org.openqa.selenium.By;

public class MSPageElement {

	public static By ManageStudyLnk=By.xpath("//*[@id='IdMS']");
	public static By studyMgmtOptionsLnk=By.xpath("//a[contains(text(),'Study Management Options')]");
	public static By documentMgmtLnk=By.xpath("//a[@id='iddmnt']");
	
	//*******Document Management**********
	public static By uploadBtn=By.xpath("//button[contains(text(),'Upload')]");
	public static By browserFile=By.xpath("//*[@id='file']");
	
	//*******Study Management Options>Bulk approvals and Approvals
	//Bulk Approval
	public static By bulkApprovalLnk=By.xpath("//*[@id='aBulkApproval']");
	public static By approvalLnk=By.xpath("//*[@id='aApproval']");
	public static By selectApprovalStepDD=By.xpath("//*[@id='ddlRoleName']");
	public static By expandSite=By.xpath("//a[@id='AncharSite0']/input[1]");
	public static By expandSubject1=By.xpath("//a[@id='0']/input[1]");
	public static By siteSelectAllChb=By.xpath("//*[@id='chkSite_90']");
	public static By subj1Visit1chb=By.xpath("(//a[@class='parent item-0 closed']/input)[5]");
	public static By bulkApprovalApplyBtn=By.xpath("//button[contains(text(),'Apply')]");
	
	//Approval
	public static By approvalsLnk=By.xpath("//*[@id='aApproval']");
	public static By approvalsSitesDD =By.xpath("//*[@id='objBulkApproval_SiteID']");
	public static By approvalsSubjStatusDD =By.xpath("//*[@id='objBulkApproval_SubjectStatus']");
	public static By approvalsSubjIdDD =By.xpath("//*[@id='objBulkApproval_SubjectId']");
	public static By approvalsApprovalsDD =By.xpath("//*[@id='objBulkApproval_Approvals']");
	public static By approvalsVisitsDD =By.xpath("//*[@id='objBulkApproval_VisitID']");
	public static By approvalsFormsDD =By.xpath("//*[@id='objBulkApproval_FormID']");
	public static By approvalsFormStatusDD =By.xpath("//*[@id='objBulkApproval_FormStatus']");
	public static By approvalsApplyBtn =By.xpath("(//button[contains(text(),'Apply')])[2]");
}
