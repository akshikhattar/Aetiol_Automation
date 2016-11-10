package com.GenericLib;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDriver {
	
	public ActionDriver(WebDriver driver){
		this.driver=driver;
	}
	protected WebDriver driver;
	WebDriverWait wait;
	long time=30;

	public void waitForElement(By loc){
		wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(loc));
	}
	public void waitForElementToBeChecked(By loc){
		wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(loc));
	}
	public void waitForAlert(){
		wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void type(By loc,String value){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		element.clear();
		element.sendKeys(value);
	}
	public void jsExecutor(By loc,String value){
		waitForElement(loc);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement el = driver.findElement(loc);
		js.executeScript("arguments[0].value = arguments[1];", el, value);
	}
	public void type1(By loc,int number) throws InterruptedException{
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		element.clear();Thread.sleep(500);
		element.sendKeys(String.valueOf(String.valueOf(number)));
	}
	public void click(By loc){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		element.click();
	}
	public void check(String id){
		waitForElementToBeChecked(By.id(id));
		WebElement element=driver.findElement(By.id(id));
		element.click();
	}
	public void click(String xpath){
		waitForElementToBeChecked(By.xpath(xpath));
		WebElement element=driver.findElement(By.xpath(xpath));
		element.click();
	}
	public void clickOnAllElementsWithText(By loc){
		waitForElement(loc);
		java.util.List<WebElement> element=driver.findElements(loc);
		for(WebElement value:element){
			if(value.isEnabled()){
			value.click();
			acceptAlert();
			}
		}
	}
	public void mouseOver(By loc){
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(loc);
		act.moveToElement(element).build().perform();
	}
	public void scrollDown(){
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).perform();
	}
	public void scrollUp(){
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.UP).keyUp(Keys.CONTROL).perform();
	}
	public void moveToElement(By loc){
		waitForElement(loc);
		WebElement element = driver.findElement(loc);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	public boolean textIsEquals(By loc,String value){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		return element.getText().equalsIgnoreCase(value);
	}
	
	public boolean isElementPresent(By loc){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		Boolean value= element.isDisplayed();
		//System.out.println("Value: "+value);
		return value;
	}
	
	public void selectDropDown(By loc,String value){
		waitForElement(loc);
		Select element=new Select(driver.findElement(loc));
		element.selectByVisibleText(value);
	}
	
	public void selectDropDownByIndex(By loc,int index){
		waitForElement(loc);
		Select element=new Select(driver.findElement(loc));
		element.selectByIndex(index);
	}
	
	public String getSelectedOptionDD(By loc){
		waitForElement(loc);
		Select element=new Select(driver.findElement(loc));
		return element.getFirstSelectedOption().getText();
	}
	public int sizeofdropdown(By loc){
		waitForElement(loc);
		Select element=new Select(driver.findElement(loc));
		List<WebElement> sizeofDD=element.getOptions();
		int size=sizeofDD.size();
		return size;
	}
	
	public void windowHandles(){
		WebElement element=driver.findElement(By.xpath("//*[@id='popOk']"));
		element.click();
	}
	
	public void acceptAlert(){
		waitForAlert();
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(){
		waitForAlert();
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertText(){
		waitForAlert();
		return driver.switchTo().alert().getText();
	}
	public void sendTextToAlert(String value){
		waitForAlert();
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys(value);
		alert.accept();
	}
	public String getText(By loc){
		return driver.findElement(loc).getText();
	}
	public int sizeOfElements(By loc){
		List<WebElement> element=driver.findElements(loc);
		int size=element.size();
		System.out.println("No of subjects: "+size);
		return size;
	}
	public List<WebElement> returnListOfElements(By loc){
		List<WebElement> element=driver.findElements(loc);
		return element;
	}
	public void NavigateOnAllLinks(By loc) throws InterruptedException{
		java.util.List<WebElement> element=driver.findElements(loc);
		String[] Arr=new String[element.size()];
		String[] LinkName=new String[element.size()];
		System.out.println("List of links:");
		for(int i=0;i<element.size();i++){
			Arr[i]=element.get(i).getAttribute("href");
			LinkName[i]=element.get(i).getText();
			System.out.println(Arr[i]);
		}
		System.out.println("SIze:"+element.size());
		for(int i=0;i<element.size();i++){
			System.out.println("before Navigation " +Arr[i]);
			driver.navigate().to(Arr[i]);
			Thread.sleep(5000);
			System.out.println("Navigated to: "+Arr[i]+"  ("+LinkName[i]+") ");
			driver.navigate().back();
			wait=new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.titleContains("Aetiol"));			
		}
	}
	public void NavigateAndBack(By loc){
		waitForElementToBeChecked(loc);
		WebElement element=driver.findElement(loc);
		String link=element.getAttribute("href");
		System.out.println("Navigation successfull to :"+link);
		element.click();
		//driver.navigate().back();
	}
	public void clear(By loc){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		element.clear();
	}
	public void keyUp(By loc){
		waitForElement(loc);
		WebElement element = driver.findElement(loc);
		Actions act = new Actions(driver);
		act.moveToElement(element).keyUp(Keys.CONTROL).perform();
	}
	public void keyDown(By loc){
		waitForElement(loc);
		WebElement element = driver.findElement(loc);
		Actions act = new Actions(driver);
		act.moveToElement(element).keyDown(Keys.CONTROL).perform();
	}
	public void pageRefresh(){
		driver.navigate().refresh();
	}
	
	public void scrollingToElementofAPage(String formname){
		WebElement element = driver.findElement(By.linkText(formname));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
		element.click();
	}
}
