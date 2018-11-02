package com.EventSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AboutEvent extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnEventSetUp = By.xpath("//li[@id='EI']//a[@href='javascript:void(0);']");
	
	By clickOnAboutEvent = By.xpath("//a[@href='event-info.aspx'][contains(text(),'About Event')]");
	
	By manageVanues = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='Venue-AddEdit.aspx']");
	
	By addVanues = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='Venue-AddEdit.aspx']");
		
	By declaimers = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='Disclaimer.aspx']");
		
//	Event Info Elements
	
	By eventFullName = By.xpath("//*[@id='top1_lblevent']");
	
//	Add Venues Elements
	
	By venue = By.xpath("//*[@id='txtVenueName']");
	
	By address = By.xpath("//*[@id='txtAddress']");
	
	By toolTipStateOpen = By.xpath("//*[@id='ContentPlaceHolder1_rbtnTooltipState_0']");
	
	By toolTipStateClose = By.xpath("//*[@id='ContentPlaceHolder1_rbtnTooltipState_1']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
		
//	Add Disclaimer Elements
	
	By clickOnDisclaimer = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='Disclaimer.aspx']");
	
	By disclaimerYesBtn = By.xpath("//*[@id='ContentPlaceHolder1_radioButtonListIsUsedByEvent_0']");
	
	By disclaimerLabel = By.xpath("//*[@id='ContentPlaceHolder1_txtDisclaimerLabel']");
	
	By everyTime = By.xpath("//*[@id='ContentPlaceHolder1_radioButtonListFrequency_1']");
	
	By acceptanceLabel = By.xpath("//*[@id='ContentPlaceHolder1_txtAcceptanceLabel']");
	
//	Social Links Elements 
	
	By clickOnSocialLinks = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='EventSociallink.aspx']");
	
	By socialLogo = By.xpath("//*[@id='ContentPlaceHolder1_grdInstance_fuNewLogo']");
	
	By socialName = By.xpath("//*[@id='ContentPlaceHolder1_grdInstance_txtNewName']");
	
	By socialUrl = By.xpath("//*[@id='ContentPlaceHolder1_grdInstance_txtNewURL']");
	
	By socialPublish = By.xpath("//*[@id='ContentPlaceHolder1_grdInstance_chkNewActive']");
	
	By socialAdd = By.xpath("//a[@id='ContentPlaceHolder1_grdInstance_lnkAdd']");
	
//	Useful Info Elements
	
	By usefullInfo = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='UsefulInfo.aspx']");
	
	By addNewBtn = By.xpath("//a[@id='ContentPlaceHolder1_A3']");
	
	By importBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnImport']");
	
	By useFullFileUpload = By.xpath("//*[@id='ContentPlaceHolder1_fileupload']");
	
	By bulkUploadHistory = By.xpath("//*[@id='ContentPlaceHolder1_btnBulkUploadHistory']");
	
	By titleName = By.xpath("//*[@id='ContentPlaceHolder1_txtTitle']");
	
	By enableBtn = By.xpath("//*[@id='ContentPlaceHolder1_rblShowInApp_0']");
	
	By addTag = By.xpath("//*[@id='ContentPlaceHolder1_txtTags']");
	
	By browseBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnUpload']");
	
	By suceessMessage = By.xpath("//li[@id='liPostSuccessMessage']");
	
	By bulkSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAdd']");
	
	By noExstInfo = By.xpath("//*[@class='btn-delete']");
	
//	App Tutorial 
	
	By appTuto = By.xpath("//*[@id='form1']/section[2]/div/ul/li[8]/a");
	
	By appTuto1 = By.xpath("Brand");
	
	
	
	

	public AboutEvent(WebDriver driver) {
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
		
		Thread.sleep(2000);

//		Clicking on Event Set Up
		
		System.out.println("Clicking on Event Set Up");
		
		waitForClickabilityOf(clickOnEventSetUp);
		
		driver.findElement(clickOnEventSetUp).click();
		
		Thread.sleep(2000);

//		Clicking on About Event
		
		System.out.println("Clicking on About Event");
		
		waitForClickabilityOf(clickOnAboutEvent);
		
		driver.findElement(clickOnAboutEvent).click();
		
		
	}
	
//  Event Info Method
	
	
//	Event Info Method
	
	public AboutEvent eventInfo(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Storing the Opened Event Name
		
//		waitForClickabilityOf(eventFullName);
		
		String CurrentEventName = driver.findElement(eventFullName).getText();
		
//		System.out.println(CurrentEventName);
		
		Thread.sleep(2000);
		
		if (EventFullName.equals(CurrentEventName)) {
			
			System.out.println("Successfully Opened the Event Info");
			
		} else {
			
			System.out.println("Failed to Open the Event Info");

		}
			
		return new AboutEvent(driver);
		
	}
	
