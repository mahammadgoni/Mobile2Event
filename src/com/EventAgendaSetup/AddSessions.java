package com.EventAgendaSetup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddSessions extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");
	
	By clickOnSession = By.xpath("//*[@class='ChangeArrow secondLevelArrow  sub-active'][contains(text(),'Sessions')]");
	
	By noOfSessions = By.xpath("//*[@class='checkbox checkbox-success']");
	
	By clickOnAddSession = By.xpath("//ul[@id='3rdlevelmenu']//li//a[@href='/Session-AddEdit_New.aspx']");
	
	By clickOnAddSessionFromLocation = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='Session-AddEdit_New.aspx'][contains(text(),'Add Session')]");
	
	By clickOnTracks = By.xpath("//ul[@id='3rdlevelmenu']//li//a[@href='/Track-AddEdit.aspx']");
	
	By clickOnLocation = By.xpath("//*[@class='menu-3rd-level clearfix']//li//a[@href='SessionLocation-AddEdit.aspx']");
	
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
	
	By checkInRegistration = By.xpath("//*[@id='ddlActivity']//option[@value='1']");
	
	By mealBreak = By.xpath("//*[@id='ddlActivity']//option[@value='2']");
		
	By selectSession = By.xpath("//*[@id='ddlActivity']//option[@value='3']");
	
	By networking = By.xpath("//*[@id='ddlActivity']//option[@value='4']");
	
	By mealTypeDropDown = By.xpath("//*[@id='ContentPlaceHolder1_ddlMealType']");
	
	By breakfast = By.xpath("//*[@id='ContentPlaceHolder1_ddlMealType']//option[@value='1']");
	
	By lunch = By.xpath("//*[@id='ContentPlaceHolder1_ddlMealType']//option[@value='2']");
	
	By tea = By.xpath("//*[@id='ContentPlaceHolder1_ddlMealType']//option[@value='3']");
	
	By dinner = By.xpath("//*[@id='ContentPlaceHolder1_ddlMealType']//option[@value='4']");
		
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
	
//	Create Poll/Vote Elements
	
	By searchSession = By.xpath("//*[@placeholder='Session Title/Track Name']");
	
	By allDates = By.xpath("//*[@id='divAllDateFilter']");
	
	By clickOnSearchedSession = By.xpath("//tbody[@id='tbdsessionlist']//td[2]//a");
	
	By clickOnSearchSession = By.xpath("//ul[@id='ulsldsession']");
	
	By clickOnPoll = By.xpath("//*[@id='tbPoll']");
	
	By createPollOrVote = By.xpath("//*[@id='aPollCreate']");
	
	By clickOnPollTitle = By.xpath("//*[@name='polltitle']");
	
	By enableMultiplyQsn = By.xpath("//*[@for='isPollGroup']");
	
	By enableAnonymous = By.xpath("//*[@for='pollTitle2']");
	
	By freeText = By.xpath("//*[@id='textbox_0']");
	
	By freeText1 = By.xpath("//*[@id='textbox_1']");
	
	By singleChoice = By.xpath("//*[@id='radiobutton_0']");
	
	By singleChoice1 = By.xpath("//*[@id='radiobutton_1']");
	
	By multipleChoice = By.xpath("//*[@id='checkbox_0']");
	
	By multipleChoice1 = By.xpath("//*[@id='checkbox_1']");
	
	By dropdownList = By.xpath("//*[@id='dropdown_0']");
	
	By dropdownList1 = By.xpath("//*[@id='dropdown_1']");
	
	By questionTitle = By.xpath("//*[@id='qtitle_0']");
	
	By questionTitle1 = By.xpath("//*[@id='qtitle_1']");
	
	By qOptions = By.xpath("//*[@name='qfrmOption_0_0']");
	
	By qOptions1 = By.xpath("//*[@name='qfrmOption_0_1']");
	
	By qOptions2 = By.xpath("//*[@name='qfrmOption_0_2']");
	
	By q1Options = By.xpath("//*[@name='qfrmOption_1_0']");
	
	By q1Options1 = By.xpath("//*[@name='qfrmOption_1_1']");
	
	By q1Options2 = By.xpath("//*[@name='qfrmOption_1_2']");
	
	By plus = By.xpath("//a[@class='cross-choice']//i[@class='plus-choice-icon']");
		
	By markItOptional = By.xpath("//*[@for='showOptional_0']");
	
	By addNewQuestion = By.xpath("//*[@class='add-new-qus-hld']//input[@value='Add New Question']");
	
	By savePollBtn = By.xpath("//*[@id='savePoll']");
	
	By noOfPolls = By.xpath("//*[@class='checkbox checkbox-success']");
	
//	Create Resources Elements
	
	By clickOnResources = By.xpath("//*[@onclick='goToResourceTab()']");
	
	By uploadResources = By.xpath("//*[@value='Upload Resources']");
	
	By resourceType = By.xpath("//select[@id='ContentPlaceHolder1_cmbSourceTpe']");
	
	By resourceTitle = By.xpath("//*[@id='txtLinkResourceTitle']");
	
	By resourceLink = By.xpath("//*[@id='txtLinkResourcLink']");
	
	By resourceSaveBtn = By.xpath("//*[@id='btnResourceLinkSave']");
	
	By resourceCloseBtn = By.xpath("//div[@id='AddResource']//a[@class='close-popup']");
	
	By resourceBrowse = By.xpath("//*[@id='upfile2']");
	
	By resourceNo = By.xpath("//*[@class='resc-row']");
	
	String ResourceFilePath = "/Users/goni/Documents/E2MDatas/ResourceData/ResourcesData.pdf";
	
//	Seating Arrangement Elements
	
	By clickOnSeating = By.xpath("//*[@onclick='SeatTabClick();']");
	
	By clickOnRandonSeating = By.xpath("//*[@for='chkIsRandomSeating']");
	
	By viewAllTables = By.xpath("//*[@id='anewSeating']");
	
	By tableName = By.xpath("//*[@id='ContentPlaceHolder1_txtCategory']");
	
	By tableCapacity = By.xpath("//*[@id='ContentPlaceHolder1_txtCapacity']");
	
	By addTableBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAddResourceCategory']");
	
	By tableCloseBtn = By.xpath("//*[@onclick='CloseSeatingPanel();']");
	
	By assignUsers = By.xpath("//*[@id='txtUser']");
	
	By selectAllUserCheckBox = By.xpath("//*[@id='user_all_chk']");
	
	By doneBtn = By.xpath("//*[@class='pull-right']//*[@onclick='user_done()']");
	
	By saveSeatingBtn = By.xpath("//*[@id='btnSave']");
	
	By existingNoOfAttendees = By.xpath("//*[@class='spdvnew p-r-20']");
	
//	Session Capacity Elements
	
	By clickOnCapacity = By.xpath("//*[@onclick='goToCapacityTab()']");
	
	By sessionCapacityBtn = By.xpath("//*[@for='chksessionCapity']");
	
	By noOfMaxSeats = By.xpath("//*[@id='txtSessionCapacity']");
	
	By allowWaitlistBtn = By.xpath("//*[@for='chkSessionCapacityWL']");
	
	By allowAddBookings = By.xpath("//*[@id='txtSessionCapacityWaitingList']");
	
	By availbilityDurationBtn = By.xpath("//*[@for='chkCapacityavlDuration']");
	
	By capStartDate = By.xpath("//*[@id='txtCapacityavlStartDate']");
	
	By capStartTime = By.xpath("//*[@id='txtCapacityavlStartTime']");
	
	By capEndDate = By.xpath("//*[@id='txtCapacityavlEndDate']");
	
	By capEndTime = By.xpath("//*[@id='txtCapacityavlEndTime']");
	
	By capSaveBtn = By.xpath("//*[@id='btnSave']");
	
