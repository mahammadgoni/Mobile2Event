package com.EventSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Resources extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnEventSetUp = By.xpath("//li[@id='EI']//a[@href='javascript:void(0);']");
	
	By clickOnResources = By.xpath("//html//li[@id='Resources']/a[1]");
	
//	Add Resource Category Elements
	
	By addCategory = By.xpath("//a[@id='btnAddResCategory']");
	
	By categoryName = By.xpath("//*[@id='txtCategory']");
	
	By check1stBox = By.xpath("//html//div[@id='inline3']//td[1]/span/label/input");
	
	By addCatBtn = By.xpath("//*[@id='btmapcat']");
	
	By saveBtn = By.xpath("//*[@id='btnAddResourceCategory']");
	
	By addedCatName = By.xpath("//*[@class='btncat-name']");
	
//	Map Resource Elements
	
	By mapResource = By.xpath("//a[@name='btnmapinstance']");
	
	By selectEvents = By.xpath("//a[@class='mapbtn offfocus-btn'][contains(text(),'Events')]");
	
	By checkBox1stEvent = By.xpath("//*[@id='Checkbox2']");
	
	By selectSession = By.xpath("//a[@class='mapbtn offfocus-btn'][contains(text(),'Sessions')]");
	
	By searchSession = By.xpath("//*[@id='txtSession2']");
	
	By selectAllSession = By.xpath("//*[@id='sess_all_chk2']");
	
	By doneBtn = By.xpath("//div[@class='ses-selectall-row fixed-session-bar clearfix']/div[2]");
	
	By editMapping = By.xpath("//*[@name='btnmapinstance']");
	
	By saveMapping = By.xpath("//*[@id='btnresmap']");
	
//	Publish Elements
	
	By unPublished = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_imgPublished_0']");
	
	By errorMsg = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");
	
	
	
	
	
	

	public Resources(WebDriver driver) {
		super(driver);
	
	}
	
//	Common Activities
	
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

//		Clicking on Resources
		
		System.out.println("Clicking on Resources");
		
		waitForClickabilityOf(clickOnResources);
		
		driver.findElement(clickOnResources).click();
		
		
	}
	
//	Add Category Method
	
	public Resources addResourceCategory(String EmailId, String Password,String EventFullName,String CategoryName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);

//		Clicking on Add Category
		
		System.out.println("Clicking on Add Category");
		
		waitForClickabilityOf(addCategory);
		
		driver.findElement(addCategory).click();
		
		Thread.sleep(2000);

//		Clicking on Add Category
		
		System.out.println("Entering Category Name");
		
		waitForClickabilityOf(categoryName);
		
		driver.findElement(categoryName).sendKeys(CategoryName);
		
		Thread.sleep(2000);
		
//		Clicking on Add Category Button
		
		System.out.println("Clicking on Add Category Button");
		
		waitForClickabilityOf(addCatBtn);
		
		driver.findElement(addCatBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Checking 1st Category
		
		System.out.println("Checking 1st Category");
		
		waitForClickabilityOf(check1stBox);
		
		driver.findElement(check1stBox).click();
		
		Thread.sleep(2000);
		
//		Checking 1st Category
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Storing the Text
		
		String AddedCat = driver.findElement(addedCatName).getText();
		
//		Verifying Condition
		
		if (AddedCat.equals(CategoryName)) {
			
			System.out.println("Successfully Added the Resource Category");
			
		} else {
			
			System.out.println("Failed to Add the Resource Category");

		}
		
		
		
		
		return new Resources(driver);
		
	}
	
//	Resources Mapping Method
	
	public Resources mapResources(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);

//		Clicking on Map Resources
		
		System.out.println("Clicking on Map Resources");
		
		waitForClickabilityOf(mapResource);
		
		driver.findElement(mapResource).click();
		
		Thread.sleep(2000);

//		Selecting Events
		
		System.out.println("Selecting Events");
		
		waitForClickabilityOf(selectEvents);
		
		driver.findElement(selectEvents).click();
		
		Thread.sleep(2000);

//		Select Session
		
		System.out.println("Select Session");
		
		waitForClickabilityOf(selectSession);
		
		driver.findElement(selectSession).click();
		
		Thread.sleep(2000);

//		Selecting 1st Event Checkbox
		
		System.out.println("Selecting 1st Event Checkbox");
		
		waitForClickabilityOf(checkBox1stEvent);
		
		driver.findElement(checkBox1stEvent).click();
		
		Thread.sleep(2000);
		
//		Searching Session
		
		System.out.println("Searching Session");
		
		waitForClickabilityOf(searchSession);
		
		driver.findElement(searchSession).click();
		
		Thread.sleep(2000);
		
//		Selecting All Session Checkbox
		
		System.out.println("Selecting All Session Checkbox");
		
		waitForClickabilityOf(selectAllSession);
		
		driver.findElement(selectAllSession).click();
		
		Thread.sleep(2000);
		
//		Clicking On Done Button
		
		System.out.println("Clicking On Done Button");
		
		waitForClickabilityOf(doneBtn);
		
		driver.findElement(doneBtn).click();
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveMapping);
		
		driver.findElement(saveMapping).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
		
		}
				
		Thread.sleep(2000);
		
//		Verifying 
		
		String EditMap = driver.findElement(editMapping).getText();
		
		if (EditMap.equals("Edit Mapping")) {
			
			System.out.println("Successfully Mapped the Resource");
			
		} else {
			
			System.out.println("Failed to Map the Resource");

		}
		
		
		
		
		
		return new Resources(driver);
		
	}
	
//	Publish the Resource 
	
	public Resources publishResource(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Status Button");
		
		waitForClickabilityOf(unPublished);
		
		driver.findElement(unPublished).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
		
		}
				
		Thread.sleep(2000);
		
//		Verifying 
		
		String ErrorMsg = driver.findElement(errorMsg).getText();
		
		if (ErrorMsg.equals("Record has been published successfully.")) {
			
			System.out.println("Successfully Published the Resource");
			
		} else {
			
			System.out.println("Failed to Publish the Resource");

		}
		
	
		
		return new Resources(driver);
		
	}
	
	
	
	
	

}
