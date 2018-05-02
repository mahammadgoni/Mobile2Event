package com.EventSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AppMenu extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnEventSetUp = By.xpath("//li[@id='EI']//a[@href='javascript:void(0);']");
	
	By clickOnAppMenu = By.xpath("//a[@href='MenuConfiguration.aspx'][contains(text(),'App Menu')]");
	
//	Add Menu Elements
	
	By addNewBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAddNew']");
	
	By categoryName = By.xpath("//*[@id='txtCategory']");
	
	By categoryUpload = By.xpath("//*[@id='FUCategory']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_Button1']");
	
//	Category Ordering Elements
	
	By catOrdering = By.xpath("//*[@id='ContentPlaceHolder1_btndisplayOrderChange']");
	
	By itemName1st = By.xpath("//*[@id='ContentPlaceHolder1_gvCategory_lblCategory_0']");
		
	By menu1stItem = By.xpath("//td[@id='ctl00_ContentPlaceHolder1_ReorderListMenuCategory__rli0___dih0']//div//img[@id='imgRowOrderChange']");
	
	By menu3rdItem = By.xpath("//td[@id='ctl00_ContentPlaceHolder1_ReorderListMenuCategory__rli3___dih3']//div//img[@id='imgRowOrderChange']");
	
	By saveDisplayOrder = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	
	
	
	
	

	public AppMenu(WebDriver driver) {
		super(driver);
		
	}
	
	public void commonActivities(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
//		Login to your Account 
		
		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		
//		Searching for Event Name
		
		System.out.println("Searching for Event Name :"+EventFullName);
		
		waitForClickabilityOf(searchEvent);
		
		WebElement search = driver.findElement(searchEvent);
		
		search.sendKeys(EventFullName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		waitForClickabilityOf(clickOnEvent);
		
		String ActEventName = driver.findElement(clickOnEvent).getText();
		
		System.out.println("Clicking On Event : "+ActEventName);
		
		if (EventFullName.equals(ActEventName)) {
			
			System.out.println("This is Correct Event");
			
		} else {
			
			System.out.println("Failed to Search the Event Name so, searching again ");
			
			search.clear();
			
			search.sendKeys(EventFullName);
			
			Thread.sleep(2000);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
//			Pressing Enter Button 
			
			search.sendKeys(Keys.ENTER);
				
		}
		
//		Clicking on The Event
		
		System.out.println("Clicking on The Event");
		
		waitForClickabilityOf(clickOnEvent);
		
		driver.findElement(clickOnEvent).click();
		
		Thread.sleep(2000);

//		Clicking on Event Set Up
		
		System.out.println("Clicking on Event Set Up");
		
		waitForClickabilityOf(clickOnEventSetUp);
		
		driver.findElement(clickOnEventSetUp).click();
		
		Thread.sleep(2000);

//		Clicking on App Menu
		
		System.out.println("Clicking on App Menu");
		
		waitForClickabilityOf(clickOnAppMenu);
		
		driver.findElement(clickOnAppMenu).click();
		
		
	}
	
//	Add New Category Method
	
	public AppMenu addNewCategory(String EmailId, String Password,String EventFullName,String Catergory) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Add New Category
		
		System.out.println("Clicking on Add New Category");
		
		waitForClickabilityOf(addNewBtn);
		
		driver.findElement(addNewBtn).click();
		
		Thread.sleep(2000);
		
//		Entering New Category Name
		
		System.out.println("Entering New Category Name");
		
		waitForClickabilityOf(categoryName);
		
		driver.findElement(categoryName).sendKeys(Catergory);
		
		Thread.sleep(2000);
		
//		Entering New Category Name
		
		System.out.println("Uploading Category Image");
		
		waitForClickabilityOf(categoryUpload);
		
		driver.findElement(categoryUpload).sendKeys(home+"/Test Data/MenuCategory.png");
		
		Thread.sleep(2000);

//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Storing the Created Category Name
		
		String NewCat = driver.findElement(By.xpath("//*[contains(text(),'"+Catergory+"')]")).getText();
		
		if (NewCat.equals(Catergory)) {
			
			System.out.println("Successfully Added One New Category");
			
		} else {
			
			System.out.println("Failed to Add New Category");

		}
		
		
		
		
		
		
		
		return new AppMenu(driver);
		
	}

	public AppMenu manageCategory(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Storing the Name of the 1st Itme
		
		String Item1st = driver.findElement(itemName1st).getText();
		
		System.out.println(Item1st);

//		Clicking on Category Ordering
		
		System.out.println("Clicking on Category Ordering");
		
		waitForClickabilityOf(catOrdering);
		
		driver.findElement(catOrdering).click();
		
		Thread.sleep(2000);
		
//		1st Item Name and Address
		
		WebElement source = driver.findElement(menu1stItem);
				
//		3rd Item Name and Address
		
		WebElement destination = driver.findElement(menu3rdItem);
	
//		Will Drag and Drop the Elements
		
		Actions action  = new Actions(driver);
		
		System.out.println("Performing Drag and Drop Operation");
		
		action.dragAndDrop(source, destination).build().perform();
		
		Thread.sleep(2000);
		
//		Clicking on Category Ordering
		
		System.out.println("Clicking on Save Display Order");
		
		waitForClickabilityOf(saveDisplayOrder);
		
		driver.findElement(saveDisplayOrder).click();
		
		Thread.sleep(2000);
		
//		Storing the Item Name
		
		String Item3rd = driver.findElement(itemName1st).getText();
		
		System.out.println(Item3rd);
				
	    Thread.sleep(2000);
		
		if (Item1st.equals(Item3rd)) {
			
			System.out.println("Failed to Change the Menu Ordering");
			
		} else {
			
			System.out.println("Successfully Changed the Menu Ordering");

		}
		
		
		return new AppMenu(driver);
		
	}

}
