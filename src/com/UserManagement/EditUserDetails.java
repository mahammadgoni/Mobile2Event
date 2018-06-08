package com.UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;

public class EditUserDetails extends BaseSetUp{
	
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
	
	By userType = By.xpath("//*[@id='ContentPlaceHolder1_ddlIsMapped']");
	
	By techAdmin = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUserRole_0_2_0']");
	
//	Reset User Password Elements
	
	By user1stEmailId = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_lblEmail_0']");
	
	By user1stName = By.xpath("//a[@id='ContentPlaceHolder1_gvUser_btnEdit_0']");
	
	By resetOption = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_imgResetPassword_0']");
	
	By loggedInAcName = By.xpath("//a[@id='top1_GoToAccount']//br");
	
	By user1stEditBtn = By.xpath("//a[@id='ContentPlaceHolder1_gvUser_btnEditUser_0']//img[@src='/images/btn-edit2.png']");
	
	By checkSetPassword = By.xpath("//*[@id='chkSetPassword']");
	
	By setPassword = By.xpath("//*[@id='txtUserDefinePassword']");
	
	By saveButton = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	String Password1stUser = "#auto123";
	
//	Change User Details 
	
	By firstName = By.xpath("//*[@id='ContentPlaceHolder1_txtFirstName']");
	
	By lastName = By.xpath("//*[@id='ContentPlaceHolder1_txtLastName']");
	
	By position = By.xpath("//*[@id='ContentPlaceHolder1_txtPosition']");
	
	By organization = By.xpath("//*[@id='ContentPlaceHolder1_txtOrganization']");
	
	By organizationName = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_lblOrganization_0']");
	
	By jobTitle = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_lblJobTitle_0']");
	
	

