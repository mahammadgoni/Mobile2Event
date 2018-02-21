package com.EventAgendaSetup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddSessions extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");
	
	By clickOnSession = By.xpath("//*[@class='ChangeArrow secondLevelArrow  sub-active'][contains(text(),'Sessions')]");
	
	By noOfSessions = By.xpath("//*[@class='checkbox checkbox-success']");
	
	By clickOnAddSession = By.xpath("//ul[@id='3rdlevelmenu']//li//a[@href='/Session-AddEdit_New.aspx?session=0']");
	
	By clickOnTracks = By.xpath("//ul[@id='3rdlevelmenu']//li//a[@href='/Track-AddEdit.aspx']");
	
	By clickOnLocation = By.xpath("//ul[@id='3rdlevelmenu']//li//a[@href='/SessionLocation-AddEdit.aspx']");
	
	By addTrack = By.xpath("//*[@id='AddTrack']");
	
	By track_Name = By.xpath("//*[@id='ContentPlaceHolder1_txtTrackName']");
	
	By addNewLocation = By.xpath("//*[@id='AddLocation']");
	
	By locationName = By.xpath("//*[@id='ContentPlaceHolder1_txtLocationName']");
	
	By locationAddBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveLocation']");
	
	By locationCloseBtn = By.xpath("//*[@id='AddEditLocationPopUp']//a[@class='close-popup']");
	
	By sessionTitle = By.xpath("//*[@id='txtSessionName']");
	
	By searchTrack = By.xpath("//*[@id='txtSearchTrack']");
	
	By createTrack = By.xpath("//a[@id='pTrackNotificaton']");
	
	By newTrack = By.xpath("//*[@id='anewTrack']");
	
	By trackName = By.xpath("//*[@id='txtTrackName']");
	
	By colorCode = By.xpath("//*[@id='txtColorCode']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveTrack']");
	
	By cancelBtn = By.xpath("//*[@id='Button1']");
	
	By activityDropDown = By.xpath("//*[@id='ddlActivity']");
	
	By selectSession = By.xpath("//*[@id='ddlActivity']//option[@value='3']");
	
	By eventStartDate = By.xpath("//*[@id='ContentPlaceHolder1_trRecordsFound']//td[5]");
			
	By sessionStartDate = By.xpath("//*[@id='txtStartDate']");
		
