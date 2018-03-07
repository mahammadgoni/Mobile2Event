package com.EventAgendaSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddAttendees extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");
	
	By clickOnAttendees = By.xpath("//*[@href='MapUsersWithRP.aspx'][contains(text(),'Attendees')]");
	
	By clickOnMapGroups = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='GroupList.aspx']");
	
	By addGroup = By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']");
	
	By groupName = By.xpath("//*[@id='ContentPlaceHolder1_txtGroupName']");
	
	By showOnMobile = By.xpath("//*[@id='ContentPlaceHolder1_SOM']");
	
	By gUserCheckBox1st = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_0']");
	
	By gUserCheckBox2nd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_1']");
	
	By moveUserRightBtn = By.xpath("//*[@id='ContentPlaceHolder1_imgRight']");
	
	By groupSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By groupCount = By.xpath("//*[@id='ContentPlaceHolder1_gvResources']");
		
	By downloadTemplate = By.xpath("//*[@id='ContentPlaceHolder1_btnDataTamplate']");
	
	By exportUnMapped = By.xpath("//*[@id='ContentPlaceHolder1_btnExportNotMapped']");
	
	By exportMapped = By.xpath("//*[@id='ContentPlaceHolder1_btnExport']");
	
	By importAttendees = By.xpath("//*[@id='ContentPlaceHolder1_btnImport']");
	
	By attendeeVisibility = By.xpath("//*[@id='ContentPlaceHolder1_btnAttendeeMap']");
	
	By userCheckBox1st = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_Chkhideattendee_0']");
	
	By userCheckBox2nd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_Chkhideattendee_1']");
	
	By visibilityOffSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");
	
	By downloadQR = By.xpath("//*[@id='ContentPlaceHolder1_btnDownloadQR']");
	
	By dimension = By.xpath("//*[@id='ContentPlaceHolder1_txtQRwidth']");
	
	By generateQR = By.xpath("//*[@id='ContentPlaceHolder1_btGenerateQR']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By clickOnMapped = By.xpath("//*[@id='ContentPlaceHolder1_ddlIsMapped']");
	
	By existingUsers = By.xpath("//*[@class='blue']");
	
	By appCheckIn1st = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_0_1_0']");
	
	By appUser1st = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_0_2_0']");
	
	By appCheckIn2nd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_1_1_1']");
	
	By appUser2nd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_1_2_1']");
	
	By chatbot2nd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_1_3_1']");
	
	By appCheckIn3rd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_2_1_2']");
	
	By appUser3rd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_2_2_2']");
	
	By chatbot3rd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_2_3_2']");
	
	By expertUser3rd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_2_7_2']");

	
	
	public AddAttendees(WebDriver driver) {
		super(driver);
		
	}
	
//	Download QR and Click on all Links Methods
	
	public AddAttendees downloadQRCode(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
//		Clicking on Download Template
		
		System.out.println("Clicking on Download Template");
		
		waitForClickabilityOf(downloadTemplate);
		
		driver.findElement(downloadTemplate).click();
		
//		Clicking on Export Un Mapped
		
		System.out.println("Clicking on Export Un Mapped");
		
		waitForClickabilityOf(exportUnMapped);
		
		driver.findElement(exportUnMapped).click();
		
//		Clicking on Export Mapped
		
		System.out.println("Clicking on Export Mapped");
		
		waitForClickabilityOf(exportMapped);
		
		driver.findElement(exportMapped).click();
		
//		Clicking on Download QR
		
		System.out.println("Clicking on Download QR");
		
		waitForClickabilityOf(downloadQR);
		
		driver.findElement(downloadQR).click();
		
//		Entering the Dimension
		
		System.out.println("Entering the Dimension as : 400 px");
		
		waitForClickabilityOf(dimension);
		
		driver.findElement(dimension).sendKeys("400");
		
//		Clicking on Generate QR
		
		System.out.println("Clicking on Generate QR");
		
		waitForClickabilityOf(generateQR);
		
		driver.findElement(generateQR).click();
		
//		Pop up Handeling 
		
		try {
			popUpHandeling();
		} catch (Exception e) {
			
		}
		
		System.out.println("Succesfully Clicked On All Links");
		
		
		return new AddAttendees(driver);
		
	}

//	Map Attendees to User Roles Methods 
	
	public AddAttendees mapUserRoles(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
//		Selecting Not mapped Users
		
		System.out.println("Selecting Not Mapped Users");
		
		waitForClickabilityOf(clickOnMapped);
		
		Select UnMappedDropDown = new Select(driver.findElement(clickOnMapped));
		
		UnMappedDropDown.selectByIndex(2);
		
		Thread.sleep(2000);
		
//		Getting No Of Existing User Count
		
		System.out.println("Getting No Of Existing User Count");
		
		waitForClickabilityOf(existingUsers);
		
		List<WebElement> element = driver.findElements(existingUsers);
		
		int NoOfExUsers = element.size();
		
		System.out.println(NoOfExUsers);
		
		int i = 3;
		
        if (NoOfExUsers > i) {
        	
//    		Giving Access to 1st user
    		
    		System.out.println("Giving Access to 1st user");
    		
    		waitForClickabilityOf(appCheckIn1st);
    		
    		driver.findElement(appCheckIn1st).click();
    		
    		waitForClickabilityOf(appUser1st);
    		
    		driver.findElement(appUser1st).click();
    		
//    		Giving Access to 2nd user
    		
    		System.out.println("Giving Access to 2nd user");
    		
    		waitForClickabilityOf(appCheckIn2nd);
    		
    		driver.findElement(appCheckIn2nd).click();
    		
    		waitForClickabilityOf(appUser2nd);
    		
    		driver.findElement(appUser2nd).click();
    		
    		waitForClickabilityOf(chatbot2nd);
    		
    		driver.findElement(chatbot2nd).click();
    		
//    		Giving Access to 3rd user
    		
    		System.out.println("Giving Access to 3rd user");
    		
    		waitForClickabilityOf(appCheckIn3rd);
    		
    		driver.findElement(appCheckIn3rd).click();
    		
    		waitForClickabilityOf(appUser3rd);
    		
    		driver.findElement(appUser3rd).click();
    		
    		waitForClickabilityOf(chatbot3rd);
    		
    		driver.findElement(chatbot3rd).click();
    		
    		waitForClickabilityOf(expertUser3rd);
    		
    		driver.findElement(expertUser3rd).click();
			
		} else {

		}
        
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
        
//		Selecting Mapped Users
		
		System.out.println("Selecting Mapped Users");
		
		waitForClickabilityOf(clickOnMapped);
		
		Select MappedDropDown = new Select(driver.findElement(clickOnMapped));
				
		MappedDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
				
		return new AddAttendees(driver);
	}
	
//	Manage Attendee in Group Method
	
	public AddAttendees manageGroup(String EmailId, String Password,String EventFullName,String GroupName) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
//		Clicking on Map Groups
		
		System.out.println("Clicking on Map Groups");
		
		waitForClickabilityOf(clickOnMapGroups);
		
		driver.findElement(clickOnMapGroups).click();
						
//		Clicking on Add Group
		
		System.out.println("Clicking on Add Group");
		
		waitForClickabilityOf(addGroup);
		
		driver.findElement(addGroup).click();
		
//		Entering Group Name
		
		System.out.println("Entering Group Name");
		
		waitForClickabilityOf(groupName);
		
		driver.findElement(groupName).sendKeys(GroupName);
		
//		Clicking on Show On Mobile
		
		System.out.println("Clicking on Show On Mobile");
		
		waitForClickabilityOf(showOnMobile);
		
		driver.findElement(showOnMobile).click();
		
//		Selecting First User
		
		System.out.println("Selecting First User");
		
		waitForClickabilityOf(gUserCheckBox1st);
		
		driver.findElement(gUserCheckBox1st).click();
		
//		Selecting Second User
		
		System.out.println("Selecting Second User");
		
		waitForClickabilityOf(gUserCheckBox2nd);
		
		driver.findElement(gUserCheckBox2nd).click();
		
//		Clicking On Move Button
		
		System.out.println("Clicking On Move Button");
		
		waitForClickabilityOf(moveUserRightBtn);
		
		driver.findElement(moveUserRightBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(groupSaveBtn);
		
		driver.findElement(groupSaveBtn).click();
		
		try {
			
			popUpHandeling();
						
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Getting the Group Count
		
		waitForClickabilityOf(groupCount);
		
		List<WebElement> element = driver.findElements(groupCount);
		
		int NoOfExSession = element.size();
		
		System.out.println(NoOfExSession);
		
		if (NoOfExSession==1) {
			
			System.out.println("Successfully Added One Group");
			
		} else {
			
			System.out.println("Failed to Add New Group");

		}
		
		
		
		return new AddAttendees(driver);
	}
	
//	Attendee Visibility Off Method
	
	public AddAttendees attendeeVisibility(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
//		Clicking on Attendee Visibility
		
		System.out.println("Clicking on Attendee Visibility");
		
		waitForClickabilityOf(attendeeVisibility);
		
		driver.findElement(attendeeVisibility).click();
		
//		Unchecking user to Off the Visibility 
		
		System.out.println("Unchecking First user to Off the Visibility");
		
		waitForClickabilityOf(userCheckBox1st);
		
		boolean result = driver.findElement(userCheckBox1st).isSelected();
		
		System.out.println(result);
		
		if (result=true) {
			
			driver.findElement(userCheckBox1st).click();
			
			
		}else {
			
			System.out.println("Unchecking 2nd user to Off the Visibility");
			
			waitForClickabilityOf(userCheckBox2nd);
							
			driver.findElement(userCheckBox2nd).click();
						
		}
		
		System.out.println("Clicking on Save Button ");
		
		waitForClickabilityOf(visibilityOffSaveBtn);
						
		driver.findElement(visibilityOffSaveBtn).click();
		
		
		
//		Getting the Success Message
		
		Thread.sleep(2000);
		
		String actMessage = driver.findElement(successMessage).getText();
		
		String expMessage = "Record saved successfully.";
		
		System.out.println(actMessage);
		
		if (actMessage.equals(expMessage)) {
			
			System.out.println("Succefully Disabled Attendee Visibility ");
			
		} else {
			
			System.out.println("Failed to Disable Attendee Visibility ");

		}
		
	
		
		return new AddAttendees(driver);
	}
	
	public AddAttendees addAttendees(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
		return new AddAttendees(driver);
	}

}
