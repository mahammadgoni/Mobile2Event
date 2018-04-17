package com.EventMeetings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class SetUpMeetings extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnMeetings = By.xpath("//*[@id='meetingmodule']");
	
	By configureMeetings = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Configure Meetings')]");
	
//	General Meeting
	
	By setUpMeetings = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Setup Meetings')]");
	
	By manageMeetings = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Manage Meetings')]");
	
	By generalRadioBtn = By.xpath("//*[@id='ContentPlaceHolder1_rbtnTypeSelection_0']");
	
	By requestedByUser = By.xpath("//*[@id='ContentPlaceHolder1_btnSelectAttendee']");
	
	By requestedToUser = By.xpath("//*[@id='ContentPlaceHolder1_btnSelectAttendee_new']");
	
	By reqstdBy1stUser = By.xpath("//html//div[@id='div5']//tr[1]/td[1]/input[1]");
	
	By reqstdBy2ndUser = By.xpath("//html//div[@id='div5']//tr[2]/td[1]/input[1]");
	
	By reqstdBy3rdUser = By.xpath("//html//div[@id='div5']//tr[3]/td[1]/input[1]");
		
	By reqstdTo2ndUser = By.xpath("//html//div[@id='div5_new']//tr[2]/td[1]/input[1]");
	
	By addByBtn = By.xpath("//*[@id='ContentPlaceHolder1_Saveattendee']");
	
	By addToBtn = By.xpath("//*[@id='ContentPlaceHolder1_Saveattendee_new']");
	
	By closeByBtn = By.xpath("//a[@id='ContentPlaceHolder1_A1']");
	
	By closeToBtn = By.xpath("//a[@id='ContentPlaceHolder1_A6']");
	
	By preApprovedBtn = By.xpath("//*[@id='ContentPlaceHolder1_chkpreapproved']");
	
	By genMtinTitle = By.xpath("//*[@id='ContentPlaceHolder1_txtTitle']");
	
	By genMtinDate = By.xpath("//*[@id='ContentPlaceHolder1_txtMeetingDate']");
	
	By genGoToNxtMnth = By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']");
	
	By selectMay4th = By.xpath("//html//tr[1]/td[6]/a[1]");
	
	By genMtinStartTime = By.xpath("//*[@id='ContentPlaceHolder1_txtFromTime']");
	
	By genMtinEndTime = By.xpath("//*[@id='ContentPlaceHolder1_txtToTime']");
	
	By description = By.xpath("//*[@id='ContentPlaceHolder1_txtDesc']");
	
	By genLocationType = By.xpath("//*[@id='ContentPlaceHolder1_ddlLocationType']");
	
	By genLocation = By.xpath("//*[@id='ContentPlaceHolder1_ddlLocation']");
	
	By genPollOrSurvey = By.xpath("//*[@id='ContentPlaceHolder1_btnSelectPoll']");
	
	By gen1stPoll = By.xpath("//table[@id='tblPollList']/tbody/tr[1]/td[1]/input");
	
	By gen2ndPoll = By.xpath("//table[@id='tblPollList']/tbody/tr[2]/td[1]/input");	
	
	By pollAddBtn = By.xpath("//*[@id='ContentPlaceHolder1_Button1']");	
	
	By genSendNotification = By.xpath("//*[@id='ContentPlaceHolder1_chkSendNotify_0']");
	
	By genSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnEditSave']");
	
	By genMeetingNo1 = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_lblMeetingTitle_0']");
	
