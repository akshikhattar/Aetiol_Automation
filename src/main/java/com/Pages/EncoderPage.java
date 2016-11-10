package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.GenericLib.ActionDriver;
import com.PageObjectRepository.CRFDesignPageElements;
import com.PageObjectRepository.DataEntryPageElements;
import com.PageObjectRepository.EncoderPageElements;

public class EncoderPage extends ActionDriver{
	public static String Domain,visit,formname;
	public EncoderPage(WebDriver driver) {
		super(driver);
	}

	public EncoderPage createECRFForm(String EcrfName,String formDescription, String formDomain) throws InterruptedException{
	formname=EcrfName;
	Domain="AE";
	type(CRFDesignPageElements.ecrfNameTxt, EcrfName);
	type(CRFDesignPageElements.formDescriptionTxt, formDescription);
	type(CRFDesignPageElements.domain,Domain);	
	clickAndType(EncoderPageElements.textBoxLnk, EncoderPageElements.txtBxLbl1, "AE");
	clickAndType(EncoderPageElements.textBoxLnk, EncoderPageElements.txtBxLbl2, "MH");
	Thread.sleep(500);
	scrollDown();
	click(CRFDesignPageElements.previewFormBtn);
	click(CRFDesignPageElements.variableBtn);Thread.sleep(500);
	applyCDASH(CRFDesignPageElements.CDASHtxtbxLnk, "AETERM", "TXTPROM");
	applyCDASHtwoVar1(CRFDesignPageElements.CDASHtxtbxLnk, "MHTERM", "TXTPROM");
	click(CRFDesignPageElements.CDASHClosePopUp);
	scrollDown();
	Thread.sleep(1000);
	click(CRFDesignPageElements.previewFormBtn);Thread.sleep(1000);
	click(CRFDesignPageElements.saveFormBtn);
	return new EncoderPage(driver);
	}
	
