package com.UserManagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;

public class AddUser extends BaseSetUp {

	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By logoutBtn = By.xpath("//*[@id and @onclick and @data-rel]");

	By menu = By.xpath("//*[@class='toggle-menu']");

	// By menu = By.xpath("//*[@class='toggle-menu' and @href='javascript:{}']");

	By userMgnt = By.xpath("//*[@id='UM']");

	By user = By.xpath("//*[@id='UMUser']");

	By noOfExistingUsers = By.xpath("//*[@class='chkboxcls']");

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

	By bulkUserBtn = By.xpath("//*[@id='ContentPlaceHolder1_fileupload']");

	By bulkUserImageBtn = By.xpath("//*[@id='ContentPlaceHolder1_fileupload1']");

	By bulkUserSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAdd']");

	By bulkUploadHistory = By.xpath("//*[@id='ContentPlaceHolder1_Button1']");

	By refreshBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnRefresh']");
	
	

	public AddUser(WebDriver driver) {
		super(driver);

	}

	public AddUser addVerifiedUser(String EmailId, String Password, String FirstName, String LastName,String AddUserEmail) {

		System.out.println("Entering Email id  is : " + EmailId);

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		driver.findElement(emailId).sendKeys(EmailId);

		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();

		System.out.println("Entering Password  is : " + Password);

		waitForClickabilityOf(pass);

		driver.findElement(pass).clear();

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

		// This is User count code

		List<WebElement> WUser = driver.findElements(noOfExistingUsers);

		// List<WebElement> GUser = driver.findElements(noOfUserG);

		int NoExUsr = WUser.size() + 1;

		System.out.println("Current Existing User Count is : " + NoExUsr);

		System.out.println("Clicking on Add User Button");

		waitForClickabilityOf(addUser);

		driver.findElement(addUser).click();

		System.out.println("Entering First Name : " + FirstName);

		waitForClickabilityOf(firstname);

		driver.findElement(firstname).sendKeys(FirstName);

		System.out.println("Entering Last Name : " + LastName);

		waitForClickabilityOf(lastName);

		driver.findElement(lastName).sendKeys(LastName);

		System.out.println("Entering Email Id : " + AddUserEmail);

		waitForClickabilityOf(email);

		driver.findElement(email).sendKeys(AddUserEmail);
		
		try {
			
			System.out.println("Clicking on User Verification Check Box ");

			if (driver.findElement(verificationCheckBox).isSelected() == true) {

				System.out.println("Verification Check Box is already Selected ");

			} else {

				driver.findElement(verificationCheckBox).click();

			}

			System.out.println("Selecting the User type as Verfied");

			if (driver.findElement(verified).isSelected() == true) {

				System.out.println("User type is already Verified ");

			} else {

				driver.findElement(verified).click();

			}

			System.out.println("Clicking On Set Password Check Box");

			waitForClickabilityOf(setPassCheckBox);

			driver.findElement(setPassCheckBox).click();

			System.out.println("Setting Up The Password : #e2m321");

			waitForClickabilityOf(setPassword);

			driver.findElement(setPassword).sendKeys("#e2m321");
			
		} catch (Exception e) {
			
		}

		System.out.println("Setting The Position as : Software Engineer");

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

		try {
			popUpHandeling();


		} catch (Exception e) {

		}
		
		waitForClickabilityOf(noOfExistingUsers);

		List<WebElement> GUser = driver.findElements(noOfExistingUsers);

		int NoExUsr1 = GUser.size() + 1;

		System.out.println("Current Existing User Count is : " + NoExUsr1);

		if (NoExUsr1 == NoExUsr + 1) {

			System.out.println("Successfully Added one Verified User");

		} else {

			System.out.println("Failed to Add Any User");
		}

//		waitForClickabilityOf(logoutBtn);
//
//		driver.findElement(logoutBtn).click();

		return new AddUser(driver);

	}