//	Genius Meeting
	
	By enableGeniusBar = By.xpath("//*[@id='ContentPlaceHolder1_rbtnSetupGeniusBar_0']");
	
	By geniusRadioBtn = By.xpath("//*[@id='ContentPlaceHolder1_rbtnTypeSelection_1']");
	
	By selectReqstdByUser = By.xpath("//*[@id='ContentPlaceHolder1_btnSelectAttendee']");
	
	By availableBy = By.xpath("//*[@id='ContentPlaceHolder1_ddlAvailabilityBy']");
	
	By topic = By.xpath("//*[@id='ContentPlaceHolder1_ddlTopic']");
	
	By subTopic = By.xpath("//*[@id='ContentPlaceHolder1_ddlSubTopic']");
	
	By geniusDescription = By.xpath("//*[@id='ContentPlaceHolder1_txtGeniDesc']");
	
	By notes = By.xpath("//*[@id='ContentPlaceHolder1_txtNotes']");
	
	By geniusLocation = By.xpath("//*[@id='ContentPlaceHolder1_ddlLocation']");
	
	By expertAvailbility = By.xpath("//*[@id='ContentPlaceHolder1_btnExpertsAvail']");
	
	By expertName = By.xpath("//*[@id='ContentPlaceHolder1_ddlExperts']");
	
	By locationName = By.xpath("//*[@id='ContentPlaceHolder1_ddlLocation']");
	
	By notificationToAttendee = By.xpath("//*[@id='ContentPlaceHolder1_chkSendNotify_0']");
	
	By notificationToExpert = By.xpath("//*[@id='ContentPlaceHolder1_chkSendNotify_1']");
	
	By geniusTab = By.xpath("//*[@id='ContentPlaceHolder1_chkSendNotify_1']");
	
	By saveButton = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By slot0 = By.xpath("//a[@id='TimeLiALByExperts0']");
	
	By slot1 = By.xpath("//a[@id='TimeLiALByExperts1']");
	
	By slot2 = By.xpath("//a[@id='TimeLiALByExperts2']");
	
	By slot3 = By.xpath("//a[@id='TimeLiALByExperts3']");
	
	By slot4 = By.xpath("//a[@id='TimeLiALByExperts4']");
	
	By geniusMeetingNo1 = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_lblTopicName_0']");
	
		

	public SetUpMeetings(WebDriver driver) {
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

//		Clicking on Meetings
		
		System.out.println("Clicking on Meetings");
		
		waitForClickabilityOf(clickOnMeetings);
		
		driver.findElement(clickOnMeetings).click();
		
//		Clicking on Configure Meetings
		
		System.out.println("Clicking on Configure Meetings");
		
		waitForClickabilityOf(setUpMeetings);
		
		driver.findElement(setUpMeetings).click();
		
	}
	
//	General Meeting Set up
	
	public SetUpMeetings setUpGeneralMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Select Requested By User
		
		System.out.println("Clicking on Select Requested By User");
		
		waitForClickabilityOf(requestedByUser);
		
		driver.findElement(requestedByUser).click();
		
		Thread.sleep(2000);
		
//		Selecting 1st User
		
		System.out.println("Selecting 1st User");
		
		waitForClickabilityOf(reqstdBy1stUser);
		
		driver.findElement(reqstdBy1stUser).click();
		
		Thread.sleep(2000);
		
