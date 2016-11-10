package com.DataProvider;

import java.io.File;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import com.GenericLib.ExcelHandler;

public class DataProviderForCRFDesign {

	@DataProvider
	public static Object[][] CreateCRFDefaultTemplate(ITestContext context) throws Exception
	{
		String EcrfName=new String();
		String formDescription=new String();
		//String defTemplateSelStudy=new String();
		//String defTemplateSelForm=new String();
		
		//int i=1;
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String excelSheet=context.getCurrentXmlTest().getParameter("excelSheetCreateCRF");
		File location=new File(System.getProperty("user.dir")+excelLoc);
		ExcelHandler excel= new ExcelHandler(location);
		excel.selectSheet(excelSheet);
		
		EcrfName=excel.getCellData(1,2).getContents();
		formDescription=excel.getCellData(2,2).getContents();
		/*Collection<Cell>  rowValues= excel.getRow(1,true).values();
		int colsize=rowValues.size();
		Collection<Cell>  colValues= excel.getColumn(1).values();
		int rowsize=colValues.size();
		System.out.println("COl size:"+colsize+"Row size: "+rowsize);
		for(i=1;i<=rowsize;){
			for(int j=1;j<colsize;)
			{	
				EcrfName=excel.getCellData(j,i).getContents();
				j=j+1;
				formDescription=excel.getCellData(j,i).getContents();
				j=j+1;
				defTemplateSelStudy=excel.getCellData(j,i).getContents();
				j=j+1;
				defTemplateSelForm=excel.getCellData(j,i).getContents();				
				//i=i+1;
			}
		}
		System.out.println(EcrfName+" "+formDescription);*/
		return new Object[][]{{EcrfName,formDescription}};
		
	}
}
