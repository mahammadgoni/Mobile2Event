package com.UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class RolesAndPrivileges extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By logoutBtn = By.xpath("//*[@id and @onclick and @data-rel]");

	By menu = By.xpath("//*[@class='toggle-menu']");

	By userMgnt = By.xpath("//*[@id='UM']");

	By user = By.xpath("//*[@id='UMUser']");
	
	By rolesPrivilege = By.xpath("//html//li[@id='Roles_And_Privilege']/a[1]");
	
	By mapRoles = By.xpath("/html[1]/body[1]/div[1]/form[1]/header[1]/section[3]/div[1]/ul[1]/li[2]/a[1]");
	
	By searchUserName = By.xpath("//*[@id='ContentPlaceHolder1_txtUserName']");
	
	

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
	
	public RolesAndPrivileges addRoleAndPrivilege(){
		
		
		return new RolesAndPrivileges(driver);
		
	}

}
