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
	
	By menu = By.xpath("//a[@class='toggle-menu']");

	By userMgnt = By.xpath("//*[@id='UM']");
	
	By user = By.xpath("//*[@id='UMUser']");
	
	By addUser = By.xpath("//*[@id='ContentPlaceHolder1_BtnAddNew']");
	
	By importUser = By.xpath("//*[@id='ContentPlaceHolder1_btnImport']");
	
	By downloadTemplete = By.xpath("//*[@id='ContentPlaceHolder1_btnDataTamplate']");
	
	By deleteSelectedUser = By.xpath("//*[@title='Delete']");
	
	By deleteUserFromList = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_imgDelFromList_1']");
	
	
	

	public AddUser(WebDriver driver) {
		super(driver);
		
	}
	
	
	public AddUser addUser(String EmailId,String Password){
		
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
		
		
		return new AddUser(driver);
		
	}
	
	public AddUser userBulkUpload(){
		
		
		return new AddUser(driver);
	}

}