//	Session Groups tab
	
	By clickOnSessionGroups = By.xpath("//*[@onclick='goToGroupTab();']");
	
	By associateGrpBtn = By.xpath("//*[@for='chkIsassociateGroup']");
	
	By addGroup = By.xpath("//*[@id='btnAddNew']");
	
	By groupName = By.xpath("//*[@id='txtGroupName']");
	
	By showOnMobile = By.xpath("//*[@id='SOM']");
	
	By grp1stUser = By.xpath("//html//div[@id='inline7']//tr[1]/td[1]/input[1]");
	
	By grp2ndUser = By.xpath("//html//div[@id='inline7']//tr[2]/td[1]/input[1]");
	
	By newGroupAddBtn = By.xpath("//*[@id='Saveattendee']");
	
	By searchGroup = By.xpath("//*[@id='txtGroup']");
	
	By selctAllGrpChkBox = By.xpath("//*[@id='group_all_chk']");
	
	By doneGrpBtn = By.xpath("//*[@class='pull-right']//*[@onclick='group_done()']");
	
	By searchUser = By.xpath("//*[@id='txtUsergroup']");
	
	By selectAllUserChkBox = By.xpath("//*[@id='usergroup_all_chk']");
	
	By doneUserBtn = By.xpath("//*[@class='pull-right']//*[@onclick='usergroup_done()']");
	
	By saveSessionGroupBtn = By.xpath("//*[@id='btnSaveBottom']");
	
	By selectAllGroup = By.xpath("//*[@id='chk_select_all_group']");
	
	By selectAllUser = By.xpath("//*[@id='chk_select_all_usergroup']");
	
	String GroupName = "Event Helper";
	
	
	

	public AddSessions(WebDriver driver) {
		super(driver);
		
	}
	
	public AddSessions addSessions(String EmailId, String Password, String EventFullName,String SessionTitle,String TrackName,String Location) throws ParseException, InterruptedException{
		
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
		
		Thread.sleep(2000);
		
//		Saving the Event Date
		
		System.out.println("Saving the Event Date");
		
		waitForClickabilityOf(eventStartDate);
		
		String EventDate = driver.findElement(eventStartDate).getText();	
		
		System.out.println(EventDate);
		
		Thread.sleep(2000);
		
//		Changing the String to Date
		
	    Date date = null;

	    DateFormat df = new SimpleDateFormat("MMM dd,yyyy");
	       
	    try{
	    	
	        date = df.parse(EventDate);

	    }
	    catch ( Exception ex ){
	        System.out.println(ex);
	    }
	    
		Thread.sleep(2000);
	    
//	  Again changing the Date to String 
	    
	    String FEventDate = null;
	    
	    SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
	    
		Thread.sleep(2000);

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
		
		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Session
		
		System.out.println("Clicking on Session");
		
		waitForClickabilityOf(clickOnSession);
		
		driver.findElement(clickOnSession).click();
		
		Thread.sleep(2000);
				
//		Clicking on Add Session
		
		System.out.println("Clicking on Add Session");
		
		waitForClickabilityOf(clickOnAddSession);
		
		driver.findElement(clickOnAddSession).click();
		
		Thread.sleep(2000);
		
//		Adding Search Track
		
		System.out.println("Entering Session Title  as :  "+SessionTitle);
		
		waitForClickabilityOf(sessionTitle);
		
		driver.findElement(sessionTitle).sendKeys(SessionTitle);
		
		Thread.sleep(2000);
		
//		Adding Search Track
		
		System.out.println("Adding Search Track");
		
		waitForClickabilityOf(searchTrack);
		
		driver.findElement(searchTrack).sendKeys(TrackName);
		
		Thread.sleep(2000);
		
//		Clicking on Create Track
		
		System.out.println("Clicking on Create Track");
		
		waitForClickabilityOf(createTrack);
		
		driver.findElement(createTrack).click();
		
		Thread.sleep(2000);
		
//		Adding Hex Color Code
		
		System.out.println("Adding Hex Color Code");
		
		waitForClickabilityOf(colorCode);
		
		driver.findElement(colorCode).sendKeys("#268dad");
		
		Thread.sleep(2000);
		
//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(trackName);
		
		driver.findElement(trackName).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(cancelBtn);
		
		driver.findElement(cancelBtn).click();
		
//		Thread.sleep(2000);
//		
////		Clicking on Activity Drop Down
//		
//		System.out.println("Clicking on Activity Drop Down");
//		
//		waitForClickabilityOf(activityDropDown);
//		
//		driver.findElement(activityDropDown).click();
//		
//		Thread.sleep(2000);
//		
////		Selecting Activity As Session from Drop Down
//		
//		System.out.println("Selecting Activity As Session from Drop Down");
//		
//		waitForClickabilityOf(selectSession);
//		
//		driver.findElement(selectSession).click();
		
		Thread.sleep(2000);
		
//		Selecting Session Start Date as Event Date
		
		System.out.println("Selecting Session Start Date as Event Date");
		
		waitForClickabilityOf(sessionStartDate);
		
		WebElement selectDate = driver.findElement(sessionStartDate);
		
		selectDate.sendKeys(FEventDate);
		
		selectDate.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Selecting Session Start Time
		
		System.out.println("Selecting Session Start Time");
		
		waitForClickabilityOf(startTime);
		
		driver.findElement(startTime).sendKeys("09:00 AM");
		
		Thread.sleep(2000);
		
//		Selecting Session End Time
		
		System.out.println("Selecting Session End Time");
		
		waitForClickabilityOf(endTime);
		
		driver.findElement(endTime).sendKeys("09:00 PM");
		
		Thread.sleep(2000);
		
//		Search the Location
		
		System.out.println("Search the Location");
		
		waitForClickabilityOf(searchLocation);
		
		driver.findElement(searchLocation).sendKeys(Location);
		
		Thread.sleep(2000);
		
//		Click On Add Location
		
		System.out.println("Click On Add Location");
		
		waitForClickabilityOf(createLocation);
		
		driver.findElement(createLocation).click();
		
		Thread.sleep(2000);
		
//		Click On Add Button
		
		System.out.println("Click On Add Button");
		
		waitForClickabilityOf(addBtn);
		
		driver.findElement(addBtn).click();
		
		Thread.sleep(2000);
		
//		Click On Close Pop Up
		
		System.out.println("Click On Close Pop Up");
		
		waitForClickabilityOf(closePopUp);
		
		driver.findElement(closePopUp).click();
		
		Thread.sleep(2000);
		
//		Adding Some Test Description
			
		try {
			
			System.out.println("Adding Some Test Description");
			
			waitForClickabilityOf(sessionDescription);
			
			driver.findElement(sessionDescription).sendKeys("This is Automation Testing Session Description");
			
		} catch (Exception e) {
			
			System.out.println("No Description Added");
			
		}
		
		Thread.sleep(2000);
		
//		Click On Save and Publish Button
		
		System.out.println("Click On Save and Publish Button");
		
		waitForClickabilityOf(saveAndPublishBtn);
		
		driver.findElement(saveAndPublishBtn).click();
		
		Thread.sleep(2000);
		
//		Verifying  whether the Session added or not 
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element = driver.findElements(noOfSessions);
		
		int NoOfExSession = element.size();
		
		if (NoOfExSession==1) {
			
			System.out.println("Successfully Added One Session");
			
		} else {
			
			System.out.println("Failed to Add New Sessions");

		}
				
		return new AddSessions(driver);
		
	}

    public AddSessions addSessionsWithTrackAndLocation(String EmailId, String Password, String EventFullName,String SessionTitle,String TrackName,String Location) throws ParseException, InterruptedException{
	
//	Login to your Account 
	
	new LoginToAccount(driver).loginToAccount(EmailId, Password);
	
//	Searching for Event Name
	
	System.out.println("Searching for Event Name :"+EventFullName);
	
	waitForClickabilityOf(searchEvent);
	
	WebElement search = driver.findElement(searchEvent);
	
	search.sendKeys(EventFullName);
	
//	Pressing Enter Button 
	
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
	
//	Getting No Of Elements Available
	
	List<WebElement> element = driver.findElements(noOfSessions);
	
	int NoOfExSession = element.size();
	
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
	
	driver.findElement(track_Name).sendKeys(TrackName+" 1");
	
//	Adding Hex Color Code
	
	System.out.println("Adding Hex Color Code");
	
	waitForClickabilityOf(colorCode);
	
	driver.findElement(colorCode).sendKeys("#268dad");
	
//	Clicking on Save Button
	
	System.out.println("Clicking on Save Button");
		
	waitForClickabilityOf(saveBtn);
	
	driver.findElement(saveBtn).click();
	
//	waitForClickabilityOf(cancelBtn);
//	
//	driver.findElement(cancelBtn).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
//	Clicking On Locations
	
	System.out.println("Clicking On Locations");
	
	waitForClickabilityOf(clickOnLocation);
	
	driver.findElement(clickOnLocation).click();
	
	Thread.sleep(2000);
	
//	Clicking On Add Location Button
	
	System.out.println("Clicking On Add Location Button");
	
	waitForClickabilityOf(addNewLocation);
	
	driver.findElement(addNewLocation).click();
	
	Thread.sleep(2000);
	
//	Entering Location Name
	
	System.out.println("Entering Location Name");
	
	waitForClickabilityOf(locationName);
	
	driver.findElement(locationName).sendKeys(Location+" 1");
	
	Thread.sleep(2000);
	
//	Clicking On Add Button
	
	System.out.println("Clicking On Add Button");
	
	waitForClickabilityOf(locationAddBtn);
	
	driver.findElement(locationAddBtn).click();
	
	Thread.sleep(2000);
	
//	Clicking On Close Up Pop up
	
	System.out.println("Clicking On Close Up Pop up");
	
	waitForClickabilityOf(locationCloseBtn);
	
	driver.findElement(locationCloseBtn).click();
	
	Thread.sleep(2000);
		
//	Clicking on Add Session
	
	System.out.println("Clicking on Add Session");
	
	waitForClickabilityOf(clickOnAddSessionFromLocation);
	
	driver.findElement(clickOnAddSessionFromLocation).click();
	
	Thread.sleep(2000);
	
//	Adding Search Track
	
	System.out.println("Entering Session Title  as :  "+SessionTitle+"1");
	
	waitForClickabilityOf(sessionTitle);
	
	driver.findElement(sessionTitle).sendKeys(SessionTitle+"1");
	
	Thread.sleep(2000);
	
//	Adding Search Track
	
	System.out.println("Adding Search Track");
	
	waitForClickabilityOf(searchTrack);
	
	WebElement SearchTrack = driver.findElement(searchTrack);
	
	SearchTrack.sendKeys(TrackName+"1");
	
//	Pressing Tab Button
	
	SearchTrack.sendKeys(Keys.TAB);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
//	Clicking on Activity Drop Down
//	
//	System.out.println("Clicking on Activity Drop Down");
//	
//	waitForClickabilityOf(activityDropDown);
//	
//	driver.findElement(activityDropDown).click();
//	
////	Selecting Activity As Session from Drop Down
//	
//	System.out.println("Selecting Activity As Session from Drop Down");
//	
//	waitForClickabilityOf(selectSession);
//	
//	driver.findElement(selectSession).click();
	
//	Selecting Session Start Date as Event Date
	
	System.out.println("Selecting Session Start Date as Event Date");
	
	waitForClickabilityOf(sessionStartDate);
	
	WebElement selectDate = driver.findElement(sessionStartDate);
	
	selectDate.sendKeys(FEventDate);
	
	selectDate.sendKeys(Keys.ENTER);
	
	Thread.sleep(2000);
	
//	Selecting Session Start Time
	
	System.out.println("Selecting Session Start Time");
	
	waitForClickabilityOf(startTime);
	
	driver.findElement(startTime).sendKeys("09:00 AM");
	
	Thread.sleep(2000);
	
//	Selecting Session End Time
	
	System.out.println("Selecting Session End Time");
	
	waitForClickabilityOf(endTime);
	
	driver.findElement(endTime).sendKeys("09:00 PM");
	
	Thread.sleep(2000);
	
//	Search the Location
	
	System.out.println("Search the Location");
	
	waitForClickabilityOf(searchLocation);
		
	WebElement SelectLocation = driver.findElement(searchLocation);
	
	SelectLocation.sendKeys(Location+" 1");
	
	Thread.sleep(2000);
	
//	Pressing Tab button
	
	SelectLocation.sendKeys(Keys.TAB);
	
//	Adding Some Test Description
	
	try {
		
		System.out.println("Adding Some Test Description");
		
		waitForClickabilityOf(sessionDescription);
		
		driver.findElement(sessionDescription).sendKeys("This is Automation Testing Session Description With Track And Location");
		
	} catch (Exception e) {
		
		System.out.println("No Description Added");
		
	}
		
//	Click On Save and Publish Button
	
	System.out.println("Click On Save and Publish Button");
	
	waitForClickabilityOf(saveAndPublishBtn);
	
	driver.findElement(saveAndPublishBtn).click();
	
	Thread.sleep(2000);
	
//	Verifying  whether the Session added or not 
	
	waitForClickabilityOf(noOfSessions);
	
	List<WebElement> element1 = driver.findElements(noOfSessions);
	
	int NoOfExSession1 = element1.size();
	
	if (NoOfExSession==NoOfExSession1-1) {
		
		System.out.println("Successfully Added One Session With Track And Location");
		
	} else {
		
		System.out.println("Failed to Add New Sessions");

	}
	
	return new AddSessions(driver);
	
}
        
    public AddSessions addSessionsWithOutTrackAndLocation(String EmailId, String Password, String EventFullName,String SessionTitle,String Location) throws ParseException, InterruptedException{
	
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
		
//		Getting No Of Elements Available
		
		List<WebElement> element = driver.findElements(noOfSessions);
		
		int NoOfExSession = element.size();
		
//		Clicking on Add Session
		
		System.out.println("Clicking on Add Session");
		
		waitForClickabilityOf(clickOnAddSession);
		
		driver.findElement(clickOnAddSession).click();
		
		Thread.sleep(2000);
		
//		Adding Search Track
		
		System.out.println("Entering Session Title  as :  "+SessionTitle+" 2");
		
		waitForClickabilityOf(sessionTitle);
		
		driver.findElement(sessionTitle).sendKeys(SessionTitle+" 2");
		
		Thread.sleep(2000);
		
//		Adding Search Track
		
		System.out.println("Not Adding any Track");
				
//		Clicking on Activity Drop Down
		
//		System.out.println("Clicking on Activity Drop Down");
//		
//		waitForClickabilityOf(activityDropDown);
//		
//		driver.findElement(activityDropDown).click();
//		
////		Selecting Activity As Session from Drop Down
//		
//		System.out.println("Selecting Activity As Session from Drop Down");
//		
//		waitForClickabilityOf(selectSession);
//		
//		driver.findElement(selectSession).click();
		
//		Selecting Session Start Date as Event Date
		
		System.out.println("Selecting Session Start Date as Event Date");
		
		waitForClickabilityOf(sessionStartDate);
		
		WebElement selectDate = driver.findElement(sessionStartDate);
		
		selectDate.sendKeys(FEventDate);
		
		selectDate.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Selecting Session Start Time
		
		System.out.println("Selecting Session Start Time");
		
		waitForClickabilityOf(startTime);
		
		driver.findElement(startTime).sendKeys("09:00 AM");
		
		Thread.sleep(2000);
		
//		Selecting Session End Time
		
		System.out.println("Selecting Session End Time");
		
		waitForClickabilityOf(endTime);
		
		driver.findElement(endTime).sendKeys("09:00 PM");
		
		Thread.sleep(2000);
		
//		Search the Location
		
		System.out.println("Search the Location");
		
		waitForClickabilityOf(searchLocation);
		
		driver.findElement(searchLocation).sendKeys(Location+" 2");
		
		Thread.sleep(2000);
		
//		Click On Add Location
		
		System.out.println("Click On Add Location");
		
		waitForClickabilityOf(createLocation);
		
		driver.findElement(createLocation).click();
		
		Thread.sleep(2000);
		
//		Click On Add Button
		
		System.out.println("Click On Add Button");
		
		waitForClickabilityOf(addBtn);
		
		driver.findElement(addBtn).click();
		
		Thread.sleep(2000);
		
//		Click On Close Pop Up
		
		System.out.println("Click On Close Pop Up");
		
		waitForClickabilityOf(closePopUp);
		
		driver.findElement(closePopUp).click();
		
//		Adding Some Test Description
			
		try {
			
			System.out.println("Adding Some Test Description");
			
			waitForClickabilityOf(sessionDescription);
			
			driver.findElement(sessionDescription).sendKeys("This is Automation Testing Description with location only");
			
		} catch (Exception e) {
			
			System.out.println("No Description Added");
			
		}
		
//		Click On Save and Publish Button
		
		System.out.println("Click On Save and Publish Button");
		
		waitForClickabilityOf(saveAndPublishBtn);
		
		driver.findElement(saveAndPublishBtn).click();
		
		Thread.sleep(2000);
		
//		Verifying  whether the Session added or not 
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element1 = driver.findElements(noOfSessions);
		
		int NoOfExSession1 = element1.size();
		
		if (NoOfExSession==NoOfExSession1-1) {
			
			System.out.println("Successfully Added One Session");
			
		} else {
			
			System.out.println("Failed to Add New Sessions");

		}
	
	
	return new AddSessions(driver);
	
}
    
    public AddSessions addCheckInRegistrationSession(String EmailId, String Password, String EventFullName,String TrackName,String SessionTitle,String Location,boolean track) throws ParseException, InterruptedException{
		
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
		
//		Checking for existing Sessions no
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element = driver.findElements(noOfSessions);
		
		int NoOfExSession = element.size();
		
//		Clicking on Add Session
		
		System.out.println("Clicking on Add Session");
		
		waitForClickabilityOf(clickOnAddSession);
		
		driver.findElement(clickOnAddSession).click();
		
//		Adding Search Track
		
		System.out.println("Entering Session Title  as :  Check-In-Registration");
		
		waitForClickabilityOf(sessionTitle);
		
		driver.findElement(sessionTitle).sendKeys(SessionTitle+" CIR");
		
//		Adding Search Track
		
		if (track==true) {
			
			System.out.println("Adding Search Track");
			
			waitForClickabilityOf(searchTrack);
			
			driver.findElement(searchTrack).sendKeys(TrackName+" CIR");
			
//			Clicking on Create Track
			
			System.out.println("Clicking on Create Track");
			
			waitForClickabilityOf(createTrack);
			
			driver.findElement(createTrack).click();
			
//			Adding Hex Color Code
			
			System.out.println("Adding Hex Color Code");
			
			waitForClickabilityOf(colorCode);
			
			driver.findElement(colorCode).sendKeys("#268dad");
			
//			Clicking on Save Button
			
			System.out.println("Clicking on Save Button");
			
			waitForClickabilityOf(trackName);
			
			driver.findElement(trackName).click();
			
			waitForClickabilityOf(saveBtn);
			
			driver.findElement(saveBtn).click();
			
			waitForClickabilityOf(cancelBtn);
			
			driver.findElement(cancelBtn).click();
			
		} else {
			
			System.out.println("No Track Added for this Session");

		}
				
//		Clicking on Activity Drop Down
//		
//		System.out.println("Clicking on Activity Drop Down");
//		
//		waitForClickabilityOf(activityDropDown);
//		
//		driver.findElement(activityDropDown).click();
//		
////		Selecting Activity As Session from Drop Down
//		
//		System.out.println("Selecting Activity As Check-In-Registration from Drop Down");
//		
//		waitForClickabilityOf(checkInRegistration);
//		
//		driver.findElement(checkInRegistration).click();
		
//		Selecting Session Start Date as Event Date
		
		System.out.println("Selecting Check-In-Registration Session Start Date as Event Date");
		
		waitForClickabilityOf(sessionStartDate);
		
		WebElement selectDate = driver.findElement(sessionStartDate);
		
		selectDate.sendKeys(FEventDate);
		
		selectDate.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Selecting Session Start Time
		
		System.out.println("Selecting Session Start Time");
		
		waitForClickabilityOf(startTime);
		
		driver.findElement(startTime).sendKeys("09:00 AM");
		
		Thread.sleep(2000);
		
//		Selecting Session End Time
		
		System.out.println("Selecting Session End Time");
		
		waitForClickabilityOf(endTime);
		
		driver.findElement(endTime).sendKeys("09:00 PM");
		
//		Search the Location
		
		if (track==true) {
			
			System.out.println("Search the Location");
			
			waitForClickabilityOf(searchLocation);
			
			driver.findElement(searchLocation).sendKeys(Location+" CIR");
			
//			Click On Add Location
			
			System.out.println("Click On Add Location");
			
			waitForClickabilityOf(createLocation);
			
			driver.findElement(createLocation).click();
			
//			Click On Add Button
			
			System.out.println("Click On Add Button");
			
			waitForClickabilityOf(addBtn);
			
			driver.findElement(addBtn).click();
			
//			Click On Close Pop Up
			
			System.out.println("Click On Close Pop Up");
			
			waitForClickabilityOf(closePopUp);
			
			driver.findElement(closePopUp).click();
			
		} else {
			
			System.out.println("Search the Location");
			
			waitForClickabilityOf(searchLocation);
			
			driver.findElement(searchLocation).sendKeys(Location+" CIRNL");
			
//			Click On Add Location
			
			System.out.println("Click On Add Location");
			
			waitForClickabilityOf(createLocation);
			
			driver.findElement(createLocation).click();
			
//			Click On Add Button
			
			System.out.println("Click On Add Button");
			
			waitForClickabilityOf(addBtn);
			
			driver.findElement(addBtn).click();
			
//			Click On Close Pop Up
			
			System.out.println("Click On Close Pop Up");
			
			waitForClickabilityOf(closePopUp);
			
			driver.findElement(closePopUp).click();

		}
				
//		Adding Some Test Description
			
		try {
			
			System.out.println("Adding Some Test Description");
			
			waitForClickabilityOf(sessionDescription);
			
			driver.findElement(sessionDescription).sendKeys("This is Automation Testing Check-In-Registration Session Description");
			
		} catch (Exception e) {
			
			System.out.println("No Description Added");
			
		}
		
//		Click On Save and Publish Button
		
		System.out.println("Click On Save and Publish Button");
		
		waitForClickabilityOf(saveAndPublishBtn);
		
		driver.findElement(saveAndPublishBtn).click();
		
//		Verifying  whether the Session added or not 
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element1 = driver.findElements(noOfSessions);
		
		int NoOfSession = element1.size();
		
		if (NoOfExSession==NoOfSession-1) {
			
			System.out.println("Successfully Added One Check-In-Registration Session");
			
		} else {
			
			System.out.println("Failed to Add New Sessions");

		}
				
		return new AddSessions(driver);
		
	}

	public AddSessions addMealBreakSessions(String EmailId, String Password, String EventFullName,String TrackName,String SessionTitle,String Location,String MealType) throws ParseException, InterruptedException{
		
//		Login to your Account 
		
		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		
//		Searching for Event Name
		
		System.out.println("Searching for Event Name :"+EventFullName);
		
		waitForClickabilityOf(searchEvent);
		
		WebElement search = driver.findElement(searchEvent);
		
		search.sendKeys(EventFullName);
		
		Thread.sleep(2000);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		Selecting the Event
		
		waitForClickabilityOf(selectEvent);
		
		driver.findElement(selectEvent).click();
		
		try {
			
//			Pressing Down Button 
			
			search.sendKeys(Keys.DOWN);
			
//			Pressing Enter Button 
			
			search.sendKeys(Keys.ENTER);
			
		} catch (Exception e) {
			
		}
		
		
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
			
//			Selecting the Event
			
			waitForClickabilityOf(selectEvent);
			
			driver.findElement(selectEvent).click();
			
			try {
				
//				Pressing Down Button 
				
				search.sendKeys(Keys.DOWN);
				
//				Pressing Enter Button 
				
				search.sendKeys(Keys.ENTER);
				
			} catch (Exception e) {
				
			}
				
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
		
//		Checking for existing Sessions no
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element = driver.findElements(noOfSessions);
		
		int NoOfExSession = element.size();
		
//		Clicking on Add Session
		
		System.out.println("Clicking on Add Session");
		
		waitForClickabilityOf(clickOnAddSession);
		
		driver.findElement(clickOnAddSession).click();
		
//		Adding Season Title
		
		System.out.println("Entering Session Title  as :  "+MealType);
		
		waitForClickabilityOf(sessionTitle);
		
		driver.findElement(sessionTitle).sendKeys(SessionTitle+" "+MealType);
				
//		Adding Search Track
		
		System.out.println("Adding Track");
		
		waitForClickabilityOf(searchTrack);
		
		driver.findElement(searchTrack).sendKeys(TrackName+" "+ MealType);
		
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
		
//		System.out.println("Clicking on Activity Drop Down");
//		
//		waitForClickabilityOf(activityDropDown);
//		
//		driver.findElement(activityDropDown).click();
//		
////		Selecting Activity As Session from Drop Down
//		
//		System.out.println("Selecting Activity As Meal Break from Drop Down");
//		
//		waitForClickabilityOf(mealBreak);
//		
//		driver.findElement(mealBreak).click();
		
//		Clicking on Meal Type Drop Down
//		
//		System.out.println("Clicking on Meal Type Drop Down");
//		
//		waitForClickabilityOf(mealTypeDropDown);
//		
//		driver.findElement(mealTypeDropDown).click();
//		
//		Thread.sleep(2000);
//		
////		Selecting the Meal Type 
//		
//		if (MealType.equals("Lunch")) {
//						
////			Selecting Meal Type As Lunch from Drop Down
//			
//			System.out.println("Selecting Meal Type As Lunch from Drop Down");
//			
//			waitForClickabilityOf(lunch);
//			
//			driver.findElement(lunch).click();
//			
//		}else if (MealType.equals("Tea")) {
//			
////			Selecting Meal Type As Tea from Drop Down
//			
//			System.out.println("Selecting Meal Type As Tea from Drop Down");
//			
//			waitForClickabilityOf(tea);
//			
//			driver.findElement(tea).click();
//			
//		}else if (MealType.equals("Dinner")) {
//			
////			Selecting Meal Type As Dinner from Drop Down
//			
//			System.out.println("Selecting Meal Type As Dinner from Drop Down");
//			
//			waitForClickabilityOf(dinner);
//			
//			driver.findElement(dinner).click();
//			
//		}else {
//			
////			Selecting Meal Type As Breakfast from Drop Down
//			
//			System.out.println("Selecting Meal Type As Breakfast from Drop Down");
//			
//			waitForClickabilityOf(breakfast);
//			
//			driver.findElement(breakfast).click();
//			
//				
//		}
				
//		Selecting Session Start Date as Event Date
		
		System.out.println("Selecting Session Start Date as Event Date");
		
		waitForClickabilityOf(sessionStartDate);
		
		WebElement selectDate = driver.findElement(sessionStartDate);
		
		selectDate.sendKeys(FEventDate);
		
		selectDate.sendKeys(Keys.ENTER);
		
//		Selecting Session Start Time
		
		if (MealType.equals("Lunch")) {
			
//			Selecting Lunch Start Time
			
			System.out.println("Selecting Lunch Start Time as : 12:00 PM");
			
			waitForClickabilityOf(startTime);
			
			driver.findElement(startTime).sendKeys("12:00 PM");
			
//			Selecting Lunch End Time
			
			System.out.println("Selecting Lunch End Time as : 01:00 PM");
			
			waitForClickabilityOf(endTime);
			
			driver.findElement(endTime).sendKeys("01:00 PM");
			

			
		}else if (MealType.equals("Tea")) {
			
//			Selecting Tea Start Time
			
			System.out.println("Selecting Tea Start Time as : 04:00 PM");
			
			waitForClickabilityOf(startTime);
			
			driver.findElement(startTime).sendKeys("04:00 PM");
			
//			Selecting Tea End Time
			
			System.out.println("Selecting Tea End Time as : 04:15 PM");
			
			waitForClickabilityOf(endTime);
			
			driver.findElement(endTime).sendKeys("04:15 PM");
			

			
		}else if (MealType.equals("Dinner")) {
			
//			Selecting Dinner Start Time
			
			System.out.println("Selecting Dinner Start Time as : 09:00 PM");
			
			waitForClickabilityOf(startTime);
			
			driver.findElement(startTime).sendKeys("09:00 PM");
			
//			Selecting Dinner End Time
			
			System.out.println("Selecting Dinner End Time as : 10:00 PM");
			
			waitForClickabilityOf(endTime);
			
			driver.findElement(endTime).sendKeys("10:00 PM");
			

			
		}else {
			
//			Selecting Breakfast Start Time
			
			System.out.println("Selecting Breakfast Start Time as : 06:00 AM");
			
			waitForClickabilityOf(startTime);
			
			driver.findElement(startTime).sendKeys("06:00 AM");
			
//			Selecting Breakfast End Time
			
			System.out.println("Selecting Breakfast End Time as : 07:30 AM");
			
			waitForClickabilityOf(endTime);
			
			driver.findElement(endTime).sendKeys("07:30 AM");
						
				
		}
		
//		Search the Location
		
		System.out.println("Search the Location : "+Location+" "+ MealType);
		
		waitForClickabilityOf(searchLocation);
		
		driver.findElement(searchLocation).sendKeys(Location+" "+ MealType);
		
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
			
		try {
			
			System.out.println("Adding Some Session Description");
			
			waitForClickabilityOf(sessionDescription);
			
			driver.findElement(sessionDescription).sendKeys("This is Automation Testing "+ MealType+" Session Description");
			
		} catch (Exception e) {
			
			System.out.println("No Description Added");
			
		}
		
//		Click On Save and Publish Button
		
		System.out.println("Click On Save and Publish Button");
		
		waitForClickabilityOf(saveAndPublishBtn);
		
		driver.findElement(saveAndPublishBtn).click();
		
//		Verifying  whether the Session added or not 
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element1 = driver.findElements(noOfSessions);
		
		int NoOfSession = element1.size();
		
		if (NoOfExSession==NoOfSession-1) {
			
			System.out.println("Successfully Added One "+ MealType+" Session");
			
		} else {
			
			System.out.println("Failed to Add "+ MealType+" Sessions");

		}
				
		return new AddSessions(driver);
		
	}

    public AddSessions addNetworkingSession(String EmailId, String Password, String EventFullName,String TrackName,String SessionTitle,String Location,boolean track) throws ParseException, InterruptedException{
		
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

		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Session
		
		System.out.println("Clicking on Session");
		
		waitForClickabilityOf(clickOnSession);
		
		driver.findElement(clickOnSession).click();
		
		Thread.sleep(2000);
		
//		Checking for existing Sessions no
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element = driver.findElements(noOfSessions);
		
		int NoOfExSession = element.size();
		
//		Clicking on Add Session
		
		System.out.println("Clicking on Add Session");
		
		waitForClickabilityOf(clickOnAddSession);
		
		driver.findElement(clickOnAddSession).click();
		
		Thread.sleep(2000);
		
//		Adding Search Track
		
		System.out.println("Entering Session Title  as :  "+SessionTitle);
		
		waitForClickabilityOf(sessionTitle);
		
		driver.findElement(sessionTitle).sendKeys(SessionTitle+" NW");
		
//		Adding Search Track
		
		if (track==true) {
			
			System.out.println("Adding Search Track");
			
			waitForClickabilityOf(searchTrack);
			
			driver.findElement(searchTrack).sendKeys(TrackName+" NET");
			
			Thread.sleep(2000);
			
//			Clicking on Create Track
			
			System.out.println("Clicking on Create Track");
			
			waitForClickabilityOf(createTrack);
			
			driver.findElement(createTrack).click();
			
			Thread.sleep(2000);
			
//			Adding Hex Color Code
			
			System.out.println("Adding Hex Color Code");
			
			waitForClickabilityOf(colorCode);
			
			driver.findElement(colorCode).sendKeys("#268dad");
			
			Thread.sleep(2000);
			
//			Clicking on Save Button
			
			System.out.println("Clicking on Save Button");
			
			waitForClickabilityOf(trackName);
			
			driver.findElement(trackName).click();
			
			Thread.sleep(2000);
			
			waitForClickabilityOf(saveBtn);
			
			driver.findElement(saveBtn).click();
			
			Thread.sleep(2000);
			
			waitForClickabilityOf(cancelBtn);
			
			driver.findElement(cancelBtn).click();
			
			Thread.sleep(2000);
			
		} else {
			
			System.out.println("No Track Added for this Session");

		}
				
//		Clicking on Activity Drop Down
//		
//		System.out.println("Clicking on Activity Drop Down");
//		
//		waitForClickabilityOf(activityDropDown);
//		
//		driver.findElement(activityDropDown).click();
//		
//		Thread.sleep(2000);
//		
////		Selecting Activity As Networking from Drop Down
//		
//		System.out.println("Selecting Activity As Networking from Drop Down");
//		
//		waitForClickabilityOf(networking);
//		
//		driver.findElement(networking).click();
		
		Thread.sleep(2000);
		
//		Selecting Session Start Date as Event Date
		
		System.out.println("Selecting Check-In-Registration Session Start Date as Event Date");
		
		waitForClickabilityOf(sessionStartDate);
		
		WebElement selectDate = driver.findElement(sessionStartDate);
		
		selectDate.sendKeys(FEventDate);
		
		selectDate.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Selecting Session Start Time
		
		System.out.println("Selecting Session Start Time");
		
		waitForClickabilityOf(startTime);
		
		driver.findElement(startTime).sendKeys("09:00 AM");
		
		Thread.sleep(2000);
		
//		Selecting Session End Time
		
		System.out.println("Selecting Session End Time");
		
		waitForClickabilityOf(endTime);
		
		driver.findElement(endTime).sendKeys("09:00 PM");
		
		Thread.sleep(2000);
		
//		Search the Location
		
		if (track==true) {
			
			System.out.println("Search the Location");
			
			waitForClickabilityOf(searchLocation);
			
			driver.findElement(searchLocation).sendKeys(Location+" NET");
			
			Thread.sleep(2000);
			
//			Click On Add Location
			
			System.out.println("Click On Add Location");
			
			waitForClickabilityOf(createLocation);
			
			driver.findElement(createLocation).click();
			
			Thread.sleep(2000);
			
//			Click On Add Button
			
			System.out.println("Click On Add Button");
			
			waitForClickabilityOf(addBtn);
			
			driver.findElement(addBtn).click();
			
			Thread.sleep(2000);
			
//			Click On Close Pop Up
			
			System.out.println("Click On Close Pop Up");
			
			waitForClickabilityOf(closePopUp);
			
			driver.findElement(closePopUp).click();
			
			Thread.sleep(2000);
			
		} else {
			
			System.out.println("Search the Location");
			
			waitForClickabilityOf(searchLocation);
			
			driver.findElement(searchLocation).sendKeys(Location+" NET");
			
			Thread.sleep(2000);
			
//			Click On Add Location
			
			System.out.println("Click On Add Location");
			
			waitForClickabilityOf(createLocation);
			
			driver.findElement(createLocation).click();
			
			Thread.sleep(2000);
			
//			Click On Add Button
			
			System.out.println("Click On Add Button");
			
			waitForClickabilityOf(addBtn);
			
			driver.findElement(addBtn).click();
			
			Thread.sleep(2000);
			
//			Click On Close Pop Up
			
			System.out.println("Click On Close Pop Up");
			
			waitForClickabilityOf(closePopUp);
			
			driver.findElement(closePopUp).click();
			
			Thread.sleep(2000);

		}
				
//		Adding Some Test Description
			
		try {
			
			System.out.println("Adding Some Test Description");
			
			waitForClickabilityOf(sessionDescription);
			
			driver.findElement(sessionDescription).sendKeys("This is Automation Testing Networking Session Description");
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println("No Description Added");
			
		}
		
//		Click On Save and Publish Button
		
		System.out.println("Click On Save and Publish Button");
		
		waitForClickabilityOf(saveAndPublishBtn);
		
		driver.findElement(saveAndPublishBtn).click();
		
		Thread.sleep(2000);
		
//		Verifying  whether the Session added or not 
		
		waitForClickabilityOf(noOfSessions);
		
		List<WebElement> element1 = driver.findElements(noOfSessions);
		
		int NoOfSession = element1.size();
		
		if (NoOfExSession==NoOfSession-1) {
			
			System.out.println("Successfully Added One Networking Session");
			
		} else {
			
			System.out.println("Failed to Add New Sessions");

		}
				
		return new AddSessions(driver);
		
	}
    
    public AddSessions addPoll(String EmailId, String Password, String EventFullName,String SessionTitle,boolean Anonymous,String QuestionType) throws InterruptedException{
    	
		// Login to your Account

		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		
		Thread.sleep(2000);

		// Searching for Event Name

		System.out.println("Searching for Event Name :" + EventFullName);

		waitForClickabilityOf(searchEvent);

		WebElement search = driver.findElement(searchEvent);

		search.sendKeys(EventFullName);

		// Pressing Enter Button

		search.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnEvent);

		String ActEventName = driver.findElement(clickOnEvent).getText();

		System.out.println("Clicking On Event : " + ActEventName);

		if (EventFullName.equals(ActEventName)) {

			System.out.println("This is Correct Event");

		} else {

			System.out.println("Failed to Search the Event Name so, searching again ");

			search.clear();

			search.sendKeys(EventFullName);

			Thread.sleep(4000);

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Pressing Enter Button

			search.sendKeys(Keys.ENTER);

		}

		// Clicking on The Event

		System.out.println("Clicking on The Event");

		waitForClickabilityOf(clickOnEvent);

		driver.findElement(clickOnEvent).click();

		// Clicking on Agenda Setup

		System.out.println("Clicking on Agenda Setup");

		waitForClickabilityOf(clickOnAgendaSetUp);

		driver.findElement(clickOnAgendaSetUp).click();

		// Clicking on Session

		System.out.println("Clicking on Session");

		waitForClickabilityOf(clickOnSession);

		driver.findElement(clickOnSession).click();
		
		// Clicking on All Dates

		System.out.println("Clicking on All Dates");

		waitForClickabilityOf(allDates);

		driver.findElement(allDates).click();
		
		// Searching for Session Name

		System.out.println("Searching for Session Name :" + SessionTitle);

		waitForClickabilityOf(searchSession);

		WebElement Session = driver.findElement(searchSession);

		Session.sendKeys(SessionTitle);
		
		Thread.sleep(2000);
		
		// Pressing Enter Button

		Session.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnSearchedSession);

		String ActSessionName = driver.findElement(clickOnSearchedSession).getText();

		System.out.println("Clicking On Session : " + ActSessionName);

		if (SessionTitle.equals(ActSessionName)) {

			System.out.println("This is Correct Session");

		} else {

			System.out.println("Failed to Search the Session Name so, searching again ");

			Session.clear();

			Session.sendKeys(SessionTitle);

			Thread.sleep(2000);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			 Pressing Enter Button

			Session.sendKeys(Keys.ENTER);

		}
		
