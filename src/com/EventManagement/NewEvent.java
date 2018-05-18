package com.EventManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;

public class NewEvent extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By logoutBtn = By.xpath("//*[@id and @onclick and @data-rel]");

	By menu = By.xpath("//*[@class='toggle-menu']");

	By noOfEvent = By.xpath("//*[@id='cloneEventId']");

	By newEvent = By.xpath("//*[@id='ContentPlaceHolder1_lnkNewEventCreation']");
	
	By openEventYes = By.xpath("//input[@id='ContentPlaceHolder1_rbtnautomapping_0']");
	
	By eventFullName = By.xpath("//*[@id='ContentPlaceHolder1_txtName']");
	
	By eventShortName = By.xpath("//*[@id='ContentPlaceHolder1_txtAcronym']");
	
	By startDate = By.xpath("//*[@id='txtFromDate']");
	
//	Selecting the Start date as 31th 
	
	By selectStartDate = By.xpath("//*[text()='30']");
	
//	Selecting the End date as 2nd 
	
	By selectEndDate = By.xpath("//*[text()='2']");
	
	By startTime = By.xpath("//*[@id='txtFromTime']");
	
	By endDate = By.xpath("//*[@id='txtToDate']");
	
	By endTime = By.xpath("//*[@id='txtToTime']");
	
	By eventTimeZone = By.xpath("//*[@id='ContentPlaceHolder1_ddlTimeZone']");
	
//	Selecting Event Time Zone as : Coordinated Universal Time
	
	By selectTimeZone = By.xpath("//*[@id='ContentPlaceHolder1_ddlTimeZone']/option[46]");
	
	By selectDateFormat = By.xpath("//*[@id='ContentPlaceHolder1_ddlDateFormat']");
	
	By selectFormat = By.xpath("//*[@value='dd/MM/yyyy']");
	
	By showBannerChkBox = By.xpath("//*[@id='ContentPlaceHolder1_chkShowBanner']");
	
	By bannerIntrvl = By.xpath("//*[@id='ContentPlaceHolder1_txtBannerInterval']");
	
	By goToNextMonth = By.xpath("//*[text()='Next']");
	
	By saveEvent = By.xpath("//*[@id='ContentPlaceHolder1_Button1']");
	
	By backEvent = By.xpath("//*[@id='ContentPlaceHolder1_Button2']");
	
	

	public NewEvent(WebDriver driver) {
		super(driver);
		
	}
	
	public NewEvent newEventCreation(String EmailId, String Password,String EventFullName,String EventShortName){
		
		System.out.println("Entering Email id  is : " + EmailId);

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		driver.findElement(emailId).sendKeys(EmailId);

		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();

		System.out.println("Entering Password  is : " + Password);

		waitForClickabilityOf(pass);

		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(Password);

		System.out.println("Clicking on Sign in Button");

		waitForClickabilityOf(signInBtn);

		driver.findElement(signInBtn).click();
		
		System.out.println("Going to Event Management ");
		
		List<WebElement> NoOfEvents = driver.findElements(noOfEvent);
		
		int Events = NoOfEvents.size();
		
		System.out.println("Current No of Existing Events is : "+Events);
		
		System.out.println("Clicking On New Event");
		
		waitForClickabilityOf(newEvent);

		driver.findElement(newEvent).click();
		
		System.out.println("Entering Event Full Name as :"+EventFullName);
				
		waitForClickabilityOf(eventFullName);

		driver.findElement(eventFullName).sendKeys(EventFullName);
		
		System.out.println("Entering Event Short Name as :"+EventShortName);
		
		waitForClickabilityOf(eventShortName);

		driver.findElement(eventShortName).sendKeys(EventShortName);
		
		System.out.println("Clicking On Event Start Date");
		
		waitForClickabilityOf(startDate);

		driver.findElement(startDate).click();
		
		System.out.println("Clicking On Go to Next Month");
		
		waitForClickabilityOf(goToNextMonth);

		driver.findElement(goToNextMonth).click();
		
		System.out.println("Selecting Event Start Date as : 30st");
		
		waitForClickabilityOf(selectStartDate);

		driver.findElement(selectStartDate).click();
		
		System.out.println("Selecting Event Start Time as : 09:00 AM");
		
		waitForClickabilityOf(startTime);

		driver.findElement(startTime).sendKeys("09:00 AM");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		System.out.println("Clicking On Event End Date");
		
		waitForClickabilityOf(endDate);

		driver.findElement(endDate).click();
		
		System.out.println("Clicking On Go to Next Month");
		
		waitForClickabilityOf(goToNextMonth);

		driver.findElement(goToNextMonth).click();
		
		System.out.println("Selecting Event End Date as : 2nd");
				
		waitForClickabilityOf(selectEndDate);

		driver.findElement(selectEndDate).click();
		
		System.out.println("Selecting Event End Time as : 06:00 PM");
		
		waitForClickabilityOf(endTime);

		driver.findElement(endTime).sendKeys("06:00 PM");
		
		System.out.println("Clicking on Event Time Zone");
		
		waitForClickabilityOf(eventTimeZone);

		driver.findElement(eventTimeZone).click();
		
		System.out.println("Selecting Event Time Zone as : Coordinated Universal Time");
		
		waitForClickabilityOf(selectTimeZone);

		driver.findElement(selectTimeZone).click();
		
		System.out.println("Clicking On Date Format ");
		
		waitForClickabilityOf(selectDateFormat);

		driver.findElement(selectDateFormat).click();
		
		System.out.println("Selecting Date Format as : MM/dd/yyyy");
		
		waitForClickabilityOf(selectFormat);

		driver.findElement(selectFormat).click();
		
		System.out.println("Clicking On Show Banner Check Box");
		
		waitForClickabilityOf(showBannerChkBox);
		
		if (driver.findElement(showBannerChkBox).isSelected()==true) {
			
			System.out.println("Check Box is already selected");
			
		} else {
			
			driver.findElement(showBannerChkBox).click();

		}
		
		System.out.println("Entering Banner Interval as : 5 seconds");
		
		waitForClickabilityOf(bannerIntrvl);

		driver.findElement(bannerIntrvl).sendKeys("5");		
		
		System.out.println("Clicking On Save Button to Create the Event");
		
		waitForClickabilityOf(saveEvent);

		driver.findElement(saveEvent).click();
		
		List<WebElement> NoOfEvents1 = driver.findElements(noOfEvent);
		
		int Events1 = NoOfEvents1.size();
		
		System.out.println("Current No of Existing Events is : "+Events1);
		
		if (Events==Events1-1) {
			
			System.out.println("Successfully Created One New Event");
			
		} else {
			
			System.out.println("Failed to Create New Event ");

		}
		
		return new NewEvent(driver);
		
	}

}



