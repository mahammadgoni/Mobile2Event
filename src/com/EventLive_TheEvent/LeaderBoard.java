package com.EventLive_TheEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class LeaderBoard extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnLiveEvent = By.xpath("//li[@id='LV']//a[@href='javascript:void(0);']");
	
	By clickOnLeaderBoard = By.xpath("//li[@id='Leaderboard']");
	
	By businessCardScore = By.xpath("//tbody//tr[2]//td[2]//input[1]");
	
	By businessCarsMaxScore = By.xpath("//tbody//tr[2]//td[3]//input[1]");
	
	By businessCardSaveBtn = By.xpath("//tbody//tr[2]//td[4]//input[1]");
	
	

	public LeaderBoard(WebDriver driver) {
		super(driver);
		
	}
	
//	Edit Activity Points
	
	public LeaderBoard editActivityPoints(String EmailId, String Password,String EventFullName,String NewScore) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Live Events");
		
		waitForClickabilityOf(clickOnLiveEvent);
		
		driver.findElement(clickOnLiveEvent).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Leader Board");
		
		waitForClickabilityOf(clickOnLeaderBoard);
		
		driver.findElement(clickOnLeaderBoard).click();
		
		Thread.sleep(2000);
		
//		Storing the Score Points
		
		System.out.println("Entering the Score Points");
		
		waitForClickabilityOf(businessCardScore);
		
		String Score = driver.findElement(businessCardScore).getText();
		
		Thread.sleep(2000);
		
		driver.findElement(businessCardScore).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(businessCardScore).sendKeys(NewScore);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(businessCardSaveBtn);
		
		driver.findElement(businessCardSaveBtn).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(businessCardScore);
		
		String Score1 = driver.findElement(businessCardScore).getText();
		
		Thread.sleep(2000);
		
		if (Score==Score1) {
			
			System.out.println("Failed to Verify Leader Board Points ");
			
		} else {
			
			System.out.println("Successfully Verified Leader Board Points");
			

		}
		
		
		
		
		return new LeaderBoard(driver);
		
	}

}
