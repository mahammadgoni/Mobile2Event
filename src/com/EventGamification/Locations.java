package com.EventGamification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Locations extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnGamification = By.xpath("//li[@id='GM']//a[@href='javascript:void(0);']");
	
	By clickOnLocation = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Locations')]");
	
	By clickOnNewQuestion = By.xpath("//a[@href='LocationAddEdit.aspx'][contains(text(),'New Question')]");
	
	By generateAllQRs = By.xpath("//a[@id='ContentPlaceHolder1_btnDownloadBC']");
	
	By downloadLocationCode = By.xpath("//a[@id='ContentPlaceHolder1_btnDownloadLocations']");
	
	By enterCode = By.xpath("//*[@id='ContentPlaceHolder1_txtEnterCode']");
	
	By scanQR = By.xpath("//*[@id='ContentPlaceHolder1_rbtnModeofGamePlay_0']");
	
	By inputCode = By.xpath("//*[@id='ContentPlaceHolder1_rbtnModeofGamePlay_1']");
	
	By location = By.xpath("//*[@id='ContentPlaceHolder1_txtLocation']");
	
	By locationScore = By.xpath("//*[@id='ContentPlaceHolder1_txtScore']");
	
	By locationRetries = By.xpath("//*[@id='ContentPlaceHolder1_txtRetries']");
	
	By locationDate = By.xpath("//*[@id='ContentPlaceHolder1_txtEndDate']");
	
	By locationTime = By.xpath("//*[@id='ContentPlaceHolder1_txtToTime']");
	
	By locationDescription = By.xpath("//*[@id='ContentPlaceHolder1_txtLocationDescription']");
	
	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtSuccessmsg']");
	
	By failureLocationMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtFailMessageWrongLoc']");
		
	By failureAttemptsMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtwronganserlocation']");
	
	By failureIfInactive = By.xpath("//*[@id='ContentPlaceHolder1_txtinactivedate']");
	
	By failureIfPlayedMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtalreadyplayed']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By deleteBtn = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_imgDel_0']");
	
	
	

	public Locations(WebDriver driver) {
		super(driver);
		
	}
//	Common Methods
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
		
		Thread.sleep(2000);

//		Clicking on Gamification
		
		System.out.println("Clicking on Gamification");
		
		waitForClickabilityOf(clickOnGamification);
		
		driver.findElement(clickOnGamification).click();
		
		Thread.sleep(2000);
		
//		Clicking on Locations
		
		System.out.println("Clicking on Locations");
		
		waitForClickabilityOf(clickOnLocation);
		
		driver.findElement(clickOnLocation).click();
		
	}
