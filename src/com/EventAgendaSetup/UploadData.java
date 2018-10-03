package com.EventAgendaSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class UploadData extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");

	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");

	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");

	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");

//	By clickOnUpload = By.xpath("//*[@href='BulkUploadData.aspx'][contains(text(),'Upload')]");
	
	By clickOnUpload = By.xpath("//li[@id='Upload']");
	
	By clickOnExcelFile = By.xpath("//*[@id='ContentPlaceHolder1_fileupload']");
	
	By clickOnSpeakerImage = By.xpath("//*[@id='fileupload1']");
	
	By clickOnExhibitorImage = By.xpath("//*[@id='fileupload2']");
	
	By clickOnSponsorImage = By.xpath("//*[@id='fileupload3']");
	
	By uploadBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSubmit']");
	
	By downloadTemplate = By.xpath("//*[@id='ContentPlaceHolder1_btnDataTamplate']");
	
	By bulkUploadHistory = By.xpath("//*[@id='ContentPlaceHolder1_Button1']");
	
	By uploadStatus = By.xpath("//*[@id='ContentPlaceHolder1_gvBulkUploadHistory_lblStatus_0']");
	

	public UploadData(WebDriver driver) {
		super(driver);
	
	}
	
	public UploadData e2mDataImport(String EmailId, String Password, String EventFullName,String E2MDataPath) throws InterruptedException{
		
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

		// Clicking on Upload

		System.out.println("Clicking on Upload");

		waitForClickabilityOf(clickOnUpload);

		driver.findElement(clickOnUpload).click();
		
//		Selecting the Excel File to Upload

		System.out.println("Selecting the Excel File to Upload");

		waitForClickabilityOf(clickOnExcelFile);

		driver.findElement(clickOnExcelFile).sendKeys(E2MDataPath);
		
//		Selecting the Speaker.zip File to Upload

		System.out.println("Selecting the Speaker.zip File to Upload");

		waitForClickabilityOf(clickOnSpeakerImage);

		driver.findElement(clickOnSpeakerImage).sendKeys(home+"/Test Data/anie_speaker.jpg.zip");
		
//		Selecting the Exhibitor.zip File to Upload

		System.out.println("Selecting the Exhibitor.zip File to Upload");

		waitForClickabilityOf(clickOnExhibitorImage);

		driver.findElement(clickOnExhibitorImage).sendKeys(home+"/Test Data/anie_Exhibitor.jpg.zip");
		
//		Selecting the Sponsor.zip File to Upload

		System.out.println("Selecting the Sponsor.zip File to Upload");

		waitForClickabilityOf(clickOnSponsorImage);

		driver.findElement(clickOnSponsorImage).sendKeys(home+"/Test Data/anie_Sponsor.jpg.zip");
		
//		Clicking On Upload Button

		System.out.println("Clicking On Upload Button");

		waitForClickabilityOf(uploadBtn);

		driver.findElement(uploadBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Bulk Upload History

		System.out.println("Clicking On Bulk Upload History");

		waitForClickabilityOf(bulkUploadHistory);

		driver.findElement(bulkUploadHistory).click();
		
		Thread.sleep(2000);
		
		// Getting Success Message

		String ActMessage = driver.findElement(uploadStatus).getText();
		
		System.out.println(ActMessage);

		String ExpMessage = "Successful";

		if (ActMessage.equals(ExpMessage)) {

			System.out.println("Successfully Uploaded E2MData");

		} else {

			System.out.println("Failed to Upload E2MData");

		}
		
		
		return new UploadData(driver);
		
	}

}
