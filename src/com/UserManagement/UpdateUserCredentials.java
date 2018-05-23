package com.UserManagement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;

public class UpdateUserCredentials extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By menu = By.xpath("//*[@class='toggle-menu']");

	By userMgnt = By.xpath("//*[@id='UM']");
	
	By updateCredentials = By.xpath("//a[@class='ChangeArrow active'][contains(text(),'Update User Credentials')]");
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_ddlEvents']");
	
//	By selectEvent = By.xpath("//select[@id='ContentPlaceHolder1_ddlEvents']//*[contains(text(),'Nokia 2 Pre Launch Event')]");
	
	By availableUser = By.xpath("//*[@type='checkbox']");

	By select1stUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUsers_0']");	
	
	By updateCredentialBtn = By.xpath("//*[@id='btnCredentials']");
	
	By userVerification = By.xpath("//*[@id='chkUserVerification']");
	
	By resetPassBox = By.xpath("//*[@id='chkReset']");
	
	By verifyUser = By.xpath("//*[@id='ContentPlaceHolder1_rdl_credentials_0']");
	
	By unverifyUser = By.xpath("//*[@id='ContentPlaceHolder1_rdl_credentials_1']");
	
	By resetPass = By.xpath("//*[@id='txtpwd']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnCredUpdate']");
	

	public UpdateUserCredentials(WebDriver driver) {
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
	
	public UpdateUserCredentials updateCredentials(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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
		
//		Clicking on Update User Credentials

		System.out.println("Clicking on Update User Credentials");

		waitForClickabilityOf(updateCredentials);

		driver.findElement(updateCredentials).click();
		
		Thread.sleep(2000);
				
//		Searching for the Event 

		System.out.println("Searching for the Event ");

		waitForClickabilityOf(searchEvent);
	
		driver.findElement(searchEvent).click();
		
		Thread.sleep(2000);
		
//	    Selecting the Event

		System.out.println("Selecting the Event  : "+EventFullName);

		waitForClickabilityOf(By.xpath("//*[contains(text(),'"+EventFullName+"')]"));

		driver.findElement(By.xpath("//*[contains(text(),'"+EventFullName+"')]")).click();
		
		Thread.sleep(2000);
				
//	    Selecting the 1st User

		System.out.println("Selecting the 1st User");

		waitForClickabilityOf(select1stUser);

		driver.findElement(select1stUser).click();
		
		Thread.sleep(2000);
		
//		Clicking On Update Credentials Button

		System.out.println("Clicking On Update Credentials Button");

		waitForClickabilityOf(updateCredentialBtn);

		driver.findElement(updateCredentialBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On User Verification Checkbox

		System.out.println("Clicking On User Verification Checkbox");

		waitForClickabilityOf(userVerification);

		driver.findElement(userVerification).click();
		
		Thread.sleep(2000);
		
//		Clicking On User Verification Checkbox

		System.out.println("Clicking On Verify User Radio Button");

		waitForClickabilityOf(verifyUser);

		driver.findElement(verifyUser).click();
		
		Thread.sleep(2000);
		
//		Clicking On Reset Password Checkbox

		System.out.println("Clicking On Reset Password Checkbox");

		waitForClickabilityOf(resetPassBox);

		driver.findElement(resetPassBox).click();
		
		Thread.sleep(2000);
		
//		Entering Reset Password

		System.out.println("Entering Reset Password");

		waitForClickabilityOf(resetPass);

		driver.findElement(resetPass).sendKeys("123456");
		
		Thread.sleep(2000);
		
//		Clicking On Save Button

		System.out.println("Clicking On Save Button");

		waitForClickabilityOf(saveBtn);

		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
//		Verifying the Pop Up Message
		
    	Alert alert  = driver.switchTo().alert();   
    	
    	String alertMessage = driver.switchTo().alert().getText();    
    	
		Thread.sleep(2000);
    	
    	alert.accept();
    	
		Thread.sleep(2000);
		
		if (alertMessage.equals("User credentials updated successfully.")) {
			
			System.out.println("Successfully Updated User Credentials");
			
		} else {
			
			System.out.println("Failed to Update User Credentials");

		}
			
		
		return new UpdateUserCredentials(driver);
		
	}

}
