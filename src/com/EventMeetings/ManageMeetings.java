package com.EventMeetings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class ManageMeetings extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnMeetings = By.xpath("//*[@id='meetingmodule']");
	
	By manageMeetings = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Manage Meetings')]");
	
//	General Meeting Elements
	
	By oneToOneView = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_imgview_0']");
	
	By oneToOneTitle = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_lblMeetingTitle_0']");
	
	By oneToOneTitle1 = By.xpath("//*[@id='ContentPlaceHolder1_txtTitle']");
	
	By oneAccept = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_imgaccept_0']");
	
	By oneAcceptStatus = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_lblStatus_0']");
	
	By acceptMailYesBtn = By.xpath("//*[@id='ContentPlaceHolder1_AlertActionYesimgaccept']");
	
	By viewBackBtn = By.xpath("//*[@id='ContentPlaceHolder1_Back']");
		
	By oneToOneCancel = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_imgcan_0']");
	
	By expandMailBtn = By.xpath("//*[@id='ContentPlaceHolder1_imgToChange']");
	
	By emailToRqstdAttendee = By.xpath("//a[@id='ContentPlaceHolder1_A2']");
	
	By rejectMailYesBtn = By.xpath("//*[@id='ContentPlaceHolder1_AlertActionYesimgcan']");
	
	By oneReschedule = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_imgresudule_0']");
	
	By oneTime = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_lblTime_0']");
	
	By oneStartTime = By.xpath("//*[@id='ContentPlaceHolder1_txtFromTime']");
	
	By oneEndTime = By.xpath("//*[@id='ContentPlaceHolder1_txtToTime']");
	
	By oneDelete = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_imgDelpractice_0']");
	
	By SaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnEditSave']");
	
//	Genius Tab Elements
	
	By geniusTab = By.xpath("//a[@id='ContentPlaceHolder1_OneToOneLab']");
	
	By genView = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_Geniusimgview_0']");
	
	By genTitle = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_lblTopicName_0']");
	
	By genTitle1 = By.xpath("//*[@id='ContentPlaceHolder1_ddlTopic']");
	
	By genAccept = By.xpath("//*[@id='ContentPlaceHolder1_gvMeeting_imgaccept_0']");
	
	By genAcceptStatus = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_GeniuslblStatus_0']");
	
	By acceptGenYesBtn = By.xpath("//*[@id='ContentPlaceHolder1_AlertActionYesGeniusimgaccept']");
			
	By genCancel = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_Geniusimgcan_0']");
	
	By expandMeetingBtn = By.xpath("//*[@id='ContentPlaceHolder1_imgToChange']");
	
	By emailToExpert = By.xpath("//a[@id='ContentPlaceHolder1_A2']");
	
	By rejectGenYesBtn = By.xpath("//*[@id='ContentPlaceHolder1_AlertActionYesGeniusimgaccept']");
	
	By genReschedule = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_Geniusimgresudule_0']");
	
	By genTime = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_GeniuslblTime_0']");
	
	By rescheduleTime = By.xpath("//a[@id='TimeLi5']");
	
	By rescheduleTime1 = By.xpath("//a[@id='TimeLi6']");
	
	By rescheduleTime2 = By.xpath("//a[@id='TimeLi6']");
	
	By genDelete = By.xpath("//*[@id='ContentPlaceHolder1_gvGenuisReport_GeniusimgDelpractice_0']");
	
		

	public ManageMeetings(WebDriver driver) {
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
		
		waitForClickabilityOf(manageMeetings);
		
		driver.findElement(manageMeetings).click();
		
	}
	
//	1 General Meeting View
	
	public ManageMeetings viewGenMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Storing the One To One Meeting Name
		
		waitForClickabilityOf(oneToOneTitle);
		
		String Title  = driver.findElement(oneToOneTitle).getText();
		
		System.out.println(Title);
		
		Thread.sleep(2000);
		
//		Clicking on View Option
		
		System.out.println("Clicking on View Option");
		
		waitForClickabilityOf(oneToOneView);
		
		driver.findElement(oneToOneView).click();
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Name
		
		waitForClickabilityOf(oneToOneTitle1);
		
		String Title1  = driver.findElement(oneToOneTitle1).getText();
		
		System.out.println(Title1);
		
		Thread.sleep(2000);
		