	public CRFDesignPage createECRFtabular(String EcrfName,String formDescription, String formDomain) throws InterruptedException{
		formname=EcrfName;
		Domain="MH";
		type(CRFDesignPageElements.ecrfNameTxt, EcrfName);
		type(CRFDesignPageElements.formDescriptionTxt, formDescription);
		type(CRFDesignPageElements.domain,Domain);
		click(CRFDesignPageElements.sizehunderedPercent);
		//Table	
		scrollDown();
		Thread.sleep(500);
		click(CRFDesignPageElements.table);
		click(CRFDesignPageElements.tableGenerateBtn);
		scrollUp();
		Thread.sleep(500);
		//Table1 col1
		type(CRFDesignPageElements.tableHeaderTxt1Lbl, "Demographic");
		type(CRFDesignPageElements.tbl1Col1Lbl,"AETERM");
		selectDropDown(CRFDesignPageElements.tbl1Col1VariableDD, "Textbox");
		//col2
		type(CRFDesignPageElements.tbl1Col2Lbl,"MHTERM");
		selectDropDown(CRFDesignPageElements.tbl1Col2VariableDD, "Textbox");
		Thread.sleep(500);
		scrollDown();
		click(CRFDesignPageElements.previewFormBtn);
		click(CRFDesignPageElements.variableBtn);
		Thread.sleep(500);
		click(CRFDesignPageElements.tabularCDASH);
		applyCDASHtab(CRFDesignPageElements.tabularCDASHtxtbxLnk, "AETERM", "TBLPROM");
		applyCDASHtab2(CRFDesignPageElements.tabularCDASHtxtbxLnk, "MHTERM", "TBLPROM");
		click(CRFDesignPageElements.CDASHClosePopUp);
		scrollDown();
		Thread.sleep(1000);
		click(CRFDesignPageElements.previewFormBtn);
		Thread.sleep(1000);
		click(CRFDesignPageElements.saveFormBtn);
		return new CRFDesignPage(driver);
	}
	public EncoderPage manageCRF() throws InterruptedException{
		CRFDesignPage crfDesign = new CRFDesignPage(driver);
		crfDesign.ManageCRFPage();
		return new EncoderPage(driver);
	}
	public EncoderPage mapCRF(String EcrfName) throws InterruptedException{
		pageRefresh();
		Thread.sleep(1000);
		List<WebElement> elements= driver.findElements(CRFDesignPageElements.listOfAllForms);
		for(WebElement value:elements){
			System.out.println("Values: "+value.getText());
			if(value.getText().contains(EcrfName)){
				By findFormName = By.xpath("//div[@class='dropdown1']//li/label[text()='"+EcrfName+"']/preceding-sibling::input[@class='clsstdyfrz']");
				moveToElement(findFormName);Thread.sleep(1000);
				click(findFormName);
			}
		}
		click(CRFDesignPageElements.selectFirstVisit);Thread.sleep(1000);
		visit=getText(CRFDesignPageElements.firstVisitNameLbl);
		click(CRFDesignPageElements.saveAndNextBtn);
		acceptAlert();
		Thread.sleep(2000);
		return new EncoderPage(driver);
	}
	public EncoderPage DataEntry(){
		click(DataEntryPageElements.DataEntryLnk);
		return new EncoderPage(driver);
	}
	public EncoderPage fillForm(String formName) throws InterruptedException{
		scrollingToElementofAPage(formName);
		type(DataEntryPageElements.encoderFormTxt1,"Myopi");
		type(DataEntryPageElements.encoderFormTxt2,"Teeth Infection");
		click(DataEntryPageElements.fillFormSaveBtn);
		Thread.sleep(2000);
		acceptAlert();
		return new EncoderPage(driver);
	}
	public EncoderPage fillFormTabular(String formName) throws InterruptedException{
		scrollingToElementofAPage(formName);
		type(DataEntryPageElements.encoderFormTxt1R1C1,"Sweating and Shivering");
		type(DataEntryPageElements.encoderFormTxtR2C1,"Loss of appetite");
		type(DataEntryPageElements.encoderFormTxt2R1C2,"Pain in Head");
		type(DataEntryPageElements.encoderFormTxt2R2C2,"Muscle aches");
		click(DataEntryPageElements.fillFormSaveBtn);
		Thread.sleep(2000);
		acceptAlert();
		return new EncoderPage(driver);
	}
	public void clickAndType(By xpath,By xpath1,String Value){		
		click(xpath);		
		type(xpath1,Value);
	}
	public void applyCDASH(By xPath,String varName, String txtProm) throws InterruptedException{
		Thread.sleep(500);click(xPath);Thread.sleep(500);
		type(CRFDesignPageElements.CDASHtxtVarNameTxt,varName);
		type(CRFDesignPageElements.CDASHtxtPromptTxt,txtProm);
		click(CRFDesignPageElements.CDASHtxtSaveBtn);
		acceptAlert();
	}
	public void applyCDASHtwoVar1(By xPath,String varName, String txtProm) throws InterruptedException{
		Thread.sleep(500);click(xPath);Thread.sleep(500);
		type(CRFDesignPageElements.CDASHtxtVarNameTxt2,varName);
		type(CRFDesignPageElements.CDASHtxtPromptTxt2,txtProm);
		click(CRFDesignPageElements.CDASHtxtSave2Btn);
		acceptAlert();
	}
	public void applyCDASHtab2(By xPath,String varName, String txtProm) throws InterruptedException{
		Thread.sleep(500);click(xPath);Thread.sleep(500);
		type(CRFDesignPageElements.CDASHtxtVarNameTxt2,varName);
		type(CRFDesignPageElements.CDASHtxtPromptTxt2,txtProm);
		click(CRFDesignPageElements.tabularCDASHSaveBtn2);
		acceptAlert();
	}
	public void applyCDASHtab(By xPath,String varName, String txtProm) throws InterruptedException{
		Thread.sleep(500);click(xPath);Thread.sleep(1000);
		type(CRFDesignPageElements.CDASHtxtVarNameTxt,varName);
		type(CRFDesignPageElements.CDASHtxtPromptTxt,txtProm);
		click(CRFDesignPageElements.tabularCDASHSaveBtn);
		acceptAlert();
	}
	
	public String getDomain() {
		System.out.println("domain: "+Domain);		
	     return Domain;
	 }
	public String getVisit() {
		System.out.println("visit: "+visit);		
	     return visit;
	}
	public String getFormName() {
		System.out.println("formname: "+formname);		
	     return formname;
	}
	
}