//		Selecting the Session

		System.out.println("Selecting the Session");

		waitForClickabilityOf(clickOnSearchedSession);

		driver.findElement(clickOnSearchedSession).click();	
		
//		Clicking On Poll

		System.out.println("Clicking On Poll");

		waitForClickabilityOf(clickOnPoll);

		driver.findElement(clickOnPoll).click();
		
//		Clicking On Create Poll/Vote

		System.out.println("Clicking On Create Poll/Vote");

		waitForClickabilityOf(createPollOrVote);

		driver.findElement(createPollOrVote).click();
		
//		Enable Anonymous Submission
		
		if (Anonymous=true) {
			
			System.out.println("Enabling Anonymous Submission");
			
			waitForClickabilityOf(enableAnonymous);

			driver.findElement(enableAnonymous).click();
			
		} else {
			
			System.out.println("Anonymous Submission Disabled");

		}
		
//		Selecting Question Type
		
		if (QuestionType.equals("Single")) {
			
//			Entering Poll Title

			System.out.println("Entering Poll Title");

			waitForClickabilityOf(clickOnPollTitle);

			driver.findElement(clickOnPollTitle).sendKeys("Automation Single Poll Testing");
			
//			Enabling Multiple Questions
			
			System.out.println("Enabling Multiple Questions");
			
			waitForClickabilityOf(enableMultiplyQsn);

			driver.findElement(enableMultiplyQsn).click();
			
//			Selecting Single Choice Question
			
			System.out.println("Selecting Single Choice Question");
			
			waitForClickabilityOf(singleChoice);

			driver.findElement(singleChoice).click();
			
//			Entering Question Title
			
			System.out.println("Entering Question Title");
			
			waitForClickabilityOf(questionTitle);

			driver.findElement(questionTitle).sendKeys("What is your Native Language?");
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions);

			driver.findElement(qOptions).sendKeys("English");
			
