package com.e2m.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CommonActions.LoginToAccount;
import com.EventManagement.NewEvent;
import com.UserManagement.AddUser;
import com.UserManagement.DeleteUser;
import com.Utils.BrowserSetUp;
import com.Utils.GetScreenShot;

@Listeners({ GetScreenShot.class })

public class E2MTestCaes extends BrowserSetUp {

	// Please select the Browser before run all the Test Cases

	String BrowserName = "Firefox";

	// String BrowserName = "Chrome";

	String EmailId = "ethan.taylor@yopmail.com";

	String Password = "#e2m321";

	String BulkUserPath = "/Users/goni/Documents/ImportUser_Template.xlsx";
	
	String EventFullName = "New E2M Test Event";
	
	String EventShortName = "E2M Event";

	@BeforeClass
	public void setUp() throws InterruptedException {

		openBrowser(BrowserName);

	}

	@AfterTest
	public void tearDown() {

		quitAllBrowser();

	}

//	@Test(priority = 1)
//	public void loginToAccount() throws InterruptedException {
//
//		System.out.println("Executing : Login To Account Test");
//
//		// openBrowser(BrowserName);
//
//		new LoginToAccount(driver).loginToAccount(EmailId, Password);
//
//		methodSeparation();
//
//	}
//
//	@Test(priority = 2)
//	public void addVerifiedUserTest() throws InterruptedException {
//
//		System.out.println("Executing : Add Verified User Test");
//
//		// openBrowser(BrowserName);
//
//		new AddUser(driver).addVerifiedUser(EmailId, Password, "Kevin", "Ms", "kevinms@yopmail.com");
//
//		methodSeparation();
//
//	}
//
//	@Test(priority = 3)
//	public void addUnverifiedUserTest() throws InterruptedException {
//
//		System.out.println("Executing : Add Unverified User Test");
//
//		// openBrowser(BrowserName);
//
//		new AddUser(driver).addUnverifiedUser(EmailId, Password, "Liam", "Neson", "liamneson@yopmail.com");
//
//		methodSeparation();
//
//	}
//
//	@Test(priority = 4)
//	public void bulkUserUploadTest() throws InterruptedException {
//
//		System.out.println("Executing : Bulk User Upload Test");
//
//		// openBrowser(BrowserName);
//
//		new AddUser(driver).userBulkUpload(EmailId, Password, BulkUserPath);
//
//		methodSeparation();
//
//	}
//
//	@Test(priority = 5)
//	public void deleteSelectedUserTest() {
//
//		System.out.println("Executing : Delete Selected User Test");
//
//		// openBrowser(BrowserName);
//
//		new DeleteUser(driver).deleteSelectedUser(EmailId, Password);
//		
//		logOut();
//
//		methodSeparation();
//
//	}
//	
//	@Test(priority = 6)
//	public void deleteAllSelectedUserTest() {
//
//		System.out.println("Executing : Delete All Selected User Test");
//
//		// openBrowser(BrowserName);
//
//		new DeleteUser(driver).deleteAllUser(EmailId, Password);
//		
//		logOut();
//
//		methodSeparation();
//
//	}
//	
//	@Test(priority = 7)
//	public void undoUserDeletionTest() {
//
//		System.out.println("Executing : Undo User Deletion Test");
//
//		// openBrowser(BrowserName);
//
//		new DeleteUser(driver).undoUserDeletion(EmailId, Password);
//		
//		logOut();
//
//		methodSeparation();
//
//	}
//	
//	@Test(priority = 8)
//	public void purgeAllUserTest() {
//
//		System.out.println("Executing : Purge All User Test");
//
//		// openBrowser(BrowserName);
//
//		new DeleteUser(driver).purgeAllUser(EmailId, Password);
//		
//		logOut();
//
//		methodSeparation();
//
//	}
	
	@Test(priority = 9)
	public void newEventCreationTest() {

		System.out.println("Executing : New Event Creation Test");

		// openBrowser(BrowserName);

		new NewEvent(driver).newEventCreation(EmailId, Password, EventFullName, EventShortName);
		
		logOut();

		methodSeparation();

	}

}
