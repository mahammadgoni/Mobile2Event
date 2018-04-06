package com.EventMeetings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class SetUpMeetings extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnMeetings = By.xpath("//*[@id='meetingmodule']");
	
	By setUpMeetings = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Setup Meetings')]");
	
	By generalRadioBtn = By.xpath("//*[@id='ContentPlaceHolder1_rbtnTypeSelection_0']");
	
	By geniusRadioBtn = By.xpath("//*[@id='ContentPlaceHolder1_rbtnTypeSelection_1']");
	
	By requestedByUser = By.xpath("//*[@id='ContentPlaceHolder1_btnSelectAttendee']");
	
	By requestedToUser = By.xpath("//*[@id='ContentPlaceHolder1_btnSelectAttendee_new']");
	
	By reqstdBy1stUser = By.xpath("//html//div[@id='div5']//tr[1]/td[1]/input[1]");
		
	By reqstdTo2ndUser = By.xpath("//html//div[@id='div5_new']//tr[2]/td[1]/input[1]");
	
	By addByBtn = By.xpath("//*[@id='ContentPlaceHolder1_Saveattendee']");
	
	By addToBtn = By.xpath("//*[@id='ContentPlaceHolder1_Saveattendee_new']");
	
	By closeByBtn = By.xpath("//a[@id='ContentPlaceHolder1_A1']");
	
	By closeToBtn = By.xpath("//a[@id='ContentPlaceHolder1_A6']");
	
	By preApprovedBtn = By.xpath("//*[@id='ContentPlaceHolder1_chkpreapproved']");
	
	By genMtinTitle = By.xpath("//*[@id='ContentPlaceHolder1_txtTitle']");
	
	By genMtinDate = By.xpath("//*[@id='ContentPlaceHolder1_txtMeetingDate']");
	
	By genGoToNxtMnth = By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']");
	
	By selectMay4th = By.xpath("//html//tr[1]/td[6]/a[1]");
	
	By genMtinStartTime = By.xpath("//*[@id='ContentPlaceHolder1_txtFromTime']");
	
	By genMtinEndTime = By.xpath("//*[@id='ContentPlaceHolder1_txtToTime']");
	
	By description = By.xpath("//html//tr[1]/td[6]/a[1]");
	
	By genLocationType = By.xpath("//*[@id='ContentPlaceHolder1_ddlLocationType']");
	
	By genLocation = By.xpath("//*[@id='ContentPlaceHolder1_ddlLocation']");
	
	By genPollOrSurvey = By.xpath("//*[@id='ContentPlaceHolder1_btnSelectPoll']");
	
	By genSendNotification = By.xpath("//*[@id='ContentPlaceHolder1_chkSendNotify_0']");
	
	By genSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnEditSave']");
	
	
	

	public SetUpMeetings(WebDriver driver) {
		super(driver);
	
	}
	
	public void commonActivities(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Meetings");
		
		waitForClickabilityOf(clickOnMeetings);
		
		driver.findElement(clickOnMeetings).click();
		
//		Clicking on Poll/Vote
		
		System.out.println("Clicking on Configure Meetings");
		
		waitForClickabilityOf(setUpMeetings);
		
		driver.findElement(setUpMeetings).click();
		
	}
	
//	General Meeting Set up
	
	public SetUpMeetings setUpGeneralMeeting(String EmailId, String Password,String EventFullName){
		
		
		
		return new SetUpMeetings(driver);
		
	}
	
//	Genius Meeting Set up
	
	public SetUpMeetings setUpGeniusMeeting(String EmailId, String Password,String EventFullName){
		
		
		return new SetUpMeetings(driver);
	}

}
