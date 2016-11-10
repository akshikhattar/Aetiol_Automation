package com.Listener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.GenericLib.OpenAndCloseBrowser;

public class ScreenshotOnFailure extends TestListenerAdapter {
	 private WebDriver driver; 
	 private static final String ESCAPE_PROPERTY = "org.uncommons.reportng.escape-output";
	  @Override
	  public void onTestFailure(ITestResult tr) {
		  try {
			screenshot(tr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult tr) {
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult tr) {
	  }
	  private void screenshot(ITestResult tr) throws IOException{
		  System.setProperty(ESCAPE_PROPERTY, "false");
		  driver=OpenAndCloseBrowser.getInstance();
		  File location=new File(System.getProperty("user.dir")+"/test-output");
		  Date date=new Date();
		  SimpleDateFormat dateFormat=new SimpleDateFormat("dd_MMM_yyyy_hh_mm_ssaa");
		  String screenshotName=location.getCanonicalPath()+"\\Screenshot\\"+tr.getName()+
				  dateFormat.format(date)+".png";
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File(screenshotName));
		  Reporter.log("<H4>Repro Steps</H4><br>"+tr.getMethod().getDescription());
		  Reporter.log("<br><a href="+screenshotName+">Screenshot</a>");
	  }

}
