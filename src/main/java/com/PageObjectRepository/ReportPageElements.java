package com.PageObjectRepository;

import org.openqa.selenium.By;

public class ReportPageElements {

	public static By reportsLnk=By.xpath("//*[@id='IdRep']");
	public static By subjDataSmryRprtLnk=By.xpath("//a[contains(text(),'Subject Data Summary Report')]");
	public static By QueriesRprtLnk=By.xpath("//a[contains(text(),'Queries Report')]");
	public static By A_monitorLogRprtLnk=By.xpath("//a[contains(text(),'Aetiol_Monitor Log Report')]");
	public static By A_FieldStatusRprtLnk=By.xpath("//a[contains(text(),'Aetiol_Field Status Report')]");
	public static By A_MissingDataRprtLnk=By.xpath("//a[contains(text(),'Aetiol_Missing Data Report')]");
	
	//Subject Data Summary Report
	public static By SDSRsiteDD=By.xpath("//*[@id='bindtotalSite']");
	public static By SDSRsubjectDD=By.xpath("//*[@id='bindtotalSubject']");
	public static By SDSRstatusDD=By.xpath("//*[@id='bindtotalSubjectStatus']");
	public static By SDSRVisitsDD=By.xpath("//*[@id='bindtotalVisit']");
	public static By SDSRformsDD=By.xpath("//*[@id='bindtotalForms']");
	public static By SDSRfileformatDD=By.xpath("//*[@id='ddlXport']");
	public static By SDSRgenerateBtn=By.xpath("//button[contains(text(),'Generate')]");
	public static By SDSRDownloadRprtBtn=By.xpath("//*[@id='btnReport']");
	public static By SDSRbackBtn=By.xpath("//button[contains(text(),'Back')]");
	
	//Queries Report
	public static By QRvisitDD=By.xpath("//*[@id='bindtotalVisit']");
	public static By QRformsDD=By.xpath("//*[@id='bindtotalForms']");
	public static By QRassignedGpDD=By.xpath("//*[@id='bindtotalAssignedGroup']");
	public static By QRqueryTypeDD=By.xpath("//*[@id='QueryType']");
	public static By QRgenerateBtn=By.xpath("//button[contains(text(),'Generate')]");
	public static By QRbackBtn=By.xpath("//button[contains(text(),'Back')]");
	public static By QRfileFormatDD=By.xpath("//*[@id='ddlXport']");
	public static By QRdownloadRprtBtn=By.xpath("//button[contains(text(),'Download Report')]");
	
	//Aetiol Monitor Log Report
	public static By AMLRsiteDD=By.xpath("//*[@id='bindtotalSite']");
	public static By AMLRgroupDD=By.xpath("//*[@id='bindtotalGroup']");
	public static By AMLRvisitDD=By.xpath("//*[@id='bindtotalVisit']");
	public static By AMLRgenerateBtn=By.xpath("//button[contains(text(),'Generate')]");
	public static By AMLRbackBtn=By.xpath("//button[contains(text(),'Back')]");
	public static By AMLRfileFormatDD=By.xpath("//*[@id='ddlXport']");
	public static By AMLRdownloadRprtBtn=By.xpath("//button[contains(text(),'Download Report')]");
	
	//Aetiol Field Status Report
	public static By AFSRsiteDD=By.xpath("//*[@id='bindtotalSite']");
	public static By AFSRgroupDD=By.xpath("//*[@id='bindtotalGroup']");
	public static By AFSRVisitsDD=By.xpath("//*[@id='bindtotalVisit']");
	public static By AFSRformsDD=By.xpath("//*[@id='bindtotalForms']");
	public static By AFSRsubjectsDD=By.xpath("//*[@id='bindtotalSubject']");
	public static By AFSRfieldStatusDD=By.xpath("//*[@id='bindFieldStatus']");
	public static By AFSRfileformatDD=By.xpath("//*[@id='ddlXport']");
	public static By AFSRgenerateBtn=By.xpath("//button[contains(text(),'Generate')]");
	public static By AFSRDownloadRprtBtn=By.xpath("//button[contains(text(),'Download Report')]");
	public static By AFSRbackBtn=By.xpath("//button[contains(text(),'Back')]");
	public static By AFSRpaginationDD=By.xpath("//*[@id='bindPageNumber']");
	
	//Aetiol Missing Data Report
	public static By AMDRsiteDD=By.xpath("//*[@id='bindtotalSite']");
	public static By AMDRgroupDD=By.xpath("//*[@id='bindtotalGroup']");
	public static By AMDRvisitDD=By.xpath("//*[@id='bindtotalVisit']");
	public static By AMDRformsDD=By.xpath("//*[@id='bindtotalForms']");
	public static By AMDRsubjectDD=By.xpath("//*[@id='bindtotalSubject']");
	public static By AMDRgenerateBtn=By.xpath("//button[contains(text(),'Generate')]");
	public static By AMDRbackBtn=By.xpath("//button[contains(text(),'Back')]");
	public static By AMDRfileFormatDD=By.xpath("//*[@id='ddlXport']");
	public static By AMDRdownloadRprtBtn=By.xpath("//button[contains(text(),'Download Report')]");
	public static By AMDRpaginationDD=By.xpath("//*[@id='bindPageNumber']");
	
}
