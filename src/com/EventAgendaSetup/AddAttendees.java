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
	
	By showOnMobile = By.xpath("//*[@id='ContentPlaceHolder1_chkShowOnMobile']");
	
	By gUserCheckBox1st = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_0']");
	
	By gUserCheckBox2nd = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_1']");
	
	By moveUserRightBtn = By.xpath("//*[@id='ContentPlaceHolder1_imgRight']");
	
	By groupSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By groupCount = By.xpath("//*[@id='ContentPlaceHolder1_gvResources']");
		
	By downloadTemplate = By.xpath("//*[@id='ContentPlaceHolder1_btnDataTamplate']");
	
	By exportUnMapped = By.xpath("//*[@id='ContentPlaceHolder1_btnExportNotMapped']");
	
	By exportMapped = By.xpath("//*[@id='ContentPlaceHolder1_btnExport']");
	
	By importAttendees = By.xpath("//*[@id='ContentPlaceHolder1_btnImport']");
	
	By uploadAttendeeBtn = By.xpath("//*[@id='ContentPlaceHolder1_fileupload']");
	
	By uploadAttendeeSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAdd']");
	
	By bulkUploadHistory = By.xpath("//*[@id='ContentPlaceHolder1_Button1']");
	
	By refreshButton = By.xpath("//*[@id='ContentPlaceHolder1_btnRefresh']");
	
	By uploadStatus = By.xpath("//*[@id='ContentPlaceHolder1_gvBulkUploadHistory_lblStatus_0']");	
	
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
	
	By appCheckIn4th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_3_1_3']");
	
	By appUser4th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_3_2_3']");
	
	By chatbot4th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_3_3_3']");
	
	By expertUser4th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_3_7_3']");
	
	By appCheckIn5th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_4_1_4']");
	
	By appUser5th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_4_2_4']");
	
	By chatbot5th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_4_3_4']");
	
	By expertUser5th = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_4_7_4']");
	
	By clickOnMatchMaking = By.xpath("//html//section[@class='container-fluid header-menu-bot-white pushmenu-toggle']//li[3]/a[1]");
	
	By manageCategory = By.xpath("//*[@id='btnAddSponsorType']");
	
	By addKeyword = By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']");
	
	By categoryName = By.xpath("//*[@id='ContentPlaceHolder1_txtCategoryname']");
	
	By addCategoryBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveType']	");
	
	By selectType = By.xpath("//*[@id='ContentPlaceHolder1_ddltype']");

	By selectMultiple = By.xpath("//*[@id='ContentPlaceHolder1_ddltype']//option[@value='2']");
	
	By closeCategoryPopUp = By.xpath("//*[@id='inline1']/a[1]");
	
	By enterKeyword = By.xpath("//*[@id='ContentPlaceHolder1_txtKeyword']");
	
	By selectCategory = By.xpath("//*[@id='ContentPlaceHolder1_ddlCategory']");
	
	By keywordSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By addedKeyword = By.xpath("//tr[@class='BgColorWhite']");
	
	
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

		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Speakers
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
		Thread.sleep(2000);
		
//		Clicking on Download Template
		
		System.out.println("Clicking on Download Template");
		
		waitForClickabilityOf(downloadTemplate);
		
		driver.findElement(downloadTemplate).click();
		
		Thread.sleep(2000);
		
//		Clicking on Export Un Mapped
		
		System.out.println("Clicking on Export Un Mapped");
		
		waitForClickabilityOf(exportUnMapped);
		
		driver.findElement(exportUnMapped).click();
		
		Thread.sleep(2000);
		
//		Clicking on Export Mapped
		
		System.out.println("Clicking on Export Mapped");
		
		waitForClickabilityOf(exportMapped);
		
		driver.findElement(exportMapped).click();
		
		Thread.sleep(2000);
		
//		Clicking on Download QR
		
		System.out.println("Clicking on Download QR");
		
		waitForClickabilityOf(downloadQR);
		
		driver.findElement(downloadQR).click();
		
		Thread.sleep(2000);
		
//		Entering the Dimension
		
		System.out.println("Entering the Dimension as : 400 px");
		
		waitForClickabilityOf(dimension);
		
		driver.findElement(dimension).sendKeys("400");
		
		Thread.sleep(2000);
		
