package com.EventMeetings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class ConfigureMeetings extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnMeetings = By.xpath("//*[@id='meetingmodule']");
	
	By configureMeetings = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Configure Meetings')]");
	
//	Genius Meeting Setup Elements
	
	By enableMeetings = By.xpath("//*[@id='ContentPlaceHolder1_rbtnSetupMeetings_0']");
	
	By enableGeniusBar = By.xpath("//*[@id='ContentPlaceHolder1_rbtnSetupGeniusBar_0']");
	
	By disableGeniusBar = By.xpath("//*[@id='ContentPlaceHolder1_rbtnSetupGeniusBar_1']");
	
	By manageLocationType = By.xpath("//*[@id='ContentPlaceHolder1_Button2']");
	
	By manageLocation = By.xpath("//*[@id='ContentPlaceHolder1_btnShowLocation']");
	
	By locationType = By.xpath("//*[@id='ContentPlaceHolder1_txtLocationType']");
	
	By addLocationTypeBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveLocationType']");
	
	By closeLocationType = By.xpath("//div[@id='inline4']//a[@href='javascript:void(0);']");
	
	By locationName = By.xpath("//*[@id='ContentPlaceHolder1_TxtLocation']");
	
	By locationTypeDropDown = By.xpath("//*[@id='ContentPlaceHolder1_ddlLocationsubType']");
	
	By locationCapacity = By.xpath("//*[@id='ContentPlaceHolder1_txtCapacity']");
	
	By locationSavebtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveLocation']");
	
	By addLocationClosebtn = By.xpath("//div[@id='div5']//a[@href='javascript:void(0);']");
	
	By manageTopic = By.xpath("//*[@id='btnAddTopic']");
	
	By topicEmailId = By.xpath("//*[@id='ContentPlaceHolder1_txtTopicEmailId']");
	
	By topicName = By.xpath("//*[@id='ContentPlaceHolder1_txtTopicname']");
	
	By addTopicEmail = By.xpath("//*[@id='ContentPlaceHolder1_txtEmailOTopic']");
	
	By locationTypeCheckBox = By.xpath("//*[@id='ContentPlaceHolder1_chklocationtype_0']");
	
	By addTopicBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveType']");
	
	By topicCloseBtn = By.xpath("//div[@id='inline2']//a[@href='javascript:void(0);']");
	
	By manageSubTopic = By.xpath("//*[@id='btnAddSubTopic']");
	
	By selectTopic = By.xpath("//*[@id='ContentPlaceHolder1_ddlTopicPop']");
	
	By subTopicName = By.xpath("//*[@id='ContentPlaceHolder1_txtSubTopicName']");
	
	By subTopicEmail = By.xpath("//*[@id='ContentPlaceHolder1_txtEmailOSubTopic']");
	
	By addSubTopicBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveSubTopicType']");
	
	By addSubTopicCloseBtn = By.xpath("//div[@id='inline3']//a[@href='javascript:void(0);']");
	
	By geniusBarTabName = By.xpath("//*[@id='ContentPlaceHolder1_txtGeniusBar']");
	
	By descriptionLabel1 = By.xpath("//*[@id='ContentPlaceHolder1_txtMeetingDesc1Label']");
	
	By descriptionLabel2 = By.xpath("//*[@id='ContentPlaceHolder1_txtMeetingDesc2Label']");
	
	By dateRangeFrom = By.xpath("//*[@id='ContentPlaceHolder1_txt_GeniusmeetingFromDate']");
	
	By gotoNextMonth = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	
	By select5thOfNextMonth = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	
	By dateRangeTo = By.xpath("//*[@id='ContentPlaceHolder1_txt_GeniusmeetingToDate']");
	
	By timeRangeFrom = By.xpath("//*[@id='ContentPlaceHolder1_txtGeniusFromTime']");
	
	By timeRangeTo = By.xpath("//*[@id='ContentPlaceHolder1_txtGeniusToTime']");
	
	By slotDifference = By.xpath("//*[@id='ContentPlaceHolder1_ddlGeniustimeslot']");
	
	By displayUnavailableSlots = By.xpath("//*[@id='ContentPlaceHolder1_ddlfilterforgetavailgenius']");
	
	By considerUnavailable = By.xpath("//*[@id='ContentPlaceHolder1_ddlfilterforsaveavailgenius']");
	
	By labelForPoll = By.xpath("//*[@id='ContentPlaceHolder1_txtForPollGenius']");
	
	By pushPollMsg = By.xpath("//*[@id='ContentPlaceHolder1_txtPollPushMessageGenius']");
	
	By saveButton = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
