package com.PageObjectRepository;

import org.openqa.selenium.By;

public class CRFDesignPageElements {

	public static By CrfDesignLnk=By.xpath("//a[@id='idCD']");
	public static By createCRFbtn=By.xpath("//button[@id='btnCreateCRF']");
	public static By ManageCRFbtn=By.xpath("//button[@id='btnManageCRF']");
	public static By saveAndNextBtn=By.xpath("//button[@id='btnSave']");
	public static By nextBtn=By.xpath("//*[@id='btnNext']");
	public static By mouseHoverOnselectForms=By.xpath("//div[@class='dropdown1']");
	public static By allFormsChb=By.xpath("//div[@class='dropdown1']//input");
	public static By addToVisitChb=By.xpath("//div[@class='ecrf-select-box']//input");
	public static By auditLog=By.xpath("//a[text()='Audit Log']");
	public static By auditLogCloseBtn=By.xpath("//*[@id='auditlog-popup']/a");
	public static By previousBtn=By.xpath("//button[text()='Previous']");
	
	//Create CRF-ECRF Design Tool page
	public static By ecrfNameTxt=By.xpath("//input[@id='txtFormName']");
	public static By chooseDefaultTemplateDD=By.xpath("//*[@id='ddlFormList']");
	public static By defTempFromAnthrStudySelStudyDD=By.xpath("//*[@id='DDLStudy']");
	public static By defTempFromAnthrStudySelFormDD=By.xpath("//*[@id='ddlStudyFormList']");
	public static By formDescriptionTxt=By.xpath("//*[@id='txtFormDescription']");
	public static By previewFormBtn=By.xpath("//*[@id='btnpreviewForm']");
	public static By editFormBtn=By.xpath("//*[@id='btnEditForm']");
	public static By saveFormBtn=By.xpath("//*[@id='btnSaveForm']");
	public static By closeWindowBtn=By.xpath("//*[@id='btnclosewindow']");
	public static By domain=By.xpath("//*[@id='txtDomain']");
	public static By variableBtn=By.xpath("//*[@id='btnCDASH']");
	
	//Manage ECRF Page
	public static By createNewEcrfBtn=By.xpath("//a[contains(text(),'create New eCRF')]");
	public static By manageEcrfCloseBtn=By.xpath("//*[@id='btnclosewindow']");
	public static By enterSearchTxt=By.xpath("//*[@id='txtSearch']");
	public static By freezeForms=By.xpath("//a[contains(text(),'Freeze')]");
	
	//print functionality
	public static By printSpecificEcrfLnk=By.xpath("//a[contains(text(),'Specific ECRF')]");
	public static By printAnnotatedEcrfLnk=By.xpath("//a[contains(text(),'Annotated ECRF')]");
	public static By printEcrfBookletLnk=By.xpath("//a[contains(text(),'ECRF Booklet')]");
	public static By printEcrfmainBtn=By.xpath("//span[contains(text(),'Print ECRF')]");
	public static By PSpecificSelFormDD=By.xpath("//select[@id='formID']");
	public static By PSpecificPrintBtn=By.xpath("//button[contains(text(),'Print')]");
	public static By PUniquePrintBtn=By.xpath("//button[contains(text(),'Print')]");
	public static By PEcrfBookletPrintBtn=By.xpath("//button[contains(text(),'Print')]");
	
	//CRF mapping
	public static By selectFirstForm=By.xpath("(//div[@class='dropdown1']//input)[2]");
	public static By selectFirstVisit=By.xpath("(//div[@class='ecrf-select-box']//input)[2]");
	public static By firstVisitNameLbl=By.xpath("(//div[@class='ecrf-select-box']//label)[2]");
	public static By listOfAllForms=By.xpath("//div[@class='dropdown1']//li/label");
	