//	By sessionEndDate = By.xpath("//*[text()='2']");
	
	By startTime = By.xpath("//*[@id='txtStartTime']");
	
	By endTime = By.xpath("//*[@id='txtEndTime']");
	
	By searchLocation = By.xpath("//*[@id='txtSearchLocation']");
	
	By createLocation = By.xpath("//a[@id='pLocationNotificaton']");
	
	By newLocation = By.xpath("//*[@id='ContentPlaceHolder1_anewLocation']");
	
	By addLocation = By.xpath("//*[@id='txtNewLocationName']");
	
	By addBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAddNewLocation']");
	
	By closePopUp = By.xpath("//*[@id='LocationAddEditpop']//a[@class='close-popup']");
	
	By sessionDescription = By.xpath("//*[@id='ContentPlaceHolder1_txtSessionDesc_ifr']");	
	
	By saveAndPublishBtn = By.xpath("//*[@id='btnSaveNpublish']");
	
	
	

	public AddSessions(WebDriver driver) {
		super(driver);
		
	}
	
	public AddSessions addSessions(String EmailId, String Password, String EventFullName,String SessionTitle) throws ParseException{
		
//		Login to your Account 
		
		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		
//		Searching for Event Name
		
		System.out.println("Searching for Event Name :"+EventFullName);
		
		waitForClickabilityOf(searchEvent);
		
		WebElement search = driver.findElement(searchEvent);
		
		search.sendKeys(EventFullName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		waitForClickabilityOf(clickOnEvent);
		
		String ActEventName = driver.findElement(clickOnEvent).getText();
		
		System.out.println(ActEventName);
		
		if (EventFullName.equals(ActEventName)) {
			
			System.out.println("This is Correct Event");
			
		} else {
			
			System.out.println("Failed to Search the Event Name so, searching again ");
			
			search.clear();
			
			search.sendKeys(EventFullName);
			
//			Pressing Enter Button 
			
			search.sendKeys(Keys.ENTER);
				
		}
		
//		Saving the Event Date
		
		System.out.println("Saving the Event Date");
		
		waitForClickabilityOf(eventStartDate);
		
		String EventDate = driver.findElement(eventStartDate).getText();	
		
		System.out.println(EventDate);
		
//		Changing the String to Date
		
	    Date date = null;

	    DateFormat df = new SimpleDateFormat("MMM dd,yyyy");
	       
	    try{
	    	
	        date = df.parse(EventDate);

	    }
	    catch ( Exception ex ){
	        System.out.println(ex);
	    }
//	  Again changing the Date to String 
	    
	    String FEventDate = null;
	    
	    SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");

	    try{
	    	
	    	FEventDate = sdfr.format(date);
	    	
	    }catch (Exception ex ){
	    	
	 	System.out.println(ex);
	 	
	    }
	    		
		System.out.println(FEventDate);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
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
		
		System.out.println("Clicking on Session");
		
		waitForClickabilityOf(clickOnSession);
		
		driver.findElement(clickOnSession).click();
		
//		Clicking on Add Session
		
		System.out.println("Clicking on Add Session");
		
		waitForClickabilityOf(clickOnAddSession);
		
		driver.findElement(clickOnAddSession).click();
		
//		Adding Search Track
		
		System.out.println("Entering Session Title  as :  "+SessionTitle);
		
		waitForClickabilityOf(sessionTitle);
		
		driver.findElement(sessionTitle).sendKeys(SessionTitle);
		
//		Adding Search Track
		
		System.out.println("Adding Search Track");
		
		waitForClickabilityOf(searchTrack);
		
		driver.findElement(searchTrack).sendKeys("Interview Room");
		
//		Clicking on Create Track
		
		System.out.println("Clicking on Create Track");
		
		waitForClickabilityOf(createTrack);
		
		driver.findElement(createTrack).click();
		
//		Adding Hex Color Code
		
		System.out.println("Adding Hex Color Code");
		
		waitForClickabilityOf(colorCode);
		
		driver.findElement(colorCode).sendKeys("#268dad");
		
//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(trackName);
		
		driver.findElement(trackName).click();
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		waitForClickabilityOf(cancelBtn);
		
		driver.findElement(cancelBtn).click();
		
//		Clicking on Activity Drop Down
		
		System.out.println("Clicking on Activity Drop Down");
		
		waitForClickabilityOf(activityDropDown);
		
		driver.findElement(activityDropDown).click();
		
//		Selecting Activity As Session from Drop Down
		
		System.out.println("Selecting Activity As Session from Drop Down");
		
		waitForClickabilityOf(selectSession);
		
		driver.findElement(selectSession).click();
		
//		Selecting Session Start Date as Event Date
		
		System.out.println("Selecting Session Start Date as Event Date");
		
		waitForClickabilityOf(sessionStartDate);
		
		WebElement selectDate = driver.findElement(sessionStartDate);
		
		selectDate.sendKeys(FEventDate);
		
		selectDate.sendKeys(Keys.ENTER);
		
//		Selecting Session Start Time
		
		System.out.println("Selecting Session Start Time");
		
		waitForClickabilityOf(startTime);
		
		driver.findElement(startTime).sendKeys("09:00 AM");
		
//		Selecting Session End Time
		
		System.out.println("Selecting Session End Time");
		
		waitForClickabilityOf(endTime);
		
		driver.findElement(endTime).sendKeys("09:00 PM");
		
//		Search the Location
		
		System.out.println("Search the Location");
		
		waitForClickabilityOf(searchLocation);
		
		driver.findElement(searchLocation).sendKeys("Meeting Room");
		
//		Click On Add Location
		
		System.out.println("Click On Add Location");
		
		waitForClickabilityOf(createLocation);
		
		driver.findElement(createLocation).click();
		
//		Click On Add Button
		
		System.out.println("Click On Add Button");
		
		waitForClickabilityOf(addBtn);
		
		driver.findElement(addBtn).click();
		
//		Click On Close Pop Up
		
		System.out.println("Click On Close Pop Up");
		
		waitForClickabilityOf(closePopUp);
		
		driver.findElement(closePopUp).click();
		
//		Adding Some Test Description
		
		System.out.println("Adding Some Test Description");
		
		waitForClickabilityOf(sessionDescription);
		
		driver.findElement(sessionDescription).sendKeys("This is Automation Testing Session Description");
		
//		Click On Save and Publish Button
		
		System.out.println("Click On Save and Publish Button");
		
		waitForClickabilityOf(saveAndPublishBtn);
		
		driver.findElement(saveAndPublishBtn).click();
		
//		Verifying  whether the Session added or not 
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element = driver.findElements(noOfSessions);
		
		int NoOfSession = element.size();
		
		if (NoOfSession==1) {
			
			System.out.println("Successfully Added One Session");
			
		} else {
			
			System.out.println("Failed to Add New Sessions");

		}
		
		
		
		
		
		
		return new AddSessions(driver);
		
	}



    public AddSessions addSessionsWithTrackAndLocation(String EmailId, String Password, String EventFullName,String SessionTitle) throws ParseException{
	
//	Login to your Account 
	
	new LoginToAccount(driver).loginToAccount(EmailId, Password);
	
//	Searching for Event Name
	
	System.out.println("Searching for Event Name :"+EventFullName);
	
	waitForClickabilityOf(searchEvent);
	
	WebElement search = driver.findElement(searchEvent);
	
	search.sendKeys(EventFullName);
	
//	Pressing Enter Button 
	
	search.sendKeys(Keys.ENTER);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	waitForClickabilityOf(clickOnEvent);
	
	String ActEventName = driver.findElement(clickOnEvent).getText();
	
	System.out.println(ActEventName);
	
	if (EventFullName.equals(ActEventName)) {
		
		System.out.println("This is Correct Event");
		
	} else {
		
		System.out.println("Failed to Search the Event Name so, searching again ");
		
		search.clear();
		
		search.sendKeys(EventFullName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
			
	}
	
//	Saving the Event Date
	
	System.out.println("Saving the Event Date");
	
	waitForClickabilityOf(eventStartDate);
	
	String EventDate = driver.findElement(eventStartDate).getText();	
	
	System.out.println(EventDate);
	
//	Changing the String to Date
	
    Date date = null;

    DateFormat df = new SimpleDateFormat("MMM dd,yyyy");
       
    try{
    	
        date = df.parse(EventDate);

    }
    catch ( Exception ex ){
        System.out.println(ex);
    }
//  Again changing the Date to String 
    
    String FEventDate = null;
    
    SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");

    try{
    	
    	FEventDate = sdfr.format(date);
    	
    }catch (Exception ex ){
    	
 	System.out.println(ex);
 	
    }
    		
	System.out.println(FEventDate);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
//	Clicking on The Event
	
	System.out.println("Clicking on The Event");
	
	waitForClickabilityOf(clickOnEvent);
	
	driver.findElement(clickOnEvent).click();

	
//	Clicking on Agenda Setup
	
	System.out.println("Clicking on Agenda Setup");
	
	waitForClickabilityOf(clickOnAgendaSetUp);
	
	driver.findElement(clickOnAgendaSetUp).click();
	
//	Clicking on Session
	
	System.out.println("Clicking on Session");
	
	waitForClickabilityOf(clickOnSession);
	
	driver.findElement(clickOnSession).click();
	
//	Clicking on Track
	
	System.out.println("Clicking on Track");
	
	waitForClickabilityOf(clickOnTracks);
	
	driver.findElement(clickOnTracks).click();
	
//	Clicking on Add Track
	
	System.out.println("Clicking on Add Track");
	
	waitForClickabilityOf(addTrack);
	
	driver.findElement(addTrack).click();
	
//	Adding Track Name
	
	waitForClickabilityOf(track_Name);
	
	driver.findElement(track_Name).sendKeys("Interview Room 1");
	
//	Adding Hex Color Code
	
	System.out.println("Adding Hex Color Code");
	
	waitForClickabilityOf(colorCode);
	
	driver.findElement(colorCode).sendKeys("#268dad");
	
//	Clicking on Save Button
	
	System.out.println("Clicking on Save Button");
	
	waitForClickabilityOf(trackName);
	
	driver.findElement(trackName).click();
	
	waitForClickabilityOf(saveBtn);
	
	driver.findElement(saveBtn).click();
	
	waitForClickabilityOf(cancelBtn);
	
	driver.findElement(cancelBtn).click();
	
	
//	Clicking On Locations
	
	System.out.println("Clicking On Locations");
	
	waitForClickabilityOf(clickOnLocation);
	
	driver.findElement(clickOnLocation).click();
	
//	Clicking On Add Location
	
	System.out.println("Clicking On Add Location");
	
	waitForClickabilityOf(addLocation);
	
	driver.findElement(addLocation).click();
	
//	Entering Location Name
	
	System.out.println("Entering Location Name");
	
	waitForClickabilityOf(locationName);
	
	driver.findElement(locationName).sendKeys("Meeting Room 1");
	
//	Clicking On Close Up Pop up
	
	System.out.println("Clicking On Close Up Pop up");
	
	waitForClickabilityOf(locationCloseBtn);
	
	driver.findElement(locationCloseBtn).click();
	
//	Clicking on Session
	
	System.out.println("Clicking on Session");
	
	waitForClickabilityOf(clickOnSession);
	
	driver.findElement(clickOnSession).click();
	
//	Clicking on Add Session
	
	System.out.println("Clicking on Add Session");
	
	waitForClickabilityOf(clickOnAddSession);
	
	driver.findElement(clickOnAddSession).click();
	
//	Adding Search Track
	
	System.out.println("Entering Session Title  as :  "+SessionTitle);
	
	waitForClickabilityOf(sessionTitle);
	
	driver.findElement(sessionTitle).sendKeys(SessionTitle+"1");
	
//	Adding Search Track
	
	System.out.println("Adding Search Track");
	
	waitForClickabilityOf(searchTrack);
	
	driver.findElement(searchTrack).sendKeys("IInterview Room 1");
		
//	Clicking on Activity Drop Down
	
	System.out.println("Clicking on Activity Drop Down");
	
	waitForClickabilityOf(activityDropDown);
	
	driver.findElement(activityDropDown).click();
	
//	Selecting Activity As Session from Drop Down
	
	System.out.println("Selecting Activity As Session from Drop Down");
	
	waitForClickabilityOf(selectSession);
	
	driver.findElement(selectSession).click();
	
//	Selecting Session Start Date as Event Date
	
	System.out.println("Selecting Session Start Date as Event Date");
	
	waitForClickabilityOf(sessionStartDate);
	
	WebElement selectDate = driver.findElement(sessionStartDate);
	
	selectDate.sendKeys(FEventDate);
	
	selectDate.sendKeys(Keys.ENTER);
	
//	Selecting Session Start Time
	
	System.out.println("Selecting Session Start Time");
	
	waitForClickabilityOf(startTime);
	
	driver.findElement(startTime).sendKeys("09:00 AM");
	
//	Selecting Session End Time
	
	System.out.println("Selecting Session End Time");
	
	waitForClickabilityOf(endTime);
	
	driver.findElement(endTime).sendKeys("09:00 PM");
	
//	Search the Location
	
	System.out.println("Search the Location");
	
	waitForClickabilityOf(searchLocation);
	
	driver.findElement(searchLocation).sendKeys("Meeting Room 1");
	
//	Adding Some Test Description
	
	System.out.println("Adding Some Test Description");
	
	waitForClickabilityOf(sessionDescription);
	
	driver.findElement(sessionDescription).sendKeys("This is Automation Testing Session Description With Track And Location");
	
//	Click On Save and Publish Button
	
	System.out.println("Click On Save and Publish Button");
	
	waitForClickabilityOf(saveAndPublishBtn);
	
	driver.findElement(saveAndPublishBtn).click();
	
//	Verifying  whether the Session added or not 
	
	waitForClickabilityOf(noOfSessions);
	
	List<WebElement> element = driver.findElements(noOfSessions);
	
	int NoOfSession = element.size();
	
	if (NoOfSession==2) {
		
		System.out.println("Successfully Added One Session With Track And Location");
		
	} else {
		
		System.out.println("Failed to Add New Sessions");

	}
	
	return new AddSessions(driver);
	
}

public AddSessions addSessionsWithOutTrackAndLocation(String EmailId, String Password, String EventFullName,String SessionTitle) throws ParseException{
	
//	Login to your Account 
	
	new LoginToAccount(driver).loginToAccount(EmailId, Password);
	
//	Searching for Event Name
	
	System.out.println("Searching for Event Name :"+EventFullName);
	
	waitForClickabilityOf(searchEvent);
	
	WebElement search = driver.findElement(searchEvent);
	
	search.sendKeys(EventFullName);
	
//	Pressing Enter Button 
	
	search.sendKeys(Keys.ENTER);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	waitForClickabilityOf(clickOnEvent);
	
	String ActEventName = driver.findElement(clickOnEvent).getText();
	
	System.out.println(ActEventName);
	
	if (EventFullName.equals(ActEventName)) {
		
		System.out.println("This is Correct Event");
		
	} else {
		
		System.out.println("Failed to Search the Event Name so, searching again ");
		
		search.clear();
		
		search.sendKeys(EventFullName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
			
	}
	
//	Saving the Event Date
	
	System.out.println("Saving the Event Date");
	
	waitForClickabilityOf(eventStartDate);
	
	String EventDate = driver.findElement(eventStartDate).getText();	
	
	System.out.println(EventDate);
	
//	Changing the String to Date
	
    Date date = null;

    DateFormat df = new SimpleDateFormat("MMM dd,yyyy");
       
    try{
    	
        date = df.parse(EventDate);

    }
    catch ( Exception ex ){
        System.out.println(ex);
    }
//  Again changing the Date to String 
    
    String FEventDate = null;
    
    SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");

    try{
    	
    	FEventDate = sdfr.format(date);
    	
    }catch (Exception ex ){
    	
 	System.out.println(ex);
 	
    }
    		
	System.out.println(FEventDate);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
//	Clicking on The Event
	
	System.out.println("Clicking on The Event");
	
	waitForClickabilityOf(clickOnEvent);
	
	driver.findElement(clickOnEvent).click();

	
//	Clicking on Agenda Setup
	
	System.out.println("Clicking on Agenda Setup");
	
	waitForClickabilityOf(clickOnAgendaSetUp);
	
	driver.findElement(clickOnAgendaSetUp).click();
	
//	Clicking on Session
	
	System.out.println("Clicking on Session");
	
	waitForClickabilityOf(clickOnSession);
	
	driver.findElement(clickOnSession).click();
	
//	Clicking on Add Session
	
	System.out.println("Clicking on Add Session");
	
	waitForClickabilityOf(clickOnAddSession);
	
	driver.findElement(clickOnAddSession).click();
	
//	Adding Search Track
	
	System.out.println("Entering Session Title  as :  Mobile Application Demo");
	
	waitForClickabilityOf(sessionTitle);
	
	driver.findElement(sessionTitle).sendKeys(SessionTitle);
	
//	Adding Search Track
	
	System.out.println("Adding Search Track");
	
	waitForClickabilityOf(searchTrack);
	
	driver.findElement(searchTrack).sendKeys("Interview Room");
	
//	Clicking on Create Track
	
	System.out.println("Clicking on Create Track");
	
	waitForClickabilityOf(createTrack);
	
	driver.findElement(createTrack).click();
	
//	Adding Hex Color Code
	
	System.out.println("Adding Hex Color Code");
	
	waitForClickabilityOf(colorCode);
	
	driver.findElement(colorCode).sendKeys("#268dad");
	
//	Clicking on Save Button
	
	System.out.println("Clicking on Save Button");
	
	waitForClickabilityOf(trackName);
	
	driver.findElement(trackName).click();
	
	waitForClickabilityOf(saveBtn);
	
	driver.findElement(saveBtn).click();
	
	waitForClickabilityOf(cancelBtn);
	
	driver.findElement(cancelBtn).click();
	
//	Clicking on Activity Drop Down
	
	System.out.println("Clicking on Activity Drop Down");
	
	waitForClickabilityOf(activityDropDown);
	
	driver.findElement(activityDropDown).click();
	
//	Selecting Activity As Session from Drop Down
	
	System.out.println("Selecting Activity As Session from Drop Down");
	
	waitForClickabilityOf(selectSession);
	
	driver.findElement(selectSession).click();
	
//	Selecting Session Start Date as Event Date
	
	System.out.println("Selecting Session Start Date as Event Date");
	
	waitForClickabilityOf(sessionStartDate);
	
	WebElement selectDate = driver.findElement(sessionStartDate);
	
	selectDate.sendKeys(FEventDate);
	
	selectDate.sendKeys(Keys.ENTER);
	
//	Selecting Session Start Time
	
	System.out.println("Selecting Session Start Time");
	
	waitForClickabilityOf(startTime);
	
	driver.findElement(startTime).sendKeys("09:00 AM");
	
//	Selecting Session End Time
	
	System.out.println("Selecting Session End Time");
	
	waitForClickabilityOf(endTime);
	
	driver.findElement(endTime).sendKeys("09:00 PM");
	
//	Search the Location
	
	System.out.println("Search the Location");
	
	waitForClickabilityOf(searchLocation);
	
	driver.findElement(searchLocation).sendKeys("Meeting Room");
	
//	Click On Add Location
	
	System.out.println("Click On Add Location");
	
	waitForClickabilityOf(createLocation);
	
	driver.findElement(createLocation).click();
	
//	Click On Add Button
	
	System.out.println("Click On Add Button");
	
	waitForClickabilityOf(addBtn);
	
	driver.findElement(addBtn).click();
	
//	Click On Close Pop Up
	
	System.out.println("Click On Close Pop Up");
	
	waitForClickabilityOf(closePopUp);
	
	driver.findElement(closePopUp).click();
	
//	Adding Some Test Description
	
	System.out.println("Adding Some Test Description");
	
	waitForClickabilityOf(sessionDescription);
	
	driver.findElement(sessionDescription).sendKeys("This is Automation Testing Session Description");
	
//	Click On Save and Publish Button
	
	System.out.println("Click On Save and Publish Button");
	
	waitForClickabilityOf(saveAndPublishBtn);
	
	driver.findElement(saveAndPublishBtn).click();
	
//	Verifying  whether the Session added or not 
	
	waitForClickabilityOf(noOfSessions);
	
	List<WebElement> element = driver.findElements(noOfSessions);
	
	int NoOfSession = element.size();
	
	if (NoOfSession==1) {
		
		System.out.println("Successfully Added One Session");
		
	} else {
		
		System.out.println("Failed to Add New Sessions");

	}
	
	
	
	
	
	
	return new AddSessions(driver);
	
}

}