//	One To One Meetings Elements
	
	By oneToOneSettings = By.xpath("//*[@id='ContentPlaceHolder1_OneToOneLab']");
	
	By enableOneToOne = By.xpath("//*[@id='ContentPlaceHolder1_rbtnOnetoOneMeeting_0']");
	
	By dateRangeFrom1 = By.xpath("//*[@id='ContentPlaceHolder1_txt_meetingFromDate']");
		
	By dateRangeTo1 = By.xpath("//*[@id='ContentPlaceHolder1_txt_meetingToDate']");
	
	By timeRangeFrom1 = By.xpath("//*[@id='ContentPlaceHolder1_txtFromTime']");
	
	By timeRangeTo1 = By.xpath("//*[@id='ContentPlaceHolder1_txtToTime']");
	
	By slotDifference1 = By.xpath("//*[@id='ContentPlaceHolder1_ddltimeslot']");
	
	By slot1CheckBox = By.xpath("//*[@id='ContentPlaceHolder1_chktimeslot']");
	
	By labelForPoll1 = By.xpath("//*[@id='ContentPlaceHolder1_txtForPollOnetoOne']");
	
	By pushPollMsg1 = By.xpath("//*[@id='ContentPlaceHolder1_txtPollPushMessageOnetoOne']");

	
	
	

	public ConfigureMeetings(WebDriver driver) {
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
		
		waitForClickabilityOf(configureMeetings);
		
		driver.findElement(configureMeetings).click();
		
	}
	
	public ConfigureMeetings configGeniusMetting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//	    Enable Setup Meetings
		
		System.out.println("Enabling Setup Meetings");
		
		waitForClickabilityOf(enableMeetings);
		
		boolean EnableMeetings = driver.findElement(enableMeetings).isSelected();
		
		System.out.println("Enabled Meeting Configure : "+EnableMeetings);
		
		if (EnableMeetings==false) {
			
			driver.findElement(enableMeetings).click();
						
		} else {
			
			
		}
		
//	    Enable Setup Genius Bar
		
		System.out.println("Enabling Setup Genius Bar");
		
		waitForClickabilityOf(enableGeniusBar);
		
		boolean EnableGeniusBar = driver.findElement(enableGeniusBar).isSelected();
		
		System.out.println("Enabled Genius Meeting Configure : "+EnableGeniusBar);
		
		if (EnableGeniusBar==false) {
			
			driver.findElement(enableGeniusBar).click();
						
		} else {
			
		}
		
		Thread.sleep(2000);
		
//	    Manage Location Type
		
		System.out.println("Clicking On Manage Location Type");
		
		waitForClickabilityOf(manageLocationType);
		
		driver.findElement(manageLocationType).click();
		
		Thread.sleep(2000);
		
//	    Add/Edit Location Type
		
		System.out.println("Entering Location Type");
		
		waitForClickabilityOf(locationType);
		
		driver.findElement(locationType).clear();
		
		driver.findElement(locationType).sendKeys("Genius Type");
		
//	    Add Location Type Button
		
		System.out.println("Clicking On Add Location Type Button");
		
		waitForClickabilityOf(addLocationTypeBtn);
		
		driver.findElement(addLocationTypeBtn).click();
		
//	    Close Button
		
		System.out.println("Clicking On Close Button");
		
		waitForClickabilityOf(closeLocationType);
		
		driver.findElement(closeLocationType).click();
		
//	    Manage Location 
		
		System.out.println("Clicking On Manage Location");
		
		waitForClickabilityOf(manageLocation);
		
		driver.findElement(manageLocation).click();
		
		Thread.sleep(2000);
		