	//CRF form design variables
	public static By sizehunderedPercent=By.xpath("//input[@type='radio' and @value='100']");
	public static By calendar=By.xpath("//span[text()='Calendar']");
	public static By calendarSingle=By.xpath("//a[text()='Single']");
	public static By calendarRelated=By.xpath("//a[text()='Related']");
	public static By checkboxSingle=By.xpath("//span[text()='Checkbox']");
	public static By checkboxGroup=By.xpath("//span[text()='Checkbox Group']");
	public static By chbGpHori=By.xpath("//span[@class='ico-chkboxgroup expender']/following::span[@class='ckbgrp-hr']");
	public static By chbGpHoriAddItems=By.xpath("//div[@class='chkgrp-horizontal']//span[@title='add item']");
	public static By chbGpVert=By.xpath("//span[@class='ico-chkboxgroup expender']/following::span[@class='ckbgrp-ve']");
	public static By chbGpVertAddItems=By.xpath("//div[@class='chkgrp-vertical']//span[@title='add item']");
	public static By dropdown=By.xpath("//span[text()='Dropdown']");
	public static By ddAddItemstxt=By.xpath("//input[@id='ddltxt5']");
	public static By ddAddItemsBtn=By.xpath("//*[@id='btnsend hideoptions5']");
	public static By multiLineTxtBx=By.xpath("//span[text()='Multi Line TextBox']");
	public static By radioBtnGp=By.xpath("//span[text()='Radiobutton Group']");
	public static By radioBtnGpHori=By.xpath("//span[@class='ico-radio expender']/following::span[@class='rbgrp-hr']");
	public static By radioBtnGpHoriAddItems=By.xpath("//div[@class='rbgrp-horizontal']//span[@title='add item']");
	public static By radioBtnGpVert=By.xpath("//span[@class='ico-radio expender']/following::span[@class='rbbgrp-ve']");
	public static By radioBtnGpVertAddItems=By.xpath("//div[@class='rbgrp-vertical']//span[@title='add item']");
	public static By textBox=By.xpath("//span[text()='TextBox']");
	public static By dateTime=By.xpath("//span[text()='Date&time']");
	public static By time=By.xpath("//span[text()='Time']");
	public static By month=By.xpath("//span[text()='Month']");
	public static By year=By.xpath("//span[text()='Year']");
	public static By fileUpload=By.xpath("//span[text()='File Upload']");
	public static By calculation=By.xpath("//span[text()='Calculation']");
	public static By DayMonthYear=By.xpath("//span[text()='DayMonthYear']");
	
	//Give label to variable
	public static By calendarlbl=By.xpath("//*[@id='lbl1']");
	public static By checkboxSingleLbl=By.xpath("//*[@id='lbl2']");
	public static By chbgpHoriLbl=By.xpath("//*[@id='lbl3']");
	public static By chbgpVertLbl=By.xpath("//*[@id='lbl4']");
	public static By ddLbl=By.xpath("//*[@id='lbl5']");
	public static By multiLineTxtLbl=By.xpath("//*[@id='lbl6']");
	public static By radioBtngpHoriLbl=By.xpath("//*[@id='lbl7']");
	public static By radioBtngpVertLbl=By.xpath("//*[@id='lbl8']");
	public static By textboxLbl=By.xpath("//*[@id='lbl9']");
	public static By dateTimeLbl=By.xpath("//*[@id='lbl10']");
	public static By timeLbl=By.xpath("//*[@id='lbl11']");
	public static By monthLbl=By.xpath("//*[@id='lbl12']");
	public static By yearLbl=By.xpath("//*[@id='lbl13']");
	public static By fileUploadLbl=By.xpath("//*[@id='lbl14']");
	public static By calcLbl=By.xpath("//*[@id='lbl15']");
	public static By DayMonthYearLbl=By.xpath("//*[@id='lbl16']");
	
	//Table Headers
	public static By tableHeaderTxt1Lbl=By.xpath("(//input[@class='cls-control-caption' and @placeholder='Title/Text'])[1]");
	public static By tableHeaderTxt2Lbl=By.xpath("(//input[@class='cls-control-caption' and @placeholder='Title/Text'])[3]");
	public static By tableHeaderTxt3Lbl=By.xpath("(//input[@class='cls-control-caption' and @placeholder='Title/Text'])[5]");
	public static By tbl1Col1Lbl=By.xpath("//*[@id='tbl000']/input");
	public static By tbl1Col2Lbl=By.xpath("//*[@id='tbl001']/input");
	public static By tbl2Col1Lbl=By.xpath("//*[@id='tbl100']/input");
	public static By tbl2Col2Lbl=By.xpath("//*[@id='tbl101']/input");
	public static By tbl3Col1Lbl=By.xpath("//*[@id='tbl200']/input");
	public static By tbl3Col2Lbl=By.xpath("//*[@id='tbl201']/input");
	
