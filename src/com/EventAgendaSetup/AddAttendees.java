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
	
	By downloadTemplate = By.xpath("//*[@id='ContentPlaceHolder1_btnDataTamplate']");
	
	By exportUnMapped = By.xpath("//*[@id='ContentPlaceHolder1_btnExportNotMapped']");
	
	By exportMapped = By.xpath("//*[@id='ContentPlaceHolder1_btnExport']");
	
	By importAttendees = By.xpath("//*[@id='ContentPlaceHolder1_btnImport']");
	
	By attendeeVisibility = By.xpath("//*[@id='ContentPlaceHolder1_btnAttendeeMap']");
	
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
