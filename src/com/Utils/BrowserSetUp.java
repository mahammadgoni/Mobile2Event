package com.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp {

	protected static WebDriver driver;

	String geckoPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Browser_Driver/geckodriver";

	String chromeDrPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Browser_Driver/chromedriver";

	String firefoxLogPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Browser_Driver/firefoxLogs";

	String e2mURL = "https://cmsuat2.event2mobile.com/";

	protected void openBrowser(String BrowserName) {
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		
//		caps.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

		if (BrowserName == "Chrome") {

			System.out.println("===============================================");

			System.out.println("Opening the Chrome Browser");

			System.setProperty("webdriver.chrome.driver", chromeDrPath);
			
//			String dir = "/Library/Application Support/Google/Chrome";

			ChromeOptions options = new ChromeOptions();

			// Code for disable the Logs

			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");

			System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "warn");
			
//			options.addArguments(dir);

			options.addArguments("--log-level=3");

			options.addArguments("--silent");

			options.addArguments("disable-infobars");

			options.addArguments("--start-maximized");

			options.addArguments("--disable-logging");

			driver = new ChromeDriver(options);

			driver.manage().window().fullscreen();

			// driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			System.out.println("Opening the Url : " + e2mURL);

			driver.get(e2mURL);

		} else {

			System.out.println("===============================================");

			System.out.println("Opening the Firefox Browser");

			System.setProperty("webdriver.gecko.driver", geckoPath);

			// This code will store all unwanted Firefox warnings to a file

			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");

			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, firefoxLogPath);

			driver = new FirefoxDriver();

			// String currentWindow = this.driver.getWindowHandle();
			//
			// driver.switchTo().window(currentWindow);
			//
			// driver.switchTo().defaultContent();

			// ((JavascriptExecutor)driver).executeScript("window.focus();");

			// Dimension dm = new Dimension(1382, 744);
			//
			// driver.manage().window().setSize(dm);

			driver.manage().window().fullscreen();

			// driver.manage().window().setPosition(new Point(-2000, 0));

			// driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			System.out.println("Opening the Url : " + e2mURL);

			driver.get(e2mURL);

		}

	}

	protected void closeBrowser() throws InterruptedException {

		System.out.println("Closing the Current Browser ");

		driver.close();
	}

	protected void quitAllBrowser() {

		System.out.println("    ");

		System.out.println("===============================================");

		System.out.println("Closing All the Browsers");

		driver.quit();

	}

	protected void methodSeparation() {

		System.out.println("    ");

		System.out.println("===============================================");

	}
	
	protected void logOut(){
		
		try {
						
			driver.navigate().to(e2mURL);
			
			By logoutBtn = By.xpath("//*[@id and @onclick and @data-rel]");
			
			driver.findElement(logoutBtn).click();
			
		} catch (UnhandledAlertException e) {
			
	    	Alert alert  = driver.switchTo().alert();  
	    	
	    	String alertMessage = driver.switchTo().alert().getText();  
	    	
	    	System.out.println(alertMessage); 
	    	
        	alert.accept();
        	
	    	try {

	        	alert.dismiss();
	        	
				By logoutBtn = By.xpath("//*[@id and @onclick and @data-rel]");
	        	
				driver.findElement(logoutBtn).click();
		
			} catch (Exception a) {
				
				System.out.println(a.getMessage());
				
				
			}
			
		}

	}

}
