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
	
	By generateAllQRCode = By.xpath("//a[@id='ContentPlaceHolder1_btnDownloadBC']");
	
	By downloadLocationCode = By.xpath("//a[@id='ContentPlaceHolder1_btnDownloadLocations']");
	
	By enterCode = By.xpath("//*[@id='ContentPlaceHolder1_txtEnterCode']");
	
	By qRScan = By.xpath("//*[@id='ContentPlaceHolder1_rbtnModeofGamePlay_0']");
	
	By inputCode = By.xpath("//*[@id='ContentPlaceHolder1_rbtnModeofGamePlay_1']");
	
	By location = By.xpath("//*[@id='ContentPlaceHolder1_txtLocation']");
	
	
	

	public Locations(WebDriver driver) {
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

//		Clicking on Gamification
		
		System.out.println("Clicking on Gamification");
		
		waitForClickabilityOf(clickOnGamification);
		
		driver.findElement(clickOnGamification).click();
		
//		Clicking on Locations
		
		System.out.println("Clicking on Locations");
		
		waitForClickabilityOf(clickOnLocation);
		
		driver.findElement(clickOnLocation).click();
		
	}
	
	public Locations addLocations(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		
		return new Locations(driver);
		
	}

}