//			Clicking On Plus Button to add another option
			
			System.out.println("Clicking On Plus Button to add another option");
			
			waitForClickabilityOf(plus);

			driver.findElement(plus).click();
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions1);

			driver.findElement(qOptions1).sendKeys("German");
			
//			Clicking on Add New Question
			
			System.out.println("Clicking on Add New Question");
			
			waitForClickabilityOf(addNewQuestion);

			driver.findElement(addNewQuestion).click();
			
//			Selecting Single Choice Question
			
			System.out.println("Selecting Single Choice Question");
			
			waitForClickabilityOf(singleChoice1);

			driver.findElement(singleChoice1).click();
			
//			Entering Question Title
			
			System.out.println("Entering 2nd Question Title");
			
			waitForClickabilityOf(questionTitle1);

			driver.findElement(questionTitle1).sendKeys("Where are you from?");
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options);
			
			WebElement Plus1 = driver.findElement(q1Options);
			
			Plus1.sendKeys("USA");
			
			System.out.println("Clicking On Plus Button to add another option");
			
			Thread.sleep(2000);
			
			// Pressing TAB Button

			Plus1.sendKeys(Keys.TAB,Keys.ENTER);
			
			Thread.sleep(2000);
						
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options1);
			
			driver.findElement(q1Options1).sendKeys("UK");
			
		}else if (QuestionType.equals("Multiple")){
			
//			Entering Poll Title

			System.out.println("Entering Poll Title");

			waitForClickabilityOf(clickOnPollTitle);

			driver.findElement(clickOnPollTitle).sendKeys("Automation Multiple Poll Testing");
			
//			Enabling Multiple Questions
			
			System.out.println("Enabling Multiple Questions");
			
			waitForClickabilityOf(enableMultiplyQsn);

			driver.findElement(enableMultiplyQsn).click();
			
			System.out.println("Selecting Multiple Choice Question");
			
			waitForClickabilityOf(multipleChoice);

			driver.findElement(multipleChoice).click();
			
//			Entering Question Title
			
			System.out.println("Entering Question Title");
			
			waitForClickabilityOf(questionTitle);

			driver.findElement(questionTitle).sendKeys("What is your Native Language?");
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions);

			driver.findElement(qOptions).sendKeys("English");
			
