package com.UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class DeleteUser extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");
	
	By proceedBtn = By.xpath("//*[@id='btnProceed']");
	
	By pass = By.xpath("//*[@id='txtPass']");
	
	By signInBtn = By.xpath("//*[@id='btnLogin']");
	
	By logoutBtn = By.xpath("//*[@id='top1_Logout'][@class='tm-logout']");
	
	By menu = By.xpath("//*[@class='toggle-menu']");
	
	By userMgnt = By.xpath("//*[@id='UM']");
	
	By user = By.xpath("//*[@id='UMUser']");
	
	By deleteSelectedUser = By.xpath("//*[@title='Delete']");
	
	By deleteUserFromList = By.xpath("//*[@id='ContentPlaceHolder1_gvUser_imgDelFromList_1']");
	
	By deleteConfromPopUp = By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteMulti']");
	
	By noOfExistingUsers = By.xpath("//*[@class='chkboxcls']");
	

	public DeleteUser(WebDriver driver) {
		super(driver);
		
	}

}