	public EditUserDetails(WebDriver driver) {
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
	
	public EditUserDetails resetUserPassword(String EmailId, String Password) throws InterruptedException{
		
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

		waitForClickabilityOf(user);

		driver.findElement(user).click();
		
		Thread.sleep(2000);
		
//		Storing the 1st User Email in String
		
		String Email1stID = driver.findElement(user1stEmailId).getText();
		
//		Storing the 1st User Name in String
		
		String UserName1st = driver.findElement(user1stName).getText();
		
//		Clicking on Edit Button	

		System.out.println("Clicking on Edit Button	");

		waitForClickabilityOf(user1stEditBtn);

		driver.findElement(user1stEditBtn).click();
		
//		Clicking on Set Password Check box

		System.out.println("Clicking on Set Password Checkbox");
		
		boolean SetPassword = driver.findElement(checkSetPassword).isSelected();
		
		if (SetPassword==false) {
			
			driver.findElement(checkSetPassword).click();
						
		} else {
			
		}
		
//		Setting User Password
		
		System.out.println("Entering New Password as : "+Password1stUser);
		
		waitForClickabilityOf(setPassword);

		driver.findElement(setPassword).clear();
		
		driver.findElement(setPassword).sendKeys(Password1stUser);
		
		Thread.sleep(2000);
		
//		Clicking on Save Button	

		System.out.println("Clicking on Save Button	");

		waitForClickabilityOf(saveButton);

		driver.findElement(saveButton).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
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
		
		try {
			
//			Clicking on Users from User Management

			System.out.println("Clicking on Users from User Management");

			waitForClickabilityOf(rolesPrivilege);

			driver.findElement(rolesPrivilege).click();
			
			Thread.sleep(2000);
			
//			Clicking on Map Roles

			System.out.println("Clicking on Map Roles");

			waitForClickabilityOf(mapRoles);
			
			boolean MapRoles = driver.findElement(mapRoles).isEnabled();
			
			System.out.println(MapRoles);
			
			if (MapRoles==true) {
				
				driver.findElement(mapRoles).click();
				
			} else {
				
				driver.findElement(mapRoles).click();

			}
			
		} catch (Exception e) {
			
		}
	
		Thread.sleep(2000);
		
//	    Selecting User Type 
		
		System.out.println("Selecting User Type");
		
		waitForClickabilityOf(userType);
		
		Select UserType = new Select(driver.findElement(userType));
		
		UserType.selectByIndex(0);
		
//		Searching for the User Name
		
		System.out.println("Searching for the User Name");

		waitForClickabilityOf(searchUserName);
										
		WebElement search = driver.findElement(searchUserName);
		
		search.sendKeys(Email1stID);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		"Clicking on Tech Admin Check Box"
		
		System.out.println("Clicking on Tech Admin Check Box");

		waitForClickabilityOf(techAdmin);
								
		driver.findElement(techAdmin).click();
		
//		Clicking on Save Button	

		System.out.println("Clicking on Save Button	");

		waitForClickabilityOf(saveButton);

		driver.findElement(saveButton).click();
			
		Thread.sleep(2000);
		
//		Clicking on Logout Button
		
		System.out.println("Clicking on Logout Button");

		waitForClickabilityOf(logoutBtn);
								
		driver.findElement(logoutBtn).click();
		
		Thread.sleep(2000);
		
//		Again Login with New User Name and Password
		
		commonLogin(Email1stID, Password1stUser);
		
		Thread.sleep(2000);
		
//		Clicking on Logout Button
		
		System.out.println("Clicking on Logout Button");

		waitForClickabilityOf(logoutBtn);
								
		driver.findElement(logoutBtn).click();
		
		Thread.sleep(2000);
		
		commonLogin(EmailId, Password);
		
//		Searching for the User Name
		
		System.out.println("Searching for the User Name");

		waitForClickabilityOf(searchUserName);
										
		WebElement search1 = driver.findElement(searchUserName);
		
		search1.sendKeys(Email1stID);
		
//		Pressing Enter Button 
		
		search1.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Clicking on Logout Button
		
		System.out.println("Clicking on Reset Option to reset the Password ");

		waitForClickabilityOf(logoutBtn);
								
		driver.findElement(logoutBtn).click();
		
//		Again Login with New User Name and Password
		
		commonLogin(Email1stID, Password);
			
		Thread.sleep(2000);		
		
//		Storing the 1st User Name in String
		
		String AcName = driver.findElement(loggedInAcName).getText();
		
		if (UserName1st.equals(AcName)) {
			
			System.out.println("Successfully Reset the Password");
			
		} else {
			
			System.out.println("Failed to Reset the Password");

		}
			
		
		
		return new EditUserDetails(driver);
		
	}
	
	public EditUserDetails editAndChangeUserDetails(String EmailId, String Password) throws InterruptedException{
		
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

		waitForClickabilityOf(user);

		driver.findElement(user).click();
		
		Thread.sleep(2000);
		
//		Storing the 1st User Email in String
		
		String Organization1st = driver.findElement(organizationName).getText();
		
		System.out.println("Organization Name is : "+Organization1st);
		
		Thread.sleep(2000);
		
//		Storing the 1st User Email in String
		
		String JobTitle1st = driver.findElement(jobTitle).getText();
		
		System.out.println("Job Title is : "+JobTitle1st);
		
		Thread.sleep(2000);
		
//		Clicking on Edit Button	

		System.out.println("Clicking on Edit Button	");

		waitForClickabilityOf(user1stEditBtn);

		driver.findElement(user1stEditBtn).click();
		
		Thread.sleep(2000);
		
//		Entering the New Position	

		System.out.println("Entering the New Position");

		waitForClickabilityOf(position);

		driver.findElement(position).clear();
		
		driver.findElement(position).sendKeys("Automation Manager");
		
		Thread.sleep(2000);
		
//		Entering the New Organization

		System.out.println("Entering the New Organization");

		waitForClickabilityOf(organization);

		driver.findElement(organization).clear();
		
		driver.findElement(organization).sendKeys("Automation Web Spiders");
		
		Thread.sleep(2000);
		
//		Clicking on Edit Button	

		System.out.println("Clicking On Save Button to Save the details");

		waitForClickabilityOf(saveButton);

		driver.findElement(saveButton).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Storing the 1st User Email in String
		
		String Organization1stN = driver.findElement(organizationName).getText();
		
		System.out.println("Organization Name is : "+Organization1stN);
		
		Thread.sleep(2000);
		
//		Storing the 1st User Email in String
		
		String JobTitle1stN = driver.findElement(jobTitle).getText();
		
		System.out.println("Job Title is : "+JobTitle1stN);
		
		Thread.sleep(2000);
		
//		Verifying the details 
				
		if (Organization1st==Organization1stN) {
			
			System.out.println("Failed to Change User Details");
						
		} else {
			
			System.out.println("Successfully Changed User Details");
			

		}
			
		
		return new EditUserDetails(driver);
		
	}

}
