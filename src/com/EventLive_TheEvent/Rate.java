package com.EventLive_TheEvent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Rate extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnLiveEvent = By.xpath("//li[@id='LV']//a[@href='javascript:void(0);']");
	
	By clickOnRate = By.xpath("//*[@id='Rate']");
	
	By addRateOption = By.xpath("//html//ul[@class='menu-3rd-level clearfix']/li[2]/a[1]");
	
	By ratingGroupName = By.xpath("//*[@id='txtGroupName']");
	
	By title1st = By.xpath("//*[@id='ContentPlaceHolder1_rptQuestions_txtQuestionTitle_0']");
	
	By title2nd = By.xpath("//*[@id='ContentPlaceHolder1_rptQuestions_txtQuestionTitle_1']");
	
	By addNewQuestion = By.xpath("//a[@id='ContentPlaceHolder1_lbAddMore']");
	
	By saveButton = By.xpath("//a[@id='ContentPlaceHolder1_btnSave']");
	
	By noOfRateQuestion = By.xpath("//*[@data-tooltip='Published']");
	
	
	

	public Rate(WebDriver driver) {
		super(driver);
		
	}
	
	
	public Rate addRate(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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

//		Clicking on Live Event
		
		System.out.println("Clicking on Live Event");
		
		waitForClickabilityOf(clickOnLiveEvent);
		
		driver.findElement(clickOnLiveEvent).click();
		
//		Clicking on Rate
		
		System.out.println("Clicking on Rate");
		
		waitForClickabilityOf(clickOnRate);
		
		driver.findElement(clickOnRate).click();
		
//		Clicking on Add Rate
		
		System.out.println("Clicking on Add Rate");
		
		waitForClickabilityOf(addRateOption);
		
		driver.findElement(addRateOption).click();
		
//		Entering Rating Group Name
		
		System.out.println("Entering Rating Group Name");
		
		waitForClickabilityOf(ratingGroupName);
		
		driver.findElement(ratingGroupName).sendKeys("Automation Group Rate");
		
//		Entering 1st Question Title
		
		System.out.println("Entering 1st Question Title");
		
		waitForClickabilityOf(title1st);
		
		driver.findElement(title1st).sendKeys("How was the Session Environment?");
		
//		Clicking On Add New Question
		
		System.out.println("Clicking On Add New Question");
		
		waitForClickabilityOf(addNewQuestion);
		
		driver.findElement(addNewQuestion).click();
		
//		Entering 2nd Question Title
		
		System.out.println("Entering 2nd Question Title");
		
		waitForClickabilityOf(title2nd);
		
		driver.findElement(title2nd).sendKeys("How was the Speaker?");
		
//		Clicking On Save to Save The Question Rating
		
		System.out.println("Clicking On Save to Save The Question Rating");
		
		waitForClickabilityOf(saveButton);
		
		driver.findElement(saveButton).click();
		
		Thread.sleep(2000);
		
//		Getting the Rate Question Count
		
		waitForClickabilityOf(noOfRateQuestion);
		
		List<WebElement> element = driver.findElements(noOfRateQuestion);
		
		int NoOfExRateQues = element.size();
		
		System.out.println(NoOfExRateQues);
		
		if (NoOfExRateQues==1) {
			
			System.out.println("Successfully Added One Rating Group");
			
		} else {
			
			System.out.println("Failed to Add Rating Group");

		}
			
		
		
		return new Rate(driver);
		
		
	}

}


