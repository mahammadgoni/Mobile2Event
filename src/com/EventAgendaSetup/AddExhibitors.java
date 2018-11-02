package com.EventAgendaSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddExhibitors extends BaseSetUp {

	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");

	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");

	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");

	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");

	By clickOnExhibitors = By.xpath("//*[@href='exhibitors.aspx'][contains(text(),'Exhibitors')]");

	By clickOn1stExbtr = By.xpath("//*[@id='ContentPlaceHolder1_gvExibitor_chkExhibitors_0']");

	By clickOnPublish = By.xpath("//*[@id='ContentPlaceHolder1_btnBulkPublish']");

	By clickOnUnpublish = By.xpath("//*[@id='ContentPlaceHolder1_btnBulkUnpublish']");

	By unpublishState = By.xpath("//*[@id='ContentPlaceHolder1_gvExibitor_imgPublished_0']");

	By publishState = By.xpath("//*[@id='ContentPlaceHolder1_gvExibitor_imgUnPublished_0']");

	By clickOnAddExhibitor = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='exhibitor_AddEdit.aspx'][contains(text(),'Add Exhibitor')]");

	By exhibitorName = By.xpath("//*[@id='ContentPlaceHolder1_txtExbtrName1']");

	By addExbtrBtn = By.xpath("//*[@name='Add']");

	By exbtrType = By.xpath("//*[@id='ContentPlaceHolder1_txtExhibitorType']");

	By saveExbtrBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSaveType']");

	By closePopUp = By.xpath("//html//div[@id='div5']/a[1]");

	By selectExbtrType = By.xpath("//*[@id='ContentPlaceHolder1_ddlExhibitorType1_txtCombo']");

	By select1stType = By.xpath("//*[@id='ContentPlaceHolder1_ddlExhibitorType1_chkList_0']");

	By boothNo = By.xpath("//*[@id='ContentPlaceHolder1_txtBoothNo1']");

	By website = By.xpath("//*[@id='ContentPlaceHolder1_txtWebsite1']");

	By emailId = By.xpath("//*[@id='ContentPlaceHolder1_txtEmail1']");

	By contactNo = By.xpath("//*[@id='ContentPlaceHolder1_txtFax1']");

	By selectCountry = By.xpath("//*[@id='ContentPlaceHolder1_ddlCountry1']");

	By selectUSA = By.xpath("//select[@id='ContentPlaceHolder1_ddlCountry1']//option[@value='184']");

	By address = By.xpath("//*[@id='ContentPlaceHolder1_txtAddress1']");

	By profile = By.xpath("//html/body[1]");

	By exbtrLogo = By.xpath("//*[@id='ContentPlaceHolder1_fuProfile1']");

	By exbtrBanner = By.xpath("//*[@id='ContentPlaceHolder1_aClose1']");

	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnEditSave']");

	By exbtrCount = By.xpath("//*[@id='ContentPlaceHolder1_gvExibitor']");

	By clickOnMapExbtr = By.xpath("//html//ul[@class='menu-3rd-level clearfix']/li[4]");

	By selectExbtr = By.xpath("//*[@id='ContentPlaceHolder1_ddlInstance']");

	By selectUserRadioBtn = By.xpath("//*[@id='ContentPlaceHolder1_rbtnaudience_1']");

	By userGroupCheckBox = By.xpath("//*[@id='ac-2']");

	By userCheckBox = By.xpath("//*[@id='ac-3']");

	By select1stUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUser_0']");
	
	By select1stGroup = By.xpath("//*[@id='ContentPlaceHolder1_gvUserGroup_chkUserGroup_0']");

	By moveBtn = By.xpath("//*[@id='ContentPlaceHolder1_imgRight']");

	By mapSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");

	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");

	
	
	public AddExhibitors(WebDriver driver) {
		super(driver);

	}

	public AddExhibitors addExhibitor(String EmailId, String Password, String EventFullName, String ExbtrName,String ExbtrType,String ExbtrPath)throws InterruptedException {

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
		
		Thread.sleep(2000);

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

		System.out.println("Clicking on Exhibitor");

		waitForClickabilityOf(clickOnExhibitors);

		driver.findElement(clickOnExhibitors).click();
		
		Thread.sleep(2000);

		// Clicking on Add Exhibitor

		System.out.println("Clicking on Add Exhibitor");

		waitForClickabilityOf(clickOnAddExhibitor);

		driver.findElement(clickOnAddExhibitor).click();
		
		Thread.sleep(2000);

		// Clicking on Add Button

		System.out.println("Clicking on Add Button");

		waitForClickabilityOf(addExbtrBtn);

		driver.findElement(addExbtrBtn).click();
		
		Thread.sleep(2000);

		// Entering Exhibitor Type

		System.out.println("Entering Exhibitor Type");

		waitForClickabilityOf(exbtrType);

		driver.findElement(exbtrType).sendKeys(ExbtrType);
		
		Thread.sleep(2000);

		// Clicking On Save Button

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveExbtrBtn);

		driver.findElement(saveExbtrBtn).click();
		
		Thread.sleep(2000);

		// Clicking On Close Pop Up

		System.out.println("Clicking On Close Pop Up");

		waitForClickabilityOf(closePopUp);

		driver.findElement(closePopUp).click();
		
		Thread.sleep(2000);

		// Clicking On Exhibitor Type

		System.out.println("Clicking On Exhibitor Type");

		waitForClickabilityOf(selectExbtrType);

		driver.findElement(selectExbtrType).click();
		
		Thread.sleep(2000);

		// Selecting Exhibitor Type

		System.out.println("Selecting Exhibitor Type");

		waitForClickabilityOf(select1stType);

		driver.findElement(select1stType).click();
		
		Thread.sleep(2000);

		// Entering Exhibitor Name

		System.out.println("Entering Exhibitor Name as : " + ExbtrName);

		waitForClickabilityOf(exhibitorName);

		driver.findElement(exhibitorName).sendKeys(ExbtrName);
		
		Thread.sleep(2000);

		// Entering Booth No

		System.out.println("Entering Booth No");

		waitForClickabilityOf(boothNo);

		driver.findElement(boothNo).sendKeys("8");
		
		Thread.sleep(2000);

		// Converting the String to Lower case

		String sExbtrName = ExbtrName.toLowerCase();

		// Entering Exhibitor Website

		System.out.println("Entering Exhibitor Website as : " + sExbtrName + ".com");

		waitForClickabilityOf(website);

		driver.findElement(website).sendKeys(sExbtrName);
		
		Thread.sleep(2000);

		// Entering Exhibitor Email Id

		System.out.println("Entering Exhibitor Email Id as : " + sExbtrName + "@yop.com");

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).sendKeys(sExbtrName + "@yop.com");
		
		Thread.sleep(2000);

		// Entering Exhibitor Phone No

		System.out.println("Entering Exhibitor Phone No ");

		waitForClickabilityOf(contactNo);

		driver.findElement(contactNo).sendKeys("9786653421");
		
		Thread.sleep(2000);

		// Entering Exhibitor Country

		System.out.println("Entering Exhibitor Country");

		waitForClickabilityOf(selectCountry);

		driver.findElement(selectCountry).click();

		waitForClickabilityOf(selectUSA);

		driver.findElement(selectUSA).click();
		
		Thread.sleep(2000);

		// Entering Exhibitor Address

		System.out.println("Entering Exhibitor Address");

		waitForClickabilityOf(address);

		driver.findElement(address).sendKeys("202,Columbia Heights, Northwest, Washington, D.C.");
		
		Thread.sleep(2000);

		// Entering Exhibitor Profile

		System.out.println("Entering Exhibitor Profile");

		waitForClickabilityOf(profile);

		driver.findElement(profile).sendKeys("This is Test Exhibitor Profile");
		
		Thread.sleep(2000);

		// Adding Exhibitor Logo

		System.out.println("Adding Exhibitor Logo");

		waitForClickabilityOf(exbtrLogo);

		driver.findElement(exbtrLogo).sendKeys(ExbtrPath);
		