//			Clicking On Plus Button to add another option
			
			System.out.println("Clicking On Plus Button to add another option");
			
			waitForClickabilityOf(plus);

			driver.findElement(plus).click();
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions1);

			driver.findElement(qOptions1).sendKeys("German");
			
//			Clicking On Plus Button to add another option
			
			System.out.println("Clicking On Plus Button to add another option");
			
			waitForClickabilityOf(plus);

			driver.findElement(plus).click();
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions2);

			driver.findElement(qOptions2).sendKeys("French");
			
//			Clicking on Add New Question
			
			System.out.println("Clicking on Add New Question");
			
			waitForClickabilityOf(addNewQuestion);

			driver.findElement(addNewQuestion).click();
			
//			Selecting Single Choice Question
			
			System.out.println("Selecting Single Choice Question");
			
			waitForClickabilityOf(multipleChoice1);

			driver.findElement(multipleChoice1).click();
			
//			Entering Question Title
			
			System.out.println("Entering 2nd Question Title");
			
			waitForClickabilityOf(questionTitle1);

			driver.findElement(questionTitle1).sendKeys("Where are you from?");
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options);
			
			WebElement Plus1 = driver.findElement(q1Options);
			
			Plus1.sendKeys("USA");
			
			System.out.println("Clicking On Plus Button to add another option");
			
			Thread.sleep(2000);
			
			// Pressing TAB Button

			Plus1.sendKeys(Keys.TAB,Keys.ENTER);
			
			Thread.sleep(2000);
						
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options1);
			
			WebElement Plus2 = driver.findElement(q1Options1);

			Plus2.sendKeys("Germany");
			
			System.out.println("Clicking On Plus Button to add another option");
			
			Thread.sleep(2000);
			
			// Pressing TAB Button

			Plus2.sendKeys(Keys.TAB,Keys.ENTER);
			
			Thread.sleep(2000);
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options2);

			driver.findElement(q1Options2).sendKeys("UK");
			

		}else if (QuestionType.equals("Dropdown")){
			
//			Entering Poll Title

			System.out.println("Entering Poll Title");

			waitForClickabilityOf(clickOnPollTitle);

			driver.findElement(clickOnPollTitle).sendKeys("Automation Dropdown Poll Testing");
			
//			Enabling Multiple Questions
			
			System.out.println("Enabling Multiple Questions");
			
			waitForClickabilityOf(enableMultiplyQsn);

			driver.findElement(enableMultiplyQsn).click();
			
//			Selecting Dropdown List Question
			
			System.out.println("Selecting Dropdown List Question");
			
			waitForClickabilityOf(dropdownList);

			driver.findElement(dropdownList).click();
			
//			Entering Question Title
			
			System.out.println("Entering Question Title");
			
			waitForClickabilityOf(questionTitle);

			driver.findElement(questionTitle).sendKeys("What is your Native Language?");
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions);

			driver.findElement(qOptions).sendKeys("English");
			
