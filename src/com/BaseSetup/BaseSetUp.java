package com.BaseSetup;

import java.awt.AWTException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSetUp {
	
    protected WebDriver driver;
    
	 protected String home = System.getProperty("user.dir");

    public BaseSetUp(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    protected void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    protected void popUpHandeling(){    	
    	Alert alert  = driver.switchTo().alert();    	
    	String alertMessage = driver.switchTo().alert().getText();    
    	System.out.println(alertMessage); 
    	try {
        	alert.accept();
        	alert.accept();
        	alert.dismiss();
	
		} catch (UnhandledAlertException e) {
			
//			System.out.println("This is Exception Message : "+e.getMessage());
			
		}   	
    	
    }
    
//    protected void scrollDown(By Element){
    	
       protected void scrollDown() throws AWTException{	
    	
//    	WebElement element  = driver.findElement(Element);
    	
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
  	
//    	js.executeScript("arguments[0].scrollIntoView();",element);
    	   
//    	   Robot robot = new Robot();
    	   
//    	   robot.keyPress(KeyEvent.VK_PAGE_DOWN);
    	   
//    	   robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    	
    	
    }
        
  
	
	

}
