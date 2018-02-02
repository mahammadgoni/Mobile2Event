package com.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp {
	
	protected static WebDriver driver;
	
	String geckoPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Browser_Driver/geckodriver";
	
	String chromeDrPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Browser_Driver/chromedriver";
	
	String logPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Browser_Driver/firefoxLogs";
	
	String e2mURL = "https://cmsuat2.event2mobile.com/";
	
	
	
	protected void openBrowser(String BrowserName){
		
		if (BrowserName=="Chrome") {
			
			System.out.println("===============================================");
			
			System.out.println("Opening the Chrome Browser");
			
			System.setProperty("webdriver.chrome.driver", chromeDrPath);
			
			driver = new ChromeDriver();
			
		    driver.manage().window().fullscreen();
			
//			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			System.out.println("Opening the Url : "+e2mURL);
			
			driver.get(e2mURL);
			
		} else {
			
			System.out.println("===============================================");
			
			System.out.println("Opening the Firefox Browser");
			
			System.setProperty("webdriver.gecko.driver", geckoPath);
			
//			This code will store all unwanted Firefox warnings to a file
			
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, logPath);
			
			driver  = new FirefoxDriver();
			
//			String currentWindow  = this.driver.getWindowHandle();
//			
//			driver.switchTo().window(currentWindow);
//			
//			driver.switchTo().defaultContent();
			
//			((JavascriptExecutor)driver).executeScript("window.focus();");
			
//			Dimension dm = new Dimension(1382, 744);
//			
//			driver.manage().window().setSize(dm);
			
			driver.manage().window().fullscreen();
			
//			driver.manage().window().setPosition(new Point(-2000, 0));
			
//			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			System.out.println("Opening the Url : "+e2mURL);
			
			driver.get(e2mURL);
			

		}
		
		
	}
	
	protected void closeBrowser(){
		
		System.out.println("Closing the current Browser Tab");
		
		driver.close();
	}
	
	protected void quitAllBrowser(){
		
		System.out.println("Closing Browser");
		
		driver.quit();
		
	}

}
