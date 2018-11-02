package com.EventSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
//	Download QR Code Elements
	
	By clickOnQR = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_Img2_0']");
	
	By imageFileName = By.xpath("//*[@id='txtFileName']");
	
	By textWidth = By.xpath("//*[@id='txtwidth']");
	
	By textHeight = By.xpath("//*[@id='txtheight']");
	
	By generateBtn = By.xpath("//*[@id='btnSave']");
	
	By closePopUp = By.xpath("//a[@id='scriptholder_A2']");
	
//	Upload Resource
		
	By uploadResources = By.xpath("//*[@class='cstm-icon icon-plus-round']");
	
	By resourceType = By.xpath("//select[@id='ContentPlaceHolder1_cmbSourceTpe']");
	
	By resourceTitle = By.xpath("//*[@id='txtLinkResourceTitle']");
	
	By resourceLink = By.xpath("//*[@id='txtLinkResourcLink']");
	
	By resourceSaveBtn = By.xpath("//*[@id='btnResourceLinkSave']");
	
	By resourceCloseBtn = By.xpath("//div[@id='AddResource']//a[@class='close-popup']");
	
	By resourceBrowse = By.xpath("//*[@id='upfile1']");
	
	By resourceNo = By.xpath("//*[@class='resc-row']");
	
//	Custom Resources 
	
	By customResources = By.xpath("//ul[@class='menu-3rd-level clearfix']//*[contains(text(),'Custom Resources')]");
	
	By customResourceTitle = By.xpath("//input[@id='txtResourceName']");
	
	By uploadExcel = By.xpath("//input[@id='flUpExcel']");
	
	By inAppLink = By.xpath("//*[@id='rbtnautomapping_0']");
	
	By ousideSideLink = By.xpath("//*[@id='rbtnautomapping_1']");
	
	By uploadBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnUploadResource']");
	
	By inApp1stActiveBtn = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_imgPublished_0']");
	
	By outside2ndActiveBtn = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_imgPublished_1']");
	
	By inApp1stAddCategory = By.xpath("//div[@id='ContentPlaceHolder1_gvResources_divBtnAddResCategory_0']//a[@id='btnAddResCategory']");
	
	By outside2ndAddCategory = By.xpath("//div[@id='ContentPlaceHolder1_gvResources_divBtnAddResCategory_1']//a[@id='btnAddResCategory']");
	
	By inApp1stViewBtn = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_imgView_0']");
	
	By outside2ndViewBtn = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_imgView_1']");
	
	By mappedUsersInApp = By.xpath("//tr[@class='BgColorWhite']//td[3]");
	
	By mappedUsersOutside = By.xpath("//tr[@class='BgColorLightGrey']//td[3]");
	
	By uploadedAttendeeList = By.xpath("//table[@id='ContentPlaceHolder1_gvResourcesURLlist']/tbody/tr");
	
	By customErrorMsg = By.xpath("//span[@id='ContentPlaceHolder1_lblError']");
	

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
	
//	Publish the Resource Method
	
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
	
//	Download QR Code Method
	
	public Resources downloadQRCode(String EmailId, String Password,String EventFullName,String ImageName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);

//		Clicking on Generate QR Code
		
		System.out.println("Clicking on Generate QR Code");
		
		waitForClickabilityOf(clickOnQR);
		
		driver.findElement(clickOnQR).click();
		
		Thread.sleep(2000);
		
		try {
			
//			Entering Image File Name
			
			System.out.println("Entering Image File Name");
			
			waitForClickabilityOf(imageFileName);
			
			driver.findElement(imageFileName).sendKeys(ImageName);
			
			Thread.sleep(2000);

//			Entering QR Image Width
			
			System.out.println("Entering QR Image Width");
			
			waitForClickabilityOf(textWidth);
			
			driver.findElement(textWidth).sendKeys("100");
			
			Thread.sleep(2000);

//			Entering QR Image Height
			
			System.out.println("Entering QR Image Height");
			
			waitForClickabilityOf(textHeight);
			
			driver.findElement(textHeight).sendKeys("100");
			
			Thread.sleep(2000);

//			Clicking on Generate QR Code
			
			System.out.println("Clicking on Generate");
			
			waitForClickabilityOf(generateBtn);
			
			driver.findElement(generateBtn).click();
			
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);

//		Clicking on Close Button
		
		System.out.println("Clicking on Close Button");
		
		waitForClickabilityOf(closePopUp);
		
		driver.findElement(closePopUp).click();
		
		Thread.sleep(2000);

	
		
		return new Resources(driver);
		
	}
	
//	Upload link Resource Method
	
	public Resources uploadResouce(String EmailId, String Password,String EventFullName,String SessionTitle) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
						
//		Clicking On Upload Resources

		System.out.println("Clicking On Upload Resources");

		waitForClickabilityOf(uploadResources);

		driver.findElement(uploadResources).click();
		
		Thread.sleep(2000);
		
