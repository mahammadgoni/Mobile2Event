package com.EventSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class AppBranding extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnEventSetUp = By.xpath("//li[@id='EI']//a[@href='javascript:void(0);']");
	
	By clickOnAppBranding = By.xpath("//a[@href='logotheme.aspx'][contains(text(),'App Branding')]");
	
//	Logo and Theme Elements
	
	By eventLogo = By.xpath("//*[@id='ContentPlaceHolder1_flUpPhoto']");
	
	By topBar = By.xpath("//*[@id='divTopBarColor']");
	
	By topBarColor = By.xpath("/html[1]/body[1]/div[2]/div[5]/input[1]");
	
	By topBarColorSubmit = By.xpath("/html[1]/body[1]/div[2]/div[12]");
	
	By headerBar = By.xpath("//*[@id='divHeaderBarColor']");
	
	By headerColor = By.xpath("/html[1]/body[1]/div[3]/div[5]/input[1]");
	
	By headerColorSubmit = By.xpath("/html[1]/body[1]/div[3]/div[12]");
	
	By font = By.xpath("//*[@id='divFontColor']");
	
	By fontColor = By.xpath("/html[1]/body[1]/div[4]/div[5]/input[1]");
	
	By fontColorSubmit = By.xpath("/html[1]/body[1]/div[4]/div[12]");
	
	By sideNavigation = By.xpath("//*[@id='divIconColor']");
	
	By navigationColor = By.xpath("/html[1]/body[1]/div[5]/div[5]/input[1]");
	
	By navigationColorSubmit = By.xpath("/html[1]/body[1]/div[5]/div[12]");
	
	By logoSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnLogosaveOnly']");
	
//	App Splash/Welcome Elements
	
	By appSplashWelcome = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='SplashWelcome.aspx']");
	
	By splashYesBtn = By.xpath("//*[@id='ContentPlaceHolder1_rbtnscreen_0']");
	
	By upload1stFile = By.xpath("//a[@id='ContentPlaceHolder1_aFU']");
	
//	Event Back Ground Image Elements
	
	By eventBackGround = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@href='BackGroundImage.aspx']");
	
	By customBack = By.xpath("//*[@id='ContentPlaceHolder1_rbtnscreen_0']");
	
	By imageBack = By.xpath("//*[@id='ContentPlaceHolder1_rdnType_0']");
	
	By selectGallery = By.xpath("//a[@id='Gallery1']");
	
	By blueWave = By.xpath("//*[@id='ContentPlaceHolder1_dtlgalleryimage_rdngroupimage_2']");
	
	By backSaveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnAdd']");
	
	By suceessMsg = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");
	
//	Event Banner Elements 
	
	By clickOnEventBanner = By.xpath("//ul[@class='menu-3rd-level clearfix']//li//a[@class='menu-hidden-arrow']");
	
	By addNewBanner = By.xpath("//*[@id='ContentPlaceHolder1_btnaddnew']");
	
	By noLink = By.xpath("//*[@id='ContentPlaceHolder1_rbtnLinkType_0']");
	
	By externalLink = By.xpath("//*[@id='ContentPlaceHolder1_rbtnLinkType_1']");
	
	By urlOrLink = By.xpath("//*[@id='ContentPlaceHolder1_txtURL']");
	
	By internalLink = By.xpath("//*[@id='ContentPlaceHolder1_rbtnLinkType_2']");
	
	By selectSection = By.xpath("//*[@id='ContentPlaceHolder1_ddlSection']");
	
	By iPhone5 = By.xpath("//*[@id='ContentPlaceHolder1_flUpBanner2']");
	
	By iPhone6 = By.xpath("//*[@id='ContentPlaceHolder1_flUpBanner3']");
	
	By iPhone6Plus = By.xpath("//*[@id='ContentPlaceHolder1_flUpBanner4']");
	
	By iPhoneX = By.xpath("//*[@id='ContentPlaceHolder1_flUpBanner10']");
	
	By allAndroid = By.xpath("//*[@id='ContentPlaceHolder1_flUpBanner7']");
	
	By iPadPortrait = By.xpath("//*[@id='ContentPlaceHolder1_flUpBanner5']");
	
	By iPadLand = By.xpath("//*[@id='ContentPlaceHolder1_flUpBanner6']");
	
	By addBanner = By.xpath("//*[@id='ContentPlaceHolder1_btnAdd']");
	
	

	public AppBranding(WebDriver driver) {
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

//		Clicking on About Event
		
		System.out.println("Clicking on App Branding");
		
		waitForClickabilityOf(clickOnAppBranding);
		
		driver.findElement(clickOnAppBranding).click();
		
		
	}
	
