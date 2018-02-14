package com.EventManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;

public class MapUserToEvent extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By logoutBtn = By.xpath("//*[@id='top1_Logout'][@class='tm-logout']");

	By menu = By.xpath("//*[@class='toggle-menu']");
	
	By searchAnEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By agendaSetup = By.xpath("//li[@id='AG']//a[@class='menu-item has-submneu']");
	
	By attendees = By.xpath("//*[@id='Attendees']");
	
	By mappedUserDropDown = By.xpath("//*[@id='ContentPlaceHolder1_ddlIsMapped']");
	
	By selectAllUser = By.xpath("//*[@id='ContentPlaceHolder1_ddlIsMapped']//option[@value='0']");
	
	By searchUser = By.xpath("//*[@id='ContentPlaceHolder1_txtUserName']");
	
//	By appUserRole = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_0_2_0']");
	
	By appUserRole = By.xpath("//html//tr[3]/td[1]");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By message = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");


	public MapUserToEvent(WebDriver driver) {
		super(driver);
		
	}
	
	public MapUserToEvent mapUserToEvent(String EmailId,String Password,String EventName,String MapUserEmail){
		
		System.out.println("Entering Email id  is : "+EmailId);
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).clear();
		
		driver.findElement(emailId).sendKeys(EmailId);
		
		System.out.println("Clicking on Proceed Button");
		
		waitForClickabilityOf(proceedBtn);
		
		driver.findElement(proceedBtn).click();
				
		System.out.println("Entering Password  is : "+Password);
		
		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();
		
		driver.findElement(pass).sendKeys(Password);
		
		System.out.println("Clicking on Sign in Button");
		
		waitForClickabilityOf(signInBtn);
		
		driver.findElement(signInBtn).click();
		
		System.out.println("Search the Event Name : "+EventName);
		
		waitForClickabilityOf(searchAnEvent);
		
		WebElement search = driver.findElement(searchAnEvent);
		
		search.sendKeys(EventName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		System.out.println("Clicking on The Event");
		
		waitForClickabilityOf(clickOnEvent);
		
		driver.findElement(clickOnEvent).click();
		
		System.out.println("Clicking on Agenda Setup");
		
		waitForClickabilityOf(agendaSetup);
		
		driver.findElement(agendaSetup).click();
		
		System.out.println("Clicking on Attendees");
		
		waitForClickabilityOf(attendees);
		
		driver.findElement(attendees).click();
		
		System.out.println("Changing User type to All");
		
		waitForClickabilityOf(mappedUserDropDown);
		
		driver.findElement(mappedUserDropDown).click();
		
		waitForClickabilityOf(selectAllUser);
		
		driver.findElement(selectAllUser).click();
		
		System.out.println("Searching for the User : "+MapUserEmail);
		
		waitForClickabilityOf(searchUser);
		
		WebElement userSrch = driver.findElement(searchUser);
		
		userSrch.sendKeys(MapUserEmail);
		
//		Pressing Enter Button 
		
		userSrch.sendKeys(Keys.ENTER);
		
		System.out.println("Giving Role as App User");
		
		waitForClickabilityOf(appUserRole);
		
		driver.findElement(appUserRole).click();
		
		System.out.println("Clicking On Save Button ");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		String actSuccsMsg = "Record saved successfully.";
		
		String successMeg = driver.findElement(message).getText();
			
		System.out.println(successMeg);
		
		if (actSuccsMsg.equals(successMeg)) {
			
			System.out.println("Succefully Given Role to User");
			
		} else {
			
			System.out.println("Failed to give the Role");

		}
				
		
		return new MapUserToEvent(driver);
		
	}

}