	public AddUser addUnverifiedUser(String EmailId, String Password, String FirstName, String LastName,String AddUserEmail) {

		System.out.println("Entering Email id  is : " + EmailId);

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		driver.findElement(emailId).sendKeys(EmailId);

		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();

		System.out.println("Entering Password  is : " + Password);

		waitForClickabilityOf(pass);

		driver.findElement(pass).clear();

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

		// This is User count code

		List<WebElement> WUser = driver.findElements(noOfExistingUsers);

		// List<WebElement> GUser = driver.findElements(noOfUserG);

		int NoExUsr = WUser.size() + 1;

		System.out.println("Current Existing User Count is : " + NoExUsr);

		System.out.println("Clicking on Add User Button");

		waitForClickabilityOf(addUser);

		driver.findElement(addUser).click();

		System.out.println("Entering First Name : " + FirstName);

		waitForClickabilityOf(firstname);

		driver.findElement(firstname).sendKeys(FirstName);

		System.out.println("Entering Last Name : " + LastName);

		waitForClickabilityOf(lastName);

		driver.findElement(lastName).sendKeys(LastName);

		System.out.println("Entering Email Id : " + AddUserEmail);

		waitForClickabilityOf(email);

		driver.findElement(email).sendKeys(AddUserEmail);
		
		try {
			
			System.out.println("Clicking on User Verification Check Box ");

			if (driver.findElement(verificationCheckBox).isSelected() == true) {

				System.out.println("Verification Check Box is already Selected ");

			} else {

				driver.findElement(verificationCheckBox).click();

			}

			System.out.println("Selecting the User type as Unverfied");

			if (driver.findElement(unverified).isSelected() == true) {

				System.out.println("User type is already Verified ");

			} else {

				driver.findElement(unverified).click();

			}

			System.out.println("Clicking On Set Password Check Box");

			waitForClickabilityOf(setPassCheckBox);

			driver.findElement(setPassCheckBox).click();

			System.out.println("Setting Up The Password : #e2m321");

			waitForClickabilityOf(setPassword);

			driver.findElement(setPassword).sendKeys("#e2m321");
			
		} catch (Exception e) {
			
		}		

		System.out.println("Setting The Position as : Software Engineer");

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

		System.out.println("Entering Mobile No as : 9986543210");

		waitForClickabilityOf(mobileNo);

		driver.findElement(mobileNo).sendKeys("9986543210");

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

		try {

			popUpHandeling();


		} catch (Exception e) {

//			System.out.println(e.getMessage());

		}
		
		waitForClickabilityOf(noOfExistingUsers);

		List<WebElement> GUser = driver.findElements(noOfExistingUsers);

		int NoExUsr1 = GUser.size() + 1;

		System.out.println("Current Existing User Count is : " + NoExUsr1);

		if (NoExUsr1 == NoExUsr + 1) {

			System.out.println("Successfully Added one Unverified User");

		} else {

			System.out.println("Failed to Add Any User");
		}

//		waitForClickabilityOf(logoutBtn);
//
//		driver.findElement(logoutBtn).click();

		return new AddUser(driver);

	}

	public AddUser userBulkUpload(String EmailId, String Password, String PathOfXlsx) {

		System.out.println("Entering Email id  is : " + EmailId);

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		driver.findElement(emailId).sendKeys(EmailId);

		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();

		System.out.println("Entering Password  is : " + Password);

		waitForClickabilityOf(pass);

		driver.findElement(pass).clear();

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

		// This is User count code

		List<WebElement> WUser = driver.findElements(noOfExistingUsers);

		int NoExUsr = WUser.size() + 1;

		System.out.println("Current Existing User Count is : " + NoExUsr);

		System.out.println("Clicking on Import User Button");

		waitForClickabilityOf(importUser);

		driver.findElement(importUser).click();

		System.out.println("Clicking on Browse Button for .xlsx path");

		waitForClickabilityOf(bulkUserBtn);

		driver.findElement(bulkUserBtn).sendKeys(PathOfXlsx);

		System.out.println("Clicking on Save Button Upload Users");

		waitForClickabilityOf(bulkUserSaveBtn);

		driver.findElement(bulkUserSaveBtn).click();

		System.out.println("Clicking on Bulk Upload History Button");

		waitForClickabilityOf(bulkUploadHistory);

		driver.findElement(bulkUploadHistory).click();

		System.out.println("Clicking on Refresh Button");

		waitForClickabilityOf(refreshBtn);

		driver.findElement(refreshBtn).click();

		System.out.println("Going Back to User Management List");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();

		System.out.println("Clicking on User Management");

		waitForClickabilityOf(userMgnt);

		driver.findElement(userMgnt).click();

		System.out.println("Clicking on Users from User Management");

		waitForClickabilityOf(user);

		driver.findElement(user).click();

		List<WebElement> GUser = driver.findElements(noOfExistingUsers);

		int NoExUsr1 = GUser.size() + 1;

		System.out.println("Current Existing User Count is : " + NoExUsr1);

		if (NoExUsr1 == NoExUsr) {

			System.out.println("Failed to Upload Bulk User ");

		} else {

			System.out.println("Successfully Uploaded Bulk Users");
		}

//		waitForClickabilityOf(logoutBtn);
//
//		driver.findElement(logoutBtn).click();

		return new AddUser(driver);
	}

}