//	    Add/Edit Location 
		
		System.out.println("Entering Location Name");
		
		waitForClickabilityOf(locationName);
		
		driver.findElement(locationName).clear();
		
		driver.findElement(locationName).sendKeys("Genius Room");
		
//	    Selecting Location Type 
		
		System.out.println("Selecting Location Type");
		
		waitForClickabilityOf(locationTypeDropDown);
		
		Select LocationDropDown = new Select(driver.findElement(locationTypeDropDown));
		
		LocationDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//	    Entering Location Capacity
		
		System.out.println("Entering Location Capacity");
		
		waitForClickabilityOf(locationCapacity);
		
		driver.findElement(locationCapacity).clear();
		
		driver.findElement(locationCapacity).sendKeys("3");
		
//	    Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(locationSavebtn);
		
		driver.findElement(locationSavebtn).click();
		
//	    Clicking On Close Button
		
		System.out.println("Clicking On Close Button");
		
		waitForClickabilityOf(addLocationClosebtn);
		
		driver.findElement(addLocationClosebtn).click();
		
		Thread.sleep(2000);
		
//	    Clicking On Manage Topic
		
		System.out.println("Clicking On Manage Topic");
		
		waitForClickabilityOf(manageTopic);
		
		driver.findElement(manageTopic).click();
		
//	    Entering Topic Name
		
		System.out.println("Entering Topic Name");
		
		waitForClickabilityOf(topicName);
		
		driver.findElement(topicName).clear();
		
		driver.findElement(topicName).sendKeys("Framework Discussion");
		
//	    Entering Email Address
		
		System.out.println("Entering Email Address");
		
		waitForClickabilityOf(addTopicEmail);
		
		driver.findElement(addTopicEmail).clear();
		
		driver.findElement(addTopicEmail).sendKeys("genius@yopmail.com");
		
//	    Select Location Type
		
		System.out.println("Select Location Type");
		
		waitForClickabilityOf(locationTypeCheckBox);
		
		driver.findElement(locationTypeCheckBox).click();
		
//	    Clicking on Add Topic Button
		
		System.out.println("Clicking on Add Topic Button");
		
		waitForClickabilityOf(addTopicBtn);
		
		driver.findElement(addTopicBtn).click();
		
//	    Clicking On Close Button
		
		System.out.println("Clicking On Close Button");
		
		waitForClickabilityOf(topicCloseBtn);
		
		driver.findElement(topicCloseBtn).click();
		
		Thread.sleep(2000);
		
//	    Entering Email Address
		
		System.out.println("Entering Email Address");
		
		waitForClickabilityOf(topicEmailId);
		
		driver.findElement(topicEmailId).clear();
		
		driver.findElement(topicEmailId).sendKeys("genius@yopmail.com");
		
//	    Clicking On Manage Topic
		
		System.out.println("Clicking On Manage Sub Topic");
		
		waitForClickabilityOf(manageSubTopic);
		
		driver.findElement(manageSubTopic).click();
		
		Thread.sleep(2000);
		
//	    Selecting Topic 
		
		System.out.println("Selecting Topic");
		
		waitForClickabilityOf(selectTopic);
		
		Select TopicDropDown = new Select(driver.findElement(selectTopic));
		
		TopicDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//	    Entering Topic Name
		
		System.out.println("Entering Sub Topic Name");
		
		waitForClickabilityOf(subTopicName);
		
		driver.findElement(subTopicName).clear();
		
		driver.findElement(subTopicName).sendKeys("Hybrid Framework");
		
//	    Entering Email Address
		
		System.out.println("Entering Email Address");
		
		waitForClickabilityOf(subTopicEmail);
		
		driver.findElement(subTopicEmail).clear();
		
		driver.findElement(subTopicEmail).sendKeys("genius@yopmail.com");
		
//	    Clicking on Add Sub Topic Button
		
		System.out.println("Clicking on Add Sub Topic Button");
		
		waitForClickabilityOf(addSubTopicBtn);
		
		driver.findElement(addSubTopicBtn).click();
		
