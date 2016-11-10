package com.Pages;

import org.openqa.selenium.WebDriver;
import com.GenericLib.ActionDriver;
import com.PageObjectRepository.EncoderLoginPageElements;

public class EncoderLoginPage extends ActionDriver{

	public EncoderLoginPage(WebDriver driver) {
		super(driver);
	}

	public EncoderLoginPage OpenclassifyVTs(String siteId,String subjId,String Domain,String visit,String formname) throws InterruptedException{
		
		click(EncoderLoginPageElements.OmissionMgmtLnk);
		click(EncoderLoginPageElements.ClassifyVTLnk);
		Thread.sleep(2500);
		selectDropDown(EncoderLoginPageElements.selectSiteDD, siteId);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectSubjDD, subjId);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectVisitDD, visit);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectDomainDD, Domain);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectCRFDD, formname);Thread.sleep(500);
		click(EncoderLoginPageElements.applyBtn);
		return new EncoderLoginPage(driver);
	}
	
	public EncoderLoginPage classifyVTs(){
		click(EncoderLoginPageElements.classifyVT1rd1);
		type(EncoderLoginPageElements.classifyVTsearchDTtxt,"Myopia");
		click(EncoderLoginPageElements.classifyVTsearchDTrd);
		click(EncoderLoginPageElements.classifyVtBtn);
		acceptAlert();
		click(EncoderLoginPageElements.generateQuery);
		type(EncoderLoginPageElements.querycomments,"Please correct it Tooth infection");
		click(EncoderLoginPageElements.generateQuerySaveBtn);
		acceptAlert();
		return new EncoderLoginPage(driver);
	}
	public EncoderLoginPage De_ReClassifyVTs(String siteId,String subjId,String Domain,String visit,String formname) throws InterruptedException{
		click(EncoderLoginPageElements.MaintenanceofVTLnk);
		click(EncoderLoginPageElements.DeclassifyVTLnk);
		selectDropDown(EncoderLoginPageElements.selectSiteDD, siteId);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectSubjDD, subjId);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectVisitDD, visit);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectDomainDD, Domain);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectCRFDD, formname);Thread.sleep(500);
		click(EncoderLoginPageElements.applyBtn);
		Thread.sleep(2500);
		click(EncoderLoginPageElements.classifyVT1rd1);
		type(EncoderLoginPageElements.classifyVTsearchDTtxt,"Myopia");
		click(EncoderLoginPageElements.classifyVTsearchDTrd1);
		click(EncoderLoginPageElements.ReclassifyBtn);
		acceptAlert();
		click(EncoderLoginPageElements.historyBtn);
		Thread.sleep(1500);
		click(EncoderLoginPageElements.closeAuditLog);
		click(EncoderLoginPageElements.classifyVT1rd1);
		click(EncoderLoginPageElements.DeclassifyBtn);
		acceptAlert();
		return new EncoderLoginPage(driver);
	}
	public EncoderLoginPage classifyVTsTabular(){
		click(EncoderLoginPageElements.classifyVT1rd1);
		type(EncoderLoginPageElements.classifyVTsearchDTtxt,"shakiness");
		click(EncoderLoginPageElements.classifyVTsearchDTrd);
		click(EncoderLoginPageElements.classifyVtBtn);
		acceptAlert();
		click(EncoderLoginPageElements.generateQuery);
		type(EncoderLoginPageElements.querycomments,"Please correct it to Headache");
		click(EncoderLoginPageElements.generateQuerySaveBtn);
		acceptAlert();
		return new EncoderLoginPage(driver);
	}
	public EncoderLoginPage De_ReClassifyVTsTabular(String siteId,String subjId,String Domain,String visit,String formname) throws InterruptedException{
		click(EncoderLoginPageElements.MaintenanceofVTLnk);
		click(EncoderLoginPageElements.DeclassifyVTLnk);
		selectDropDown(EncoderLoginPageElements.selectSiteDD, siteId);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectSubjDD, subjId);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectVisitDD, visit);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectDomainDD, Domain);Thread.sleep(500);
		selectDropDown(EncoderLoginPageElements.selectCRFDD, formname);Thread.sleep(500);
		click(EncoderLoginPageElements.applyBtn);
		Thread.sleep(2500);
		click(EncoderLoginPageElements.classifyVT1rd1);
		type(EncoderLoginPageElements.classifyVTsearchDTtxt,"Shaking");
		click(EncoderLoginPageElements.classifyVTsearchDTrd);
		click(EncoderLoginPageElements.ReclassifyBtn);
		acceptAlert();
		click(EncoderLoginPageElements.historyBtn);
		Thread.sleep(1500);
		click(EncoderLoginPageElements.closeAuditLog);
		click(EncoderLoginPageElements.classifyVT1rd1);
		click(EncoderLoginPageElements.DeclassifyBtn);
		acceptAlert();
		return new EncoderLoginPage(driver);
	}
	public EncoderLoginPage OpenDEclassifyVTs() throws InterruptedException{
		click(EncoderLoginPageElements.classifyVT1rd1);
		click(EncoderLoginPageElements.DeclassifyBtn);
		return new EncoderLoginPage(driver);
	}
	public EncoderLoginPage Reports() throws InterruptedException{
		click(EncoderLoginPageElements.reportsLnk);	
		click(EncoderLoginPageElements.CodingGlossaryReportLnk);
		click(EncoderLoginPageElements.downloadReportBtn);Thread.sleep(500);
		click(EncoderLoginPageElements.backBtn);
		click(EncoderLoginPageElements.ListingReportLnk);
		Thread.sleep(500);
		return new EncoderLoginPage(driver);
	}
	public EncoderLoginPage QueryListing(){
		click(EncoderLoginPageElements.queryListingLnk);	
		click(EncoderLoginPageElements.queryListingHeaderLnk);	
		return new EncoderLoginPage(driver);
	}
}
