package com.DataProvider;

import java.io.File;
import java.util.Collection;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import com.GenericLib.ExcelHandler;
import jxl.Cell;

public class DataProviderForUser_DefineRole {
	//Data Provider to add Communication group names
	@DataProvider
	public static Object[][] communicationGpNameProvider(ITestContext context) throws Exception
	{
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String excelSheet=context.getCurrentXmlTest().getParameter("excelSheetCommGp");
		File location=new File(System.getProperty("user.dir")+excelLoc);
		ExcelHandler excel= new ExcelHandler(location);
		excel.selectSheet(excelSheet);
		
		Collection<Cell>  values= excel.getColumn(1, false).values();
		int rowSize =values.size();
		Object[][] commGp = new Object[rowSize][1] ;
		int i=0;
		for(Cell value:values){
			commGp[i][0]=value.getContents();		 				
		}
		return commGp;
	}
	    
	//@DataProvider to new add role(Role name,check privilege,check group,click save
	@DataProvider
	public static Object[][] AddRole(ITestContext context) throws Exception
	{
		String rolename=new String();
		String privilege=new String();
		String groupname=new String();
		
		int i=1;
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String excelSheet=context.getCurrentXmlTest().getParameter("excelSheetDefineRole");
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
				rolename=excel.getCellData(j,i).getContents();
				j=j+1;
				privilege=excel.getCellData(j,i).getContents();
				j=j+1;
				groupname=excel.getCellData(j,i).getContents();
				i=i+1;
			}
		}
		System.out.println("Rolename: "+rolename+" \tPrivilege: "+privilege+" \tGroupName: "+groupname);
		return new Object[][]{{rolename,privilege,groupname}};
		
	}
}
