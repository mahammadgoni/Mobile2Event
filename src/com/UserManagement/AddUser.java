package com.UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;

public class AddUser extends BaseSetUp{
	

	By emailId = By.xpath("//*[@id='txtLogin']");
	
	By proceedBtn = By.xpath("//*[@id='btnProceed']");
	
	By pass = By.xpath("//*[@id='txtPass']");
	
	By signInBtn = By.xpath("//*[@id='btnLogin']");
	
	By logoutBtn = By.xpath("//*[@id='Layer_1']");
	
//	By menu = By.xpath("//*[@class='toggle-menu']");
	
	By menu = By.xpath("//*[@class='toggle-menu' and @href='javascript:{}']");

	By userMgnt = By.xpath("//*[@id='UM']");
	
	By user = By.xpath("//*[@id='UMUser']");
	
	By noOfUserW = By.xpath("//*[@class='BgColorWhite']");
	
	By noOfUserG = By.xpath("//*[@class='BgColorLightGrey']");
	
	By addUser = By.xpath("//*[@id='ContentPlaceHolder1_BtnAddNew']");
	
	By firstname = By.xpath("//*[@id='ContentPlaceHolder1_txtFirstName']");
	
	By lastName = By.xpath("//*[@id='ContentPlaceHolder1_txtLastName']");
	
	By email = By.xpath("//*[@id='ContentPlaceHolder1_txtEmail']");
	
	By verificationCheckBox = By.xpath("//*[@id='chkUserVerification']");
	
	By verified = By.xpath("//*[@id='ContentPlaceHolder1_rbtlUserVerified_0']");
	
	By unverified = By.xpath("//*[@id='ContentPlaceHolder1_rbtlUserVerified_1']");
	
	By importUser = By.xpath("//*[@id='ContentPlaceHolder1_btnImport']");
	
	By setPassCheckBox = By.xpath("//*[@id='chkSetPassword']");
	
	By setPassword = By.xpath("//*[@id='txtUserDefinePassword']");
	
	By position = By.xpath("//*[@id='ContentPlaceHolder1_txtPosition']");
	
	By organization = By.xpath("//*[@id='ContentPlaceHolder1_txtOrganization']");
	
	By description = By.xpath("//*[@id='ContentPlaceHolder1_txtprofile_ifr']");
	
	By selectCountry = By.xpath("//*[@id='ContentPlaceHolder1_ddlCountryInfo']");
	
	By country = By.xpath("//*[@value='India^+91']");
	
	By mobileNo = By.xpath("//*[@id='ContentPlaceHolder1_txtMobileNo']");
	
	By facebook = By.xpath("//*[@id='ContentPlaceHolder1_txtFB']");
	
	By twitter = By.xpath("//*[@id='ContentPlaceHolder1_txtTwe']");
	
