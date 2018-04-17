package com.EventMeetings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class ExpertTopicMapping extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnMeetings = By.xpath("//*[@id='meetingmodule']");
	
	By expertTopicMapping = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Expert Topic Mapping')]");
	
	By topicName = By.xpath("//*[@id='ContentPlaceHolder1_ddlTopic']");
	
	By expert1stUser = By.xpath("//*[@id='ContentPlaceHolder1_gvExpertUser_chkExpert_0']");
	
	By moveExpertToRight = By.xpath("//*[@id='ContentPlaceHolder1_imgRightExpert']");
	
	By selectUsers = By.xpath("//*[@id='ContentPlaceHolder1_rbtnaudience_1']");
	
	By userGroup1st = By.xpath("//*[@id='ContentPlaceHolder1_gvUserGroup_chkUserGroup_0']");
	
	By select1stUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_0']");
	
	By select2ndUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_1']");
	
	By moveUserToRight = By.xpath("//*[@id='ContentPlaceHolder1_imgRight']");
	
	By selectAllUsers = By.xpath("//*[@id='ContentPlaceHolder1_rbtnaudience_0']");
	
	By saveButton = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
		
	
	

	public ExpertTopicMapping(WebDriver driver) {
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

//		Clicking on Live Event
		
		System.out.println("Clicking on Meetings");
		
		waitForClickabilityOf(clickOnMeetings);
		
		driver.findElement(clickOnMeetings).click();
		
//		Clicking on Poll/Vote
		
		System.out.println("Clicking on Configure Meetings");
		
		waitForClickabilityOf(expertTopicMapping);
		
		driver.findElement(expertTopicMapping).click();
		
	}
	
	public ExpertTopicMapping addExpertTopicMapping(String EmailId, String Password,String EventFullName,String UserType) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//	    Selecting Topic Name
		
		System.out.println("Selecting Topic Name");
				
		waitForClickabilityOf(topicName);
		
		Select TopicDropDown = new Select(driver.findElement(topicName));
		
		TopicDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//	    Selecting Expert User
		
		System.out.println("Selecting Expert User");
		
		waitForClickabilityOf(expert1stUser);
		
		driver.findElement(expert1stUser).click();
		
		Thread.sleep(2000);
		
//	    Moving Expert User to Right Side
		
		System.out.println("Moving Expert User to Right Side");
		
		waitForClickabilityOf(moveExpertToRight);
		
		driver.findElement(moveExpertToRight).click();
		
		Thread.sleep(2000);
		
//		Condition to select User Type
		
		if (UserType.equals("Group")) {
			
//		    Clicking On Select User
			
			System.out.println("Clicking On Select User");
			
			waitForClickabilityOf(selectUsers);
			
			boolean SelectUsers = driver.findElement(selectUsers).isSelected();
						
			if (SelectUsers==false) {
				
				driver.findElement(selectUsers).click();
							
			} else {
				
			}
			
			System.out.println("Select Users Radio Button Selected : "+SelectUsers);
			
			Thread.sleep(2000);
			
//		    Select User Group
			
			System.out.println("Select User Group");
			
			waitForClickabilityOf(userGroup1st);
			
			driver.findElement(userGroup1st).click();
			
			Thread.sleep(2000);
			
//		    Clicking On Save to Map The Topic
			
			System.out.println("Clicking On Save to Map The Topic");
			
			waitForClickabilityOf(saveButton);
			
			driver.findElement(saveButton).click();
			
			Thread.sleep(2000);
			
			try {
				
				popUpHandeling();
				
			} catch (Exception e) {
				
			}
				
			
		} else if (UserType.equals("User")) {
			
//		    Clicking On Select User
			
			System.out.println("Clicking On Select User");
			
			waitForClickabilityOf(selectUsers);
			
			boolean SelectUsers = driver.findElement(selectUsers).isSelected();
						
			if (SelectUsers==false) {
				
				driver.findElement(selectUsers).click();
							
			} else {
				
			}
			
			System.out.println("Select Users Radio Button Selected : "+SelectUsers);
			
			Thread.sleep(2000);
			
//		    Select 1st User
			
			System.out.println("Select 1st User");
			
			waitForClickabilityOf(select1stUser);
			
			driver.findElement(select1stUser).click();
			
			Thread.sleep(2000);
			
//		    Select 2nd User
			
			System.out.println("Select 2nd User");
			
			waitForClickabilityOf(select2ndUser);
			
			driver.findElement(select2ndUser).click();
			
//		    Moving User to Right Side
			
			System.out.println("Moving User to Right Side");
			
			waitForClickabilityOf(moveUserToRight);
			
			driver.findElement(moveUserToRight).click();
			
			Thread.sleep(2000);
			
//		    Clicking On Save to Map The Topic
			
			System.out.println("Clicking On Save to Map The Topic");
			
			waitForClickabilityOf(saveButton);
			
			driver.findElement(saveButton).click();
			
			Thread.sleep(2000);
			
			try {
				
				popUpHandeling();
				
			} catch (Exception e) {
				
			}
			
		} else{
			
//		    Selecting all user if not Selected
			
			System.out.println("Selecting All User");
			
			waitForClickabilityOf(selectAllUsers);
			
			boolean SelectAllUsers = driver.findElement(selectAllUsers).isSelected();
						
			if (SelectAllUsers==false) {
				
				driver.findElement(selectAllUsers).click();
							
			} else {
				
			}
			
			Thread.sleep(2000);
			
//		    Clicking On Save to Map The Topic
			
			System.out.println("Clicking On Save to Map The Topic");
			
			waitForClickabilityOf(saveButton);
			
			driver.findElement(saveButton).click();
			
			Thread.sleep(2000);
			
			try {
				
				popUpHandeling();
				
			} catch (Exception e) {
				
			}

		}
		
		
		return new ExpertTopicMapping(driver);
		
	}

}
