package com.EventSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class FloorMap extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnEventSetUp = By.xpath("//li[@id='EI']//a[@href='javascript:void(0);']");
	
	By clickOnFloorMap = By.xpath("//html//li[@id='EventFL']/a[1]");
	
//	Add Floor Map Elements
	
	By addNewBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAddFloorMap']");
	
	By floorMapTitle = By.xpath("//*[@id='ContentPlaceHolder1_txtFloorMapTitle']");
	
	By floorMapImage = By.xpath("//*[@id='fuFloorImage']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
//	Way Finder Elements
	
	By clickOnMapSettings = By.xpath("//ul[@class='menu-3rd-level clearfix']//div[@class='sub-menu2 clearfix submenu-hide']//li[5]");
	
	By enableWayfinder = By.xpath("//*[@id='ContentPlaceHolder1_rdwayfinderenable_0']");
	
	By pinColor = By.xpath("//*[@id='divTopBarColor']");
	
	By colorChange = By.xpath("//*[@class='colorpicker']/div[5]/input");
	
	By colorSave = By.xpath("//*[@class='colorpicker']/div[12]");
	
	By routeColor = By.xpath("//*[@id='divFontColor']");
	
	By routeColorChange = By.xpath("//*[@class='colorpicker']//div[@class='colorpicker_hex']//input[@type='text']");
	
	By routeColorSave = By.xpath("//*[@class='colorpicker']//div[@class='colorpicker_submit']");
	
	By errorMsg = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");
	
//	Booth Elements
	
	By clickOnBooth1 = By.xpath("//a[@href='FloormapMapper.aspx?mid=418&&eid=4565&&vid=468&&tab=1']");
	
	By left = By.xpath("//input[@id='txtLeft']");
	
	By top = By.xpath("//input[@id='txtTop']");
	
	By right = By.xpath("//input[@id='txtRight']");
	
	By bottm = By.xpath("//input[@id='txtBottom']");
	
	By width = By.xpath("//input[@id='w']");
	
	By hight = By.xpath("//input[@id='h']");
	
	By totalW = By.xpath("//input[@id='txtTotalW']");
	
	By totalH = By.xpath("//input[@id='txtTotalH']");
	
	By name = By.xpath("//input[@id='txtName']");
	
	By description = By.xpath("//input[@id='txtDescription']");
	
	By exhbtr1 = By.xpath("//label[@for='ContentPlaceHolder1_chkblstExhibitors_0']");
	
	By exhbtr2 = By.xpath("//label[@for='ContentPlaceHolder1_chkblstExhibitors_1']");
	
	By savebtn = By.xpath("//input[@id='btnSave']");

	

	public FloorMap(WebDriver driver) {
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

//		Clicking on Floor Map
		
		System.out.println("Clicking on Floor Map");
		
		waitForClickabilityOf(clickOnFloorMap);
		
		driver.findElement(clickOnFloorMap).click();
		
		
	}
	
//	Add Floor Map Method
	
	public FloorMap addFloorMap(String EmailId, String Password,String EventFullName,String FloorMapTitle) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
				
		Thread.sleep(2000);

//		Clicking on Add New Floor Map
		
		System.out.println("Clicking on Add New Floor Map");
		
		waitForClickabilityOf(addNewBtn);
		
		driver.findElement(addNewBtn).click();
		
		Thread.sleep(2000);

//		Entering Floor Map Title
		
		System.out.println("Entering Floor Map Title");
		
		waitForClickabilityOf(floorMapTitle);
		
		driver.findElement(floorMapTitle).sendKeys(FloorMapTitle);
		
		Thread.sleep(2000);

//		Entering Floor Map Image
		
		System.out.println("Entering Floor Map Image");
		
		waitForClickabilityOf(floorMapImage);
		
		driver.findElement(floorMapImage).sendKeys(home+"/Test Data/FloorMap.jpg");
		
		Thread.sleep(2000);

//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
//		Searching for the Added Floor Map
		
		boolean AddedFM = driver.findElement(By.xpath("//*[contains(text(),'"+FloorMapTitle+"')]")).isDisplayed();
		
//		Verifying Condition
		
		if (AddedFM==true) {
			
			System.out.println("Successfully Added one Floor Map");
			
		} else {
			
			System.out.println("Failed to Add Floor Map");

		}
				
		
		return new FloorMap(driver);
		
	}
	
//	Wayfinder Creation Method
	
	public FloorMap wayFinderCreation(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);

//		Clicking on Floor Map Settings
		
		System.out.println("Clicking on Floor Map Settings");
		
		waitForClickabilityOf(clickOnMapSettings);
		
		driver.findElement(clickOnMapSettings).click();
		
		Thread.sleep(2000);

//		Clicking on Floor Map Settings
			
		waitForClickabilityOf(enableWayfinder);
		
		boolean EnableWF = driver.findElement(enableWayfinder).isSelected();
		
		if (EnableWF==false) {
			
			System.out.println("Clicking on Enable Way Finder");
			
			driver.findElement(enableWayfinder).click();
			
		} else {
			
			System.out.println("Already Enabled Way Finder");

		}
		
		Thread.sleep(2000);
		
		try {
			
//			Clicking on Pin Color
			
			System.out.println("Clicking on Pin Color");
			
			waitForClickabilityOf(pinColor);
			
			driver.findElement(pinColor).click();
			
			Thread.sleep(2000);

//			Changing the Pin Color
			
			System.out.println("Changing the Pin Color");
			
			waitForClickabilityOf(colorChange);
			
			driver.findElement(colorChange).clear();
			
			driver.findElement(colorChange).sendKeys("1d87eb");
			
			Thread.sleep(2000);

//			Saving the Pin Color
			
			System.out.println("Saving the Pin Color");
			
			waitForClickabilityOf(colorSave);
			
			driver.findElement(colorSave).click();
			
			Thread.sleep(2000);

//			Clicking on Route Color
			
			System.out.println("Clicking on Route Color");
			
			waitForClickabilityOf(routeColor);
			
			driver.findElement(routeColor).click();
			
			Thread.sleep(2000);

//			Changing the Route Color
			
			System.out.println("Changing the Route Color");
			
			waitForClickabilityOf(routeColorChange);
			
			driver.findElement(routeColorChange).clear();
			
			driver.findElement(routeColorChange).sendKeys("818b94");
			
			Thread.sleep(2000);

//			Saving the Route Color
			
			System.out.println("Saving the Route Color");
			
			waitForClickabilityOf(routeColorSave);
			
			driver.findElement(routeColorSave).click();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);

//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
//		Storing the Message 
		
		String ErrorMsg = driver.findElement(errorMsg).getText();
		
		Thread.sleep(2000);
		
//		Verifying the Codition
		
		if (ErrorMsg.equals("Record saved successfully.")) {
			
			System.out.println("Successfully Saved the Way Finder");
			
		} else {
			
			System.out.println("Failed to Save Way Finder");

		}
		
		
		
		return new FloorMap(driver);
		
	}

//	Add Booth
	
	public FloorMap addBooth(){
		
		
		return new FloorMap(driver);
		
	}
	
	

}
