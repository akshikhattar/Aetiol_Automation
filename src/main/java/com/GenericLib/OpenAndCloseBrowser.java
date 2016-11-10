package com.GenericLib;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenAndCloseBrowser {
	protected static WebDriver driver;
	DesiredCapabilities caps;
	@Parameters({"browser","baseURL"})
	//@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser,String baseURL) throws MalformedURLException, InterruptedException{
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/driver/IEDriverServer.exe");
			caps=DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver=new InternetExplorerDriver();
		}
		else{
			driver=new FirefoxDriver();
			/*URL urlbrowser = new URL("http://192.168.1.30:2828/wd/hub");
			DesiredCapabilities caps = DesiredCapabilities.firefox();
			caps.setBrowserName("firefox");
			caps.setPlatform(Platform.WIN8_1);
			Thread.sleep(2000);
			driver= new RemoteWebDriver(urlbrowser, caps);*/
		}
		driver.manage().window().maximize();
		driver.get(baseURL);
		
	}
	public static WebDriver getInstance(){
		return driver;
	}
/*	@AfterMethod
	public void closeBrowser1(){
		driver.quit();
	}*/
	@AfterClass
	public void closeBrowser(){
		//driver.quit();
	}	
}

