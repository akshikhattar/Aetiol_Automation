package com.PageObjectRepository;

import org.openqa.selenium.By;

public class QueryMgmtPageElements {

	public static By queryMgmtLnk=By.xpath("//*[@id='idQueryManagement']/a");
	public static By automaticQuery=By.xpath("//a[@id='IdAutomatic']");
	public static By skipQuery=By.xpath("//a[@id='IdSkip']");
	public static By customQuery=By.xpath("//a[@id='IdCustom']");
	
	//Automatic Query
	public static By automaticSelectFormDD=By.xpath("//*[@id='ddlAutomatic']");
	public static By firstElementCalorTxt=By.xpath("//a[@id='txt14']");
	public static By firstElementChkgrpHori=By.xpath("(//*[@class='flds']/div)[1]");
				//Hard Check
	public static By hardcheckEditImgBtn=By.xpath("//*[@id='editSkipHard']");
	public static By hardCheckMaxtxt=By.xpath("//*[@id='txtMaxVal']");
	public static By hardCheckMintxt=By.xpath("//*[@id='txtMinVal']");
	public static By hardCheckalertChb=By.xpath("//*[@id='chkAlert']");
	public static By hardcheckQueryChb=By.xpath("//*[@id='chkQuery']");
	public static By hardcheckCommGpDD=By.xpath("//*[@id='drpCommgrphard']");
	public static By hardcheckmessageTxt=By.xpath("//*[@id='txtMsg']");
	public static By hardcheckStatusDD=By.xpath("//*[@id='ddlStatus']");	
	public static By hardcheckSaveImgBtn=By.xpath("//*[@id='savebtnhard']");
				//Soft Check
	public static By softcheckEditImgBtn=By.xpath("//*[@id='editSkipsoft']");
	public static By softCheckMaxtxt=By.xpath("//*[@id='txtMaxValsoft']");
	public static By softCheckMintxt=By.xpath("//*[@id='txtMinValsoft']");
	public static By softCheckalertChb=By.xpath("//*[@id='chkAlertsoft']");
	public static By softcheckQueryChb=By.xpath("//*[@id='chkQuerysoft']");
	public static By softcheckCommGpDD=By.xpath("//*[@id='drpCommgrpsoft']");
	public static By softcheckmessageTxt=By.xpath("//*[@id='txtMsgsoft']");
	public static By softcheckStatusDD=By.xpath("//*[@id='ddlStatussoft']");	
	public static By softcheckSaveImgBtn=By.xpath("//*[@id='savebtnsoft']");
	//Soft Check
	public static By skipMissingEditImgBtn=By.xpath("//*[@id='editSkipmissing']");
	public static By skipMissingMaxtxt=By.xpath("//*[@id='txtMaxValmissing']");
	public static By skipMissingMintxt=By.xpath("//*[@id='txtMinValmissing']");
	public static By skipMissingalertChb=By.xpath("//*[@id='chkAlertmissing']");
	public static By skipMissingQueryChb=By.xpath("//*[@id='chkQuerymissing']");
	public static By skipMissingCommGpDD=By.xpath("//*[@id='drpCommgrpmissing']");
	public static By skipMissingmessageTxt=By.xpath("//*[@id='txtMsgmissing']");
	public static By skipMissingStatusDD=By.xpath("//*[@id='ddlStatusmissing']");	
	public static By skipMissingSaveImgBtn=By.xpath("//*[@id='savebtnmissing']");
	
	//Skip Query
	public static By addSkipQueryBtn=By.xpath("//*[@id='btnSkip']");
	public static By skipSelectFormDD=By.xpath("//*[@id='AddSkipRow']/td[1]/select");
	public static By skipSlectVisitDD=By.xpath("//*[@id='AddSkipRow']/td[2]/select");
	public static By skipNameTxt=By.xpath("//*[@id='txtSkipName']");
	public static By skipSelVariableDD=By.xpath("//*[@id='ddlCRFVariables']");
	public static By skipSelectValueTxt=By.xpath("//*[@id='txtVariableName']");
	public static By selectSkipVarDD=By.xpath("//*[@id='ddlCRFVariableskip']");
	public static By skipAddImgBtn=By.xpath("//*[@id='imgSkipadd']");
	
	//custom query
	public static By addCustomqueryBtn=By.xpath("//*[@id='btnSkip']");
	public static By customCommGpDD=By.xpath("//*[@id='ddlCommgrp']");
	public static By customQueryNameTxt=By.xpath("//*[@id='txtQueryName']");
	public static By customDescriptionTxt=By.xpath("//*[@id='txtDescription']");
	public static By customStatusDD=By.xpath("//*[@id='txtStatus']");
	public static By customSelFormDD=By.xpath("//*[@id='ddlFormName']");
	public static By customSelVarDD=By.xpath("//*[@id='FormVariables']");
	public static By customSelVisitDD=By.xpath("(//*[@id='ddlVisit'])[1]");
	public static By customCondition1DD=By.xpath("//*[@id='tdCustomadd']/select[1]");
	public static By customSelForm1DD=By.xpath("(//*[@id='ddlFormNamenew'])[1]");
	public static By customSelVar1DD=By.xpath("(//*[@id='trId']/td[2]/select)[1]");
	public static By customSelVisit1DD=By.xpath("(//*[@id='ddlVisit'])[2]");
	public static By addCndtnImgBtn1 =By.xpath("(//*[@id='btnAdd'])[1]");
	public static By customCondition2DD=By.xpath("//*[@id='tdCustomadd']/select[2]");
	public static By customSelForm2DD=By.xpath("(//*[@id='ddlFormNamenew'])[2]");
	public static By customSelVar2DD=By.xpath("(//*[@id='trId']/td[2]/select)[2]");
	public static By customSelVisit2DD=By.xpath("(//*[@id='ddlVisit'])[3]");
	public static By addCndtnImgBtn2 =By.xpath("(//*[@id='btnAdd'])[2]");
	public static By andOrDD1=By.xpath("//*[@id='ConditionAndOr']/select[2]");
	public static By SaveCustomQryBtn=By.xpath("//*[@id='btnCreate']");
	
}
