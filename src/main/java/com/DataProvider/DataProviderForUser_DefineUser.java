package com.DataProvider;

import java.io.File;
import java.util.Collection;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import com.GenericLib.ExcelHandler;
import jxl.Cell;

public class DataProviderForUser_DefineUser {
	
		//@DataProvider to new add user(User name,address,emailId and role 
		@DataProvider
		public static Object[][] addUser(ITestContext context) throws Exception
		{
			String username=new String();
			String address=new String();
			String emailId=new String();
			String role=new String();
						
			int i=1;
			String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
			String excelSheet=context.getCurrentXmlTest().getParameter("excelSheetDefineUser");
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
					username=excel.getCellData(j,i).getContents();
					j=j+1;
					address=excel.getCellData(j,i).getContents();
					j=j+1;
					emailId=excel.getCellData(j,i).getContents();
					j=j+1;
					role=excel.getCellData(j,i).getContents();
					i=i+1;							
				}
			}
			System.out.println("UserName: "+username+" \taddress: "+address+" \temailId: "+emailId+"\tRole: "+role);
			return new Object[][]{{username,address,emailId,role}};
			
		}
}