//			Clicking On Plus Button to add another option
			
			System.out.println("Clicking On Plus Button to add another option");
			
			waitForClickabilityOf(plus);

			driver.findElement(plus).click();
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions1);

			driver.findElement(qOptions1).sendKeys("German");
			
//			Clicking On Plus Button to add another option
			
			System.out.println("Clicking On Plus Button to add another option");
			
			waitForClickabilityOf(plus);

			driver.findElement(plus).click();
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(qOptions2);

			driver.findElement(qOptions2).sendKeys("French");
			
//			Clicking on Add New Question
			
			System.out.println("Clicking on Add New Question");
			
			waitForClickabilityOf(addNewQuestion);

			driver.findElement(addNewQuestion).click();
			
//			Selecting Single Choice Question
			
			System.out.println("Selecting Single Choice Question");
			
			waitForClickabilityOf(dropdownList1);

			driver.findElement(dropdownList1).click();
			
//			Entering Question Title
			
			System.out.println("Entering 2nd Question Title");
			
			waitForClickabilityOf(questionTitle1);

			driver.findElement(questionTitle1).sendKeys("Where are you from?");
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options);
			
			WebElement Plus1 = driver.findElement(q1Options);
			
			Plus1.sendKeys("USA");
			
			System.out.println("Clicking On Plus Button to add another option");
			
			Thread.sleep(2000);
			
			// Pressing TAB Button

			Plus1.sendKeys(Keys.TAB,Keys.ENTER);
			
			Thread.sleep(2000);
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options1);
			
			WebElement Plus2 = driver.findElement(q1Options1);

			Plus2.sendKeys("Germany");
			
			System.out.println("Clicking On Plus Button to add another option");
			
			Thread.sleep(2000);
			
			// Pressing TAB Button

			Plus2.sendKeys(Keys.TAB,Keys.ENTER);
			
			Thread.sleep(2000);
			
//			Entering Question Options
			
			System.out.println("Entering Question Options");
			
			waitForClickabilityOf(q1Options2);

			driver.findElement(q1Options2).sendKeys("UK");
			
		}else {
			
			System.out.println("Selecting Free Text Question");
			
//			Entering Poll Title

			System.out.println("Entering Poll Title");

			waitForClickabilityOf(clickOnPollTitle);

			driver.findElement(clickOnPollTitle).sendKeys("Automation Free Text Poll Testing");
			
//			Enabling Multiple Questions
			
			System.out.println("Enabling Multiple Questions");
			
			waitForClickabilityOf(enableMultiplyQsn);

			driver.findElement(enableMultiplyQsn).click();
			
//			Entering Question Title
			
			System.out.println("Entering Question Title");
			
			waitForClickabilityOf(questionTitle);

			driver.findElement(questionTitle).sendKeys("What is your Native Language?");
			
//			Clicking on Add New Question
			
			System.out.println("Clicking on Add New Question");
			
			waitForClickabilityOf(addNewQuestion);

			driver.findElement(addNewQuestion).click();
			
//			Entering Question Title
			
			System.out.println("Entering 2nd Question Title");
			
			waitForClickabilityOf(questionTitle1);

			driver.findElement(questionTitle1).sendKeys("Where are you from?");
			
		}
      
//		Clicking on Save Button
		
		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(savePollBtn);

		driver.findElement(savePollBtn).click();
		
//		Verifying  whether the Poll added or not 
		
		waitForClickabilityOf(noOfPolls);
		
		List<WebElement> Polls = driver.findElements(noOfPolls);
		
		int NoOfExPolls = Polls.size();
		
//		System.out.println(NoOfExPolls);
		
		if (NoOfExPolls==3) {
			
			System.out.println("Successfully Added One Free Text Poll");
			
		} else if (NoOfExPolls==4) {
			
			System.out.println("Successfully Added One Single Choice Poll");
			
		} else if (NoOfExPolls==5) {
			
			System.out.println("Successfully Added One Multiple Choice Poll");
			
		} else if (NoOfExPolls==6) {
			
			System.out.println("Successfully Added One Dropdown Choice Poll");
			
		}else {
			
			System.out.println("Failed to Add New Poll");

		}
		    	
    	
		return new AddSessions(driver);
    	
    }

	public AddSessions addResources(String EmailId, String Password, String EventFullName,String SessionTitle,String ResourceFormatType) throws InterruptedException, AWTException{
		
    	
		// Login to your Account

		new LoginToAccount(driver).loginToAccount(EmailId, Password);

		// Searching for Event Name

		System.out.println("Searching for Event Name :" + EventFullName);

		waitForClickabilityOf(searchEvent);

		WebElement search = driver.findElement(searchEvent);

		search.sendKeys(EventFullName);

		// Pressing Enter Button

		search.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnEvent);

		String ActEventName = driver.findElement(clickOnEvent).getText();

		System.out.println("Clicking On Event : " + ActEventName);

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

			// Pressing Enter Button

			search.sendKeys(Keys.ENTER);

		}

		// Clicking on The Event

		System.out.println("Clicking on The Event");

		waitForClickabilityOf(clickOnEvent);

		driver.findElement(clickOnEvent).click();

		// Clicking on Agenda Setup

		System.out.println("Clicking on Agenda Setup");

		waitForClickabilityOf(clickOnAgendaSetUp);

		driver.findElement(clickOnAgendaSetUp).click();

		// Clicking on Session

		System.out.println("Clicking on Session");

		waitForClickabilityOf(clickOnSession);

		driver.findElement(clickOnSession).click();
		
		// Clicking on All Dates

		System.out.println("Clicking on All Dates");

		waitForClickabilityOf(allDates);

		driver.findElement(allDates).click();
		
		// Searching for Session Name

		System.out.println("Searching for Session Name :" + SessionTitle);

		waitForClickabilityOf(searchSession);

		WebElement Session = driver.findElement(searchSession);

		Session.sendKeys(SessionTitle);
		
		Thread.sleep(2000);
		
		// Pressing Enter Button

		Session.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnSearchedSession);

		String ActSessionName = driver.findElement(clickOnSearchedSession).getText();

		System.out.println("Clicking On Session : " + ActSessionName);

		if (SessionTitle.equals(ActSessionName)) {

			System.out.println("This is Correct Session");

		} else {

			System.out.println("Failed to Search the Session Name so, searching again ");

			Session.clear();

			Session.sendKeys(SessionTitle);

			Thread.sleep(2000);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			 Pressing Enter Button

			Session.sendKeys(Keys.ENTER);

		}
		
//		Selecting the Session

		System.out.println("Selecting the Session");

		waitForClickabilityOf(clickOnSearchedSession);

		driver.findElement(clickOnSearchedSession).click();	
		
//		Clicking On Resources	

		System.out.println("Clicking On Resources");

		waitForClickabilityOf(clickOnResources);

		driver.findElement(clickOnResources).click();
		
//		Clicking On Upload Resources

		System.out.println("Clicking On Upload Resources");

		waitForClickabilityOf(uploadResources);

		driver.findElement(uploadResources).click();
		
