package com.EventLive_TheEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class PollOrVote extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnLiveEvent = By.xpath("//li[@id='LV']//a[@href='javascript:void(0);']");
	
	By clickOnPollVote = By.xpath("//*[@href='New/Poll/Index']");
	
	By clickOn1stUpdateMapping = By.xpath("//table[@id='tblPollList']//tr[1]/td[3]/div");
	
	By searchSessionName = By.xpath("//*[@id='txtmapsession']");
	
	By clickOn1stSessionChkBox = By.xpath("//div[@id='sldmapsession']//*[@class='ui-menu-item'][1]//*[@class='checkbox']");
	
	By save1stSessionName = By.xpath("//*[@id='tbdmapsession']//tr[1]/td[2]/div/div");
	
	By save2ndSessionName = By.xpath("//*[@id='tbdmapsession']//tr[2]/td[2]/div/div");
	
	By save3rdSessionName = By.xpath("//*[@id='tbdmapsession']//tr[3]/td[2]/div/div");
	
	By clickOnDoneButton = By.xpath("//*[@id='sldmapsession']//*[@value='Done']");
	
	By clickOn1stSesnSettings = By.xpath("//tbody[@id='tbdmapsession']/tr[1]/td[6]/div/div[1]");
	
	By clickOn1stTimiers = By.xpath("//tbody[@id='tbdmapsession']/tr[1]/td[6]/div/div[2]");
	
	By clickOn2ndSesnSettings = By.xpath("//tbody[@id='tbdmapsession']/tr[2]/td[6]/div/div[1]");
	
	By clickOn2ndTimiers = By.xpath("//tbody[@id='tbdmapsession']/tr[2]/td[6]/div/div[2]");
	
	By clickOn3rdSesnSettings = By.xpath("//tbody[@id='tbdmapsession']/tr[3]/td[6]/div/div[1]");
	
	By clickOn3rdTimiers = By.xpath("//tbody[@id='tbdmapsession']/tr[3]/td[6]/div/div[2]");
	
	By activeToggleBtn = By.xpath("//*[@class='col-sm-12 pt-sm-3 pb-sm-3']/div[1]/div[1][@class='checkbox-toggle']/label");
	
	By enableAnonymousBtn = By.xpath("//*[@class='col-sm-12 pt-sm-3 pb-sm-3']/div[3]/div[1][@class='checkbox-toggle']/label");
	
	By clickOnSesnActiveSetTime = By.xpath("//*[@class='customradiobuttonholder clearfix pb-3']/div[2]/input[@value='2']");
	
	By activeOnDate = By.xpath("//div[@class='datetime-hld form-inline mb-sm-2 col-md-8']/div[1]");
	
	By activeOnTime = By.xpath("//div[@class='datetime-hld form-inline mb-sm-2 col-md-8']/div[2]");
	
	By deactiveOnDate = By.xpath("//div[@class='datetime-hld form-inline  col-md-8']/div[1]");
	
	By deactiveOnTime = By.xpath("//div[@class='datetime-hld form-inline  col-md-8']/div[2]");
	
	By saveBtn = By.xpath("//button[@type='button'][contains(text(),'Save changes')]");
	
	

	public PollOrVote(WebDriver driver) {
		super(driver);

	}
	
	public PollOrVote pollOrVoteActivities(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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

		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnLiveEvent);
		
		driver.findElement(clickOnLiveEvent).click();
		
		
		
		return new PollOrVote(driver);
		
	}

}
