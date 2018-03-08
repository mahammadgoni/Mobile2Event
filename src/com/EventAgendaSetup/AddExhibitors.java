package com.EventAgendaSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AddExhibitors extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnAgendaSetUp = By.xpath("//li[@id='AG']//a[@href='javascript:void(0);']");
	
	By clickOnExhibitors = By.xpath("//*[@href='exhibitors.aspx'][contains(text(),'Exhibitors')]");
	
	By clickOnAddExhibitor = By.xpath("//html//ul[@class='menu-3rd-level clearfix']/li[2]");
	
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
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnEditSave']");
	
	By exbtrCount = By.xpath("//*[@id='ContentPlaceHolder1_gvExibitor']");
	

	public AddExhibitors(WebDriver driver) {
		super(driver);
		
	}
	
	public AddExhibitors addExhibitor(String EmailId, String Password,String EventFullName,String ExbtrName) throws InterruptedException{
		
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
		
//		Clicking on Exhibitor
		
		System.out.println("Clicking on Exhibitor");
		
		waitForClickabilityOf(clickOnExhibitors);
		
		driver.findElement(clickOnExhibitors).click();
		
//		Clicking on Add Exhibitor
		
		System.out.println("Clicking on Add Exhibitor");
		
		waitForClickabilityOf(clickOnAddExhibitor);
		
		driver.findElement(clickOnAddExhibitor).click();
		
//		Clicking on Add Button
		
		System.out.println("Clicking on Add Button");
		
		waitForClickabilityOf(addExbtrBtn);
		
		driver.findElement(addExbtrBtn).click();
		
//		Entering Exhibitor Type
		
		System.out.println("Entering Exhibitor Type");
		
		waitForClickabilityOf(exbtrType);
		
		driver.findElement(exbtrType).sendKeys("Silver");
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveExbtrBtn);
		
		driver.findElement(saveExbtrBtn).click();
		
//		Clicking On Close Pop Up
		
		System.out.println("Clicking On Close Pop Up");
		
		waitForClickabilityOf(closePopUp);
		
		driver.findElement(closePopUp).click();
		
//		Clicking On Exhibitor Type
		
		System.out.println("Clicking On Exhibitor Type");
		
		waitForClickabilityOf(selectExbtrType);
		
		driver.findElement(selectExbtrType).click();
		
//		Selecting Exhibitor Type
		
		System.out.println("Selecting Exhibitor Type");
		
		waitForClickabilityOf(select1stType);
		
		driver.findElement(select1stType).click();
		
//		Entering Exhibitor Name
		
		System.out.println("Entering Exhibitor Name as : "+ExbtrName);
		
		waitForClickabilityOf(exhibitorName);
		
		driver.findElement(exhibitorName).sendKeys(ExbtrName);
		
//		Entering Booth No
		
		System.out.println("Entering Booth No");
		
		waitForClickabilityOf(boothNo);
		
		driver.findElement(boothNo).sendKeys("8");
		
//		Converting the String to Lower case
		
		String sExbtrName = ExbtrName.toLowerCase();
		
//		Entering Exhibitor Website
		
		System.out.println("Entering Exhibitor Website as : "+sExbtrName+".com");
		
		waitForClickabilityOf(website);
		
		driver.findElement(website).sendKeys(sExbtrName);
		
//		Entering Exhibitor Email Id
		
		System.out.println("Entering Exhibitor Email Id as : "+sExbtrName+"@yop.com");
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).sendKeys(sExbtrName+"@yop.com");
		
//		Entering Exhibitor Phone No 
		
		System.out.println("Entering Exhibitor Phone No ");
		
		waitForClickabilityOf(contactNo);
		
		driver.findElement(contactNo).sendKeys("9786653421");
		
//		Entering Exhibitor Country
		
		System.out.println("Entering Exhibitor Country");
		
		waitForClickabilityOf(selectCountry);
		
		driver.findElement(selectCountry).click();
		
		waitForClickabilityOf(selectUSA);
		
		driver.findElement(selectUSA).click();
		
//		Entering Exhibitor Address
		
		System.out.println("Entering Exhibitor Address");
		
		waitForClickabilityOf(address);
		
		driver.findElement(address).sendKeys("202,Columbia Heights, Northwest, Washington, D.C.");
		
//		Entering Exhibitor Profile
		
		System.out.println("Entering Exhibitor Profile");
		
		waitForClickabilityOf(profile);
		
		driver.findElement(profile).sendKeys("This is Test Exhibitor Profile");
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();

		} catch (Exception e) {

		}
		
//		Getting No Of Speakers
		
		waitForClickabilityOf(exbtrCount);
		
		List<WebElement> element = driver.findElements(exbtrCount);
		
		int NoOfExExbtr = element.size();
		
		if (NoOfExExbtr==1) {
			
			System.out.println("Successfully Added one Exhibitor");
			
		} else {
			
			System.out.println("Failed to Add Exhibitor");

		}
		
			
		
		return new AddExhibitors(driver);
		
		
	}

}
