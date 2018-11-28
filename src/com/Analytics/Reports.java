package com.Analytics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Reports extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnAnalytics = By.xpath("//li[@id='RT']");
	
	By clickOnReports = By.xpath("//a[@class='ChangeArrow'][contains(text(),'Reports')]");
	
	By sessionReport = By.xpath("//h3[@class='ana-session']");
	
	

	public Reports(WebDriver driver) {
		super(driver);
		
	}
	
//	Method to Download all Reports
	
	public Reports allReports(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
//		Login to your Account 
		
		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		
//		Searching for Event Name
		
		System.out.println("Searching for Event Name :"+EventFullName);
		
		waitForClickabilityOf(searchEvent);
		
		WebElement search = driver.findElement(searchEvent);
		
		search.sendKeys(EventFullName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		waitForClickabilityOf(clickOnEvent);
		
		String ActEventName = driver.findElement(clickOnEvent).getText();
		
		System.out.println("Clicking On Event : "+ActEventName);
		
		if (EventFullName.equals(ActEventName)) {
			
			System.out.println("This is Correct Event");
			
		} else {
			
			System.out.println("Failed to Search the Event Name so, searching again ");
			
			search.clear();
			
			search.sendKeys(EventFullName);
			
			Thread.sleep(2000);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
//			Pressing Enter Button 
			
			search.sendKeys(Keys.ENTER);
				
		}
		
//		Clicking on The Event
		
		System.out.println("Clicking on The Event");
		
		waitForClickabilityOf(clickOnEvent);
		
		driver.findElement(clickOnEvent).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Analytics");
		
		waitForClickabilityOf(clickOnAnalytics);
		
		driver.findElement(clickOnAnalytics).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Reports");
		
		waitForClickabilityOf(clickOnReports);
		
		driver.findElement(clickOnReports).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(sessionReport).getText();
		
		System.out.println(text);
		
		if (text.equals("SESSION REPORTS")) {
			
			System.out.println("Successfully Verified the Reports");
			
		} else {
			
			System.out.println("Failed to Verify the Reports");
			

		}
		
		return new Reports(driver);
	}

}
