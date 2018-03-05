package com.EventAgendaSetup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddSpeakers extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");
	
	By clickOnSpeakers = By.xpath("//*[@href='speakers.aspx'][contains(text(),'Speakers')]");
	
	By clickOnMapSessionWithSpeakers = By.xpath("//*[@id='form1']/section[2]/div/ul/li[3]/a");
	
	By speaker1 = By.xpath("//*[@id='ContentPlaceHolder1_gvSpeaker_chkSpeaker_0']");
	
	By session1 = By.xpath("//*[@id='sldsession']/ul/li[1]");
	
	By addSpeaker = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='SpeakerAddEdit.aspx']");
	
	By newSpeaker = By.xpath("//*[@href='#'][contains(text(),'new speaker')]");
	
	By first_Name = By.xpath("//*[@id='txtFirstName']");
	
	By last_Name = By.xpath("//*[@id='txtLastName']");
	
	By save_Btn = By.xpath("//*[@id='btnEditSave']");
	
	By sessionSaveBtn = By.xpath("//*[@id='bntSave']");
	
	By newSession = By.xpath("//*[@ class ='green-btn new-spkr-btn' and contains(text(),'new session')]");
	
	By clickOnTrack = By.xpath("//*[@id='ddlTrack']");
	
	By clickOnDate = By.xpath("//*[@id='ddlSessionDate']");
	
	By clickOnActivity = By.xpath("//*[@id='ddlActivity']");
	
	By sessionTitle = By.xpath("//*[@id='txtSessionName']");
	
	By startTime = By.xpath("//*[@id='txtFromTime']");
	
	By endTime = By.xpath("//*[@id='txtToTime']");
	
	By clickOnLocation = By.xpath("//*[@id='ddlLoc']");
	
	By firstName = By.xpath("//*[@id='ContentPlaceHolder1_txtFirstName1']");

	By lastName = By.xpath("//*[@id='ContentPlaceHolder1_txtLastName1']");
	
	By company = By.xpath("//*[@id='ContentPlaceHolder1_txtCompany1']");
	
	By mapAsAttendee = By.xpath("//*[@id='ContentPlaceHolder1_chkmapasanattendee']");

	By emailId = By.xpath("//*[@id='ContentPlaceHolder1_txtEmail1']");
	
	By showMail = By.xpath("//*[@id='ContentPlaceHolder1_chkshowemail']");

	By position = By.xpath("//*[@id='ContentPlaceHolder1_txtPosition1']");

	By selectCountry = By.xpath("//*[@id='ContentPlaceHolder1_DDL1']");
	
//	Selecting Country As United States

	By country = By.xpath("//*[@id='ContentPlaceHolder1_DDL1']//option[@value='184']");
	
	By city = By.xpath("//*[@id='ContentPlaceHolder1_txtCity']");
	
	By state = By.xpath("//*[@id='ContentPlaceHolder1_txtState']");	
	
	By description = By.xpath("//*[@id='ContentPlaceHolder1_txtProfile1_ifr']");

	By facebook = By.xpath("//*[@id='ContentPlaceHolder1_txtFb1']");

	By twitter = By.xpath("//*[@id='ContentPlaceHolder1_txttwt1']");

	By linkedin = By.xpath("//*[@id='ContentPlaceHolder1_txtlnk1']");
	
	By blog = By.xpath("//*[@id='ContentPlaceHolder1_txtws1']");

	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnEditSave']");
	
	By speakerSearchBar = By.xpath("//*[@id='txtEntity']");
	
	By selectSpeakerCheckBox = By.xpath("//html//div[@class='wrapper pushmenu-toggle body-wrapper-new']//li[1]/input[1]");
	
	By speakerDoneBtn = By.xpath("//*[@value='Done' and @onclick='speaker_done()']");
	
	By sessionSearchBar = By.xpath("//*[@id='txtSession']");
	
	By selectSessionCheckBox = By.xpath("//html//div[@class='col-lg-6 same-height border-left arrowrel']//li[1]/input[1]");
	
	By sessionDoneBtn = By.xpath("//*[@value='Done' and @onclick='session_done()']");
	
	By mapBtn = By.xpath("//*[@id='btnMap']");
	
	By yesBtn = By.xpath("//*[@class='yes']");
	
	By showMappings = By.xpath("//*[@id='btnListView']");
	

	public AddSpeakers(WebDriver driver) {
		super(driver);
	
	}
	
	public AddSpeakers addSpeakers(String EmailId, String Password, String EventFullName,String FirstName,String LastName) throws InterruptedException{
				
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
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
//		Clicking on Session
		
		System.out.println("Clicking on Speakers");
		
		waitForClickabilityOf(clickOnSpeakers);
		
		driver.findElement(clickOnSpeakers).click();
				
//		Clicking on Add Speakers
		
		System.out.println("Clicking on Add Speakers");
		
		waitForClickabilityOf(addSpeaker);
		
		driver.findElement(addSpeaker).click();
		
//		Entering First Name
		
		System.out.println("Entering First Name");
		
		waitForClickabilityOf(firstName);
		
		driver.findElement(firstName).sendKeys(FirstName);
		
//		Entering Last Name
		
		System.out.println("Entering Last Name");
		
		waitForClickabilityOf(lastName);
		
		driver.findElement(lastName).sendKeys(LastName);
				
//		Entering Company Name
		
		System.out.println("Entering Company Name");
		
		waitForClickabilityOf(company);
		
		driver.findElement(company).sendKeys("Webspiders India Pvt Ltd");
				
//		Converting the String to Lower case
		
		String FEmail = FirstName.toLowerCase()+LastName.toLowerCase();
		
//		Entering Email Id
		
		System.out.println("Entering Email Id");
				
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).sendKeys(FEmail+"@mailinator.com");
		
