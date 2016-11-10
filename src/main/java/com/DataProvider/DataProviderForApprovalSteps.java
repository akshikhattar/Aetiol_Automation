package com.DataProvider;

import java.io.File;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.GenericLib.ExcelHandler;

public class DataProviderForApprovalSteps {
	@DataProvider
	public static Object[][] credentialsProvider(ITestContext context) throws Exception{	
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String excelSheet=context.getCurrentXmlTest().getParameter("excelSheet");
		File location=new File(System.getProperty("user.dir")+excelLoc);
		ExcelHandler excel=new ExcelHandler(location);
		excel.selectSheet(excelSheet);
		
		String username=excel.getCellData(1,2).getContents();
		String password=excel.getCellData(2,2).getContents();
		System.out.println("UN and Pswd "+username+" "+password);
		return new Object[][]{{username,password}};
	}
	@DataProvider
	public static Object[][] forgetPassword(ITestContext context) throws Exception{
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String excelSheet=context.getCurrentXmlTest().getParameter("excelSheet");
		File location=new File(System.getProperty("user.dir")+excelLoc);
		ExcelHandler excel=new ExcelHandler(location);
		excel.selectSheet(excelSheet);
		
		String username=excel.getCellData(1,2).getContents();
		String email=excel.getCellData(2,2).getContents();
		System.out.println("UN and Pswd "+username+" "+email);
		return new Object[][]{{username,email}};
	}
}
