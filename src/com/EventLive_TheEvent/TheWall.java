package com.EventLive_TheEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class TheWall extends BaseSetUp{
	
	
	
	public TheWall(WebDriver driver) {
		super(driver);
		
	}

	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnLiveEvent = By.xpath("//li[@id='LV']//a[@href='javascript:void(0);']");
	
	By clickOnTheWall = By.xpath("//a[contains(text(),'The Wall')]");
	
//	Social Wall 
	
	By topicArea1 = By.xpath("//textarea[@id='ContentPlaceHolder1_gvforum_txtTopicText_0']");
	
	By topicSave1 = By.xpath("//input[@id='ContentPlaceHolder1_gvforum_lnkAccept_0']");
	
	By topicSatusP1 = By.xpath("//img[@id='ContentPlaceHolder1_gvforum_Img3_0']");
	
	By topicSatusU1 = By.xpath("//img[@id='ContentPlaceHolder1_gvforum_Img4_0']");
	
	By topicDelete1 = By.xpath("//a[@id='ContentPlaceHolder1_gvforum_lnkDelete_0']");
	
//	Photo Wall
	
	By clickOnPhotoWall = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='photo-modaration.aspx'][contains(text(),'Photo Wall')]");
	
	By photoArea1 = By.xpath("//textarea[@id='ContentPlaceHolder1_gvPhotos_txtTopicText_0']");
	
	By photoSave1 = By.xpath("//input[@id='ContentPlaceHolder1_gvPhotos_lnkAccept_0']");
	
	By photoSatusP1 = By.xpath("//input[@id='ContentPlaceHolder1_gvPhotos_Img3_0']");
	
	By photoSatusU1 = By.xpath("//input[@id='ContentPlaceHolder1_gvPhotos_Img4_0']");
	
	By photoDelete1 = By.xpath("//input[@id='ContentPlaceHolder1_gvPhotos_imgDelFromList_0']");
	
	
	
	
//	Update Topic
	
	public TheWall updateSocialWall(String EmailId, String Password,String EventFullName,String NewTopic) throws InterruptedException{
		
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
		
		System.out.println("Clicking on The Wall");
		
		waitForClickabilityOf(clickOnTheWall);
		
		driver.findElement(clickOnTheWall).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering New Topic");
		
		waitForClickabilityOf(topicArea1);
		
		String Topic = driver.findElement(topicArea1).getText();
		
		Thread.sleep(2000);
		
		driver.findElement(topicArea1).clear();
		
		driver.findElement(topicArea1).sendKeys(NewTopic);
		
		Thread.sleep(2000);
		
		try {
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(topicSave1);
		
		driver.findElement(topicSave1).click();
		
		Thread.sleep(2000);
			
		driver.findElement(topicSave1).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
			
		popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		String Topic1 = driver.findElement(topicArea1).getText();
		
		try {
			
			if (Topic==Topic1) {
				
				System.out.println("Successfully Updated the Topic");
				
			} else {
				
				System.out.println("Failed to Update the Topic");

			}
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Status Button");
		
		waitForClickabilityOf(topicSatusP1);
		
		driver.findElement(topicSatusP1).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Delete Button");
		
		waitForClickabilityOf(topicDelete1);
		
		driver.findElement(topicDelete1).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		
	
		return new TheWall(driver);
		
	}
	
//	Update Photo Wall
	
	public TheWall updatePhotoWall(String EmailId, String Password,String EventFullName,String NewTopic) throws InterruptedException{
		
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
		
		System.out.println("Clicking on The Wall");
		
		waitForClickabilityOf(clickOnTheWall);
		
		driver.findElement(clickOnTheWall).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Photo Wall");
		
		waitForClickabilityOf(clickOnPhotoWall);
		
		driver.findElement(clickOnPhotoWall).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering New Topic");
		
		waitForClickabilityOf(photoArea1);
		
		String Topic = driver.findElement(photoArea1).getText();
		
		Thread.sleep(2000);
		
		driver.findElement(photoArea1).clear();
		
		driver.findElement(photoArea1).sendKeys(NewTopic);
		
		Thread.sleep(2000);
		
		try {
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(photoSave1);
		
		driver.findElement(photoSave1).click();
		
		Thread.sleep(2000);
			
		driver.findElement(photoSave1).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
			
		popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		String Topic1 = driver.findElement(photoArea1).getText();
		
		try {
			
			if (Topic==Topic1) {
				
				System.out.println("Successfully Updated the Topic");
				
			} else {
				
				System.out.println("Failed to Update the Topic");

			}
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Status Button");
		
		waitForClickabilityOf(photoSatusP1);
		
		driver.findElement(photoSatusP1).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Delete Button");
		
		waitForClickabilityOf(photoDelete1);
		
		driver.findElement(photoDelete1).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		
		return new TheWall(driver);
	}
	
	
	

}
