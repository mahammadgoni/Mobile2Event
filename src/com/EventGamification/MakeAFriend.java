package com.EventGamification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class MakeAFriend extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnGamification = By.xpath("//li[@id='GM']//a[@href='javascript:void(0);']");
	
	By clickOnMakeAFrnd = By.xpath("//li[@id='MkFriend']//a[@href='UserConnections.aspx?mk']");
	
	By addConnection = By.xpath("//a[@href='UserConnectionAddEdit.aspx'][contains(text(),'Add Connections')]");
	
	By generateMappedUserQR = By.xpath("//*[@id='ContentPlaceHolder1_QRcode']");
	
	By selectDate = By.xpath("//*[@id='ContentPlaceHolder1_txtFromDate']");
	
	By setCount = By.xpath("//*[@id='ContentPlaceHolder1_txtCount']");
	
	By score = By.xpath("//*[@id='ContentPlaceHolder1_txtScore']");
	
	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtSuccessmsg']");
	
	By failureSameUserScanned = By.xpath("//*[@id='ContentPlaceHolder1_txtFaliuremsg']");
	
	By failureMaxCountRechd = By.xpath("//*[@id='ContentPlaceHolder1_txtfailmax']");
	
	By failureWrongDateScanned = By.xpath("//*[@id='ContentPlaceHolder1_txtwrongdatescanned']");
	
	By failureInvalidUser = By.xpath("//*[@id='ContentPlaceHolder1_txtinvaliduser']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	

	public MakeAFriend(WebDriver driver) {
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
		
		Thread.sleep(2000);

//		Clicking on Gamification
		
		System.out.println("Clicking on Gamification");
		
		waitForClickabilityOf(clickOnGamification);
		
		driver.findElement(clickOnGamification).click();
		
		Thread.sleep(2000);
		
//		Clicking on Make a Friend
		
		System.out.println("Clicking on Make a Friend");
		
		waitForClickabilityOf(clickOnMakeAFrnd);
		
		driver.findElement(clickOnMakeAFrnd).click();
		
	}
	
		
	public MakeAFriend addConnectionRules(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Make a Friend
		
		System.out.println("Clicking on Add Connections");
		
		waitForClickabilityOf(addConnection);
		
		driver.findElement(addConnection).click();
		
		Thread.sleep(2000);
		
//		Select Date
		
		System.out.println("Select Date");
		
		waitForClickabilityOf(selectDate);
		
		WebElement Date = driver.findElement(selectDate);
		
		Date.clear();
		
		Date.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Set the Count
		
		System.out.println("Set the Count");
		
		waitForClickabilityOf(setCount);
		
		driver.findElement(setCount).sendKeys("3");
		
		Thread.sleep(2000);
		
//		Set the Score
		
		System.out.println("Set the Score");
		
		waitForClickabilityOf(score);
		
		driver.findElement(score).sendKeys("100");
		
		Thread.sleep(2000);
		
//		Entering Success Message
		
		System.out.println("Entering Success Message");
		
		waitForClickabilityOf(successMessage);
		
		driver.findElement(successMessage).clear();
		
		driver.findElement(successMessage).sendKeys("Congratulations, you have made a connection!  You have earned $$ points! Hurray");
		
		Thread.sleep(2000);
		
//		Entering Failure Message if Same User Scanned Again
		
		System.out.println("Entering Failure Message if Same User Scanned Again");
		
		waitForClickabilityOf(failureSameUserScanned);
		
		driver.findElement(failureSameUserScanned).clear();
		
		driver.findElement(failureSameUserScanned).sendKeys("You have already scanned the user.Please Try Again with New One.");
		
		Thread.sleep(2000);
		
//		Entering Failure Message when Max Count Reached 
		
		System.out.println("Entering Failure Message when Max Count Reached ");
		
		waitForClickabilityOf(failureMaxCountRechd);
		
		driver.findElement(failureMaxCountRechd).clear();
		
		driver.findElement(failureMaxCountRechd).sendKeys("You have reached the maximum achievement for this game!.Thanks. It's Over.");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If Wrong Date Scanned 
		
		System.out.println("Entering Failure Message If Wrong Date Scanned ");
		
		waitForClickabilityOf(failureWrongDateScanned);
		
		driver.findElement(failureWrongDateScanned).clear();
		
		driver.findElement(failureWrongDateScanned).sendKeys("Sorry, you have scanned on the wrong day. Please Try Again when the Game is Active.");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If Invalid User Scanned
		
		System.out.println("Entering Failure Message If Invalid User Scanned");
		
		waitForClickabilityOf(failureInvalidUser);
		
		driver.findElement(failureInvalidUser).clear();
		
		driver.findElement(failureInvalidUser).sendKeys("You have scanned an invalid user. Please try Again with Valid User.");
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			driver.findElement(saveBtn).click();
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		
		
		return new MakeAFriend(driver);
		
	}

}
