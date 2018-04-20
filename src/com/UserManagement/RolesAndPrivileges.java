package com.UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;

public class RolesAndPrivileges extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By menu = By.xpath("//*[@class='toggle-menu']");

	By userMgnt = By.xpath("//*[@id='UM']");

	By user = By.xpath("//*[@id='UMUser']");
	
	By rolesPrivilege = By.xpath("//html//li[@id='Roles_And_Privilege']/a[1]");
	
	By addBtn = By.xpath("//a[@id='ContentPlaceHolder1_BtnAddNew']");
	
	By roleName = By.xpath("//*[@id='ContentPlaceHolder1_txtRole']");
	
	By searchRole = By.xpath("//*[@id='ContentPlaceHolder1_txtRole']");
	
	By addedRoleName = By.xpath("//a[@id='ContentPlaceHolder1_gvRole_lnkButton_0']");
	
	By cmsEvent = By.xpath("//*[@id='ContentPlaceHolder1_rptPrivAdmin_chkRowAll_3']");
	
	By cmsUser = By.xpath("//*[@id='ContentPlaceHolder1_rptPrivAdmin_chkRowAll_11']");
	
	By cmsPoll = By.xpath("//*[@id='ContentPlaceHolder1_rptPrivAdmin_chkRowAll_14']");
	
	By cmsMeeting = By.xpath("//*[@id='ContentPlaceHolder1_rptPrivAdmin_chkRowAll_32']");
	
	By cmsReport = By.xpath("//*[@id='ContentPlaceHolder1_rptPrivAdmin_chkRowAll_40']");
	
	By liveEvent = By.xpath("//*[@id='ContentPlaceHolder1_rptPrivAdmin_chkRowAll_51']");
	
	By appLogin = By.xpath("//input[@id='ContentPlaceHolder1_chkPrivApp_0']");
	
	By expertLogin = By.xpath("//input[@id='ContentPlaceHolder1_chkPrivApp_1']");
	
	By chatbot = By.xpath("//input[@id='ContentPlaceHolder1_chkPrivApp_2']");
	
	By appCheckin = By.xpath("//input[@id='ContentPlaceHolder1_chkPrivApp_3']");
	
	By allowMessaging = By.xpath("//input[@id='ContentPlaceHolder1_chkPrivApp_4']");
	
	By showAttendeeList = By.xpath("//input[@id='ContentPlaceHolder1_chkPrivApp_5']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	String Role = "Automation Manger";
	
		

	public RolesAndPrivileges(WebDriver driver) {
		super(driver);
		
	}
	
	public void commonLogin(String EmailId, String Password) throws InterruptedException{
		
		System.out.println("Entering Email id  is : " + EmailId);

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		driver.findElement(emailId).sendKeys(EmailId);
		
		Thread.sleep(2000);
		
//		Clicking on Proceed Button

		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();
		
		Thread.sleep(2000);
		
//		Entering Password

		System.out.println("Entering Password  is : " + Password);

		waitForClickabilityOf(pass);

		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(Password);
		
		Thread.sleep(2000);
		
//		Clicking on Sign in Button

		System.out.println("Clicking on Sign in Button");

		waitForClickabilityOf(signInBtn);

		driver.findElement(signInBtn).click();
		
	}
	
	public RolesAndPrivileges addRoleAndPrivilege(String EmailId, String Password) throws InterruptedException{
		
		commonLogin(EmailId, Password);
		
		Thread.sleep(2000);
		
//		Clicking on Menu

		System.out.println("Clicking on Menu");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
//		Clicking on User Management

		System.out.println("Clicking on User Management");

		waitForClickabilityOf(userMgnt);

		driver.findElement(userMgnt).click();
		
		Thread.sleep(2000);
		
//		Clicking on Users from User Management

		System.out.println("Clicking on Users from User Management");

		waitForClickabilityOf(rolesPrivilege);

		driver.findElement(rolesPrivilege).click();
		
		Thread.sleep(2000);
		
//	    Clicking on Add Button to Add Role

		System.out.println("Clicking on Add Button to Add Role");

		waitForClickabilityOf(addBtn);

		driver.findElement(addBtn).click();
		
		Thread.sleep(2000);
		
//	    Clicking on Add Button to Add Role

		System.out.println("Entering Role Name");

		waitForClickabilityOf(roleName);

		driver.findElement(roleName).sendKeys(Role);
		
		Thread.sleep(2000);
		
//	    Giving CMS Event Privilege

		System.out.println("Giving CMS Event Privilege");

		waitForClickabilityOf(cmsEvent);

		driver.findElement(cmsEvent).click();
		
		Thread.sleep(2000);
		
//	    Giving CMS User Privilege

		System.out.println("Giving CMS User Privilege");

		waitForClickabilityOf(cmsUser);

		driver.findElement(cmsUser).click();
		
		Thread.sleep(2000);
		
//	    Giving CMS Poll Privilege

		System.out.println("Giving CMS Poll Privilege");

		waitForClickabilityOf(cmsPoll);

		driver.findElement(cmsPoll).click();
		
		Thread.sleep(2000);
		
//	    Giving CMS Meeting Privilege

		System.out.println("Giving CMS Meeting Privilege");

		waitForClickabilityOf(cmsMeeting);

		driver.findElement(cmsMeeting).click();
		
		Thread.sleep(2000);
		
//	    Giving CMS Report Privilege

		System.out.println("Giving CMS Report Privilege");

		waitForClickabilityOf(cmsReport);

		driver.findElement(cmsReport).click();
		
//	    Giving CMS Report Privilege

		System.out.println("Giving CMS Live Event Privilege");

		waitForClickabilityOf(liveEvent);

		driver.findElement(liveEvent).click();
		
		Thread.sleep(2000);
		
//	    Giving App Login Privilege

		System.out.println("Giving App Login Privilege");

		waitForClickabilityOf(appLogin);

		driver.findElement(appLogin).click();
		
		Thread.sleep(2000);
		
//	    Giving Expert Login Privilege

		System.out.println("Giving Expert Login Privilege");

		waitForClickabilityOf(expertLogin);

		driver.findElement(expertLogin).click();
		
		Thread.sleep(2000);
		
//	    Giving Chat Bot User Privilege

		System.out.println("Giving Chat Bot User Privilege");

		waitForClickabilityOf(chatbot);

		driver.findElement(chatbot).click();
		
		Thread.sleep(2000);
		
//	    Giving App Check In Privilege

		System.out.println("Giving App Check In Privilege");

		waitForClickabilityOf(appCheckin);

		driver.findElement(appCheckin).click();
		
		Thread.sleep(2000);
		
//	    Giving Allow Messaging Privilege

		System.out.println("Giving Allow Messaging Privilege");

		waitForClickabilityOf(allowMessaging);

		driver.findElement(allowMessaging).click();
		
		Thread.sleep(2000);
		
//	    Giving Show Attendee List Privilege

		System.out.println("Giving Show Attendee List Privilege");

		waitForClickabilityOf(showAttendeeList);

		driver.findElement(showAttendeeList).click();
		
		Thread.sleep(2000);
		
//	    Clicking On Save Button

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveBtn);

		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//	    Clicking On Search Role

		System.out.println("Searching for : "+Role+" Role");

		waitForClickabilityOf(searchRole);
		
		WebElement search = driver.findElement(searchRole);
		
		search.sendKeys(Role);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Storing the Added Role Name in String 
		
		String AddedRole = driver.findElement(addedRoleName).getText();
		
//		Verifying the Roles
		
		if (Role.equals(AddedRole)) {
			
			System.out.println("Successfully Added One Role and Privileges");
			
		} else {
			
			System.out.println("Failed to Add Role and Privileges");

		}
		
		
		
		return new RolesAndPrivileges(driver);
		
	}
	
	public RolesAndPrivileges globalRights(){
		
			
		return new RolesAndPrivileges(driver);
		
	}

}