//		Clicking On Add Button
		
		System.out.println("Clicking On Add Button");
		
		waitForClickabilityOf(addByBtn);
		
		driver.findElement(addByBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking on Select Requested To User
		
		System.out.println("Clicking on Select Requested To User");
		
		waitForClickabilityOf(requestedToUser);
		
		driver.findElement(requestedToUser).click();
		
		Thread.sleep(2000);
		
//		Selecting 2nd User
		
		System.out.println("Selecting 2nd User");
		
		waitForClickabilityOf(reqstdTo2ndUser);
		
		driver.findElement(reqstdTo2ndUser).click();
		
		Thread.sleep(2000);
		
//		Clicking On Add Button
		
		System.out.println("Clicking On Add Button");
		
		waitForClickabilityOf(addToBtn);
		
		driver.findElement(addToBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Pre Approved Check Box
		
//		System.out.println("Clicking On Pre Approved Check Box");
//		
//		waitForClickabilityOf(preApprovedBtn);
//		
//		driver.findElement(preApprovedBtn).click();
//		
//		Thread.sleep(2000);
		
//		Entering The Meeting Title
		
		System.out.println("Entering The Meeting Title");
		
		waitForClickabilityOf(genMtinTitle);
		
		driver.findElement(genMtinTitle).sendKeys("General Automation Meeting");
		
		Thread.sleep(2000);
		
//		Clicking On Date Field
		
		System.out.println("Clicking On Date Field");
		
		waitForClickabilityOf(genMtinDate);
		
		WebElement GenDate = driver.findElement(genMtinDate);
		
		GenDate.click();
		
//		Pressing Enter Button 
		
		GenDate.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Clicking On Goto Next Month
		
//		System.out.println("Clicking On Goto Next Month");
//		
//		waitForClickabilityOf(genGoToNxtMnth);
//		
//		driver.findElement(genGoToNxtMnth).click();
//		
//		Thread.sleep(2000);
//		
////		Selecting the Date
//		
//		System.out.println("Selecting the Date ");
//		
//		waitForClickabilityOf(selectMay4th);
//		
//		driver.findElement(selectMay4th).click();
//		
//		Thread.sleep(2000);
		
//		Selecting the Start Time
		
		System.out.println("Selecting the Start Time");
		
		waitForClickabilityOf(genMtinStartTime);
		
//		driver.findElement(genMtinStartTime).sendKeys("10:00 AM");
		
		driver.findElement(genMtinStartTime).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Selecting the End Time
		
		System.out.println("Selecting the End Time");
		
		waitForClickabilityOf(genMtinEndTime);
		
//		driver.findElement(genMtinEndTime).sendKeys("12:00 PM");
		
		driver.findElement(genMtinEndTime).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Entering The Meeting Description
		
		System.out.println("Entering The Meeting Description");
		
		waitForClickabilityOf(description);
		
		driver.findElement(description).sendKeys("This is Automaion Testing General Meeting Description");
		
		Thread.sleep(2000);
		
//	    Selecting Location Type 
		
		System.out.println("Selecting Location Type");
		
		waitForClickabilityOf(genLocationType);
		
		Select LocationTypeDropDown = new Select(driver.findElement(genLocationType));
		
		LocationTypeDropDown.selectByIndex(2);
		
		Thread.sleep(2000);
		
//	    Selecting Location  
		
		System.out.println("Selecting Location ");
		
		waitForClickabilityOf(genLocation);
		
		Select LocationDropDown = new Select(driver.findElement(genLocation));
		
		LocationDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//		Clicking On Associate Poll/Survey Button
		
		System.out.println("Clicking On Associate Poll/Survey Button");
		
		waitForClickabilityOf(genPollOrSurvey);
		
		driver.findElement(genPollOrSurvey).click();
		
		Thread.sleep(2000);
		
//		Clicking On Associate Poll/Survey Button
		
		System.out.println("Selecting 1st Associate Poll/Survey");
		
		waitForClickabilityOf(gen1stPoll);
		
		driver.findElement(gen1stPoll).click();
		
		Thread.sleep(2000);
		
//		Clicking On Associate Poll/Survey Add Button
		
		System.out.println("Clicking On Associate Poll/Survey Add Button");
		
		waitForClickabilityOf(pollAddBtn);
		
		driver.findElement(pollAddBtn).click();
		
		Thread.sleep(2000);

//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(genSaveBtn);
		
		driver.findElement(genSaveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
				
//		Checking for Created Meeting
		
		waitForClickabilityOf(genMeetingNo1);
		
		boolean genMeeting = driver.findElement(genMeetingNo1).isDisplayed();
		
		if (genMeeting==true) {
			
			System.out.println("Successfully Created One General Meeting");
			
		} else {
			
			System.out.println("Failed to Create General Meeting");

		}
			
		
		
		return new SetUpMeetings(driver);
		
	}
	
//	Genius Meeting Set up
	
	public SetUpMeetings setUpGeniusMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Genius Meetings Radio Button
		
		System.out.println("Clicking on Genius Meetings Radio Button");
				
//		waitForClickabilityOf(geniusRadioBtn);
		
		boolean GeniusRdBtn = driver.findElement(geniusRadioBtn).isEnabled();
		
		System.out.println(GeniusRdBtn);
		
		if (GeniusRdBtn==true) {
			
			driver.findElement(geniusRadioBtn).click();
			
		} else {
			
			System.out.println("Genius Radio Button is disabled, so trying to Enable it");
			
//			Clicking on Meetings
			
			System.out.println("Clicking on Meetings");
			
			waitForClickabilityOf(clickOnMeetings);
			
			driver.findElement(clickOnMeetings).click();
			
			Thread.sleep(2000);
			
//			Clicking on Configure Meetings
			
			System.out.println("Clicking on Configure Meetings");
			
			waitForClickabilityOf(configureMeetings);
			
			driver.findElement(configureMeetings).click();
			
			Thread.sleep(2000);
			
//		    Enable Setup Genius Bar
			
			System.out.println("Enabling Setup Genius Bar");
			
			waitForClickabilityOf(enableGeniusBar);
			
			boolean EnableGeniusBar = driver.findElement(enableGeniusBar).isSelected();
			
			System.out.println("Enabled Genius Meeting Configure : "+EnableGeniusBar);
			
			if (EnableGeniusBar==false) {
				
				driver.findElement(enableGeniusBar).click();
							
			} else {
				
			}
			
			Thread.sleep(2000);
			
//		    Clicking on save Button to create the Genius Meeting
			
			System.out.println("Clicking on save Button to create the Genius Meetings");
			
			waitForClickabilityOf(saveButton);
			
			driver.findElement(saveButton).click();
			
			
			try {
				
				popUpHandeling();
				
			} catch (Exception e) {
				
				
			}
			
//			Clicking on Meetings
			
			System.out.println("Clicking on Meetings");
			
			waitForClickabilityOf(clickOnMeetings);
			
			driver.findElement(clickOnMeetings).click();
			
			Thread.sleep(2000);
			
//			Clicking on Configure Meetings
			
			System.out.println("Clicking on Configure Meetings");
			
			waitForClickabilityOf(setUpMeetings);
			
			driver.findElement(setUpMeetings).click();
			
			Thread.sleep(2000);
			
//			Clicking on Genius Radio Button
			
			System.out.println("Clicking on Genius Radio Button");
			
			waitForClickabilityOf(geniusRadioBtn);
			
			driver.findElement(geniusRadioBtn).click();
					
		}
				
		Thread.sleep(2000);
		
//		Clicking on Select Requested By User
		
		System.out.println("Clicking on Select Requested By User");
		
		waitForClickabilityOf(selectReqstdByUser);
		
		driver.findElement(selectReqstdByUser).click();
		
		Thread.sleep(2000);
		
//		Selecting the User
		
		System.out.println("Selecting the User");
		
		waitForClickabilityOf(reqstdBy3rdUser);
		
		driver.findElement(reqstdBy3rdUser).click();
		
		Thread.sleep(2000);
		
//		Clicking On Add Button
		
		System.out.println("Clicking On Add Button");
		
		waitForClickabilityOf(addByBtn);
		
		driver.findElement(addByBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Associate Poll/Survey Button
		
		System.out.println("Clicking On Associate Poll/Survey Button");
		
		waitForClickabilityOf(genPollOrSurvey);
		
		driver.findElement(genPollOrSurvey).click();
		
		Thread.sleep(2000);
		
//		Clicking On Associate Poll/Survey Button
		
		System.out.println("Selecting 1st Associate Poll/Survey");
		
		waitForClickabilityOf(gen1stPoll);
		
		driver.findElement(gen1stPoll).click();
		
		Thread.sleep(2000);
		
//		Clicking On Associate Poll/Survey Add Button
		
		System.out.println("Clicking On Associate Poll/Survey Add Button");
		
		waitForClickabilityOf(pollAddBtn);
		
		driver.findElement(pollAddBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Send Notification to Attendee Check box
		
		System.out.println("Clicking On Send Notification to Attendee Checkbox");
		
		waitForClickabilityOf(notificationToAttendee);
		
		driver.findElement(notificationToAttendee).click();
		
		Thread.sleep(2000);
		
//		Clicking On Send Notification to Expert Check box
		
		System.out.println("Clicking On Send Notification to Expert Checkbox");
		
		waitForClickabilityOf(notificationToExpert);
		
		driver.findElement(notificationToExpert).click();
		
		Thread.sleep(2000);
		
//	    Selecting Available By
		
		System.out.println("Selecting Available By");
		
		waitForClickabilityOf(availableBy);
		
		Select AvailableByDropDown = new Select(driver.findElement(availableBy));
		
		AvailableByDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//	    Selecting Topic
		
		System.out.println("Selecting Topic");
		
		waitForClickabilityOf(topic);
		
		Select TopicDropDown = new Select(driver.findElement(topic));
		
		TopicDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//	    Selecting Sub Topic
		
		System.out.println("Selecting Sub Topic");
		
		waitForClickabilityOf(subTopic);
		
		Select SubtopicDropDown = new Select(driver.findElement(subTopic));
		
		SubtopicDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//		Entering The Meeting Description
		
		System.out.println("Entering The Meeting Description");
		
		waitForClickabilityOf(geniusDescription);
		
		driver.findElement(geniusDescription).sendKeys("This is Automaion Testing Genius Meeting Description");
		
//		Entering The Meeting Notes
		
		System.out.println("Entering The Meeting Notes");
		
		waitForClickabilityOf(notes);
		
		driver.findElement(notes).sendKeys("This is Automaion Testing Genius Meeting Notes");
		
		Thread.sleep(2000);
		
//	    Selecting Location  
		
		System.out.println("Selecting Location ");
		
		waitForClickabilityOf(geniusLocation);
		
		Select LocationDropDown = new Select(driver.findElement(geniusLocation));
		
		LocationDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
		boolean TimeSlot4 = driver.findElement(slot4).isDisplayed();
		
		if (TimeSlot4==true) {
			
			driver.findElement(slot4).click();
			
		} else {
			
			driver.findElement(slot2).click();

		}
			
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(genSaveBtn);
		
		driver.findElement(genSaveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Checking for Created Meeting
		
		waitForClickabilityOf(geniusMeetingNo1);
		
		boolean geniusMeeting = driver.findElement(geniusMeetingNo1).isDisplayed();
		
		if (geniusMeeting==true) {
			
			System.out.println("Successfully Created One Genius Meeting");
			
		} else {
			
			System.out.println("Failed to Create Genius Meeting");

		}
		
		
		
		return new SetUpMeetings(driver);
	}

}