//		Selecting Resource Type
		
		String ResouceType = "Link";

		if (ResourceFormatType.equals(ResouceType)) {

			System.out.println("Selecting Resouce Type as : Link");
			
			waitForClickabilityOf(resourceType);
		
			Select Type = new Select(driver.findElement(resourceType));
			
			Type.selectByIndex(1);
			
//			Entering Resource Title

			System.out.println("Entering Resource Title as : "+ResourceFormatType+" Resource");

			waitForClickabilityOf(resourceTitle);

			driver.findElement(resourceTitle).sendKeys(ResourceFormatType+" Resource");
			
//			Entering Resource Link

			System.out.println("Entering Resource Link as : https://google.com");

			waitForClickabilityOf(resourceLink);

			driver.findElement(resourceLink).sendKeys("https://google.com");
			
//			Clicking on Save Button

			System.out.println("Clicking on Save Button");

			waitForClickabilityOf(resourceSaveBtn);

			driver.findElement(resourceSaveBtn).click();
							

		} else {

			System.out.println("Selecting Resouce Type as : File");
			
//			Entering Resource Link

			System.out.println("Clicking On Browse to Upload the PDF File");

			waitForClickabilityOf(resourceBrowse);
			
			WebElement BrowseBtn = driver.findElement(resourceBrowse);
			
			BrowseBtn.click();
						
			File file = new File(ResourceFilePath);
			
			StringSelection sel = new StringSelection(file.getAbsolutePath());
			
//			System.out.println(sel);
			
//			Copy to Clipboard	
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
			
//			CMD+TAB is needed to since it launches a java app and Browser looses focus
			
			Robot robot = new Robot();
			
//			robot.keyPress(KeyEvent.VK_META);
//			
			robot.delay(2000);
//			
//			robot.keyPress(KeyEvent.VK_TAB);
//			
//			robot.delay(1000);
//			
//			robot.keyRelease(KeyEvent.VK_META);
//			
//			robot.delay(1000);
//			
//			robot.keyRelease(KeyEvent.VK_TAB);
//			
//			robot.delay(1000);
			
//			Goto the Resource File Path
			
			robot.keyPress(KeyEvent.VK_META+KeyEvent.VK_SHIFT+KeyEvent.VK_G);
					
//			robot.keyPress(KeyEvent.VK_SHIFT);
//			
//			robot.keyPress(KeyEvent.VK_G);
			
			robot.delay(1000);
			
			robot.keyRelease(KeyEvent.VK_META+KeyEvent.VK_SHIFT+KeyEvent.VK_G);
			
//			robot.keyRelease(KeyEvent.VK_SHIFT);
//
//			robot.keyRelease(KeyEvent.VK_G);
			
//			Paste the Clip Board Value
			
			robot.delay(1000);
			
			robot.keyPress(KeyEvent.VK_META);
			
			robot.delay(1000);
			
			robot.keyPress(KeyEvent.VK_V);
			
			robot.delay(1000);
			
			robot.keyRelease(KeyEvent.VK_META);
			
			robot.delay(1000);
			
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.delay(1000);
			
			
			robot.delay(1000);
			
//			Press Enter Key to Close the Window
			
			robot.delay(1000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.delay(1000);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			robot.delay(1000);
						
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.delay(1000);
			
			robot.keyRelease(KeyEvent.VK_ENTER);	
			
			robot.delay(1000);

		}
		
//		Getting No Of Existing Resource Count
		
		System.out.println("Getting No Of Existing Resource Count");
		
		waitForClickabilityOf(resourceNo);
		
		List<WebElement> element = driver.findElements(resourceNo);
		
		int NoOfExResources = element.size();
		
		if (NoOfExResources==1) {
			
			System.out.println("Successfully Uploaded One Resource");
			
		} else {
			
			System.out.println("Failed to Upload One Resource");

		}
		
		
		return new AddSessions(driver);
		
	}
	
	public AddSessions seatingArrangement(String EmailId, String Password, String EventFullName,String SessionTitle,String TableName,boolean RandomSeating) throws InterruptedException{
		
		// Login to your Account

		new LoginToAccount(driver).loginToAccount(EmailId, Password);

		// Searching for Event Name

		System.out.println("Searching for Event Name :" + EventFullName);

		waitForClickabilityOf(searchEvent);

		WebElement search = driver.findElement(searchEvent);

		search.sendKeys(EventFullName);

		// Pressing Enter Button

		search.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnEvent);

		String ActEventName = driver.findElement(clickOnEvent).getText();

		System.out.println("Clicking On Event : " + ActEventName);

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

			// Pressing Enter Button

			search.sendKeys(Keys.ENTER);

		}

		// Clicking on The Event

		System.out.println("Clicking on The Event");

		waitForClickabilityOf(clickOnEvent);

		driver.findElement(clickOnEvent).click();

		// Clicking on Agenda Setup

		System.out.println("Clicking on Agenda Setup");

		waitForClickabilityOf(clickOnAgendaSetUp);

		driver.findElement(clickOnAgendaSetUp).click();

		// Clicking on Session

		System.out.println("Clicking on Session");

		waitForClickabilityOf(clickOnSession);

		driver.findElement(clickOnSession).click();
		
		// Clicking on All Dates

		System.out.println("Clicking on All Dates");

		waitForClickabilityOf(allDates);

		driver.findElement(allDates).click();
		
		// Searching for Session Name

		System.out.println("Searching for Session Name :" + SessionTitle);

		waitForClickabilityOf(searchSession);

		WebElement Session = driver.findElement(searchSession);

		Session.sendKeys(SessionTitle);
		
		Thread.sleep(2000);
		
		// Pressing Enter Button

		Session.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnSearchedSession);

		String ActSessionName = driver.findElement(clickOnSearchedSession).getText();

		System.out.println("Clicking On Session : " + ActSessionName);

		if (SessionTitle.equals(ActSessionName)) {

			System.out.println("This is Correct Session");

		} else {

			System.out.println("Failed to Search the Session Name so, searching again ");

			Session.clear();

			Session.sendKeys(SessionTitle);

			Thread.sleep(2000);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			 Pressing Enter Button

			Session.sendKeys(Keys.ENTER);

		}
		
//		Selecting the Session

		System.out.println("Selecting the Session");

		waitForClickabilityOf(clickOnSearchedSession);

		driver.findElement(clickOnSearchedSession).click();	
		
//		Clicking On Seating	

		System.out.println("Clicking On Seating");

		waitForClickabilityOf(clickOnSeating);

		driver.findElement(clickOnSeating).click();
		
//		Clicking on Random Seating 
		
		if (RandomSeating=true) {
			
			System.out.println("Clicking On Random Seating");

			waitForClickabilityOf(clickOnRandonSeating);

			driver.findElement(clickOnRandonSeating).click();
			
		} else {
			
			System.out.println("Random Seating disabled");

		}
		
//		Clicking On View All Tables
		
		System.out.println("Clicking On View All Tables");

		waitForClickabilityOf(viewAllTables);

		driver.findElement(viewAllTables).click();
		
//		Entering Table Name
		
		System.out.println("Entering Table Name");

		waitForClickabilityOf(tableName);

		driver.findElement(tableName).sendKeys(TableName);
		
//		Entering Table Capacity
		
		System.out.println("Entering Table Capacity");

		waitForClickabilityOf(tableCapacity);

		driver.findElement(tableCapacity).sendKeys("30");
		
//		Clicking On Add Button
		
		System.out.println("Clicking On Add Button");

		waitForClickabilityOf(addTableBtn);

		driver.findElement(addTableBtn).click();
		
//		Clicking On Close Button
		
		System.out.println("Clicking On Close Button");

		waitForClickabilityOf(tableCloseBtn);

		driver.findElement(tableCloseBtn).click();
		
//		Clicking On Search Attendees
		
		System.out.println("Clicking On Search Attendees");

		waitForClickabilityOf(assignUsers);

		driver.findElement(assignUsers).click();
		
//		Clicking On Select All Users
		
		System.out.println("Clicking On Select All Users");

		waitForClickabilityOf(selectAllUserCheckBox);

		driver.findElement(selectAllUserCheckBox).click();
		
		Thread.sleep(2000);
		
//		Clicking On Done Button
		
		System.out.println("Clicking On Done Button");

		waitForClickabilityOf(doneBtn);

		driver.findElement(doneBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveSeatingBtn);

		driver.findElement(saveSeatingBtn).click();
		
//		Clicking On Seating	

		System.out.println("Clicking On Seating");

		waitForClickabilityOf(clickOnSeating);

		driver.findElement(clickOnSeating).click();
		
		Thread.sleep(2000);
		
//		Getting No Of Existing Attendee Count
		
		try {
			
			waitForClickabilityOf(existingNoOfAttendees);
			
			List<WebElement> element = driver.findElements(existingNoOfAttendees);
			
			int NoOfExAttendees = element.size();
			
			if (NoOfExAttendees>1) {
				
				System.out.println("Successfully Arranged Seating Management");
				
			} else {
				
				System.out.println("Failed to Arrange Seating Management");

			}
			
		} catch (Exception e) {
			
		}
				
		
		return new AddSessions(driver);
		
	}
	
	public AddSessions addSessionCapacity(String EmailId, String Password, String EventFullName,String SessionTitle) throws InterruptedException{
		
		// Login to your Account

		new LoginToAccount(driver).loginToAccount(EmailId, Password);

		// Searching for Event Name

		System.out.println("Searching for Event Name :" + EventFullName);

		waitForClickabilityOf(searchEvent);

		WebElement search = driver.findElement(searchEvent);

		search.sendKeys(EventFullName);

		// Pressing Enter Button

		search.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnEvent);

		String ActEventName = driver.findElement(clickOnEvent).getText();

		System.out.println("Clicking On Event : " + ActEventName);

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

			// Pressing Enter Button

			search.sendKeys(Keys.ENTER);

		}

		// Clicking on The Event

		System.out.println("Clicking on The Event");

		waitForClickabilityOf(clickOnEvent);

		driver.findElement(clickOnEvent).click();

		// Clicking on Agenda Setup

		System.out.println("Clicking on Agenda Setup");

		waitForClickabilityOf(clickOnAgendaSetUp);

		driver.findElement(clickOnAgendaSetUp).click();

		// Clicking on Session

		System.out.println("Clicking on Session");

		waitForClickabilityOf(clickOnSession);

		driver.findElement(clickOnSession).click();
		
		// Clicking on All Dates

		System.out.println("Clicking on All Dates");

		waitForClickabilityOf(allDates);

		driver.findElement(allDates).click();
		
		// Searching for Session Name

		System.out.println("Searching for Session Name :" + SessionTitle);

		waitForClickabilityOf(searchSession);

		WebElement Session = driver.findElement(searchSession);

		Session.sendKeys(SessionTitle);
		
		Thread.sleep(2000);
		
		// Pressing Enter Button

		Session.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnSearchedSession);

		String ActSessionName = driver.findElement(clickOnSearchedSession).getText();

		System.out.println("Clicking On Session : " + ActSessionName);

		if (SessionTitle.equals(ActSessionName)) {

			System.out.println("This is Correct Session");

		} else {

			System.out.println("Failed to Search the Session Name so, searching again ");

			Session.clear();

			Session.sendKeys(SessionTitle);

			Thread.sleep(2000);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			 Pressing Enter Button

			Session.sendKeys(Keys.ENTER);

		}
		
//		Selecting the Session

		System.out.println("Selecting the Session");

		waitForClickabilityOf(clickOnSearchedSession);

		driver.findElement(clickOnSearchedSession).click();	
		
//		Clicking On Capacity	

		System.out.println("Clicking On Capacity");

		waitForClickabilityOf(clickOnCapacity);

		driver.findElement(clickOnCapacity).click();
		
		Thread.sleep(2000);
				
