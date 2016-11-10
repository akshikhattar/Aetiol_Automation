package com.Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.GenericLib.ActionDriver;
import com.PageObjectRepository.CRFDesignPageElements;
import com.PageObjectRepository.HomePageElement;

public class CRFDesignPage extends ActionDriver{

	public CRFDesignPage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickSelectStudyDropdown(String studyName) throws Exception{
		selectDropDown(HomePageElement.SelectStudydropdown,studyName);
		//windowHandles();	
		acceptAlert();
		Thread.sleep(500);
		return new HomePage(driver);
	}
	public CRFDesignPage openCRFPage(){
		click(CRFDesignPageElements.CrfDesignLnk);	
		return new CRFDesignPage(driver);
	}
	public CRFDesignPage createCRFPage(){
		click(CRFDesignPageElements.createCRFbtn);
		return new CRFDesignPage(driver);
	}
	public CRFDesignPage createECRFForm(String EcrfName,String formDescription) throws InterruptedException{
		type(CRFDesignPageElements.ecrfNameTxt, EcrfName);
		type(CRFDesignPageElements.formDescriptionTxt, formDescription);
		type(CRFDesignPageElements.domain,"AE");
		selectDropDownByIndex(CRFDesignPageElements.chooseDefaultTemplateDD, 4);
		//selectDropDownByIndex(CRFDesignPageElements.defTempFromAnthrStudySelStudyDD, 1);
		Thread.sleep(500);
		//selectDropDownByIndex(CRFDesignPageElements.defTempFromAnthrStudySelFormDD, 2);
		scrollDown();
		click(CRFDesignPageElements.previewFormBtn);
		Thread.sleep(1000);
		//click(CRFDesignPageElements.saveFormBtn);
		acceptAlert();
		return new CRFDesignPage(driver);
	}
	public CRFDesignPage OpenManageCRFPage() throws InterruptedException{
		click(CRFDesignPageElements.ManageCRFbtn);
		Thread.sleep(500);
		return new CRFDesignPage(driver);
	}
	public CRFDesignPage ManageCRFPage() throws InterruptedException{
		String parentWin=driver.getWindowHandle();
		System.out.println("p in mapping: "+parentWin);
		Set<String> allWin=driver.getWindowHandles();
		for(String child:allWin){
			System.out.println("c in mapping: "+child);
			if(!child.equalsIgnoreCase(parentWin)){
			System.out.println("cc: "+child);
			clickOnAllElementsWithText(CRFDesignPageElements.freezeForms);
			click(CRFDesignPageElements.manageEcrfCloseBtn);
			acceptAlert();
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			}
		}
		
		return new CRFDesignPage(driver);
	}
	public CRFDesignPage printECRF() throws InterruptedException{
		click(CRFDesignPageElements.nextBtn);
		Thread.sleep(1000);
		mouseOver(CRFDesignPageElements.printEcrfmainBtn);
		Thread.sleep(1000);
		//***********Print-Specific ECRF Form, then select form and print
			/*click(CRFDesignPageElements.printSpecificEcrfLnk);
			selectDropDownByIndex(CRFDesignPageElements.PSpecificSelFormDD, 3);
			click(CRFDesignPageElements.PSpecificPrintBtn);*/
		//**********End of Print-Specific ECRF Form***********
		
		//***********Print-Unique ECRF Form, then select form and print
			click(CRFDesignPageElements.printAnnotatedEcrfLnk);
			scrollDown();Thread.sleep(500);
			click(CRFDesignPageElements.PUniquePrintBtn);
		//**********End of Print-Unique ECRF Form***********
		
		//***********Print-ECRF Booklet Form, then select form and print
		/*click(CRFDesignPageElements.printEcrfBookletLnk);
		scrollDown();Thread.sleep(500);
		click(CRFDesignPageElements.PEcrfBookletPrintBtn);*/
		//**********End of Print-ECRF Booklet Form***********
		
		return new CRFDesignPage(driver);
	}

	public CRFDesignPage mapEcrf() throws InterruptedException{
		click(CRFDesignPageElements.selectFirstForm);
		click(CRFDesignPageElements.selectFirstVisit);
		click(CRFDesignPageElements.saveAndNextBtn);
		return new CRFDesignPage(driver);
	}
	
