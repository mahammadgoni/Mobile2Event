package com.EventAgendaSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddSessions extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By clickOnEvent = By.xpath("//a[@onclick='GetPositionForEdit(this);']");
	
	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");
	
	By clickOnSession = By.xpath("//*[@class='ChangeArrow secondLevelArrow  sub-active'][contains(text(),'Sessions')]");
	
	By clickOnAddSession = By.xpath("//a[@href='/Session-AddEdit_New.aspx?session=0']");
	
	By searchTrack = By.xpath("//*[@id='txtSearchTrack']");
	
	By createTrack = By.xpath("//a[@id='pTrackNotificaton']");
	
	By newTrack = By.xpath("//*[@id='anewTrack']");
	
	By trackName = By.xpath("//*[@id='txtTrackName']");
	
	By colorCode = By.xpath("//*[@id='txtColorCode']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveTrack']");
	
	By cancelBtn = By.xpath("//*[@id='Button1']");
	
	By activityDropDown = By.xpath("//*[@id='ddlActivity']");
	
	By selectSession = By.xpath("//*[@id='ddlActivity']//option[@value='3']");
		
//	Selecting the Start date as 31th 
	
	By startDate = By.xpath("//*[text()='31']");
	
//	Selecting the End date as 2nd 
	
	By endDate = By.xpath("//*[text()='2']");
	
	By startTime = By.xpath("//*[@id='txtStartTime']");
	
	By endTime = By.xpath("//*[@id='txtEndTime']");
	
	By searchLocation = By.xpath("//*[@id='txtSearchLocation']");
	
	By createLocation = By.xpath("//a[@id='pLocationNotificaton']");
	
	By newLocation = By.xpath("//*[@id='ContentPlaceHolder1_anewLocation']");
	
	By addLocation = By.xpath("//*[@id='txtNewLocationName']");
	
	By addBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAddNewLocation']");
	
	By sessionDescription = By.xpath("//*[@id='ContentPlaceHolder1_txtSessionDesc_ifr']");	
	
	By saveAndPublishBtn = By.xpath("//*[@id='btnSaveNpublish']");
	

	public AddSessions(WebDriver driver) {
		super(driver);
		
	}
	
	public AddSessions addSessions(String EmailId, String Password, String EventFullName){
		
//		Login to your Account 
		
		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		
		System.out.println("Searching for Event Name :"+EventFullName);
		
		waitForClickabilityOf(searchEvent);
		
		WebElement search = driver.findElement(searchEvent);
		
		search.sendKeys(EventFullName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		System.out.println("Clicking on The Event");
		
		waitForClickabilityOf(clickOnEvent);
		
		driver.findElement(clickOnEvent).click();
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		System.out.println("Clicking on Session");
		
		waitForClickabilityOf(clickOnSession);
		
		driver.findElement(clickOnSession).click();
		
		System.out.println("Clicking on Add Session");
		
		waitForClickabilityOf(clickOnAddSession);
		
		driver.findElement(clickOnAddSession).click();
		
		System.out.println("Clicking on Search Track");
		
		waitForClickabilityOf(searchTrack);
		
		driver.findElement(searchTrack).sendKeys("Interview Room");
		
		System.out.println("Clicking on Create Track");
		
		waitForClickabilityOf(createTrack);
		
		driver.findElement(createTrack).click();
		
		System.out.println("Adding Hex Color Code");
		
		waitForClickabilityOf(colorCode);
		
		driver.findElement(colorCode).sendKeys("#268dad");
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(trackName);
		
		driver.findElement(trackName).click();
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		waitForClickabilityOf(cancelBtn);
		
		driver.findElement(cancelBtn).click();
		
		
		
		return new AddSessions(driver);
		
	}

}
