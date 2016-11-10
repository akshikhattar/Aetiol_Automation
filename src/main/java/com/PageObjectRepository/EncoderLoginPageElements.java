package com.PageObjectRepository;

import org.openqa.selenium.By;

public class EncoderLoginPageElements {

	public static By homePageLnk=By.xpath("//*[@id='IdCM']");
	public static By OmissionMgmtLnk=By.xpath("//*[text()='Omission Management']");
	public static By ClassifyVTLnk=By.xpath("//*[text()='Classify Verbatim Terms']");
	public static By MaintenanceofVTLnk=By.xpath("//*[text()='Maintenance Of VT']");
	public static By DeclassifyVTLnk=By.xpath("//*[text()='Declassify/Reclassify VT']");
	public static By reportsLnk=By.xpath("//*[text()='Reports']");
	public static By CodingGlossaryReportLnk=By.xpath("//*[text()='Coding Glossary']");
	public static By downloadReportBtn=By.xpath("//*[text()='Download Report']");
	public static By backBtn=By.xpath("//*[text()='Back']");
	public static By ListingReportLnk=By.xpath("//*[text()='Listing Report']");
	public static By queryListingLnk=By.xpath("//*[text()='Query Listing']");
	public static By queryListingHeaderLnk=By.xpath("//*[@id='queryCount']");

	//Classification of Verbatim Terms
	public static By selectSiteDD=By.xpath("//*[@id='SiteType']");
	public static By selectSubjDD=By.xpath("//*[@id='ddpSubject']");
	public static By selectVisitDD=By.xpath("//*[@id='ddpVisit']");
	public static By selectDomainDD=By.xpath("//*[@id='ddpDomain']");
	public static By selectCRFDD=By.xpath("//*[@id='ddpCRF']");
	public static By applyBtn=By.xpath("//*[@id='btnApply']");
	public static By classifyVT1rd1=By.xpath("//*[@id='VTs']/tr[2]//input");
	public static By classifyVTsearchDTtxt=By.xpath("//*[@id='SearchRT']");
	public static By classifyVTsearchDTrd=By.xpath("(//ul[@id='RTs']//input)[1]");
	public static By classifyVTsearchDTrd1=By.xpath("(//ul[@id='RTs']//input)[2]");
	public static By classifyVtBtn=By.xpath("//button[text()='Classify Verbatim Term']");
	public static By generateQuery=By.xpath("(//*[@id='VTs']//img)[3]");
	public static By querycomments=By.xpath("//table[@class='status-table']//textarea");
	public static By generateQuerySaveBtn=By.xpath("//table[@class='status-table']//button[@value='Save']");
	
	
	//De-classify/Reclassify VT
	public static By ReclassifyBtn=By.xpath("//button[text()='Reclassify VT']");
	public static By DeclassifyBtn=By.xpath("//button[text()='Declassify VT']");
	public static By historyBtn=By.xpath("(//*[@id='VTs']//img)[1]");
	public static By closeAuditLog=By.xpath("//*[@class='close-auditlog-popup']");
	
}