//	    Clicking On Close Button
		
		System.out.println("Clicking On Close Button");
		
		waitForClickabilityOf(addSubTopicCloseBtn);
		
		driver.findElement(addSubTopicCloseBtn).click();
		
		Thread.sleep(2000);
			
//	    Entering Genius Bar tab Name
		
		System.out.println("Entering Genius Bar tab Name");
		
		waitForClickabilityOf(geniusBarTabName);
		
		driver.findElement(geniusBarTabName).clear();
		
		driver.findElement(geniusBarTabName).sendKeys("Framework Bar Tab");
		
		Thread.sleep(2000);
		
//	    Entering Meeting Description 1 Level
		
		System.out.println("Entering Meeting Description 1 Level");
		
		waitForClickabilityOf(descriptionLabel1);
		
		driver.findElement(descriptionLabel1).clear();
		
		driver.findElement(descriptionLabel1).sendKeys("We will discuss about all kinds of Framework");
		
		Thread.sleep(2000);
	
//	    Entering Meeting Description 2 Level
		
		System.out.println("Entering Meeting Description 2 Level");
		
		waitForClickabilityOf(descriptionLabel2);
		
		driver.findElement(descriptionLabel2).clear();
		
		driver.findElement(descriptionLabel2).sendKeys("We will discuss more about Framework Creation");
		
		Thread.sleep(2000);
		
//	    Entering Activation Date Range from
		
//		System.out.println("Selecting the Activation Date Range from");
//		
//		waitForClickabilityOf(dateRangeFrom);
//		
//		driver.findElement(dateRangeFrom).click();
//		
//		driver.findElement(dateRangeFrom).clear();
//				
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date Range from
//		
//		waitForClickabilityOf(gotoNextMonth);
//		
//		driver.findElement(gotoNextMonth).click();
//		
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date as 5th of Next month
//		
//		waitForClickabilityOf(select5thOfNextMonth);
//		
//		driver.findElement(select5thOfNextMonth).click();
//		
//		Thread.sleep(2000);
//		
////	    Entering Activation Date Range to
//		
//		System.out.println("Selecting the Activation Date Range to");
//		
//		waitForClickabilityOf(dateRangeTo);
//		
//		driver.findElement(dateRangeTo).click();
//		
//		driver.findElement(dateRangeTo).clear();
//		
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date Range from
//		
//		waitForClickabilityOf(gotoNextMonth);
//		
//		driver.findElement(gotoNextMonth).click();
//		
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date as 5th of Next month
//		
//		waitForClickabilityOf(select5thOfNextMonth);
//		
//		driver.findElement(select5thOfNextMonth).click();
//		
//		Thread.sleep(2000);
		
//	    Entering Activation Time Range from
		
		System.out.println("Entering Activation Time Range from");
		
		waitForClickabilityOf(timeRangeFrom);
		
		driver.findElement(timeRangeFrom).clear();
		
		driver.findElement(timeRangeFrom).sendKeys("10:00 AM");
		
		Thread.sleep(2000);
		
//	    Entering Activation Time Range to
		
		System.out.println("Entering Activation Time Range to");
		
		waitForClickabilityOf(timeRangeTo);
		
		driver.findElement(timeRangeTo).clear();
		
		driver.findElement(timeRangeTo).sendKeys("12:00 PM");
		
		Thread.sleep(2000);
		
//	    Selecting Time Slot Difference  
		
		System.out.println("Selecting Time Slot Difference");
		
		waitForClickabilityOf(slotDifference);
		
		Select TimeSlots = new Select(driver.findElement(slotDifference));
		
		TimeSlots.selectByIndex(1);
		
		Thread.sleep(2000);
		
//	    Entering Label for Poll
		
		System.out.println("Entering Label for Poll");
		
		waitForClickabilityOf(labelForPoll);
		
		driver.findElement(labelForPoll).clear();
		
		driver.findElement(labelForPoll).sendKeys("Genius Meeting");
		
		Thread.sleep(2000);
		