//	Logo and Theme Method
	
	public AppBranding logoAndTheme(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
			
		Thread.sleep(2000);
		
//		Clicking on About Event
		
		System.out.println("Clicking on Upload Logo");
		
		waitForClickabilityOf(eventLogo);
		
		driver.findElement(eventLogo).sendKeys(home+"/Test Data/LogoAndTheme.png");
		
		Thread.sleep(2000);
		
//		Clicking on Top Bar
		
		System.out.println("Clicking on Top Bar");
		
		waitForClickabilityOf(topBar);
		
		driver.findElement(topBar).click();
		
		Thread.sleep(2000);
		
//		Selecting the Top Bar Color Code
		
		System.out.println("Selecting the Top Bar Color Code");
		
		waitForClickabilityOf(topBarColor);
		
		driver.findElement(topBarColor).clear();
		
		driver.findElement(topBarColor).sendKeys("095ded");
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(topBarColorSubmit);
		
		driver.findElement(topBarColorSubmit).click();
		
		Thread.sleep(2000);
		
//		Clicking on Header Bar
		
		System.out.println("Clicking on Header Bar");
		
		waitForClickabilityOf(headerBar);
		
		driver.findElement(headerBar).click();
		
		Thread.sleep(2000);
		
//		Selecting the Header Bar Color Code
		
		System.out.println("Selecting the Header Bar Color Code");
		
		waitForClickabilityOf(headerColor);
		
		driver.findElement(headerColor).clear();
		
		driver.findElement(headerColor).sendKeys("b316ae");
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(headerColorSubmit);
		
		driver.findElement(headerColorSubmit).click();
		
		Thread.sleep(2000);
		
//		Clicking on Font Bar
		
		System.out.println("Clicking on Font Bar");
		
		waitForClickabilityOf(font);
		
		driver.findElement(font).click();
		
		Thread.sleep(2000);
		
//		Selecting the Font Color Code
		
		System.out.println("Selecting the Font Color Code");
		
		waitForClickabilityOf(fontColor);
		
		driver.findElement(fontColor).clear();
		
		driver.findElement(fontColor).sendKeys("12d900");
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(fontColorSubmit);
		
		driver.findElement(fontColorSubmit).click();
		
		Thread.sleep(2000);
		
//		Clicking on Side Navigation
		
		System.out.println("Clicking on Side Navigation");
		
		waitForClickabilityOf(sideNavigation);
		
		driver.findElement(sideNavigation).click();
		
		Thread.sleep(2000);
		
//		Selecting the Font Color Code
		
		System.out.println("Selecting the Side Navigation Color Code");
		
		waitForClickabilityOf(navigationColor);
		
		driver.findElement(navigationColor).clear();
		
		driver.findElement(navigationColor).sendKeys("d66813");
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(navigationColorSubmit);
		
		driver.findElement(navigationColorSubmit).click();
		
		Thread.sleep(2000);
		
//		Clicking on Save Button
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(logoSaveBtn);
		
		driver.findElement(logoSaveBtn).click();
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		return new AppBranding(driver);
		
	}
	
//	App Splash/Welcome Method 
	
	public AppBranding splashOrWelcome(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on App Splash/Welcome
		
		System.out.println("Clicking on App Splash/Welcome");
		
		waitForClickabilityOf(appSplashWelcome);
		
		driver.findElement(appSplashWelcome).click();
		
		Thread.sleep(2000);
		
//		Clicking on About Event
		
		System.out.println("Clicking on Yes Button");
		
		waitForClickabilityOf(splashYesBtn);
		
		driver.findElement(splashYesBtn).click();
		
		Thread.sleep(2000);
		
//		Uploading 1st Welcome Image
		
		System.out.println("Uploading 1st Welcome Image");
		
		waitForClickabilityOf(upload1stFile);
		
		driver.findElement(upload1stFile).sendKeys(home+"/Test Data/Splash1st.jpg");
		
		Thread.sleep(2000);
		
//		Clicking on About Event
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(logoSaveBtn);
		
		driver.findElement(logoSaveBtn).click();
		
		
		
		
		return new AppBranding(driver);
		
		
		
		
	}
	