//		Clicking on Show Email Button
		
		System.out.println("Clicking on Show Email Button");
		
		waitForClickabilityOf(showMail);
		
		driver.findElement(showMail).click();
		
//		Clicking on Show Email Button
		
		System.out.println("Entering Position ");
		
		waitForClickabilityOf(position);
		
		driver.findElement(position).sendKeys("Speker");
		
//		Selecting Country
		
		System.out.println("Selecting Country");
		
		waitForClickabilityOf(selectCountry);
		
		driver.findElement(selectCountry).click();
		
//		Choosing Country as United States 
		
		System.out.println("Choosing Country as United States");
		
		waitForClickabilityOf(country);
		
		driver.findElement(country).click();
		
//		Selecting the City 
		
		System.out.println("Selecting the City");
		
		waitForClickabilityOf(city);
		
		driver.findElement(city).sendKeys("Austin");
		
//		Selecting the state 
		
		System.out.println("Selecting the state");
		
		waitForClickabilityOf(state);
		
		driver.findElement(state).sendKeys("Texas");
		
//		Entering some profile description 
		
		System.out.println("Entering some profile description");
		
		waitForClickabilityOf(description);
		
		driver.findElement(description).sendKeys("This is Profile Description");
		
//		Entering Facebook URL 
		
		System.out.println("Entering Facebook URL");
		
		waitForClickabilityOf(facebook);
		
		driver.findElement(facebook).sendKeys(FEmail+"@facebook.com");
		
//		Entering Linkedin URL 
		
		System.out.println("Entering Linkedin URL");
		
		waitForClickabilityOf(linkedin);
		
		driver.findElement(linkedin).sendKeys(FEmail+"@linkedin.com");
		
//		Entering Twitter URL 
		
		System.out.println("Entering Twitter URL");
		
		waitForClickabilityOf(twitter);
		
		driver.findElement(twitter).sendKeys(FEmail+"@twitter.com");
		
//		Entering blog URL 
		
		System.out.println("Entering Blog URL");
		
		waitForClickabilityOf(blog);
		
		driver.findElement(blog).sendKeys(FEmail+"@blog.com");
		
//		Entering save Button 
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		try {
			popUpHandeling();

		} catch (Exception e) {

		}
		