//	    Entering Push Poll Message
		
		System.out.println("Entering Push Poll Message");
		
		waitForClickabilityOf(pushPollMsg);
		
		driver.findElement(pushPollMsg).clear();
		
		driver.findElement(pushPollMsg).sendKeys("Please share your valuable feed back");
		
		Thread.sleep(2000);
		
//	    Clicking on save Button to create the Genius Meeitngs
		
		System.out.println("Clicking on save Button to create the Genius Meeitngs");
		
		waitForClickabilityOf(saveButton);
		
		driver.findElement(saveButton).click();
		
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
//			System.out.println(e.getMessage());
			
		}
				
		
		return new ConfigureMeetings(driver);
		
	}
	
	public ConfigureMeetings configOneToOneMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//	    Enable Setup Meetings
		
		System.out.println("Enabling Setup Meetings");
		
		waitForClickabilityOf(enableMeetings);
		
		boolean EnableMeetings = driver.findElement(enableMeetings).isSelected();
		
		System.out.println("Enabled Meeting Configure : "+EnableMeetings);
		
		if (EnableMeetings==true) {
									
		} else {
			
			driver.findElement(enableMeetings).click();
			
		}
		
		Thread.sleep(2000);
		
//	    Disable Setup Genius Bar
		
		System.out.println("Disabling Setup Genius Bar");
		
		waitForClickabilityOf(disableGeniusBar);
		
		boolean DisableGeniusBar = driver.findElement(disableGeniusBar).isSelected();
		
		System.out.println("Disabled Genius Meeting Configure : "+DisableGeniusBar);
		
		if (DisableGeniusBar==false) {
			
			driver.findElement(disableGeniusBar).click();
						
		} else {
			
		}
		
		Thread.sleep(2000);
		
//	    Enable Setup One to One Meetings
		
		System.out.println("Enable Setup One to One Meetings");
		
		waitForClickabilityOf(enableOneToOne);
		
		boolean EnableOneToOne = driver.findElement(enableOneToOne).isSelected();
		
		System.out.println("Enabled One To One Meeting Configure : "+EnableOneToOne);
		
		if (EnableOneToOne==false) {
			
			driver.findElement(enableOneToOne).click();
						
		} else {
			
		}
		
		Thread.sleep(2000);
		
//	    Manage Location Type
		
		System.out.println("Clicking On Manage Location Type");
		
		waitForClickabilityOf(manageLocationType);
		
		driver.findElement(manageLocationType).click();
		
		Thread.sleep(2000);
		
//	    Add/Edit Location Type
		
		System.out.println("Entering Location Type");
		
		waitForClickabilityOf(locationType);
		
		driver.findElement(locationType).clear();
		
		driver.findElement(locationType).sendKeys("One To One");
		
//	    Add Location Type Button
		
		System.out.println("Clicking On Add Location Type Button");
		
		waitForClickabilityOf(addLocationTypeBtn);
		
		driver.findElement(addLocationTypeBtn).click();
		
//	    Close Button
		
		System.out.println("Clicking On Close Button");
		
		waitForClickabilityOf(closeLocationType);
		
		driver.findElement(closeLocationType).click();
		
//	    Manage Location 
		
		System.out.println("Clicking On Manage Location");
		
		waitForClickabilityOf(manageLocation);
		
		driver.findElement(manageLocation).click();
		
		Thread.sleep(2000);
		
//	    Add/Edit Location 
		
		System.out.println("Entering Location Name");
		
		waitForClickabilityOf(locationName);
		
		driver.findElement(locationName).clear();
		
		driver.findElement(locationName).sendKeys("General Room");
		
//	    Selecting Location Type 
		
		System.out.println("Selecting Location Type");
		
		waitForClickabilityOf(locationTypeDropDown);
		
		Select LocationDropDown = new Select(driver.findElement(locationTypeDropDown));
		
		LocationDropDown.selectByIndex(2);
		
		Thread.sleep(2000);
		
//	    Entering Location Capacity
		
		System.out.println("Entering Location Capacity");
		
		waitForClickabilityOf(locationCapacity);
		
		driver.findElement(locationCapacity).clear();
		
		driver.findElement(locationCapacity).sendKeys("1");
		
