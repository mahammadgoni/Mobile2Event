package com.EventAgendaSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddSponsors extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");

	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");

	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");

	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");

	By clickOnSponsors = By.xpath("//*[@href='sponsors.aspx'][contains(text(),'Sponsors')]");
		
	By clickOnAddSponsors = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='SponsorAddEdit.aspx']");
		
	By spnsrName = By.xpath("//*[@id='ContentPlaceHolder1_txtSponsorName1']");

	By addSpnsrBtn = By.xpath("//*[@name='Add']");

	By spnsrType = By.xpath("//*[@id='ContentPlaceHolder1_txtSponsorType']");
	
	By saveSpnsrBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveType']");
	
	By closePopUp = By.xpath("//div[@id='inline1']//a[@class='close-popup']");
	
	By selectSpnsrType = By.xpath("//*[@id='ContentPlaceHolder1_ddlSponsorType1_txtCombo']");

	By select1stType = By.xpath("//*[@id='ContentPlaceHolder1_ddlSponsorType1_chkList_0']");

	By boothNo = By.xpath("//*[@id='ContentPlaceHolder1_txtBoothNo']");

	By website = By.xpath("//*[@id='ContentPlaceHolder1_txtWebsite1']");

	By emailId = By.xpath("//*[@id='ContentPlaceHolder1_txtEmail1']");

	By contactNo = By.xpath("//*[@id='ContentPlaceHolder1_txtContactNo']");

	By selectCountry = By.xpath("//*[@id='ContentPlaceHolder1_ddlCountry1']");

	By selectUSA = By.xpath("//select[@id='ContentPlaceHolder1_ddlCountry1']//option[@value='184']");

	By address = By.xpath("//*[@id='ContentPlaceHolder1_txtAddress1']");

	By profile = By.xpath("//html/body[1]");

	By spnsrLogo = By.xpath("//*[@id='ContentPlaceHolder1_fuLogo']");

	By spnsrBanner = By.xpath("//*[@id='ContentPlaceHolder1_aClose1']");

	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By spnsrCount = By.xpath("//*[@id='ContentPlaceHolder1_gvSponsor']");
	
	
	By clickOn1stSpnsr = By.xpath("//*[@id='ContentPlaceHolder1_gvSponsor_chkSponsors_0']");

	By clickOnPublish = By.xpath("//*[@id='ContentPlaceHolder1_btnBulkPublish']");

	By clickOnUnpublish = By.xpath("//*[@id='ContentPlaceHolder1_btnBulkUnpublish']");

	By unPublishState = By.xpath("//*[@id='ContentPlaceHolder1_gvSponsor_imgPublished_0']");

	By publishState = By.xpath("//*[@id='ContentPlaceHolder1_gvSponsor_imgUnPublished_0']");
	
	
	By clickOnMapSpnsr = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='SponsorMapping.aspx']");

	By selectSpnsr = By.xpath("//*[@id='ContentPlaceHolder1_ddlInstance']");

	By selectUserRadioBtn = By.xpath("//*[@id='ContentPlaceHolder1_rbtnaudience_1']");

	By userGroupCheckBox = By.xpath("//*[@id='ac-2']");

	By userCheckBox = By.xpath("//*[@id='ac-3']");

	By select1stUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_0']");
	
	By select1stGroup = By.xpath("//*[@id='ContentPlaceHolder1_gvUserGroup_chkUserGroup_0']");

	By moveBtn = By.xpath("//*[@id='ContentPlaceHolder1_imgRight']");

	By mapSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");

	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");
	


	public AddSponsors(WebDriver driver) {
		super(driver);

	}
	
	public AddSponsors addSponsor(String EmailId, String Password, String EventFullName, String SponsorName,String SpnsrPath) throws InterruptedException{
		
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
		
		Thread.sleep(2000);

		// Clicking on Agenda Setup

		System.out.println("Clicking on Agenda Setup");

		waitForClickabilityOf(clickOnAgendaSetUp);

		driver.findElement(clickOnAgendaSetUp).click();
		
		Thread.sleep(2000);

		// Clicking on Exhibitor

		System.out.println("Clicking on Sponsor");

		waitForClickabilityOf(clickOnSponsors);

		driver.findElement(clickOnSponsors).click();
		
		Thread.sleep(2000);

		// Clicking on Add Sponsor

		System.out.println("Clicking on Add Sponsor");

		waitForClickabilityOf(clickOnAddSponsors);

		driver.findElement(clickOnAddSponsors).click();
		
		Thread.sleep(2000);

		// Clicking on Add Button

		System.out.println("Clicking on Add Button");

		waitForClickabilityOf(addSpnsrBtn);

		driver.findElement(addSpnsrBtn).click();
		
		Thread.sleep(2000);

		// Entering Sponsor Type

		System.out.println("Entering Sponsor Type");

		waitForClickabilityOf(spnsrType);

		driver.findElement(spnsrType).sendKeys("Gold");
		
		Thread.sleep(2000);

		// Clicking On Save Button

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveSpnsrBtn);

		driver.findElement(saveSpnsrBtn).click();
		
		Thread.sleep(2000);

		// Clicking On Close Pop Up

		System.out.println("Clicking On Close Pop Up");

		waitForClickabilityOf(closePopUp);

		driver.findElement(closePopUp).click();
		
		Thread.sleep(2000);

		// Clicking On Sponsor Type

		System.out.println("Clicking On Sponsor Type");

		waitForClickabilityOf(selectSpnsrType);

		driver.findElement(selectSpnsrType).click();
		
		Thread.sleep(2000);

		// Selecting Sponsor Type

		System.out.println("Selecting Sponsor Type");

		waitForClickabilityOf(select1stType);

		driver.findElement(select1stType).click();
		
		Thread.sleep(2000);

		// Entering Sponsor Name

		System.out.println("Entering Sponsor Name as : " + SponsorName);

		waitForClickabilityOf(spnsrName);

		driver.findElement(spnsrName).sendKeys(SponsorName);
		
		Thread.sleep(2000);

		// Entering Booth No

		System.out.println("Entering Booth No");

		waitForClickabilityOf(boothNo);

		driver.findElement(boothNo).sendKeys("8");
		
		Thread.sleep(2000);

		// Converting the String to Lower case

		String sSpnsrName = SponsorName.toLowerCase();
		
		Thread.sleep(2000);

		// Entering Sponsor Website

		System.out.println("Entering Sponsor Website as : " + sSpnsrName + ".com");

		waitForClickabilityOf(website);

		driver.findElement(website).sendKeys(sSpnsrName+ ".com");
		
		Thread.sleep(2000);

		// Entering Sponsor Email Id

		System.out.println("Entering Sponsor Email Id as : " + sSpnsrName + "@yop.com");

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).sendKeys(sSpnsrName + "@yop.com");
		
		Thread.sleep(2000);

		// Entering Sponsor Phone No

		System.out.println("Entering Sponsor Phone No ");

		waitForClickabilityOf(contactNo);

		driver.findElement(contactNo).sendKeys("9786653421");
		
		Thread.sleep(2000);

		// Entering Sponsor Country

		System.out.println("Entering Sponsor Country");

		waitForClickabilityOf(selectCountry);

		driver.findElement(selectCountry).click();
		
		Thread.sleep(2000);

		waitForClickabilityOf(selectUSA);

		driver.findElement(selectUSA).click();
		
		Thread.sleep(2000);

		// Entering Sponsor Address

		System.out.println("Entering Sponsor Address");

		waitForClickabilityOf(address);

		driver.findElement(address).sendKeys("202,Columbia Heights, Northwest, Washington, D.C.");
		
		Thread.sleep(2000);

		// Entering Sponsor Profile

		System.out.println("Entering Sponsor Profile");

		waitForClickabilityOf(profile);

		driver.findElement(profile).sendKeys("This is Test Sponsor Profile");
		
		Thread.sleep(2000);

		// Adding Sponsor Logo

		System.out.println("Adding Sponsor Logo");

		waitForClickabilityOf(spnsrLogo);

		driver.findElement(spnsrLogo).sendKeys(SpnsrPath);
		
		Thread.sleep(2000);

		// Adding Sponsor Banner

