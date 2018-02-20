package com.CommonActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;

public class ForgotPassword extends BaseSetUp{
	
	
	By emailId = By.xpath("//*[@id='txtLogin']");
	
	By proceedBtn = By.xpath("//*[@id='btnProceed']");
	
	By forgotPassBtn = By.xpath("//*[@id='aForgotPassword']");
	
	By forgotEmail = By.xpath("//*[@id='txtModalUsername']");
	
	By submitBtn = By.xpath("//*[@href='#'][contains(text(),'Submit')]");
	
	By checkAnyInbox = By.xpath("//*[@id='inboxfield']");
	
	By goToInbox = By.xpath("//*[@class='btn btn-dark']");
	
	By newPassword = By.xpath("//*[@id='txtNewpassword']");
	
	By confirmPassword = By.xpath("//*[@id='txtConfirmpassword']");
	
	By btnSubmit = By.xpath("//*[@id='btnSubmit']");
	
	By clickOnEmail = By.xpath("//div[@id='msgpane']");
	
	By emailBody = By.xpath("//html/body[1]");
	
	By successMsg = By.xpath("//*[contains(text(),'Success')]");
	
	By pass = By.xpath("//*[@id='txtPass']");
	
	By signInBtn = By.xpath("//*[@id='btnLogin']");
	
	By logoutBtn = By.xpath("//*[@id='top1_Logout'][@class='tm-logout']");
	
	

	public ForgotPassword(WebDriver driver) {
		super(driver);
		
	}
	
	public ForgotPassword forgotPassword(String EmailId, String Password) throws AWTException{
		
		System.out.println("Entering Email id  is : "+EmailId);
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).clear();
		
		driver.findElement(emailId).sendKeys(EmailId);
		
		System.out.println("Clicking on Proceed Button");
		
		waitForClickabilityOf(proceedBtn);
		
		driver.findElement(proceedBtn).click();
				
		System.out.println("Entering Password  is : e2m123");
		
		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();
		
		driver.findElement(pass).sendKeys("e2m123");
		
		System.out.println("Clicking on Sign in Button");
		
		waitForClickabilityOf(signInBtn);
		
		driver.findElement(signInBtn).click();
		
		System.out.println("Clicking on Forgot Password/PIN option");
		
		waitForClickabilityOf(forgotPassBtn);
		
		driver.findElement(forgotPassBtn).click();
		
		System.out.println("Entering Forgot Email Id");
		
		waitForClickabilityOf(forgotEmail);
		
		driver.findElement(forgotEmail).clear();
		
		driver.findElement(forgotEmail).sendKeys(EmailId);
		
		System.out.println("Clicking on Submit Button");
		
		waitForClickabilityOf(submitBtn);
		
		driver.findElement(submitBtn).click();
		
		System.out.println("Opening the Email in new Tab");
		
		Robot r  = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_T); 
		
		r.keyRelease(KeyEvent.VK_CONTROL); 
		
		r.keyRelease(KeyEvent.VK_T);
		
//		String Base = driver.getWindowHandle();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(0));
		
		
		
//		String goingToNewTab = Keys.chord(Keys.COMMAND,"t");
//		
//		driver.findElement(By.tagName("body")).sendKeys(goingToNewTab);
		
		driver.get("https://www.mailinator.com/");
		
		System.out.println("Clicking on Any Inbox");
		
		waitForClickabilityOf(checkAnyInbox);
		
		driver.findElement(checkAnyInbox).sendKeys(EmailId);
		
		System.out.println("Clicking on Go Button");
		
		waitForClickabilityOf(goToInbox);
		
		driver.findElement(goToInbox).click();
		
		System.out.println("Clicking on Forgot  Email");
		
		waitForClickabilityOf(clickOnEmail);
		
		driver.findElement(clickOnEmail).click();
		
		System.out.println("Going to the Forgot Email link");
		
		waitForClickabilityOf(emailBody);
		
		String Body = driver.findElement(emailBody).getText();
		
		System.out.println(Body);
		
		
//		Need to write full code for this class
		
		
		
		return new ForgotPassword(driver) ;
		
	}

}