//		Clicking on Generate QR
		
		System.out.println("Clicking on Generate QR");
		
		waitForClickabilityOf(generateQR);
		
		driver.findElement(generateQR).click();
		
		Thread.sleep(2000);
		
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
		
		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Speakers
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
		Thread.sleep(2000);
		
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
		
		int i = 10;
		
        if (NoOfExUsers > i) {
        	
//    		Giving Access to 1st user
    		
    		System.out.println("Giving Access to 1st user");
    		
    		waitForClickabilityOf(appCheckIn1st);
    		
    		driver.findElement(appCheckIn1st).click();
    		
    		waitForClickabilityOf(appUser1st);
    		
    		driver.findElement(appUser1st).click();
    		
    		Thread.sleep(2000);
    		
//    		Giving Access to 2nd user
    		
    		System.out.println("Giving Access to 2nd user");
    		
    		waitForClickabilityOf(appCheckIn2nd);
    		
    		driver.findElement(appCheckIn2nd).click();
    		
    		waitForClickabilityOf(appUser2nd);
    		
    		driver.findElement(appUser2nd).click();
    		
    		waitForClickabilityOf(chatbot2nd);
    		
    		driver.findElement(chatbot2nd).click();
    		
    		Thread.sleep(2000);
    		
    		try {
    		
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
    		
    		    Thread.sleep(2000);
    		
    			
//        		Giving Access to 4th user
        		
        		System.out.println("Giving Access to 4th user");
        		
        		waitForClickabilityOf(appCheckIn4th);
        		
        		driver.findElement(appCheckIn4th).click();
        		
        		waitForClickabilityOf(appUser4th);
        		
        		driver.findElement(appUser4th).click();
        		
        		waitForClickabilityOf(chatbot4th);
        		
        		driver.findElement(chatbot4th).click();
        		
        		waitForClickabilityOf(expertUser4th);
        		
        		driver.findElement(expertUser4th).click();
        		
//        		Giving Access to 5th user
        		
        		System.out.println("Giving Access to 5th user");
        		
        		waitForClickabilityOf(appCheckIn5th);
        		
        		driver.findElement(appCheckIn5th).click();
        		
        		waitForClickabilityOf(appUser5th);
        		
        		driver.findElement(appUser5th).click();
        		
        		waitForClickabilityOf(chatbot5th);
        		
        		driver.findElement(chatbot5th).click();
        		
        		waitForClickabilityOf(expertUser5th);
        		
        		driver.findElement(expertUser5th).click();
				
			} catch (Exception e) {
				
			}
			
		} else {

		}
        
		Thread.sleep(2000);
        
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
        
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

		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Speakers
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
		Thread.sleep(2000);
		
//		Clicking on Map Groups
		
		System.out.println("Clicking on Map Groups");
		
		waitForClickabilityOf(clickOnMapGroups);
		
		driver.findElement(clickOnMapGroups).click();
		
		Thread.sleep(2000);
						
//		Clicking on Add Group
		
		System.out.println("Clicking on Add Group");
		
		waitForClickabilityOf(addGroup);
		
		driver.findElement(addGroup).click();
		
		Thread.sleep(2000);
		
//		Entering Group Name
		
		System.out.println("Entering Group Name");
		
		waitForClickabilityOf(groupName);
		
		driver.findElement(groupName).sendKeys(GroupName);
		
		Thread.sleep(2000);
		
//		Clicking on Show On Mobile
		
		System.out.println("Clicking on Show On Mobile");
		
		waitForClickabilityOf(showOnMobile);
		
		driver.findElement(showOnMobile).click();
		
		Thread.sleep(2000);
		
//		Selecting First User
		
		System.out.println("Selecting First User");
		
		waitForClickabilityOf(gUserCheckBox1st);
		
		driver.findElement(gUserCheckBox1st).click();
		
		Thread.sleep(2000);
		
//		Selecting Second User
		
		System.out.println("Selecting Second User");
		
		waitForClickabilityOf(gUserCheckBox2nd);
		
		driver.findElement(gUserCheckBox2nd).click();
		
		Thread.sleep(2000);
		
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

		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Speakers
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
		Thread.sleep(2000);
		
//		Clicking on Attendee Visibility
		
		System.out.println("Clicking on Attendee Visibility");
		
		waitForClickabilityOf(attendeeVisibility);
		
		driver.findElement(attendeeVisibility).click();
		
		Thread.sleep(2000);
		
//		Unchecking user to Off the Visibility 
		
		System.out.println("Unchecking First user to Off the Visibility");
		
		waitForClickabilityOf(userCheckBox1st);
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(userCheckBox1st).isSelected();
		
		System.out.println(result);
		
		if (result=true) {
			
			driver.findElement(userCheckBox1st).click();
			
			
		}else {
			
			System.out.println("Unchecking 2nd user to Off the Visibility");
			
			waitForClickabilityOf(userCheckBox2nd);
							
			driver.findElement(userCheckBox2nd).click();
						
		}
		
		Thread.sleep(2000);
		
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
	