//		System.out.println("Adding Sponsor Banner");
//
//		waitForClickabilityOf(spnsrBanner);
//
//		driver.findElement(spnsrBanner).sendKeys(home+"/Test Data/SponsorBanner.jpg");

		// Clicking On Save Button

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveBtn);

		driver.findElement(saveBtn).click();

		Thread.sleep(2000);

		try {
			popUpHandeling();

		} catch (Exception e) {

		}

		// Getting No Of Sponsor

		waitForClickabilityOf(spnsrCount);

		List<WebElement> element = driver.findElements(spnsrCount);

		int NoOfExSpnsr = element.size();

		if (NoOfExSpnsr == 1) {

			System.out.println("Successfully Added one Sponsor");

		} else {

			System.out.println("Failed to Add Sponsor");

		}
		
		
		
		return new AddSponsors(driver);
		
	}

	public AddSponsors sponsorList(String EmailId, String Password, String EventFullName) throws InterruptedException{
		
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

		// Clicking on Exhibitor

		System.out.println("Clicking on Sponsor");

		waitForClickabilityOf(clickOnSponsors);

		driver.findElement(clickOnSponsors).click();

		// Un-publishing the Exhibitor

		System.out.println("Unpublishing the Sponsor");

		waitForClickabilityOf(clickOn1stSpnsr);

		driver.findElement(clickOn1stSpnsr).click();

		waitForClickabilityOf(clickOnUnpublish);

		driver.findElement(clickOnUnpublish).click();

		System.out.println("Clicking On OK to Unpublish the Sponsor");

		try {

			popUpHandeling();

		} catch (Exception e) {

		}

		Thread.sleep(2000);

		try {

			popUpHandeling();

		} catch (Exception e) {

		}

		waitForClickabilityOf(unPublishState);

		WebElement UnPublishStatus = driver.findElement(unPublishState);

		System.out.println("Current Sponsor Status is Unpublish : " + UnPublishStatus.isDisplayed());

		Thread.sleep(2000);

		// Publishing the Exhibitor

		System.out.println("Publishing the Sponsor");

		waitForClickabilityOf(clickOn1stSpnsr);

		driver.findElement(clickOn1stSpnsr).click();

		waitForClickabilityOf(clickOnPublish);

		driver.findElement(clickOnPublish).click();

		System.out.println("Clicking On OK to Publish the Sponsor");

		try {

			popUpHandeling();

		} catch (Exception e) {

		}

		Thread.sleep(2000);

		try {

			popUpHandeling();

		} catch (Exception e) {

		}

		waitForClickabilityOf(publishState);

		WebElement PublishStatus = driver.findElement(publishState);

		System.out.println("Current Sponsor Status is Publish : " + PublishStatus.isDisplayed());

		Thread.sleep(2000);
		
		
		return new AddSponsors(driver);
		
	}

	public AddSponsors mapSponsorWithUser(String EmailId, String Password, String EventFullName) throws InterruptedException{
		
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

		// Clicking on Sponsors

		System.out.println("Clicking on Sponsors");

		waitForClickabilityOf(clickOnSponsors);

		driver.findElement(clickOnSponsors).click();

		// Clicking on Map Sponsors with Users

		System.out.println("Clicking on Map Sponsors with Users");

		waitForClickabilityOf(clickOnMapSpnsr);

		driver.findElement(clickOnMapSpnsr).click();

		// Selecting Sponsors

		System.out.println("Selecting Sponsors");

		waitForClickabilityOf(selectSpnsr);

		Select exbtrDropDown = new Select(driver.findElement(selectSpnsr));

		exbtrDropDown.selectByIndex(1);
		
		Thread.sleep(2000);

		// Clicking on Map Sponsors with Users

		System.out.println("Clicking on Select Users Radio Button");

		waitForClickabilityOf(selectUserRadioBtn);

		boolean SelectUsers = driver.findElement(selectUserRadioBtn).isSelected();

		if (SelectUsers == true) {

			System.out.println("Users are all ready selected : " + SelectUsers);

		} else {

			driver.findElement(selectUserRadioBtn).click();

		}
		
		Thread.sleep(2000);

		// Clicking on User From Users List

		System.out.println("Clicking on User From Users List");

		waitForClickabilityOf(select1stUser);

		driver.findElement(select1stUser).click();

		// Clicking on Move Button to Add User

		System.out.println("Clicking on Move Button to Add User");

		waitForClickabilityOf(moveBtn);

		driver.findElement(moveBtn).click();
		
		Thread.sleep(2000);

		// Clicking on Save Button

		System.out.println("Clicking on Save Button");

		waitForClickabilityOf(mapSaveBtn);

		driver.findElement(mapSaveBtn).click();

		// Getting Success Message

		String ActMessage = driver.findElement(successMessage).getText();
		
		System.out.println(ActMessage);

		String ExpMessage = "Records saved successfully.";

		if (ActMessage.equals(ExpMessage)) {

			System.out.println("Successfully Mapped Sponsors with User");

		} else {

			System.out.println("Failed to Map Sponsors with User");

		}
		
		
		return new AddSponsors(driver);
		
	}
	
	public AddSponsors mapSponsorWithUserGroup(String EmailId, String Password, String EventFullName) throws InterruptedException{
		
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

		// Clicking on Sponsors

		System.out.println("Clicking on Sponsors");

		waitForClickabilityOf(clickOnSponsors);

		driver.findElement(clickOnSponsors).click();

		// Clicking on Map Sponsors with Users

		System.out.println("Clicking on Map Sponsors with Users");

		waitForClickabilityOf(clickOnMapSpnsr);

		driver.findElement(clickOnMapSpnsr).click();

		// Selecting Sponsors

		System.out.println("Selecting Sponsors");

		waitForClickabilityOf(selectSpnsr);

		Select exbtrDropDown = new Select(driver.findElement(selectSpnsr));

		exbtrDropDown.selectByIndex(1);
		
		Thread.sleep(2000);

		// Clicking on Map Sponsors with Users

		System.out.println("Clicking on Select Users Radio Button");

		waitForClickabilityOf(selectUserRadioBtn);

		boolean SelectUsers = driver.findElement(selectUserRadioBtn).isSelected();

		if (SelectUsers == true) {

			System.out.println("Users are all ready selected : " + SelectUsers);

		} else {

			driver.findElement(selectUserRadioBtn).click();

		}
				
		Thread.sleep(2000);

		// Clicking on User From Users List

		System.out.println("Clicking on Group From Users Group");

		waitForClickabilityOf(select1stGroup);

		driver.findElement(select1stGroup).click();

		// Clicking on Save Button

		System.out.println("Clicking on Save Button");

		waitForClickabilityOf(mapSaveBtn);

		driver.findElement(mapSaveBtn).click();

		// Getting Success Message

		String ActMessage = driver.findElement(successMessage).getText();
		
		System.out.println(ActMessage);

		String ExpMessage = "Records saved successfully.";

		if (ActMessage.equals(ExpMessage)) {

			System.out.println("Successfully Mapped Sponsors with User Group");

		} else {

			System.out.println("Failed to Map Sponsors with User Group");

		}
		
		
		return new AddSponsors(driver);
		
	}

	
}