//		Selecting Resource Type

		System.out.println("Selecting Resouce Type as : Link");
			
		waitForClickabilityOf(resourceType);
		
		Select Type = new Select(driver.findElement(resourceType));
			
		Type.selectByIndex(1);
		
		Thread.sleep(2000);
			
//		Entering Resource Title

		System.out.println("Entering Resource Title as : "+SessionTitle+" Resource");

		waitForClickabilityOf(resourceTitle);

		driver.findElement(resourceTitle).sendKeys(SessionTitle+" Resource");
		
		Thread.sleep(2000);
			
//		Entering Resource Link

		System.out.println("Entering Resource Link as : https://google.com");

		waitForClickabilityOf(resourceLink);

		driver.findElement(resourceLink).sendKeys("https://google.com");
		
		Thread.sleep(2000);
			
//		Clicking on Save Button

		System.out.println("Clicking on Save Button");

		waitForClickabilityOf(resourceSaveBtn);

		driver.findElement(resourceSaveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//		Getting No Of Existing Resource Count
		
		System.out.println("Getting No Of Existing Resource Count");
		
		waitForClickabilityOf(resourceNo);
		
		List<WebElement> element = driver.findElements(resourceNo);
		
		int NoOfExResources = element.size();
		
		Thread.sleep(2000);
		
		if (NoOfExResources==1) {
			
			System.out.println("Successfully Uploaded One Resource");
			
		} else {
			
			System.out.println("Failed to Upload One Resource");

		}
		
		return new Resources(driver);
		
	}
	
	
//	Upload File Resource Method
	
	public Resources uploadFileResouce(String EmailId, String Password,String EventFullName,String FilePath) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
						
//		Clicking On Upload Resources

		System.out.println("Clicking On Upload Resources");

		waitForClickabilityOf(uploadResources);

		driver.findElement(uploadResources).click();
		
		Thread.sleep(2000);
		
//		Clicking on Save Button

		System.out.println("Browsing File Resource ");

		waitForClickabilityOf(resourceBrowse);

		driver.findElement(resourceBrowse).sendKeys(FilePath);
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
//		Getting No Of Existing Resource Count
		
		System.out.println("Getting No Of Existing Resource Count");
		
		waitForClickabilityOf(resourceNo);
		
		List<WebElement> element = driver.findElements(resourceNo);
		
		int NoOfExResources = element.size();
		
		Thread.sleep(2000);
		
		if (NoOfExResources==1) {
			
			System.out.println("Successfully Uploaded One Resource");
			
		} else {
			
			System.out.println("Failed to Upload One Resource");

		}
		
		return new Resources(driver);
		
	}
	
	
//	Add Custom Resources for TrueValue
	
	public Resources addCustomResourcesInApp(String EmailId, String Password,String EventFullName,String Title,String FilePath) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
						
//		Clicking On Custom Resources

		System.out.println("Clicking On Custom Resources");

		waitForClickabilityOf(customResources);

		driver.findElement(customResources).click();
		
		Thread.sleep(2000);
		
//		Entering Resources Title

		System.out.println("Entering Resources Title as : "+Title);

		waitForClickabilityOf(customResourceTitle);

		driver.findElement(customResourceTitle).sendKeys(Title);
		
		Thread.sleep(2000);
		
//		Selecting the Resources Excel File 

		System.out.println("Selecting the Resources Excel File ");

		waitForClickabilityOf(uploadExcel);

		driver.findElement(uploadExcel).sendKeys(FilePath);
		
		Thread.sleep(2000);
		
//		Selecting Open Link As : In App 

		System.out.println("Selecting Open Link As : In App ");

		waitForClickabilityOf(inAppLink);

		driver.findElement(inAppLink).click();
		
		Thread.sleep(2000);
		
//		Clicking On Upload Button

		System.out.println("Clicking On Upload Button");

		waitForClickabilityOf(uploadBtn);

		driver.findElement(uploadBtn).click();
		
		Thread.sleep(9000);
		