//		Clicking on Back Button
		
		System.out.println("Clicking on Back Button");
		
		waitForClickabilityOf(viewBackBtn);
		
		driver.findElement(viewBackBtn).click();
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Title.equals(Title1)) {
			
			System.out.println("Sccessfully Viewd Meeting Details");
			
		} else {
			
			System.out.println("Failed to view the Meeting Details");

		}
			
		
		return new ManageMeetings(driver);
		
	}
	
//	2 General Meeting Accept
	
	public ManageMeetings acceptGenMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(oneAcceptStatus);
		
		String Status  = driver.findElement(oneAcceptStatus).getText();
		
		System.out.println(Status);
		
		Thread.sleep(2000);
		
//		Clicking on Accept Option
		
		System.out.println("Clicking on Accept Option");
		
		waitForClickabilityOf(oneAccept);
		
		driver.findElement(oneAccept).click();
		
		Thread.sleep(2000);
		
//		Clicking on Accept Meeting Expand Option
		
		System.out.println("Clicking on Accept Meeting Expand Option");
		
		waitForClickabilityOf(expandMailBtn);
		
		driver.findElement(expandMailBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking on Accept Meeting Expand Option
		
		System.out.println("Clicking on Attendee Mail Option");
		
		waitForClickabilityOf(emailToRqstdAttendee);
		
		driver.findElement(emailToRqstdAttendee).click();
		
		Thread.sleep(2000);
		
//		Clicking on Yes to Accept
		
		System.out.println("Clicking on Yes to Accept");
		
		waitForClickabilityOf(acceptMailYesBtn);
		
		driver.findElement(acceptMailYesBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Status
		
//		waitForClickabilityOf(oneAcceptStatus);
		
		String Status1  = driver.findElement(oneAcceptStatus).getText();
		
		System.out.println(Status1);
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Status.equals(Status1)) {
			
			System.out.println("Failed to Accept Meeting Status");
						
		} else {
			
			System.out.println("Sccessfully Accepted Meeting Status");

		}
				
		return new ManageMeetings(driver);
		
	}
	
//	3 General Meeting Reschedule
	
	public ManageMeetings rescheduleGenMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(oneTime);
		
		String Time  = driver.findElement(oneTime).getText();
		
		System.out.println(Time);
		
		Thread.sleep(2000);
		
//		Clicking on Reschedule Option
		
		System.out.println("Clicking on Reschedule Option");
		
		waitForClickabilityOf(oneReschedule);
		
		driver.findElement(oneReschedule).click();
		
//		Clicking On Start Time Field
		
		System.out.println("Clicking On Start Time Field");
		
		waitForClickabilityOf(oneStartTime);
		
		WebElement StartTime = driver.findElement(oneStartTime);
		
		StartTime.click();
		
//		Pressing Enter Button 
		
		StartTime.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Clicking On End Time Field
		
		System.out.println("Clicking On End Time Field");
		
		waitForClickabilityOf(oneEndTime);
		
		WebElement EndTime = driver.findElement(oneEndTime);
		
		EndTime.click();
		
//		Pressing Enter Button 
		
		EndTime.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Clicking on Save Button to Reschedule
		
		System.out.println("Clicking on Save Button to Reschedule");
		
		waitForClickabilityOf(SaveBtn);
		
		driver.findElement(SaveBtn).click();
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(oneTime);
		
		String Time1  = driver.findElement(oneTime).getText();
		
		System.out.println(Time1);
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Time.equals(Time1)) {
			
			System.out.println("Failed to Reschedule Meeting");
			
		} else {
			
			System.out.println("Sccessfully Rescheduled the Meeting");

		}
		
		
		return new ManageMeetings(driver);
		
	}
	
//	4 General Meeting Cancel
	
	public ManageMeetings cancelGenMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(oneAcceptStatus);
		
		String Status  = driver.findElement(oneAcceptStatus).getText();
		
		System.out.println(Status);
		
		Thread.sleep(2000);
		
//		Clicking on Accept Option
		
		System.out.println("Clicking on Cancel Option");
		
		waitForClickabilityOf(oneToOneCancel);
		
		driver.findElement(oneToOneCancel).click();
		
		Thread.sleep(2000);
		