	public CRFDesignPage CDASHVariable() throws InterruptedException{
		type(CRFDesignPageElements.ecrfNameTxt, "Cdash Form");
		type(CRFDesignPageElements.formDescriptionTxt, "Testing Cdash");
		type(CRFDesignPageElements.domain,"AE");
		click(CRFDesignPageElements.sizehunderedPercent);
		//Calendar
		click(CRFDesignPageElements.calendar);
		clickAndType(CRFDesignPageElements.calendarSingle,CRFDesignPageElements.calendarlbl,"Date");
		//Checkbox Group
		clickAndType(CRFDesignPageElements.checkboxSingle,CRFDesignPageElements.checkboxSingleLbl,"Chb Single");
		//Checkbox Group
		click(CRFDesignPageElements.checkboxGroup);
		clickAndType(CRFDesignPageElements.chbGpHori,CRFDesignPageElements.chbgpHoriLbl,"Chb Hori");
		enterValuesInVariables(CRFDesignPageElements.chbGpHoriAddItems,"CHBH");
		//Checkbox Vertical
		clickAndType(CRFDesignPageElements.chbGpVert,CRFDesignPageElements.chbgpVertLbl,"Chb Vert");
		enterValuesInVariables(CRFDesignPageElements.chbGpVertAddItems,"CHBV");
		//Dropdown
		clickAndType(CRFDesignPageElements.dropdown,CRFDesignPageElements.ddLbl,"Dropdown");
		enterValuesInDD(CRFDesignPageElements.ddAddItemstxt,"DD",CRFDesignPageElements.ddAddItemsBtn);		
		//MultiLineTxt		
		clickAndType1(CRFDesignPageElements.multiLineTxtBx,CRFDesignPageElements.multiLineTxtLbl,"Address");		
		//Radio Btn Horizontal
		click(CRFDesignPageElements.radioBtnGp);
		clickAndType1(CRFDesignPageElements.radioBtnGpHori,CRFDesignPageElements.radioBtngpHoriLbl,"Radio Horizontal");
		enterValuesInVariables(CRFDesignPageElements.radioBtnGpHoriAddItems,"RDBH");
		//Radio Btn Vertical
		clickAndType1(CRFDesignPageElements.radioBtnGpVert,CRFDesignPageElements.radioBtngpVertLbl,"Radio Vertical");
		enterValuesInVariables(CRFDesignPageElements.radioBtnGpVertAddItems,"RDBV");
		//TextBox
		clickAndType(CRFDesignPageElements.textBox,CRFDesignPageElements.textboxLbl,"Txtbx");
		//Date&time
		clickAndType(CRFDesignPageElements.dateTime,CRFDesignPageElements.dateTimeLbl,"DateTime");
		//Time
		clickAndType(CRFDesignPageElements.time,CRFDesignPageElements.timeLbl,"Time");
		//Month
		clickAndType(CRFDesignPageElements.month,CRFDesignPageElements.monthLbl,"Month");
		//Year
		clickAndType(CRFDesignPageElements.year,CRFDesignPageElements.yearLbl,"Year");
		//File Upload
		clickAndType(CRFDesignPageElements.fileUpload,CRFDesignPageElements.fileUploadLbl,"Upload File");
		//Calculation
		clickAndType(CRFDesignPageElements.calculation, CRFDesignPageElements.calcLbl, "Calc");
		//DayMonthYear
		clickAndType(CRFDesignPageElements.DayMonthYear,CRFDesignPageElements.DayMonthYearLbl,"DayMonthYear");
		Thread.sleep(500);
		scrollDown();
		click(CRFDesignPageElements.previewFormBtn);
		click(CRFDesignPageElements.variableBtn);
		applyCDASH(CRFDesignPageElements.CDASHtxtbxLnk, "TXTNAME", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHMultiLinetxtLnk, "MultiTxt", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHddLnk, "DDVar", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHchbLnk, "CHBSingle", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHcalLnk, "DATE", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHchbGpLnk, "CHB1", "TXTPROM");
		applyCDASHtwoVar1(CRFDesignPageElements.CDASHchbGpLnk, "CHB2", "TXTPROM2");
		applyCDASH(CRFDesignPageElements.CDASHrdBtnLnk, "RD1", "TXTPROM");
		applyCDASHtwoVar1(CRFDesignPageElements.CDASHrdBtnLnk, "RD2", "TXTPROM2");
		applyCDASH(CRFDesignPageElements.CDASHDateTimeLnk, "D&T", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHmonthLnk, "MNTH", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHyearLnk, "YEAR", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHDayMonthYearLnk, "DayMonthYear", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHtimeLnk, "TIME", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHfileUploadLnk, "FILE", "TXTPROM");
		applyCDASH(CRFDesignPageElements.CDASHCalcLnk, "CALC", "TXTPROM");
		click(CRFDesignPageElements.CDASHClosePopUp);
		scrollDown();
		click(CRFDesignPageElements.previewFormBtn);
		//click(CRFDesignPageElements.saveFormBtn);
		return new CRFDesignPage(driver);
	}
	public CRFDesignPage CDASHtabular() throws InterruptedException{
		type(CRFDesignPageElements.ecrfNameTxt, "Cdash Form Tab");
		type(CRFDesignPageElements.formDescriptionTxt, "Testing Cdash tabular");
		type(CRFDesignPageElements.domain,"MH");
		click(CRFDesignPageElements.sizehunderedPercent);
		//Table	
		scrollDown();
		Thread.sleep(500);
		click(CRFDesignPageElements.table);
		click(CRFDesignPageElements.tableGenerateBtn);
		click(CRFDesignPageElements.tableGenerateBtn);
		click(CRFDesignPageElements.tableGenerateBtn);
		scrollUp();
		Thread.sleep(500);
		//Table1 col1
		type(CRFDesignPageElements.tableHeaderTxt1Lbl, "Demographic");
		type(CRFDesignPageElements.tbl1Col1Lbl,"AETERM");
		selectDropDown(CRFDesignPageElements.tbl1Col1VariableDD, "Textbox");
		//col2
		type(CRFDesignPageElements.tbl1Col2Lbl,"MHDATE");
		selectDropDown(CRFDesignPageElements.tbl1Col2VariableDD, "Calendar");
		//Table2 col1
		type(CRFDesignPageElements.tableHeaderTxt2Lbl, "Medical History");
		type(CRFDesignPageElements.tbl2Col1Lbl,"MHONGOING");
		selectDropDown(CRFDesignPageElements.tbl2Col1VariableDD, "Checkbox");
		//col2
		type(CRFDesignPageElements.tbl2Col2Lbl,"MHCOUNTRY");
		selectDropDown(CRFDesignPageElements.tbl2Col2VariableDD, "Dropdown");
		sendTextToAlert("India,USA,China,Japan");
		//Table3 col1
		type(CRFDesignPageElements.tableHeaderTxt3Lbl, "Physical exam");
		type(CRFDesignPageElements.tbl3Col1Lbl,"MHGENDER");
		selectDropDown(CRFDesignPageElements.tbl3Col1VariableDD, "Radiobutton Group");
		sendTextToAlert("Male,Female");
		//col2
		type(CRFDesignPageElements.tbl3Col2Lbl,"MHRACE");
		selectDropDown(CRFDesignPageElements.tbl3Col2VariableDD, "Checkbox Group");
		sendTextToAlert("Asian,Black,White");
		Thread.sleep(500);
		scrollDown();
		click(CRFDesignPageElements.previewFormBtn);
		click(CRFDesignPageElements.variableBtn);
		Thread.sleep(500);
		click(CRFDesignPageElements.tabularCDASH);
		applyCDASHtab(CRFDesignPageElements.tabularCDASHcalLnk, "MHDATE", "TBLPROM");
		applyCDASHtab(CRFDesignPageElements.tabularCDASHchkbxLnk, "MHONGOING", "TBLPROM");
		applyCDASHtab(CRFDesignPageElements.tabularCDASHchkGpLnk, "MHRACE", "TBLPROM");
		applyCDASHtab(CRFDesignPageElements.tabularCDASHddLnk, "MHCOUNTRY", "TBLPROM");
		applyCDASHtab(CRFDesignPageElements.tabularCDASHrdBtnLnk, "MHTERM", "TBLPROM");
		applyCDASHtab(CRFDesignPageElements.tabularCDASHtxtbxLnk, "AETERM", "TBLPROM");
		click(CRFDesignPageElements.CDASHClosePopUp);
		scrollDown();
		click(CRFDesignPageElements.previewFormBtn);
		//click(CRFDesignPageElements.saveFormBtn);
		return new CRFDesignPage(driver);
	}
	public void enterValuesInVariables(By xpath,String Value){
		for(int i=1;i<3;i++){
		click(xpath);
		sendTextToAlert(Value+i);
		}
	}
	public void enterValuesInDD(By xpath,String Value,By xpath1){
		for(int i=1;i<3;i++){
		type(xpath,Value+i);
		click(xpath1);
		}
	}
	public void clickAndType(By xpath,By xpath1,String Value){		
		click(xpath);		
		type(xpath1,Value);
	}
	public void clickAndType1(By xpath,By xpath1,String Value) throws InterruptedException{
		Thread.sleep(500);
		scrollDown();Thread.sleep(500);
		click(xpath);Thread.sleep(500);
		scrollUp();Thread.sleep(500);
		type(xpath1,Value);
	}
	public void applyCDASH(By xPath,String varName, String txtProm) throws InterruptedException{
		Thread.sleep(500);click(xPath);Thread.sleep(1000);
		type(CRFDesignPageElements.CDASHtxtVarNameTxt,varName);
		type(CRFDesignPageElements.CDASHtxtPromptTxt,txtProm);
		click(CRFDesignPageElements.CDASHtxtSaveBtn);
		acceptAlert();
	}
	public void applyCDASHtwoVar1(By xPath,String varName, String txtProm) throws InterruptedException{
		Thread.sleep(500);click(xPath);Thread.sleep(1000);
		type(CRFDesignPageElements.CDASHtxtVarNameTxt2,varName);Thread.sleep(3000);
		type(CRFDesignPageElements.CDASHtxtPromptTxt2,txtProm);
		click(CRFDesignPageElements.CDASHtxtSave2Btn);
		acceptAlert();
	}
	public void applyCDASHtab(By xPath,String varName, String txtProm) throws InterruptedException{
		Thread.sleep(500);click(xPath);Thread.sleep(1000);
		type(CRFDesignPageElements.CDASHtxtVarNameTxt,varName);
		type(CRFDesignPageElements.CDASHtxtPromptTxt,txtProm);
		click(CRFDesignPageElements.tabularCDASHSaveBtn);
		acceptAlert();
	}

}