//		Getting Message
		
		try {
			
			waitForClickabilityOf(customErrorMsg);
			
			String ErrorMsg = driver.findElement(customErrorMsg).getText();
			
			System.out.println(ErrorMsg);
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Publishing the Resources
		
		System.out.println("Publishing the Resources");
		
		waitForClickabilityOf(inApp1stActiveBtn);
		
		driver.findElement(inApp1stActiveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Category");
		
		waitForClickabilityOf(inApp1stAddCategory);
		
		driver.findElement(inApp1stAddCategory).click();
		
		Thread.sleep(2000);
		
//		Selecting the Category
		
		System.out.println("Selecting the Category");
		
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
		
//		Number of Users Mapped to Ip App Link
		
		System.out.println("Number of Users Mapped to Ip App Link");

		waitForClickabilityOf(mappedUsersInApp);
		
		String MappedAttendees = driver.findElement(mappedUsersInApp).getText();
		
		System.out.println(MappedAttendees);
		
		Thread.sleep(2000);
		
//		Replacing Non digits Char with Blank Space and store it in a Integer
		
		int MappedUsers = Integer.parseInt(MappedAttendees.replaceAll("\\D", ""));
		
		Thread.sleep(2000);
		
//		Clicking On View Button
		
		System.out.println("Clicking On View Button");
		
		waitForClickabilityOf(inApp1stViewBtn);
		
		driver.findElement(inApp1stViewBtn).click();	
		
//		Clicking On View Button
		
		Thread.sleep(2000);
		
		System.out.println("Getting Uploaded Attendees No");
		
		waitForClickabilityOf(uploadedAttendeeList);
		
		List<WebElement> AttdnNo = driver.findElements(uploadedAttendeeList);
		
		int NoAtten = AttdnNo.size()-1;
		
		Thread.sleep(2000);
		
//		Verifying the Condition
		
		if (NoAtten==MappedUsers) {
			
			System.out.println("Successfully Uploaded Custom In App Resource");
			
		} else {
			
			System.out.println("Failed to Upload Custom In App Resource");

		}
		
			
		
		
		return new Resources(driver);
	}
	
	
//	Custom Resources Outside 
	
	public Resources addCustomResourcesOutside(String EmailId, String Password,String EventFullName,String Title,String FilePath) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
						
//		Clicking On Custom Resources

		System.out.println("Clicking On Custom Resources");

		waitForClickabilityOf(customResources);

		driver.findElement(customResources).click();
		
		Thread.sleep(2000);
		
//		Entering Resources Title

		System.out.println("Entering Resources Title as : "+Title);

		waitForClickabilityOf(customResourceTitle);

		driver.findElement(customResourceTitle).sendKeys(Title);
		
		Thread.sleep(2000);
		
//		Selecting the Resources Excel File 

		System.out.println("Selecting the Resources Excel File ");

		waitForClickabilityOf(uploadExcel);

		driver.findElement(uploadExcel).sendKeys(FilePath);
		
		Thread.sleep(2000);
		
//		Selecting Open Link As : Outside

		System.out.println("Selecting Open Link As : Outside ");

		waitForClickabilityOf(ousideSideLink);

		driver.findElement(ousideSideLink).click();
		
		Thread.sleep(2000);
		
//		Clicking On Upload Button

		System.out.println("Clicking On Upload Button");

		waitForClickabilityOf(uploadBtn);

		driver.findElement(uploadBtn).click();
		
		Thread.sleep(9000);
		
//		Getting Message
		
		try {
			
			waitForClickabilityOf(customErrorMsg);
			
			String ErrorMsg = driver.findElement(customErrorMsg).getText();
			
			System.out.println(ErrorMsg);
			
		} catch (Exception e) {
			
		}
			
		Thread.sleep(2000);
		
//		Publishing the Resources
		
		System.out.println("Publishing the Resources");
		
		waitForClickabilityOf(outside2ndActiveBtn);
		
		driver.findElement(outside2ndActiveBtn).click();
		
		Thread.sleep(2000);
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Category");
		
		waitForClickabilityOf(outside2ndAddCategory);
		
		driver.findElement(outside2ndAddCategory).click();
		
		Thread.sleep(2000);
		
//		Selecting the Category
		
		System.out.println("Selecting the Category");
		
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
		
//		Number of Users Mapped to Outside Link
		
		System.out.println("Number of Users Mapped to Outside Link");

		waitForClickabilityOf(mappedUsersOutside);
		
		String MappedAttendees = driver.findElement(mappedUsersOutside).getText();
		
		System.out.println(MappedAttendees);
		
		Thread.sleep(2000);
		
//		Replacing Non digits Char with Blank Space and store it in a Integer
		
		int MappedUsers = Integer.parseInt(MappedAttendees.replaceAll("\\D", ""));
		
		Thread.sleep(2000);
		
//		Clicking On View Button
		
		System.out.println("Clicking On View Button");
		
		waitForClickabilityOf(outside2ndViewBtn);
		
		driver.findElement(outside2ndViewBtn).click();	
		
//		Clicking On View Button
		
		Thread.sleep(2000);
		
		System.out.println("Getting Uploaded Attendees No");
		
		waitForClickabilityOf(uploadedAttendeeList);
		
		List<WebElement> AttdnNo = driver.findElements(uploadedAttendeeList);
		
		int NoAtten = AttdnNo.size()-1;
		
		Thread.sleep(2000);
		
//		Verifying the Condition
		
		if (NoAtten==MappedUsers) {
			
			System.out.println("Successfully Uploaded Custom Outside Resource");
			
		} else {
			
			System.out.println("Failed to Upload Custom Outside Resource");

		}
		
		
		
		
		return new Resources(driver);
	}
	
	

}
