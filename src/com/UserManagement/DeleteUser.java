package com.UserManagement;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.BaseSetup.BaseSetUp;

public class DeleteUser extends BaseSetUp {

	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By logoutBtn = By.xpath("//*[@id='top1_Logout'][@class='tm-logout']");

	By menu = By.xpath("//*[@class='toggle-menu']");

	By userMgnt = By.xpath("//*[@id='UM']");

	By user = By.xpath("//*[@id='UMUser']");
	
	By deletedUsers = By.xpath("//*[@href='DeletedUsers.aspx']");

	By selectAllUser = By.xpath("//*[@id='chkHeader']");

	By deleteSelectedUsers = By.xpath("//*[@title='Delete']");

	By deleteUserFromList = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_imgDelFromList_1']");
	
	By deleteConfromPopUp = By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteMulti']");
	
	By purgeBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnBulkDelete']");

	By noOfExistingUsers = By.xpath("//*[@class='chkboxcls']");
	
	By userMain = By.xpath("//*[@class='aspNetDisabled chkboxcls']");
	
	By selectDeletedUser = By.xpath("//*[@class='chkUserClass']");
	
	By selectAllDeletedUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkHeader']");
	

	public DeleteUser(WebDriver driver) {
		super(driver);

	}

	public DeleteUser deleteSelectedUser(String EmailId, String Password) {

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
		
//		System.out.println(userNo);

		int userNo = NoExUsr - 1;
		
		By selectUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_chkUsers_" + userNo + "']");
		
		System.out.println("Selecting User No : " + (userNo+1));
		
		waitForClickabilityOf(selectUser);

		driver.findElement(selectUser).click();

		System.out.println("Deleting the Selected User ");

		waitForClickabilityOf(deleteSelectedUsers);

		driver.findElement(deleteSelectedUsers).click();

		System.out.println("Clicking on Delete Confirmation Pop Up ");

		waitForClickabilityOf(deleteConfromPopUp);

		driver.findElement(deleteConfromPopUp).click();
		
		try {
			
			popUpHandeling();

			waitForClickabilityOf(noOfExistingUsers);

			List<WebElement> GUser = driver.findElements(noOfExistingUsers);

			int NoExUsr1 = GUser.size() + 1;

			System.out.println("Current Existing User Count is : " + NoExUsr1);

			if (NoExUsr1 == NoExUsr - 1) {

				System.out.println("Successfully Deleted the User");

			} else {

				System.out.println("Failed to Delete the User");
			}
			
		} catch (Exception e) {
			
		}
		
		return new DeleteUser(driver);

	}
	
	public DeleteUser deleteAllUser(String EmailId, String Password){
		
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
		
//		Select All User to Delete
		
		System.out.println("Selecting All User");
		
		waitForClickabilityOf(selectAllUser);

		driver.findElement(selectAllUser).click();
		
		System.out.println("Deleting All Selected User ");

		waitForClickabilityOf(deleteSelectedUsers);

		driver.findElement(deleteSelectedUsers).click();

		System.out.println("Clicking on Delete Confirmation Pop Up ");

		waitForClickabilityOf(deleteConfromPopUp);

		driver.findElement(deleteConfromPopUp).click();
		
		try {
			
			popUpHandeling();
			
			popUpHandeling();
			
		} catch (Exception e) {
		
		}
		
		waitForClickabilityOf(userMain);

		List<WebElement> GUser = driver.findElements(userMain);

		int NoExUsr1 = GUser.size();

		System.out.println("Current Existing User Count is : " + NoExUsr1);

		if (NoExUsr1 == 1) {

			System.out.println("Successfully Deleted All Selected User");

		} else {

			System.out.println("Failed to Delete All User");
		}
		
		return new DeleteUser(driver);
		
	}
	
	public DeleteUser undoUserDeletion(String EmailId, String Password){
		
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
		
		System.out.println("Clicking on Deleted Users from User Management");
		
		waitForClickabilityOf(deletedUsers);

		driver.findElement(deletedUsers).click();
		
		List<WebElement> WUser = driver.findElements(selectDeletedUser);

		int NoExUsr = WUser.size();

		System.out.println("Current Existing User Count is : " + NoExUsr);
				
		System.out.println("Undo Deletion Last User form the List");
		
		int lstUsr = NoExUsr-1;
			
		By undoLastUser = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_ImageUndo_" + lstUsr + "']");
		
		waitForClickabilityOf(undoLastUser);

		driver.findElement(undoLastUser).click();
		
		try {
			
			popUpHandeling();
			
			popUpHandeling();
			
		} catch (Exception e) {
		
		}
	
		List<WebElement> GUser = driver.findElements(selectDeletedUser);

		int NoExUsr1 = GUser.size();

		System.out.println("Current Existing User Count is : " + NoExUsr1);
		
		if (NoExUsr==NoExUsr1+1) {
			
			System.out.println("Successfully Undo Deletion Last User");
			
		} else {
			
			System.out.println("Failed to Undo Last User Deletion");

		}
				
		return new DeleteUser(driver);
		
	}
	
	public DeleteUser purgeAllUser(String EmailId, String Password) throws InterruptedException{
		
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
		
		Thread.sleep(2000);

		System.out.println("Clicking on User Management");

		waitForClickabilityOf(userMgnt);

		driver.findElement(userMgnt).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Deleted Users from User Management");
		
		waitForClickabilityOf(deletedUsers);

		driver.findElement(deletedUsers).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting All Deleted Users");
		
		waitForClickabilityOf(selectAllDeletedUser);

		driver.findElement(selectAllDeletedUser).click();
		
		Thread.sleep(2000);
		
		System.out.println("Purge All Deleted Users");
		
		waitForClickabilityOf(purgeBtn);

		driver.findElement(purgeBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
			popUpHandeling();
			
			
		} catch (Exception e) {
			
		
		}
		
		Thread.sleep(2000);
		
		System.out.println("Successfully Purge All Deleted Users");
		
		
		return new DeleteUser(driver);
		
	}

}