//  Add Venue Method
	
	
//	Add Venues Method 
	
	public AboutEvent addVenue(String EmailId, String Password,String EventFullName,String VenueName,String VenueAddress) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Add Venue
		
		System.out.println("Clicking on Add Venue");
		
		waitForClickabilityOf(addVanues);
		
		driver.findElement(addVanues).click();
		
		Thread.sleep(2000);
		
//		Entering Venue Name
		
		System.out.println("Entering Venue Name");
		
		waitForClickabilityOf(venue);
		
		driver.findElement(venue).sendKeys(VenueName);
		
		Thread.sleep(2000);
		
//		Entering Venue Address
		
		System.out.println("Entering Venue Address");
		
		waitForClickabilityOf(address);
		
		WebElement Addrs = driver.findElement(address);
		
		Addrs.sendKeys(VenueAddress);
		
		Thread.sleep(2000);
		
		Addrs.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Clicking on Add Venue
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Storing Added Venue Name
				
		String AddedVenueName = driver.findElement(By.xpath("//*[contains(text(),'"+VenueName+"')]")).getText();
		
		if (VenueName.equals(AddedVenueName)) {
			
			System.out.println("Successfully Added One Venue");
			
		} else {
			
			System.out.println("Failed to Add Venue");

		}
			
		
		
		return new AboutEvent(driver);
		
	}
	
//	Add Disclaimer Method
	
	
//	Add Disclaimer Method

	public AboutEvent addDisclaimer(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on The Event
		
		System.out.println("Clicking on Disclaimer");
		
		waitForClickabilityOf(clickOnDisclaimer);
		
		driver.findElement(clickOnDisclaimer).click();
		
		Thread.sleep(2000);
		
//		Clicking on Yes button
		
		waitForClickabilityOf(disclaimerYesBtn);
		
		boolean YesBtn = driver.findElement(disclaimerYesBtn).isSelected();
		
		if (YesBtn==false) {
			
			System.out.println("Clicking on Yes Button");
			
			driver.findElement(disclaimerYesBtn).click();
			
		} else {
			
			System.out.println("Already Selected Yes Button");

		}
		
		Thread.sleep(2000);
		
//		Entering Disclaimer Label
		
		System.out.println("Entering Disclaimer Label");
		
		waitForClickabilityOf(disclaimerLabel);
		
		driver.findElement(disclaimerLabel).clear();
		
		driver.findElement(disclaimerLabel).sendKeys("Automation Disclaimer");
		
		Thread.sleep(2000);
		
//		Entering Disclaimer Label
		
		System.out.println("Entering Acceptance Disclaimer Label");
		
		waitForClickabilityOf(acceptanceLabel);
		
		driver.findElement(acceptanceLabel).clear();
		
		driver.findElement(acceptanceLabel).sendKeys("Automation");
		
		Thread.sleep(2000);
		
//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}	
		
		
		
		return new AboutEvent(driver);
		
	}

	
//	Add Social Link Method
	
	public AboutEvent addSocialLink(String EmailId, String Password,String EventFullName,String EventShortName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Social Links
		
		System.out.println("Clicking on Social Links");
		
		waitForClickabilityOf(clickOnSocialLinks);
		
		driver.findElement(clickOnSocialLinks).click();
		
		Thread.sleep(2000);
		
//		Clicking on Social Links
		
		System.out.println("Choosing Social Link Logo");
		
		waitForClickabilityOf(socialLogo);
		
		driver.findElement(socialLogo).sendKeys(home+"/Test Data/SocialLogo.png");
		
		Thread.sleep(2000);
		
//		Entering Social Link Name
		
		System.out.println("Entering Social Link Name");
		
		waitForClickabilityOf(socialName);
		
		driver.findElement(socialName).sendKeys(EventShortName+" Facebook Page");
		
		Thread.sleep(2000);
		
//		Entering Social Link Name
		
		System.out.println("Entering Social Link Name");
		
		waitForClickabilityOf(socialUrl);
		
		driver.findElement(socialUrl).sendKeys("https://facebook.com");
		
		Thread.sleep(2000);
		
//		Clicking On Publish Box
		
		System.out.println("Clicking On Publish Box");
		
		waitForClickabilityOf(socialPublish);
		
		driver.findElement(socialPublish).click();
		
		Thread.sleep(2000);
		
//		Clicking On Publish Box
		
		System.out.println("Clicking On Add New Button");
		
		waitForClickabilityOf(socialAdd);
		
		driver.findElement(socialAdd).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//		Added Social Link name
		
		String SocialName = driver.findElement(By.xpath("//*[contains(text(),'"+EventShortName+" Facebook Page')]")).getText(); 
		
//		 Actual Social Link
		
		String ActSocialName = EventShortName+" Facebook Page";
		
//		Verifying Social Name
		
		if (ActSocialName.equals(SocialName)) {
			
			System.out.println("Successfully Added Social One Link");
			
		} else {
			
			System.out.println("Failed to Add Social Link");

		}
		
		
		return new AboutEvent(driver);
		
	}
		
	
