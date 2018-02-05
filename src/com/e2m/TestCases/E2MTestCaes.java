package com.e2m.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CommonActions.LoginToAccount;
import com.UserManagement.AddUser;
import com.Utils.BrowserSetUp;

public class E2MTestCaes extends BrowserSetUp{
	
//	Please select the Browser before run all the Test Cases
	
	String BrowserName = "Firefox";
	
//	String BrowserName = "Chrome";
	
	String EmailId = "ethan.taylor@yopmail.com";
	
	String Password = "#e2m321";
	
	String FirstName = "Kevin";
	
	String LastName = "Ms";
	
	String AddUserEmail = "kevinms@yopmail.com";
	
	
	@BeforeClass
	public void setUp(){
	
		openBrowser(BrowserName);
    	
		
	}
	
	@AfterClass
	public void tearDown(){
		
		quitAllBrowser();
		
		
	}
	
	@Test(priority=1)
	public void loginToAccount() throws InterruptedException{
		
		openBrowser(BrowserName);
		
		System.out.println("Executing Login To Account Test");
		
		new LoginToAccount(driver).loginToAccount(EmailId, Password);
			
	}
	
	@Test(priority=2)
	public void addVerifiedUserTest(){
		
		openBrowser(BrowserName);
		
		System.out.println("Executing Add Verified User Test");
		
		new AddUser(driver).addVerifiedUser(EmailId, Password, FirstName, LastName, AddUserEmail);
		
	}
	
	@Test(priority=3)
	public void addUnverifiedUserTest(){
		
		openBrowser(BrowserName);
		
		System.out.println("Executing Add Unverified User Test");
		
	}
	

}
