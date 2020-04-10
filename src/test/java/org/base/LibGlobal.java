package org.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	
    public static WebDriver driver;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\Webjet\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.webjet.com.au/");
		driver.manage().window().maximize();
		
	}
	
	public static String getText(WebElement ele) {
		return ele.getText();
	}
	
	
	public static String getAttribute(WebElement ele, String AttributeName)
	{
		return ele.getAttribute(AttributeName);
		
	}

	public static void selectbyvalue(WebElement ele,String value) {

		new Select(ele).selectByValue(value);
		
	}
	
	public static void selectbyIndex(WebElement ele,int value) {

		new Select(ele).selectByIndex(value);
		
	}
	
	public static void selectbyvisibleText(WebElement ele,String value) {

		new Select(ele).selectByVisibleText(value);
		
	}
	public static void click(WebElement ele) {

	ele.click();
		
	}
	
	public static void fill(WebElement ele, String value) {

		ele.sendKeys(value);
		
	}
	public static void movetoElement(WebElement ele) {

		new Actions(driver).moveToElement(ele).perform();
	}
	
	public static void doubleclick(WebElement ele) {

		new Actions(driver).doubleClick(ele).perform();
	}
	
	
	
	
}