//		Clicking on Reject Meeting Expand Option
		
		System.out.println("Clicking on Reject Meeting Expand Option");
		
		waitForClickabilityOf(expandMailBtn);
		
		driver.findElement(expandMailBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking on Yes to Accept
		
		System.out.println("Clicking on Yes to Accept");
		
		waitForClickabilityOf(acceptMailYesBtn);
		
		driver.findElement(acceptMailYesBtn).click();
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(oneAcceptStatus);
		
		String Status1  = driver.findElement(oneAcceptStatus).getText();
		
		System.out.println(Status1);
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Status.equals(Status1)) {
			
			System.out.println("Sccessfully Cancelled Meeting Status");
			
		} else {
			
			System.out.println("Failed to Cancel Meeting Status");

		}
		
		
		return new ManageMeetings(driver);
		
	}
	
//	5 General Meeting Delete
	
	public ManageMeetings deleteGenMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Clicking on Delete Option
		
		System.out.println("Clicking on Delete Option");
		
		waitForClickabilityOf(oneDelete);
		
		driver.findElement(oneDelete).click();
		
//		Clicking on Yes to Delete
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//		 Searching for The Meeting
		
		boolean GenMeeting = driver.findElement(oneDelete).isDisplayed();
		
//		Verifying the Title
		
		if (GenMeeting==false) {
			
			System.out.println("Sccessfully Deleted the Meeting");
			
		} else {
			
			System.out.println("Failed to Delete the Meeting");

		}
		
		
		return new ManageMeetings(driver);
		
	}
	
//	6 General Meeting View
	
	public ManageMeetings viewGeniusMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Clicking on Genius Meeting Tab
		
		System.out.println("Clicking on Genius Meeting Tab");
		
		waitForClickabilityOf(geniusTab);
		
		driver.findElement(geniusTab).click();
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Name
		
		waitForClickabilityOf(genTitle);
		
		String Title  = driver.findElement(genTitle).getText();
		
		System.out.println(Title);
		
		Thread.sleep(2000);
		
//		Clicking on View Option
		
		System.out.println("Clicking on View Option");
		
		waitForClickabilityOf(genView);
		
		driver.findElement(genView).click();
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Name
		
		waitForClickabilityOf(genTitle1);
		
		String Title1  = driver.findElement(genTitle1).getText();
		
		System.out.println(Title1);
		
		Thread.sleep(2000);
		
//		Clicking on Back Button
		
		System.out.println("Clicking on Back Button");
		
		waitForClickabilityOf(viewBackBtn);
		
		driver.findElement(viewBackBtn).click();
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Title.equals(Title1)) {
			
			System.out.println("Sccessfully Viewd"+ Title +"Meeting Details");
			
		} else {
			
			System.out.println("Failed to view the"+ Title +"Meeting Details");

		}
			
		
		return new ManageMeetings(driver);
		
	}
	
//	7 General Meeting Accept
	
	public ManageMeetings acceptGeniusMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Genius Meeting Tab
		
		System.out.println("Clicking on Genius Meeting Tab");
		
		waitForClickabilityOf(geniusTab);
		
		driver.findElement(geniusTab).click();
				
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(genAcceptStatus);
		
		String Status  = driver.findElement(genAcceptStatus).getText();
		
		System.out.println(Status);
		
		Thread.sleep(2000);
		
//		Clicking on Accept Option
		
		System.out.println("Clicking on Accept Option");
		
		waitForClickabilityOf(genAccept);
		
		driver.findElement(genAccept).click();
		
		Thread.sleep(2000);
		
//		Clicking on Accept Meeting Expand Option
		
		System.out.println("Clicking on Accept Meeting Expand Option");
		
		waitForClickabilityOf(expandMeetingBtn);
		
		driver.findElement(expandMeetingBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking on Yes to Accept
		
		System.out.println("Clicking on Yes to Accept");
		
		waitForClickabilityOf(acceptMailYesBtn);
		
		driver.findElement(acceptMailYesBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(oneAcceptStatus);
		
		String Status1  = driver.findElement(oneAcceptStatus).getText();
		
		System.out.println(Status1);
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Status.equals(Status1)) {
			
			System.out.println("Failed to Accept Meeting Status");
			
		} else {
			
			System.out.println("Sccessfully Accepted Meeting Status");

		}
		
		
		return new ManageMeetings(driver);
		
	}
	