//	    Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(locationSavebtn);
		
		driver.findElement(locationSavebtn).click();
		
//	    Clicking On Close Button
		
		System.out.println("Clicking On Close Button");
		
		waitForClickabilityOf(addLocationClosebtn);
		
		driver.findElement(addLocationClosebtn).click();
		
		Thread.sleep(2000);
					
//	    Entering Activation Date Range from
		
//		System.out.println("Selecting the Activation Date Range from");
//		
//		waitForClickabilityOf(dateRangeFrom1);
//		
//		driver.findElement(dateRangeFrom1).click();
//		
//		driver.findElement(dateRangeFrom1).clear();
//				
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date Range from
//		
//		waitForClickabilityOf(gotoNextMonth);
//		
//		driver.findElement(gotoNextMonth).click();
//		
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date as 5th of Next month
//		
//		waitForClickabilityOf(select5thOfNextMonth);
//		
//		driver.findElement(select5thOfNextMonth).click();
//		
//		Thread.sleep(2000);
//		
////	    Entering Activation Date Range to
//		
//		System.out.println("Selecting the Activation Date Range to");
//		
//		waitForClickabilityOf(dateRangeTo1);
//		
//		driver.findElement(dateRangeTo1).click();
//		
//		driver.findElement(dateRangeTo1).clear();
//		
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date Range from
//		
//		waitForClickabilityOf(gotoNextMonth);
//		
//		driver.findElement(gotoNextMonth).click();
//		
//		Thread.sleep(2000);
//		
////	    Selecting the Activation Date as 5th of Next month
//		
//		waitForClickabilityOf(select5thOfNextMonth);
//		
//		driver.findElement(select5thOfNextMonth).click();
//		
//		Thread.sleep(2000);
		
//	    Entering Activation Time Range from
		
		System.out.println("Entering Activation Time Range from");
		
		waitForClickabilityOf(timeRangeFrom1);
		
		driver.findElement(timeRangeFrom1).clear();
		
		driver.findElement(timeRangeFrom1).sendKeys("10:00 AM");
		
		Thread.sleep(2000);
		
//	    Entering Activation Time Range to
		
		System.out.println("Entering Activation Time Range to");
		
		waitForClickabilityOf(timeRangeTo1);
		
		driver.findElement(timeRangeTo1).clear();
		
		driver.findElement(timeRangeTo1).sendKeys("12:00 PM");
		
		Thread.sleep(2000);
		
//	    Checking the Time Slot
		
		System.out.println("Checking the Time Slot");
		
		waitForClickabilityOf(slot1CheckBox);
		
		driver.findElement(slot1CheckBox).click();
				
//	    Selecting Time Slot Difference  
		
		System.out.println("Selecting Time Slot Difference");
		
		waitForClickabilityOf(slotDifference1);
		
		Select TimeSlots = new Select(driver.findElement(slotDifference1));
		
		TimeSlots.selectByIndex(4);
		
		Thread.sleep(2000);
		
//	    Entering Label for Poll
		
		System.out.println("Entering Label for Poll");
		
		waitForClickabilityOf(labelForPoll1);
		
		driver.findElement(labelForPoll1).clear();
		
		driver.findElement(labelForPoll1).sendKeys("One To One Meeting");
		
		Thread.sleep(2000);
		
//	    Entering Push Poll Message
		
		System.out.println("Entering Push Poll Message");
		
		waitForClickabilityOf(pushPollMsg1);
		
		driver.findElement(pushPollMsg1).clear();
		
		driver.findElement(pushPollMsg1).sendKeys("Please share your valuable feed back");
		
		Thread.sleep(2000);
		
//	    Entering Push Poll Message
		
		System.out.println("Clicking on save Button to create the Genius Meeitngs");
		
		waitForClickabilityOf(saveButton);
		
		driver.findElement(saveButton).click();
		
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
//			System.out.println(e.getMessage());
			
		}
		
		
		return new ConfigureMeetings(driver);
		
	}

}
