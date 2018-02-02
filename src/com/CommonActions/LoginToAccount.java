package com.CommonActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LoginToAccount extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");
	
	By proceedBtn = By.xpath("//*[@id='btnProceed']");
	
	By pass = By.xpath("//*[@id='txtPass']");
	
	By signInBtn = By.xpath("//*[@id='btnLogin']");
	
	By logoutBtn = By.xpath("//*[@id='Layer_1']");
	

	public LoginToAccount(WebDriver driver) {
		super(driver);
		
	}
	
	public LoginToAccount loginToAccount(String EmailId,String Password){
		
		System.out.println("Entering Email id  is : "+EmailId);
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).sendKeys(EmailId);
		
		System.out.println("Clicking on Proceed Button");
		
		waitForClickabilityOf(proceedBtn);
		
		driver.findElement(proceedBtn).click();
				
		System.out.println("Entering Password  is : "+Password);
		
		waitForClickabilityOf(pass);
		
		driver.findElement(pass).sendKeys(Password);
		
		System.out.println("Clicking on Sign in Button");
		
		waitForClickabilityOf(signInBtn);
		
		driver.findElement(signInBtn).click();
			
		boolean lBtn = driver.findElement(logoutBtn).isDisplayed();
		
		System.out.println(lBtn);
		
		if (lBtn=true) {
			
			System.out.println("Successfully Logged in to your Account");
			
		} else {
			
			System.out.println("Failed to Login to your Account");

		}
				
		return new LoginToAccount(driver);
		
	}

}