//	Add Key Word in Match Making option
	
	public AddAttendees matchMaking(String EmailId, String Password,String EventFullName, String Keyword) throws InterruptedException{
		
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

		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Attendees
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
		Thread.sleep(2000);
		
//		Clicking on Match Making
		
		System.out.println("Clicking on Match Making");
		
		waitForClickabilityOf(clickOnMatchMaking);
		
		driver.findElement(clickOnMatchMaking).click();
		
		Thread.sleep(2000);
		
//		Clicking on Manage Category
		
		System.out.println("Clicking on Manage Category");
		
		waitForClickabilityOf(manageCategory);
		
		driver.findElement(manageCategory).click();
		
		Thread.sleep(2000);
		
//		Entering Category Name
		
		System.out.println("Entering Category Name as : "+Keyword);
		
		waitForClickabilityOf(categoryName);
		
		driver.findElement(categoryName).sendKeys(Keyword);
		
		Thread.sleep(2000);
		
//		Selecting Category Type
		
		System.out.println("Selecting Category Type");
		
		waitForClickabilityOf(selectType);
		
		driver.findElement(selectType).click();
		
		waitForClickabilityOf(selectMultiple);
		
		driver.findElement(selectMultiple).click();
		
		Thread.sleep(2000);
		
//		Clicking On Add Button
		
		System.out.println("Clicking On Add Button");
		
		waitForClickabilityOf(addCategoryBtn);
		
		driver.findElement(addCategoryBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Close Pop Up Button
		
		System.out.println("Clicking On Close Pop Up Button");
		
		waitForClickabilityOf(closeCategoryPopUp);
		
		driver.findElement(closeCategoryPopUp).click();
		
		Thread.sleep(2000);
		
//		Clicking On Add Keyword Button
		
		System.out.println("Clicking On Add Keyword Button");
		
		waitForClickabilityOf(addKeyword);
		
		driver.findElement(addKeyword).click();
		
		Thread.sleep(2000);
		
//		Entering Keyword Name
		
		System.out.println("Entering Keyword Name as : "+Keyword);
		
		waitForClickabilityOf(enterKeyword);
		
		driver.findElement(enterKeyword).sendKeys(Keyword);
		
		Thread.sleep(2000);
		
//		Clicking On Select Category
		
		System.out.println("Clicking On Select Category");
				
		waitForClickabilityOf(selectCategory);
		
		Select categoryDropDown = new Select(driver.findElement(selectCategory));
				
		categoryDropDown.selectByIndex(1);
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(keywordSaveBtn);
		
		driver.findElement(keywordSaveBtn).click();
		
		Thread.sleep(2000);		
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(addedKeyword);
				
		if (driver.findElement(addedKeyword).isDisplayed()==true) {
			
			System.out.println("Successfully Added Keyword");
			
		} else {
			
			System.out.println("Faied to Add Keyword");

		}
			
		return new AddAttendees(driver);
	}
	
	
	public AddAttendees importAttendees(String EmailId, String Password,String EventFullName, String UploadAttendee) throws InterruptedException{
		
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

		Thread.sleep(2000);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(clickOnAgendaSetUp);
		
		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);
		
//		Clicking on Attendees
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(clickOnAttendees);
		
		driver.findElement(clickOnAttendees).click();
		
		Thread.sleep(2000);
		
//		Clicking on Import Option
		
		System.out.println("Clicking on Import Option");
		
		waitForClickabilityOf(importAttendees);
		
		driver.findElement(importAttendees).click();
		
		Thread.sleep(2000);
		
//		Uploading the excel File
		
		System.out.println("Uploading the excel File");
		
		waitForClickabilityOf(uploadAttendeeBtn);
		
		driver.findElement(uploadAttendeeBtn).sendKeys(UploadAttendee);
		
		Thread.sleep(2000);
				
//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(uploadAttendeeSaveBtn);
		
		driver.findElement(uploadAttendeeSaveBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking on Bulk Upload History
		
		System.out.println("Clicking on Bulk Upload History");
		
		waitForClickabilityOf(bulkUploadHistory);
		
		driver.findElement(bulkUploadHistory).click();
		
		Thread.sleep(2000);
		
//		Clicking on Refresh Button
		
		System.out.println("Clicking on Refresh Button");
		
		waitForClickabilityOf(refreshButton);
		
		driver.findElement(refreshButton).click();
		
		Thread.sleep(2000);
		
//		Getting the status message
		
		waitForClickabilityOf(uploadStatus);
		
		String ActMessage = driver.findElement(uploadStatus).getText();
		
		String ExpMessage = "Successful";
		
		if (ActMessage.equals(ExpMessage)) {
			
			System.out.println("Successfully Uploaded Attendees");
			
		} else {
			
			System.out.println("Failed to Upload Attendees");

		}
		
		return new AddAttendees(driver);
		
	}
	

}