//		Enabling Session Capacity	

		System.out.println("Enabling Session Capacity");

		waitForClickabilityOf(sessionCapacityBtn);
		
		boolean CapBtn = driver.findElement(sessionCapacityBtn).isSelected();
		
		System.out.println(CapBtn);
		
		if (CapBtn==true) {
			
		}else {
			
			driver.findElement(sessionCapacityBtn).click();
			
		}
		
		Thread.sleep(2000);
		
//		Clicking On Capacity	

		System.out.println("Entering Max Capacity as : 50");

		waitForClickabilityOf(noOfMaxSeats);
		
		driver.findElement(noOfMaxSeats).clear();

		driver.findElement(noOfMaxSeats).sendKeys("50");
		
		Thread.sleep(2000);
		
//		Enabling Allow Wait list	

		System.out.println("Enabling Allow Waitlist");

		waitForClickabilityOf(allowWaitlistBtn);

		driver.findElement(allowWaitlistBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Capacity	

		System.out.println("Entering Max Waitlist Capacity as : 5");

		waitForClickabilityOf(allowAddBookings);
		
		driver.findElement(allowAddBookings).clear();

		driver.findElement(allowAddBookings).sendKeys("5");
		
		Thread.sleep(2000);
		
//		Enabling Allow Wait list	

		System.out.println("Enabling Availbility Duaration");

		waitForClickabilityOf(availbilityDurationBtn);

		driver.findElement(availbilityDurationBtn).click();
		
		Thread.sleep(2000);
		
//		Entering Start Date	

		System.out.println("Entering Start Date");

		waitForClickabilityOf(capStartDate);
		
		driver.findElement(capStartDate).clear();

		driver.findElement(capStartDate).sendKeys("26/01/2018");
		
		Thread.sleep(2000);
		
//		Entering Start Time	

		System.out.println("Entering Start Time");

		waitForClickabilityOf(capStartTime);
		
		driver.findElement(capStartTime).clear();

		driver.findElement(capStartTime).sendKeys("10:00AM");
		
		Thread.sleep(2000);
		
//		Entering End Date	

		System.out.println("Entering End Date");

		waitForClickabilityOf(capEndDate);
		
		driver.findElement(capEndDate).clear();

		driver.findElement(capEndDate).sendKeys("26/01/2018");
		
		Thread.sleep(2000);
		
//		Entering Start Time	

		System.out.println("Entering End Time");

		waitForClickabilityOf(capEndTime);
		
		driver.findElement(capEndTime).clear();

		driver.findElement(capEndTime).sendKeys("08:00PM");
		
		Thread.sleep(2000);
		
//		Clicking On Save Button	

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(capSaveBtn);

		driver.findElement(capSaveBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Capacity	

		System.out.println("Clicking On Capacity");

		waitForClickabilityOf(clickOnCapacity);

		driver.findElement(clickOnCapacity).click();
		
//		Checking for Capability Button

		waitForClickabilityOf(sessionCapacityBtn);
		
		boolean CapBtn1 = driver.findElement(sessionCapacityBtn).isSelected();
		
		System.out.println(CapBtn1);
		
		if (CapBtn1==false) {
			
			System.out.println("Successfully Created Capacity Management");
			
		}else {
			
			System.out.println("Failed to Create Capacity Management");
			
		}
		
		return new AddSessions(driver);
		
	}
	
	public AddSessions addSessionGroup(String EmailId, String Password, String EventFullName,String SessionTitle,boolean Group) throws InterruptedException{
		
		// Login to your Account

		new LoginToAccount(driver).loginToAccount(EmailId, Password);

		// Searching for Event Name

		System.out.println("Searching for Event Name :" + EventFullName);

		waitForClickabilityOf(searchEvent);

		WebElement search = driver.findElement(searchEvent);

		search.sendKeys(EventFullName);

		// Pressing Enter Button

		search.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnEvent);

		String ActEventName = driver.findElement(clickOnEvent).getText();

		System.out.println("Clicking On Event : " + ActEventName);

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

			// Pressing Enter Button

			search.sendKeys(Keys.ENTER);

		}

		// Clicking on The Event

		System.out.println("Clicking on The Event");

		waitForClickabilityOf(clickOnEvent);

		driver.findElement(clickOnEvent).click();

		// Clicking on Agenda Setup

		System.out.println("Clicking on Agenda Setup");

		waitForClickabilityOf(clickOnAgendaSetUp);

		driver.findElement(clickOnAgendaSetUp).click();

		// Clicking on Session

		System.out.println("Clicking on Session");

		waitForClickabilityOf(clickOnSession);

		driver.findElement(clickOnSession).click();
		
		// Clicking on All Dates

		System.out.println("Clicking on All Dates");

		waitForClickabilityOf(allDates);

		driver.findElement(allDates).click();
		
		// Searching for Session Name

		System.out.println("Searching for Session Name :" + SessionTitle);

		waitForClickabilityOf(searchSession);

		WebElement Session = driver.findElement(searchSession);

		Session.sendKeys(SessionTitle);
		
		Thread.sleep(2000);
		
		// Pressing Enter Button

		Session.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		waitForClickabilityOf(clickOnSearchedSession);

		String ActSessionName = driver.findElement(clickOnSearchedSession).getText();

		System.out.println("Clicking On Session : " + ActSessionName);

		if (SessionTitle.equals(ActSessionName)) {

			System.out.println("This is Correct Session");

		} else {

			System.out.println("Failed to Search the Session Name so, searching again ");

			Session.clear();

			Session.sendKeys(SessionTitle);

			Thread.sleep(2000);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			 Pressing Enter Button

			Session.sendKeys(Keys.ENTER);

		}
		
//		Selecting the Session

		System.out.println("Selecting the Session");

		waitForClickabilityOf(clickOnSearchedSession);

		driver.findElement(clickOnSearchedSession).click();	
		
//		Clicking On Session Group	

		System.out.println("Clicking On Session Group");

		waitForClickabilityOf(clickOnSessionGroups);

		driver.findElement(clickOnSessionGroups).click();
		
		Thread.sleep(2000);
		
//		Enabling Associate Group
		
		System.out.println("Enabling Associate Group");
		
		Thread.sleep(2000);

		waitForClickabilityOf(associateGrpBtn);
		
		Thread.sleep(2000);
		
		boolean AssociateBtn = driver.findElement(associateGrpBtn).isSelected();
		
		System.out.println(AssociateBtn);
		
		if (AssociateBtn==true) {
			
		}else {
			
			driver.findElement(associateGrpBtn).click();
			
		}
		
		Thread.sleep(2000);
	 
//		Adding User Type
	 	
		if (Group==true) {
			
//			Clicking On Add Group	

			System.out.println("Clicking On Add Group");

			waitForClickabilityOf(addGroup);

			driver.findElement(addGroup).click();
			
//			Entering the New Group Name	

			System.out.println("Entering the New Group Name");

			waitForClickabilityOf(groupName);

			driver.findElement(groupName).sendKeys(GroupName);
			
//			Enabling Show On Mobile Check Box		

			System.out.println("Enabling Show On Mobile Check Box");

			waitForClickabilityOf(showOnMobile);

			driver.findElement(showOnMobile).click();
			
//			Selecting 1st User Check Box		

			System.out.println("Selecting 1st User Check Box");

			waitForClickabilityOf(grp1stUser);

			driver.findElement(grp1stUser).click();
			
//			Selecting 2nd User Check Box		

			System.out.println("Selecting 2nd User Check Box");

			waitForClickabilityOf(grp2ndUser);

			driver.findElement(grp2ndUser).click();
			
			Thread.sleep(2000);
			
//			Selecting 2nd User Check Box		

			System.out.println("Clicking On Add to Save the Group");

			waitForClickabilityOf(newGroupAddBtn);

			driver.findElement(newGroupAddBtn).click();
			
			Thread.sleep(2000);
			
//			Clicking On Search Group		

			System.out.println("Clicking On Search Group");

			waitForClickabilityOf(searchGroup);

			driver.findElement(searchGroup).sendKeys(GroupName);
			
			Thread.sleep(2000);
			
//			Selecting All Group Name		

			System.out.println("Selecting All Group Name");

			waitForClickabilityOf(selctAllGrpChkBox);

			driver.findElement(selctAllGrpChkBox).click();
			
			Thread.sleep(2000);
			
//			Selecting All Group Name		

			System.out.println("Clicking On Done to save Group");

			waitForClickabilityOf(doneGrpBtn);

			driver.findElement(doneGrpBtn).click();
			
		} else {
			
//			Clicking On Search User		

			System.out.println("Clicking On Search User");

			waitForClickabilityOf(searchUser);

			driver.findElement(searchUser).click();
			
			Thread.sleep(2000);
			
//			Selecting All User		

			System.out.println("Selecting All User");

			waitForClickabilityOf(selectAllUserChkBox);

			driver.findElement(selectAllUserChkBox).click();
			
			Thread.sleep(2000);
			
//			Selecting All User	

			System.out.println("Clicking On Done to save Users");

			waitForClickabilityOf(doneUserBtn);

			driver.findElement(doneUserBtn).click();
			
			Thread.sleep(2000);


		}
		
//		Selecting All Group Name		

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveSessionGroupBtn);

		driver.findElement(saveSessionGroupBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Session Group	

		System.out.println("Clicking On Session Group");

		waitForClickabilityOf(clickOnSessionGroups);

		driver.findElement(clickOnSessionGroups).click();
		
		Thread.sleep(2000);
		
		if (Group==true) {
			
//			Clicking On Session Group	

			waitForClickabilityOf(selectAllGroup);
			
			List<WebElement> element = driver.findElements(selectAllGroup);
			
			int NoOfExGroups = element.size();
			
			System.out.println(NoOfExGroups);
			
			if (NoOfExGroups >1) {
				
				System.out.println("Successfully Added Groups to Session");
				
			} else {
				
				System.out.println("Failed to Add Groups to Session");

			}
			
			
		}else {
			
//			Clicking On Session Group	

			waitForClickabilityOf(selectAllUser);
			
			List<WebElement> element = driver.findElements(selectAllUser);
			
			int NoOfExUsers = element.size();
			
			System.out.println(NoOfExUsers);
			
			if (NoOfExUsers >2) {
				
				System.out.println("Successfully Added Users to Session");
				
			} else {
				
				System.out.println("Failed to Add Users to Session");

			}
			
		}
			
		
		return new AddSessions(driver);
		
	}
}
