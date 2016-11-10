package com.DataProvider;

import java.io.File;
import java.util.Collection;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.GenericLib.ExcelHandler;

import jxl.Cell;

public class DataProviderForStudyConfiguration {

	@DataProvider
	public static Object[][] CreateStudy(ITestContext context) throws Exception
	{
		String studyName=new String();
		String investigator=new String();
		String sponsor=new String();
		String StudyPhase=new String();
		String collaborators=new String();
		String noOfSites=new String();
		String TimeZone=new String();
		String protocolId=new String();
		String summary=new String();
		String studyStatus=new String();
		String noOfSubjects=new String();
		String subIdentifier=new String();
		int i=1;
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String excelSheet=context.getCurrentXmlTest().getParameter("excelSheetCreateStudy");
		File location=new File(System.getProperty("user.dir")+excelLoc);
		ExcelHandler excel= new ExcelHandler(location);
		excel.selectSheet(excelSheet);
		
		Collection<Cell>  rowValues= excel.getRow(1).values();
		int colsize=rowValues.size();
		Collection<Cell>  colValues= excel.getColumn(1).values();
		int rowsize=colValues.size();
		System.out.println("COl size:"+colsize+"Row size: "+rowsize);
		for(i=1;i<=rowsize;){
			for(int j=1;j<colsize;)
			{	
				studyName=excel.getCellData(j,i).getContents();
				j=j+1;
				investigator=excel.getCellData(j,i).getContents();
				j=j+1;
				sponsor=excel.getCellData(j,i).getContents();
				j=j+1;
				StudyPhase=excel.getCellData(j,i).getContents();
				j=j+1;
				collaborators=excel.getCellData(j,i).getContents();
				j=j+1;
				noOfSites=excel.getCellData(j,i).getContents();
				j=j+1;
				TimeZone=excel.getCellData(j,i).getContents();
				j=j+1;
				protocolId=excel.getCellData(j,i).getContents();
				j=j+1;
				summary=excel.getCellData(j,i).getContents();
				j=j+1;
				studyStatus=excel.getCellData(j,i).getContents();
				j=j+1;
				noOfSubjects=excel.getCellData(j,i).getContents();
				j=j+1;
				subIdentifier=excel.getCellData(j,i).getContents();
				i=i+1;
			}
		}
		return new Object[][]{{studyName, investigator, sponsor, StudyPhase, collaborators, 
			noOfSites, TimeZone, protocolId, summary, studyStatus, noOfSubjects, subIdentifier}};
		
	}
	//Data Provider to select study after create study
		@DataProvider
		public static Object[][] StudyDD(ITestContext context) throws Exception
		{
			String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
			String excelSheet=context.getCurrentXmlTest().getParameter("excelSheetCreateStudy");
			File location=new File(System.getProperty("user.dir")+excelLoc);
			ExcelHandler excel= new ExcelHandler(location);
			excel.selectSheet(excelSheet);
			
			Collection<Cell>  values= excel.getColumn(1, true).values();
			int rowSize =values.size();
			System.out.println("Row size: "+rowSize);
			Object[][] studyName = new Object[rowSize][1] ;
			int i=0;
			for(Cell value:values){
				System.out.println("Study Name: "+excel.getCellData(1,rowSize).getContents());
				studyName[i][0]=value.getContents();		 				
			}
			return studyName;
		}
}