//	Event Background Image Method
	
	public AppBranding eventBackground(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Clicking on Event Background
		
		System.out.println("Clicking on Event Background");
		
		waitForClickabilityOf(eventBackGround);
		
		driver.findElement(eventBackGround).click();
		
		Thread.sleep(2000);
		
//		Clicking on Custom Back
		
		boolean Custom = driver.findElement(eventBackGround).isSelected();
		
		if (Custom==false) {
			
			System.out.println("Clicking on Custom Background");
			
			waitForClickabilityOf(customBack);
			
			driver.findElement(customBack).click();
			
		} else {
			
			System.out.println("Custom Background is Already Selected");

		}
		
		Thread.sleep(2000);
		
//		Clicking on Custom Back
		
		boolean Image = driver.findElement(imageBack).isSelected();
		
		if (Image==false) {
			
			System.out.println("Clicking on Custom Image");
			
			waitForClickabilityOf(imageBack);
			
			driver.findElement(imageBack).click();
			
		} else {
			
			System.out.println("Image is Already Selected");

		}
		
//		Selecting Gallery
		
		Thread.sleep(2000);
		
		System.out.println("Selecting Gallery Image");
		
		waitForClickabilityOf(selectGallery);
		
		driver.findElement(selectGallery).click();
		
		Thread.sleep(2000);
		
//		Selecting Custom Image
		
		System.out.println("Selecting the Custom Image");
		
		waitForClickabilityOf(blueWave);
		
		driver.findElement(blueWave).click();
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(backSaveBtn);
		
		driver.findElement(backSaveBtn).click();
		
		Thread.sleep(2000);
		
//		Storing the Success Message
		
//		waitForClickabilityOf(suceessMsg);
		
		Thread.sleep(2000);
		
		String Message = driver.findElement(suceessMsg).getText();
		
		if (Message.equals("Gallery Images has been saved successfully.")) {
			
			System.out.println("Successfully Saved The Image");
			
		} else {
			
			System.out.println("Failed to Save The Image");

		}
			
		
		
		return new AppBranding(driver);
		
	}
	
//	Event Banner Mathod
	
	public AppBranding eventBanner(String EmailId, String Password,String EventFullName,String Target) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on Event Banner
		
		System.out.println("Clicking on Event Banner");
		
		waitForClickabilityOf(clickOnEventBanner);
		
		driver.findElement(clickOnEventBanner).click();
		
		Thread.sleep(2000);
		
//		Clicking on Add New Banner
		
		System.out.println("Clicking on Add New Banner");
		
		waitForClickabilityOf(addNewBanner);
		
		driver.findElement(addNewBanner).click();
		
		Thread.sleep(2000);
		
//		Selecting Target Banner
		
		if (Target.equals("External")) {
			
			System.out.println("Selecting External Link");
			
			waitForClickabilityOf(externalLink);
			
			driver.findElement(externalLink).click();
			
			waitForClickabilityOf(urlOrLink);
			
			driver.findElement(urlOrLink).sendKeys("https://event2mobile.com/");
			
			
		} else if (Target.equals("Internal")) {
					
			System.out.println("Selecting Internal Link");
			
			waitForClickabilityOf(internalLink);
			
			driver.findElement(internalLink).click();
			
			waitForClickabilityOf(selectSection);
			
			Select SectionDropDown = new Select(driver.findElement(selectSection));
			
			SectionDropDown.selectByIndex(8);
			
		} else {
			
			System.out.println("Selecting No Link");
			
			
		}
		
		Thread.sleep(2000);
		
//		Selecting iPhone5 Banner
		
		System.out.println("Selecting iPhone5 Banner");
				
		waitForClickabilityOf(iPhone5);
		
		driver.findElement(iPhone5).sendKeys(home+"/Test Data/iPhone5.jpg");
		
		Thread.sleep(2000);
		
//		Selecting iPhone6 Banner
		
		System.out.println("Selecting iPhone6 Banner");
				
		waitForClickabilityOf(iPhone6);
		
		driver.findElement(iPhone6).sendKeys(home+"/Test Data/iPhone6.jpg");
		
		Thread.sleep(2000);
		
//		Selecting iPhone6 Plus Banner
		
		System.out.println("Selecting iPhone6 Plus Banner");
				
		waitForClickabilityOf(iPhone6Plus);
		
		driver.findElement(iPhone6Plus).sendKeys(home+"/Test Data/iPhone6Plus.jpg");
		
		Thread.sleep(2000);
		
//		Selecting iPhone X Banner
		
		System.out.println("Selecting iPhone X Banner");
				
		waitForClickabilityOf(iPhoneX);
		
		driver.findElement(iPhoneX).sendKeys(home+"/Test Data/iPhoneX.jpg");
		
		Thread.sleep(2000);
		
//		Selecting All Android Banner
		
		System.out.println("Selecting All Android Banner");
				
		waitForClickabilityOf(allAndroid);
		
		driver.findElement(allAndroid).sendKeys(home+"/Test Data/android.jpg");
		
		Thread.sleep(2000);
		
//		Selecting iPad Potrait Banner
		
		System.out.println("Selecting iPad Potrait Banner");
				
		waitForClickabilityOf(iPadPortrait);
		
		driver.findElement(iPadPortrait).sendKeys(home+"/Test Data/iPadP.jpg");
		
		Thread.sleep(2000);
		
//		Selecting iPad Landscape Banner
		
		System.out.println("Selecting iPad Landscape Banner");
				
		waitForClickabilityOf(iPadLand);
		
		driver.findElement(iPadLand).sendKeys(home+"/Test Data/iPadL.jpg");
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Add Banner");
		
		waitForClickabilityOf(addBanner);
		
		driver.findElement(addBanner).click();
		
			
		
		
		return new AppBranding(driver);
		
	}

}