	//Table controls dropdown
	public static By table=By.xpath("//span[text()='Table']");
	public static By tablerows=By.xpath("//*[@id='txtTableRows']");
	public static By tableCols=By.xpath("//*[@id='txtTableCols']");
	public static By tableGenerateBtn=By.xpath("//*[@id='btnGenerateForm']");
	public static By CdashVariableBtn=By.xpath("//*[@id='btnCDASH']");
	public static By tbl1Col1VariableDD=By.xpath("//*[@id='tbl000']/span/select");
	public static By tbl1Col2VariableDD=By.xpath("//*[@id='tbl001']/span/select");
	public static By tbl2Col1VariableDD=By.xpath("//*[@id='tbl100']/span/select");
	public static By tbl2Col2VariableDD=By.xpath("//*[@id='tbl101']/span/select");
	public static By tbl3Col1VariableDD=By.xpath("//*[@id='tbl200']/span/select");
	public static By tbl3Col2VariableDD=By.xpath("//*[@id='tbl201']/span/select");
	
	//CDASH normal controls
	public static By CDASHtxtbxLnk=By.xpath("//*[@id='dv_txt']");
	public static By CDASHtxtVarNameTxt=By.xpath("//*[@id='cdashidtxt0']");
	public static By CDASHtxtVarNameTxtByClass=By.cssSelector("input[class=cdashcls]");
	public static By CDASHtxtPromptTxt=By.xpath("//*[@id='cdashprompttxt0']");
	public static By CDASHtxtVarNameTxt2=By.xpath("//*[@id='cdashidtxt1']");
	public static By CDASHtxtPromptTxt2=By.xpath("//*[@id='cdashprompttxt1']");
	public static By CDASHtxtSaveBtn=By.xpath("//*[@id='btnSaveCDASH']");
	public static By CDASHtxtSave2Btn=By.xpath("(//*[@id='btnSaveCDASH'])[2]");
	public static By CDASHMultiLinetxtLnk=By.xpath("//*[@id='dv_MulTxt']");
	public static By CDASHddLnk=By.xpath("//*[@id='dv_ddl']");
	public static By CDASHchbLnk=By.xpath("//*[@id='dv_chk']");
	public static By CDASHcalLnk=By.xpath("//*[@id='dv_cal']");
	public static By CDASHchbGpLnk=By.xpath("//*[@id='dv_chkGrp']");
	public static By CDASHrdBtnLnk=By.xpath("//*[@id='dv_rbtnGrp']");
	public static By CDASHDateTimeLnk=By.xpath("//div[text()='Date and Time']");
	public static By CDASHmonthLnk=By.xpath("//div[text()='Month']");
	public static By CDASHyearLnk=By.xpath("//div[text()='Year']");
	public static By CDASHtimeLnk=By.xpath("//div[text()='Time']");
	public static By CDASHfileUploadLnk=By.xpath("//div[text()='FileUpload']");
	public static By CDASHCalcLnk=By.xpath("//div[text()='Calculation']");
	public static By CDASHDayMonthYearLnk=By.xpath("//div[text()='DayMonthYear']");
	
	
	//Tabular CDASH
	public static By tabularCDASH=By.xpath("//*[@id='dv_table']");
	public static By tabularCDASHcalLnk=By.xpath("//*[@id='tbl_Calender']");
	public static By tabularCDASHchkbxLnk=By.xpath("//*[@id='tbl_chk']");
	public static By tabularCDASHchkGpLnk=By.xpath("//*[@id='tbl_chkGrp']");
	public static By tabularCDASHddLnk=By.xpath("//*[@id='tbl_ddl']");
	public static By tabularCDASHrdBtnLnk=By.xpath("//*[@id='tbl_rbtnGrp']");
	public static By tabularCDASHtxtbxLnk=By.xpath("//*[@id='tbl_txt']");
	public static By tabularCDASHSaveBtn=By.xpath("(//*[@id='btnTabularInsert'])[1]");
	public static By tabularCDASHSaveBtn2=By.xpath("(//*[@id='btnTabularInsert'])[2]");
	public static By CDASHClosePopUp=By.xpath("//*[@id='closevalidationPopupCDASH']");
	
}