	By linkedin = By.xpath("//*[@id='ContentPlaceHolder1_txtLnk']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By resetbtn = By.xpath("//*[@id='ContentPlaceHolder1_btnReset']");
	
	By downloadTemplete = By.xpath("//*[@id='ContentPlaceHolder1_btnDataTamplate']");
	
	By deleteSelectedUser = By.xpath("//*[@title='Delete']");
	
	By deleteUserFromList = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_imgDelFromList_1']");
	
	
	

	public AddUser(WebDriver driver) {
		super(driver);
		
	}
	
	
	public AddUser addVerifiedUser(String EmailId,String Password,String FirstName,String LastName,String AddUserEmail){
		
		System.out.println("Entering Email id  is : "+EmailId);
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).sendKeys(EmailId);
		
		System.out.println("Clicking on Proceed Button");
		
		waitForClickabilityOf(proceedBtn);
		
		driver.findElement(proceedBtn).click();
				
		System.out.println("Entering Password  is : "+Password);
		
		waitForClickabilityOf(pass);
		
		driver.findElement(pass).sendKeys(Password);
		
		System.out.println("Clicking on Sign in Button");
		
		waitForClickabilityOf(signInBtn);
		
		driver.findElement(signInBtn).click();
		
		System.out.println("Clicking on Menu");
		
		waitForClickabilityOf(menu);
		
		driver.findElement(menu).click();
		
		System.out.println("Clicking on User Management");
		
		waitForClickabilityOf(userMgnt);
		
		driver.findElement(userMgnt).click();
		
		System.out.println("Clicking on Users from User Management");
		
		waitForClickabilityOf(user);
		
		driver.findElement(user).click();
		
//		Need to Add Verification Code Here
		
//		List<WebElement> WUser = driver.findElements(noOfUserW);
//		
//		List<WebElement>  GUser = driver.findElements(noOfUserG);
//			
//		System.out.println("Current Existing User Count is :");
		
//		waitForClickabilityOf(user);
//		
//		driver.findElement(user).click();
		
		System.out.println("Clicking on Add User Button");
		
		waitForClickabilityOf(addUser);
		
		driver.findElement(addUser).click();
		
		System.out.println("Entering First Name : "+FirstName);
		
		waitForClickabilityOf(firstname);
		
		driver.findElement(firstname).sendKeys(FirstName);
		
		System.out.println("Entering Last Name : "+LastName);
		
		waitForClickabilityOf(lastName);
		
		driver.findElement(lastName).sendKeys(LastName);
		
		System.out.println("Entering Email Id : "+AddUserEmail);
		
		waitForClickabilityOf(email);
		
		driver.findElement(email).sendKeys(AddUserEmail);
		
		System.out.println("Clicking on User Verification Check Box ");
		
		if (driver.findElement(verificationCheckBox).isSelected()==true) {
			
			System.out.println("Verification Check Box is already Selected ");
			
		} else {
			
			driver.findElement(verificationCheckBox).click();

		}
		
		System.out.println("Selecting the User type as Verfied");
		
		if (driver.findElement(verified).isSelected()==true) {
			
			System.out.println("User type is already Verified ");
			
		} else {
			
			driver.findElement(verified).click();

		}
		
		System.out.println("Clicking On Set Password Check Box");
		
		waitForClickabilityOf(setPassCheckBox);
		
		driver.findElement(setPassCheckBox).click();
		
		System.out.println("Setting Up The Password : #e2m321");
		
		waitForClickabilityOf(setPassword);
		
		driver.findElement(setPassword).sendKeys("e2m321");
		
		System.out.println("Setting The Possion as : Software Engineer");
		
		waitForClickabilityOf(position);
		
		driver.findElement(position).sendKeys("Software Engineer");
		
		System.out.println("Setting The Company Name as : Webspiders Group");
		
		waitForClickabilityOf(organization);
		
		driver.findElement(organization).sendKeys("Webspiders Group");
		
		System.out.println("Adding Some Description ");
		
		waitForClickabilityOf(description);
		
		driver.findElement(description).sendKeys("This is test Description to Check the Description Box ");
		
		System.out.println("Selecting Country As India");
		
		waitForClickabilityOf(selectCountry);
		
		driver.findElement(selectCountry).click();
		
		waitForClickabilityOf(country);
		
		driver.findElement(country).click();
		
		System.out.println("Entering Mobile No as : 9876543210");
		
		waitForClickabilityOf(mobileNo);
		
		driver.findElement(mobileNo).sendKeys("9876543210");
		
		System.out.println("Entering Facebook url : https://facebook.com");
		
		waitForClickabilityOf(facebook);
		
		driver.findElement(facebook).sendKeys("https://facebook.com");
		
		System.out.println("Entering Twitter url : https://twitter.com");
		
		waitForClickabilityOf(twitter);
		
		driver.findElement(twitter).sendKeys("https://twitter.com");
		
		System.out.println("Entering LinkedIn url : https://linkedin.com");
		
		waitForClickabilityOf(linkedin);
		
		driver.findElement(linkedin).sendKeys("https://linkedin.com");
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		return new AddUser(driver);
		
	}
	
