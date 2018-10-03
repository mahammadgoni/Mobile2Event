package com.EventMeetings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class UploadMeetings extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnMeetings = By.xpath("//*[@id='meetingmodule']");
	
	By uploadMeetings = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Upload Meetings')]");
	
	By chooseFile = By.xpath("//*[@id='ContentPlaceHolder1_fileupload1']");
	
	By importFile = By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']");
	
	By bulkUploadHistory = By.xpath("//*[@id='ContentPlaceHolder1_Button1']");
	
	By allModules = By.xpath("//*[@id='ContentPlaceHolder1_ddlModule']");
	
	By stausMsg = By.xpath("//span[@id='ContentPlaceHolder1_gvBulkUploadHistory_lblStatus_0']");
	

	public UploadMeetings(WebDriver driver) {
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
		
		waitForClickabilityOf(uploadMeetings);
		
		driver.findElement(uploadMeetings).click();
		
	}
	
	public UploadMeetings meetingsUpload(String EmailId, String Password,String EventFullName,String MeetingUploadPath) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Uploading Excel File
				
		System.out.println("Uploading Excel File");
		
		waitForClickabilityOf(chooseFile);
		
		driver.findElement(chooseFile).sendKeys(MeetingUploadPath);
		
		Thread.sleep(2000);
		
//		Clicking On Import File
		
		System.out.println("Clicking On Import File");
		
		waitForClickabilityOf(importFile);
		
		driver.findElement(importFile).click();
		
		Thread.sleep(2000);
		
//		Clicking On Bulk Upload History
		
		System.out.println("Clicking On Bulk Upload History");
		
		waitForClickabilityOf(bulkUploadHistory);
		
		driver.findElement(bulkUploadHistory).click();
		
//	    Selecting Location Type 
		
		System.out.println("Clicking on All Modules to Select Meeting excel file");
		
		waitForClickabilityOf(allModules);
		
		Select AllModulesDropDown = new Select(driver.findElement(allModules));
		
		AllModulesDropDown.selectByIndex(10);
		
//		Clicking On Bulk Upload History
				
		waitForClickabilityOf(stausMsg);
		
		String Status = driver.findElement(stausMsg).getText();
		
		if (Status.equals("Successful")) {
			
			System.out.println("Successfully Uploaded Meetings ");
			
		} else {
			
			System.out.println("Failed to Upload Meetings File");

		}
		
		
		
		
		return new UploadMeetings(driver);
		
	}

}