//	8 General Meeting Reschedule
	
	public ManageMeetings rescheduleGeniusMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Genius Meeting Tab
		
		System.out.println("Clicking on Genius Meeting Tab");
		
		waitForClickabilityOf(geniusTab);
		
		driver.findElement(geniusTab).click();
				
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(genTime);
		
		String Time  = driver.findElement(genTime).getText();
		
		System.out.println(Time);
		
		Thread.sleep(2000);
		
//		Clicking on Reschedule Option
		
		System.out.println("Clicking on Reschedule Option");
		
		waitForClickabilityOf(genReschedule);
		
		driver.findElement(genReschedule).click();
		
//		Clicking On Start Time Field
		
		System.out.println("Clicking On New Time to Reschedule");
		
		boolean SelectedTime = driver.findElement(rescheduleTime).isSelected();
		
		if (SelectedTime==false) {
			
			driver.findElement(rescheduleTime).click();
			
		} else {
			
			boolean SelectedTime1 = driver.findElement(rescheduleTime1).isSelected();
			
			if (SelectedTime1==false) {
				
				driver.findElement(rescheduleTime1).click();
				
			} else {

			}

		}
		
		
//		Clicking on Save Button to Reschedule
		
		System.out.println("Clicking on Save Button to Reschedule");
		
		waitForClickabilityOf(SaveBtn);
		
		driver.findElement(SaveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(genTime);
		
		String Time1  = driver.findElement(genTime).getText();
		
		System.out.println(Time1);
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Time.equals(Time1)) {
			
			System.out.println("Sccessfully Rescheduled the Meeting");
			
		} else {
			
			System.out.println("Failed to Reschedule Meeting");

		}
		
		
		return new ManageMeetings(driver);
		
	}
	
//	9 General Meeting Cancel
	
	public ManageMeetings cancelGeniusMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Genius Meeting Tab
		
		System.out.println("Clicking on Genius Meeting Tab");
		
		waitForClickabilityOf(geniusTab);
		
		driver.findElement(geniusTab).click();
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(genAcceptStatus);
		
		String Status  = driver.findElement(genAcceptStatus).getText();
		
		System.out.println(Status);
		
		Thread.sleep(2000);
		
//		Clicking on Accept Option
		
		System.out.println("Clicking on Cancel Option");
		
		waitForClickabilityOf(genCancel);
		
		driver.findElement(genCancel).click();
		
		Thread.sleep(2000);
		
//		Clicking on Reject Meeting Expand Option
		
		System.out.println("Clicking on Reject Meeting Expand Option");
		
		waitForClickabilityOf(expandMeetingBtn);
		
		driver.findElement(expandMeetingBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking on Yes to Accept
		
		System.out.println("Clicking on Yes to Cancel");
		
		waitForClickabilityOf(acceptGenYesBtn);
		
		driver.findElement(acceptGenYesBtn).click();
		
		Thread.sleep(2000);
		
//		Storing the One To One Meeting Status
		
		waitForClickabilityOf(genAcceptStatus);
		
		String Status1  = driver.findElement(genAcceptStatus).getText();
		
		System.out.println(Status1);
		
		Thread.sleep(2000);
		
//		Verifying the Title
		
		if (Status.equals(Status1)) {
			
			System.out.println("Sccessfully Cancelled Meeting Status");
			
		} else {
			
			System.out.println("Failed to Cancel Meeting Status");

		}
		
		
		return new ManageMeetings(driver);
		
	}
	
//	10 General Meeting Delete
	
	public ManageMeetings deleteGeniusMeeting(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Genius Meeting Tab
		
		System.out.println("Clicking on Genius Meeting Tab");
		
		waitForClickabilityOf(geniusTab);
		
		driver.findElement(geniusTab).click();
		
//		Clicking on Delete Option
		
		System.out.println("Clicking on Delete Option");
		
		waitForClickabilityOf(genDelete);
		
		driver.findElement(genDelete).click();
		
//		Clicking on Yes to Delete
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//		 Searching for The Meeting
		
		boolean GenMeeting = driver.findElement(genDelete).isDisplayed();
		
//		Verifying the Title
		
		if (GenMeeting==false) {
			
			System.out.println("Sccessfully Deleted the Meeting");
			
		} else {
			
			System.out.println("Failed to Delete the Meeting");

		}
		
		
		return new ManageMeetings(driver);
		
	}
	


}
