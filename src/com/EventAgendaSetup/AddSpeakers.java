package com.EventAgendaSetup;

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
	
	By speaker1 = By.xpath("//*[@id='ContentPlaceHolder1_gvSpeaker_chkSpeaker_0']");
	
	By addSpeaker = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='SpeakerAddEdit.aspx']");
	
	By firstname = By.xpath("//*[@id='ContentPlaceHolder1_txtFirstName1']");

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
		
		waitForClickabilityOf(firstname);
		
		driver.findElement(firstname).sendKeys(FirstName);
		
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

}