//	Common Methods
	public void commonLocationAdd(boolean ScanQR,String Code,String Location,String Score) throws InterruptedException{
		
		Thread.sleep(2000);
		
//		Clicking on New  Quiz or Trivia
		
		System.out.println("Clicking on New Location Questions");
		
		waitForClickabilityOf(clickOnNewQuestion);
		
		driver.findElement(clickOnNewQuestion).click();
		
		Thread.sleep(2000);
				
//		Entering the Location Code
		
		System.out.println("Entering the Location Code");
		
		waitForClickabilityOf(enterCode);
		
		driver.findElement(enterCode).sendKeys(Code);
				
//		Selecting Mode Of Game Play
		
		if (ScanQR==true) {
			
//			Selecting Mode Of Game Play as QR Scan
			
			System.out.println("Selecting Mode Of Game Play as QR Scan");
			
			waitForClickabilityOf(scanQR);
			
			driver.findElement(scanQR).click();
			
			
		} else {
			
//			Selecting Mode Of Game Play as Input Code
			
			System.out.println("Selecting Mode Of Game Play as Input Code");
			
			waitForClickabilityOf(inputCode);
			
			driver.findElement(inputCode).click();

		}		
		
		Thread.sleep(2000);
		
//		Entering the Location
		
		System.out.println("Entering the Location");
		
		waitForClickabilityOf(location);
		
		driver.findElement(location).sendKeys(Location);
		
		Thread.sleep(2000);
		
//		Entering the Score
		
		System.out.println("Entering the Score");
		
		waitForClickabilityOf(locationScore);
		
		driver.findElement(locationScore).sendKeys(Score);
		
		Thread.sleep(2000);
		
//		Entering Attempts
		
		System.out.println("Entering Attempts");
		
		waitForClickabilityOf(locationRetries);
		
		driver.findElement(locationRetries).sendKeys("3");
		
		Thread.sleep(2000);
		
//		Selecting Activation Date
		
		System.out.println("Selecting Activation Date");
		
		waitForClickabilityOf(locationDate);
		
		WebElement Date = driver.findElement(locationDate);
		
		Date.click();
		
		Date.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Selecting Activation Time
		
		System.out.println("Selecting Activation Time");
		
		waitForClickabilityOf(locationTime);
		
		WebElement Time = driver.findElement(locationTime);
		
		Time.click();
		
		Time.sendKeys(Keys.UP,Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Entering Location Description
		
		System.out.println("Entering Location Description");
		
		waitForClickabilityOf(locationDescription);
		
		driver.findElement(locationDescription).sendKeys("This is Automation Testing Location Question Description");
			
		Thread.sleep(2000);
		
//		"Entering Success Message"
		
		System.out.println("Entering Success Message");
		
		waitForClickabilityOf(successMessage);
		
		driver.findElement(successMessage).clear();
		
		driver.findElement(successMessage).sendKeys("Congratulations, you have answered correctly! You have earned $$ points! WOW");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Location Scanned
		
		System.out.println("Entering Failure Message If wrong Location Scanned");
		
		waitForClickabilityOf(failureLocationMessage);
		
		driver.findElement(failureLocationMessage).clear();
		
		driver.findElement(failureLocationMessage).sendKeys("You have scanned the wrong location. Please check the instructions and try with new location!");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Answer Given
		
		System.out.println("Entering Failure Message If wrong Location Scanned ");
		
		waitForClickabilityOf(failureIfInactive);
		
		driver.findElement(failureIfInactive).clear();
		
		driver.findElement(failureIfInactive).sendKeys("This location is not yet unlocked.  Please try again later.");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Location Scanned
		
		System.out.println("Entering Failure Message If Attempt Exhusted");
		
		waitForClickabilityOf(failureAttemptsMessage);
		
		driver.findElement(failureAttemptsMessage).clear();
		
		driver.findElement(failureAttemptsMessage).sendKeys("Sorry, you have exhausted all the attempts.  You did not earn any points, but please try again on the next question!");
		
		Thread.sleep(2000);
				
//		Entering Failure Message If wrong Location Scanned
		
		System.out.println("Entering Failure Message If already been Played");
		
		waitForClickabilityOf(failureIfPlayedMessage);
		
		driver.findElement(failureIfPlayedMessage).clear();
		
		driver.findElement(failureIfPlayedMessage).sendKeys("This location has already been played successfully.");
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		try {
			
			System.out.println("Clicking On Save Button");
			
			waitForClickabilityOf(saveBtn);
			
			driver.findElement(saveBtn).click();
			
			Thread.sleep(2000);
			
			waitForClickabilityOf(saveBtn);
			
			driver.findElement(saveBtn).click();
			
		} catch (Exception e) {
			
		}				
		
	}
	
	public Locations addLocations(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Adding 1st Location 
		
		commonLocationAdd(true, "244181", "Automation Test Room", "100");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Adding 2nd Location 
		
		commonLocationAdd(true, "244182", "Automation Code Room", "100");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Adding 3rd Location 
		
		commonLocationAdd(false, "244183", "Automation Gym Room", "100");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Adding 4th Location 
		
		commonLocationAdd(false, "244184", "Automation Game Room", "100");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Clicking On Generate All QRs
		
		System.out.println("Clicking On Generate All QRs");
		
		waitForClickabilityOf(generateAllQRs);
		
		driver.findElement(generateAllQRs).click();
		
		Thread.sleep(2000);
		
//		Checking No Of Questions
		
		waitForClickabilityOf(deleteBtn);
		
		boolean ExistQsNo = driver.findElement(deleteBtn).isDisplayed();
						
		if (ExistQsNo==true) {
			
			System.out.println("Succefully Added One Location Question ");
			
		} else {
			
			System.out.println("Failed to one Location Question");

		}
		
		
		
		
		return new Locations(driver);
		
	}

}