//		Thread.sleep(2000);
		
//		try {
////			 Adding Exhibitor Banner
//
//			System.out.println("Adding Exhibitor Banner");
//
//			waitForClickabilityOf(exbtrBanner);
//
//			driver.findElement(exbtrBanner).sendKeys(home+"/Test Data/ExhibitorBanner.png");
//
//		} catch (Exception e) {
//
//		}
		
		Thread.sleep(2000);

//		 Clicking On Save Button

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveBtn);

		driver.findElement(saveBtn).click();

		Thread.sleep(2000);

		try {
			popUpHandeling();

		} catch (Exception e) {

		}

//		 Getting No Of Exhibitor

		waitForClickabilityOf(exbtrCount);

		List<WebElement> element = driver.findElements(exbtrCount);

		int NoOfExExbtr = element.size();

		if (NoOfExExbtr == 1) {

			System.out.println("Successfully Added one Exhibitor");

		} else if (NoOfExExbtr == 2) {
			
			System.out.println("Successfully Added one Exhibitor");
			
		} else {
			
			System.out.println("Failed to Add Exhibitor");
			
		}
		
		
		

		return new AddExhibitors(driver);

	}

	public AddExhibitors exhibitorList(String EmailId, String Password, String EventFullName)throws InterruptedException {

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

		System.out.println("Clicking on Exhibitor");

		waitForClickabilityOf(clickOnExhibitors);

		driver.findElement(clickOnExhibitors).click();

		// Unpublishing the Exhibitor

		System.out.println("Unpublishing the Exhibitor");

		waitForClickabilityOf(clickOn1stExbtr);

		driver.findElement(clickOn1stExbtr).click();

		waitForClickabilityOf(clickOnUnpublish);

		driver.findElement(clickOnUnpublish).click();

		System.out.println("Clicking On OK to Unpublish the Exhibitor");

		try {

			popUpHandeling();

		} catch (Exception e) {

		}

		Thread.sleep(2000);

		try {

			popUpHandeling();

		} catch (Exception e) {

		}

		waitForClickabilityOf(unpublishState);

		WebElement UnPublishStatus = driver.findElement(unpublishState);

		System.out.println("Current Exhibitor Status is Unpublish : " + UnPublishStatus.isDisplayed());

		Thread.sleep(2000);

		// Publishing the Exhibitor

		System.out.println("Publishing the Exhibitor");

		waitForClickabilityOf(clickOn1stExbtr);

		driver.findElement(clickOn1stExbtr).click();

		waitForClickabilityOf(clickOnPublish);

		driver.findElement(clickOnPublish).click();

		System.out.println("Clicking On OK to Publish the Exhibitor");

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

		System.out.println("Current Exhibitor Status is Publish : " + PublishStatus.isDisplayed());

		Thread.sleep(2000);

		return new AddExhibitors(driver);

	}

	public AddExhibitors mapExhibitorWithUser(String EmailId, String Password, String EventFullName)throws InterruptedException {

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

		System.out.println("Clicking on Exhibitor");

		waitForClickabilityOf(clickOnExhibitors);

		driver.findElement(clickOnExhibitors).click();

		// Clicking on Map Exhibitor with Users

		System.out.println("Clicking on Map Exhibitor with Users");

		waitForClickabilityOf(clickOnMapExbtr);

		driver.findElement(clickOnMapExbtr).click();

		// Selecting Exhibitor

		System.out.println("Selecting Exhibitor");

		waitForClickabilityOf(selectExbtr);

		Select exbtrDropDown = new Select(driver.findElement(selectExbtr));

		exbtrDropDown.selectByIndex(1);
		
		Thread.sleep(2000);

		// Clicking on Map Exhibitor with Users

		System.out.println("Clicking on Select Users Radio Button");

		waitForClickabilityOf(selectUserRadioBtn);

		boolean SelectUsers = driver.findElement(selectUserRadioBtn).isSelected();

		if (SelectUsers == true) {

			System.out.println("Users are all ready selected : " + SelectUsers);

		} else {

			driver.findElement(selectUserRadioBtn).click();

		}
		
//		driver.findElement(selectUserRadioBtn).click();
		
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

			System.out.println("Successfully Mapped Exhibitor with User");

		} else {

			System.out.println("Failed to Map Exhibitor with User");

		}

		return new AddExhibitors(driver);

	}
	
	public AddExhibitors mapExhibitorWithUserGroup(String EmailId, String Password, String EventFullName)throws InterruptedException {

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

		System.out.println("Clicking on Exhibitor");

		waitForClickabilityOf(clickOnExhibitors);

		driver.findElement(clickOnExhibitors).click();

		// Clicking on Map Exhibitor with Users

		System.out.println("Clicking on Map Exhibitor with Users");

		waitForClickabilityOf(clickOnMapExbtr);

		driver.findElement(clickOnMapExbtr).click();

		// Selecting Exhibitor

		System.out.println("Selecting Exhibitor");

		waitForClickabilityOf(selectExbtr);

		Select exbtrDropDown = new Select(driver.findElement(selectExbtr));

		exbtrDropDown.selectByIndex(1);
		
		Thread.sleep(2000);

		// Clicking on Map Exhibitor with Users

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

			System.out.println("Successfully Mapped Exhibitor with User Group");

		} else {

			System.out.println("Failed to Map Exhibitor with User Group");

		}

		return new AddExhibitors(driver);

	}

}