	public AddUser addUnverifiedUser(String EmailId,String Password,String FirstName,String LastName,String AddUserEmail){
		
		System.out.println("Entering Email id  is : "+EmailId);
		
		waitForClickabilityOf(emailId);
		
		driver.findElement(emailId).sendKeys(EmailId);
		
		System.out.println("Clicking on Proceed Button");
		
		waitForClickabilityOf(proceedBtn);
		
		driver.findElement(proceedBtn).click();
				
		System.out.println("Entering Password  is : "+Password);
		
		waitForClickabilityOf(pass);
		
		driver.findElement(pass).sendKeys(Password);
		
		System.out.println("Clicking on Sign in Button");
		
		waitForClickabilityOf(signInBtn);
		
		driver.findElement(signInBtn).click();
		
		System.out.println("Clicking on User Management");
		
		waitForClickabilityOf(userMgnt);
		
		driver.findElement(userMgnt).click();
		
		System.out.println("Clicking on Users from User Management");
		
		waitForClickabilityOf(user);
		
		driver.findElement(user).click();
		
//		Need to Add Verification Code Here
		
//		List<WebElement> WUser = driver.findElements(noOfUserW);
//		
//		List<WebElement>  GUser = driver.findElements(noOfUserG);
//			
//		System.out.println("Current Existing User Count is :");
		
		waitForClickabilityOf(user);
		
		driver.findElement(user).click();
		
		System.out.println("Clicking on Add User Button");
		
		waitForClickabilityOf(addUser);
		
		driver.findElement(addUser).click();
		
		System.out.println("Entering First Name : "+FirstName);
		
		waitForClickabilityOf(firstname);
		
		driver.findElement(firstname).sendKeys(FirstName);
		
		System.out.println("Entering Last Name : "+LastName);
		
		waitForClickabilityOf(lastName);
		
		driver.findElement(lastName).sendKeys(LastName);
		
		System.out.println("Entering Email Id : "+AddUserEmail);
		
		waitForClickabilityOf(email);
		
		driver.findElement(email).sendKeys(AddUserEmail);
		
		System.out.println("Clicking on User Verification Check Box ");
		
		if (driver.findElement(verificationCheckBox).isSelected()==true) {
			
			System.out.println("Verification Check Box is already Selected ");
			
		} else {
			
			driver.findElement(verificationCheckBox).click();

		}
		
		System.out.println("Selecting the User type as Unverfied");
		
		if (driver.findElement(unverified).isSelected()==true) {
			
			System.out.println("User type is already Verified ");
			
		} else {
			
			driver.findElement(unverified).click();

		}
		
		System.out.println("Clicking On Set Password Check Box");
		
		waitForClickabilityOf(setPassCheckBox);
		
		driver.findElement(setPassCheckBox).click();
		
		System.out.println("Setting Up The Password : #e2m321");
		
		waitForClickabilityOf(setPassword);
		
		driver.findElement(setPassword).sendKeys("e2m321");
		
		System.out.println("Setting The Possion as : Software Engineer");
		
		waitForClickabilityOf(position);
		
		driver.findElement(position).sendKeys("Software Engineer");
		
		System.out.println("Setting The Company Name as : Webspiders Group");
		
		waitForClickabilityOf(organization);
		
		driver.findElement(organization).sendKeys("Webspiders Group");
		
		System.out.println("Adding Some Description ");
		
		waitForClickabilityOf(description);
		
		driver.findElement(description).sendKeys("This is test Description to Check the Description Box ");
		
		System.out.println("Selecting Country As India");
		
		waitForClickabilityOf(selectCountry);
		
		driver.findElement(selectCountry).click();
		
		waitForClickabilityOf(country);
		
		driver.findElement(country).click();
		
		System.out.println("Entering Mobile No as : 9876543210");
		
		waitForClickabilityOf(mobileNo);
		
		driver.findElement(mobileNo).sendKeys("9876543210");
		
		System.out.println("Entering Facebook url : https://facebook.com");
		
		waitForClickabilityOf(facebook);
		
		driver.findElement(facebook).sendKeys("https://facebook.com");
		
		System.out.println("Entering Twitter url : https://twitter.com");
		
		waitForClickabilityOf(twitter);
		
		driver.findElement(twitter).sendKeys("https://twitter.com");
		
		System.out.println("Entering LinkedIn url : https://linkedin.com");
		
		waitForClickabilityOf(linkedin);
		
		driver.findElement(linkedin).sendKeys("https://linkedin.com");
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		return new AddUser(driver);
		
	}
	
	public AddUser userBulkUpload(){
		
		
		return new AddUser(driver);
	}

}