//		Getting No Of Speakers
		
		waitForClickabilityOf(speaker1);
		
		List<WebElement> element = driver.findElements(speaker1);
		
		int NoOfExSession = element.size();
		
		if (NoOfExSession==1) {
			
			System.out.println("Successfully Added one Speaker");
			
		} else {
			
			System.out.println("Failed to Add Speaker");

		}
		
				
		return new AddSpeakers(driver);
	}
	
	public AddSpeakers mapSessionWithRandomSpeaker(String EmailId, String Password, String EventFullName) throws InterruptedException{
		
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
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
//		Clicking on Speakers
		
		System.out.println("Clicking on Speakers");
		
		waitForClickabilityOf(clickOnSpeakers);
		
		driver.findElement(clickOnSpeakers).click();
				
//		Clicking on Map Sessions with Speakers
		
		System.out.println("Clicking on Map Sessions with Speakers");
		
		waitForClickabilityOf(clickOnMapSessionWithSpeakers);
		
		driver.findElement(clickOnMapSessionWithSpeakers).click();
		
//		Search for Speaker
		
		System.out.println("Search for Speaker");
		
		waitForClickabilityOf(speakerSearchBar);
		
		driver.findElement(speakerSearchBar).click();
		
//		Saving the Speakers name
		
		try {
			
			String Speaker = driver.findElement(speaker1).getText();
			
		} catch (Exception e) {
			
		}
				
//		Selecting the Speaker
		
		System.out.println("Selecting the Speaker");
		
		waitForClickabilityOf(selectSpeakerCheckBox);
		
		driver.findElement(selectSpeakerCheckBox).click();
				
//		Clicking on Done Button
		
		System.out.println("Clicking on Done Button");
		
		waitForClickabilityOf(speakerDoneBtn);
		
		driver.findElement(speakerDoneBtn).click();
				
//		Searching for Sessions
		
		System.out.println("Searching for Sessions");
		
		waitForClickabilityOf(sessionSearchBar);
		
		driver.findElement(sessionSearchBar).click();
		
//		Saving the Session name
		
		try {
			
			String Session = driver.findElement(session1).getText();
			
		} catch (Exception e) {
			
		}
				
//		Selecting the Session
		
		System.out.println("Selecting the Session");
		
		waitForClickabilityOf(selectSessionCheckBox);
		
		driver.findElement(selectSessionCheckBox).click();
		
//		Clicking on Done Button
		
		System.out.println("Clicking on Done Button");
		
		waitForClickabilityOf(sessionDoneBtn);
		
		driver.findElement(sessionDoneBtn).click();
		
//		Clicking on Map Button
		
		System.out.println("Clicking on Map Button");
		
		waitForClickabilityOf(mapBtn);
		
		driver.findElement(mapBtn).click();
		
//		Pop Up 

		try {
			popUpHandeling();
			
//			Clicking on Map Button
			
			System.out.println("Clicking on Show Mappings");
			
			waitForClickabilityOf(showMappings);
			
			driver.findElement(showMappings).click();

		} catch (Exception e) {

		}
		

		
//		Getting No Of Speakers
		
//		waitForClickabilityOf(speaker1);
//		
//		List<WebElement> element = driver.findElements(speaker1);
//		
//		int NoOfExSession = element.size();
//		
//		if (NoOfExSession==1) {
//			
//			System.out.println("Successfully Added one Speaker");
//			
//		} else {
//			
//			System.out.println("Failed to Add Speaker");
//
//		}
		
				
		return new AddSpeakers(driver);
	}

    public AddSpeakers createSpeakerAndMapWithCreateSession(String EmailId, String Password, String EventFullName,String FirstName,String LastName, String SessionTitle) throws InterruptedException, AWTException{
 		
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
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
//		Clicking on Speakers
		
		System.out.println("Clicking on Speakers");
		
		waitForClickabilityOf(clickOnSpeakers);
		
		driver.findElement(clickOnSpeakers).click();
				
//		Clicking on Map Sessions with Speakers
		
		System.out.println("Clicking on Map Sessions with Speakers");
		
		waitForClickabilityOf(clickOnMapSessionWithSpeakers);
		
		driver.findElement(clickOnMapSessionWithSpeakers).click();
		
//		Clicking on Clicking on new speaker
		
		System.out.println("Clicking on new speaker");
		
		waitForClickabilityOf(newSpeaker);
		
		driver.findElement(newSpeaker).click();
		
//		Entering First Name
		
		System.out.println("Entering First Name");
		
		waitForClickabilityOf(first_Name);
		
		driver.findElement(first_Name).sendKeys(FirstName);
		
//		Entering Last Name
		
		System.out.println("Entering Last Name");
		
		waitForClickabilityOf(last_Name);
		
		driver.findElement(last_Name).sendKeys(LastName);
		
//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(save_Btn);
		
		driver.findElement(save_Btn).click();
		
		Thread.sleep(2000);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		Clicking on new Sessions
		
		System.out.println("Clicking on new Sessions");
		
		waitForClickabilityOf(newSession);
		
		driver.findElement(newSession).click();
		
//		Clicking on Track
		
		System.out.println("Clicking on Track");
		
		waitForClickabilityOf(clickOnTrack);
		
		driver.findElement(clickOnTrack).click();
		
//		Initiating Robot Class for Key Event Actions
		
		Robot robot = new Robot();
		
//		Pressing Down Key 
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
//		Pressing Enter Key 
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
//		Clicking on Select Date
		
		System.out.println("Clicking on Select Date");
		
		waitForClickabilityOf(clickOnDate);
		
		driver.findElement(clickOnDate).click();
		
//		Pressing Down Key 
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
//		Pressing Enter Key 
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
//		Clicking on Select Session
		
		System.out.println("Clicking on Select Session");
		
		waitForClickabilityOf(clickOnActivity);
		
		driver.findElement(clickOnActivity).click();
		
//		Pressing Down Key 
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
//		Pressing Enter Key 
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
//		Entering the Sessions Title 
		
		System.out.println("Entering the Sessions Title ");
		
		waitForClickabilityOf(sessionTitle);
		
		driver.findElement(sessionTitle).sendKeys(SessionTitle);
		
//		Entering the Start Time 
		
		System.out.println("Entering the Start Time ");
		
		waitForClickabilityOf(startTime);
		
		driver.findElement(startTime).sendKeys("09:00 AM");
		
//		Entering the End Time 
		
		System.out.println("Entering the End Time ");
		
		waitForClickabilityOf(endTime);
		
		driver.findElement(endTime).sendKeys("09:00 PM");
		
//		Selecting the Location
		
		System.out.println("Selecting the Location");
		
		waitForClickabilityOf(clickOnLocation);
		
		driver.findElement(clickOnLocation).click();
		
//		Pressing Down Key 
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
//		Pressing Enter Key 
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(sessionSaveBtn);
		
		driver.findElement(sessionSaveBtn).click();
		
		
		return new AddSpeakers(driver);
		
}
}