//	Add Use full Info Method
	
	public AboutEvent addUseFullInfo(String EmailId, String Password,String EventFullName,String EventShortName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Useful Info
		
		System.out.println("Clicking on Useful Info");
		
		waitForClickabilityOf(usefullInfo);
		
		driver.findElement(usefullInfo).click();
		
		Thread.sleep(2000);
		
//		Clicking on Add New Button
		
		System.out.println("Clicking on Add New Button");
		
		waitForClickabilityOf(addNewBtn);
		
		driver.findElement(addNewBtn).click();
		
		Thread.sleep(2000);
		
//		Entering the Title or Menu Name
		
		System.out.println("Entering the Title or Menu Name");
		
		waitForClickabilityOf(titleName);
		
		driver.findElement(titleName).clear();
		
		driver.findElement(titleName).sendKeys(EventShortName+" Useful Info");
		
		Thread.sleep(2000);
		
//		Enabling Show In App
		
		boolean Enable = driver.findElement(enableBtn).isSelected();
		
		if (Enable==false) {
			
			System.out.println("Enabling Show In App");
			
			waitForClickabilityOf(enableBtn);
			
			driver.findElement(enableBtn).click();
			
		} else {
			
			System.out.println("Show In App already Enabled");

		}
		
//		Entering the Title or Menu Name
		
		Thread.sleep(2000);
		
		System.out.println("Entering the Add Tag");
		
		waitForClickabilityOf(addTag);
		
		driver.findElement(addTag).clear();
		
		driver.findElement(addTag).sendKeys("Automation");
		
		Thread.sleep(2000);
		
//		Clicking on Add New Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
//		Added Useful Info name
		
		String UsefulTitle = driver.findElement(By.xpath("//*[contains(text(),'"+EventShortName+" Useful Info')]")).getText(); 
		
//		 Actual Useful Info
		
		String UsefulTitle1 = EventShortName+" Useful Info";
		
//		Verifying Useful Info
		
		if (UsefulTitle.equals(UsefulTitle1)) {
			
			System.out.println("Successfully Added Useful Info");
			
		} else {
			
			System.out.println("Failed to Add Useful Info");

		}
		
				
		return null;
		
	}
	
//	Bulk Upload Method
	
	public AboutEvent bulkUploadUsefullInfo(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Useful Info
		
		System.out.println("Clicking on Useful Info");
		
		waitForClickabilityOf(usefullInfo);
		
		driver.findElement(usefullInfo).click();
		
		Thread.sleep(2000);
		
//		Storing the Existing Elements 
		
		waitForClickabilityOf(noExstInfo);

		List<WebElement> ExstInfo = driver.findElements(noExstInfo);

		int NoExInfo = ExstInfo.size();
		
		Thread.sleep(2000);
		
//		Clicking on Import Button
		
		System.out.println("Clicking on Import Button");
		
		waitForClickabilityOf(importBtn);
		
		driver.findElement(importBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking on Import Button
		
		System.out.println("Selecting the Import File");
		
		waitForClickabilityOf(useFullFileUpload);
		
		driver.findElement(useFullFileUpload).sendKeys(home+"/Test Data/UsefulInfoImportTemplate.xlsx");
		
		Thread.sleep(2000);	
		
//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(bulkSaveBtn);
		
		driver.findElement(bulkSaveBtn).click();
		
		Thread.sleep(2000);	
		
//		Clicking on Useful Info
		
		System.out.println("Clicking on Useful Info");
		
		waitForClickabilityOf(usefullInfo);
		
		driver.findElement(usefullInfo).click();
		
		Thread.sleep(2000);	
		
//		Storing the Existing Elements 
		
		waitForClickabilityOf(noExstInfo);

		List<WebElement> ExstInfo1 = driver.findElements(noExstInfo);

		int NoExInfo1 = ExstInfo1.size();
						
//		Verifying Social Name
		
		if (NoExInfo1==NoExInfo+2) {
			
			System.out.println("Successfully Uploaded Useful Info");
			
		} else {
			
			System.out.println("Failed to Upload Useful Info");

		}
	
		
		return new AboutEvent(driver);
		
	}
	
//	App Tutorial Method
	
	public AboutEvent appTutorial(String Email,String Password,String EventName) throws InterruptedException{
		
		commonActivities(Email, Password, EventName);
		
		System.out.println("Clicking On App Tutorial");
		
		waitForClickabilityOf(appTuto);
		
		driver.findElement(appTuto).click();
		
		
		
		
		return new AboutEvent(driver);
	}
	

}
