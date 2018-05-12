package com.GenericFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GenericFunctions {

	public static WebDriver driver;

	// Launch browser and Application

	public static boolean Launchapp(String Browser, String url) {
		boolean status = true;

		try {

			switch (Browser.toLowerCase()) {

			case "Firefox":
				driver = new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			case "IE":

				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;

			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				break;

			default:
				break;
			}

		} catch (Exception e) {
			status = false;
		}

		return status;

	}
	
	//Set Text

	public boolean setText(WebElement ele1, String value) {
		boolean status = true;
		try {

			ele1.click();
			ele1.clear();
			ele1.sendKeys(value);
		} catch (Exception e) {
			status = false;
		}
		return status;
	}
	
	
	// click element
	public static boolean clickElement(WebElement ele2){
		boolean status = true;
		try {
			
			ele2.click();
			
		} catch (Exception e) {
			status = false;
		}
		return status;
	}
	
	// Mousehover Action
	
	public static boolean Mousehover(WebElement ele ,String xpath){
		boolean status = true;
		
		try {
			
			Actions a =new Actions(driver);
			ele = driver.findElement(By.xpath(xpath));
			a.moveToElement(ele).build().perform();
			
			
		} catch (Exception e) {
			status = false;
		}
		return status;
	}

}
