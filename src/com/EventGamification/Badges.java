package com.EventGamification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class Badges extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnGamification = By.xpath("//li[@id='GM']//a[@href='javascript:void(0);']");
	
	By clickOnBadges = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Badges')]");
	
	By createNewBadge = By.xpath("//*[@id='ContentPlaceHolder1_ContentPlaceHolder1_A2']");
	
	By badgeTitle = By.xpath("//*[@id='ContentPlaceHolder1_txtBadgetitle']");
	
	By badgeIcon = By.xpath("//*[@id='ContentPlaceHolder1_fuProfile1']");
	
	By howToPlay = By.xpath("//*[@id='ContentPlaceHolder1_txtDtls1']");
	
	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtBadgeMessage']");
	
	By score = By.xpath("//*[@id='ContentPlaceHolder1_txtscore']");
	
	By acDate = By.xpath("//*[@id='ContentPlaceHolder1_txtEndDate']");
	
	By acTime = By.xpath("//*[@id='ContentPlaceHolder1_txtToTime']");
	
	By mapGameType = By.xpath("//*[@id='ContentPlaceHolder1_ddlgametype']");
	
	By selectAllQuizCheckBox = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_chkHeader']");
	
	By selectAllLocationCheckBox = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_chkHeader']");
	
	By selectUserCheckBox = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_rbtnUC_0']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	

	public Badges(WebDriver driver) {
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

//		Clicking on Gamification
		
		System.out.println("Clicking on Gamification");
		
		waitForClickabilityOf(clickOnGamification);
		
		driver.findElement(clickOnGamification).click();
		
		Thread.sleep(2000);
		
//		Clicking on Badges
		
		System.out.println("Clicking on Badges");
		
		waitForClickabilityOf(clickOnBadges);
		
		driver.findElement(clickOnBadges).click();
		
	}
	
	public Badges addBadges(String EmailId, String Password,String EventFullName,String Title,String MappingGameType) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Clicking on New Badges
		
		System.out.println("Clicking on New Badges");
		
		waitForClickabilityOf(createNewBadge);
		
		driver.findElement(createNewBadge).click();
		
		Thread.sleep(2000);
				
//		Entering Badge Title
		
		System.out.println("Entering Badge Title");
		
		waitForClickabilityOf(badgeTitle);
		
		driver.findElement(badgeTitle).clear();
		
		driver.findElement(badgeTitle).sendKeys(Title);
		
		Thread.sleep(2000);
		
//		Entering Badge Icon
		
//		System.out.println("Entering Badge Icon");
//		
//		waitForClickabilityOf(badgeIcon);
//				
//		driver.findElement(badgeIcon).sendKeys(Title);
//		
//		Thread.sleep(2000);
		
//		Entering How to Play
		
		System.out.println("Entering How to Play");
		
		waitForClickabilityOf(howToPlay);
		
		driver.findElement(howToPlay).clear();
		
		driver.findElement(howToPlay).sendKeys("Instruction will provide later.");
		
		Thread.sleep(2000);
		
//		Entering Success Message
		
		System.out.println("Entering Success Message");
		
		waitForClickabilityOf(successMessage);
		
		driver.findElement(successMessage).clear();
		
		driver.findElement(successMessage).sendKeys("Congratulations, you have unlocked a special badge for scanning all locations correctly! Hurray");
		
		Thread.sleep(2000);
		
//		Entering Success Score
		
		System.out.println("Entering Score");
		
		waitForClickabilityOf(score);
		
		driver.findElement(score).clear();
		
		driver.findElement(score).sendKeys("100");
		
		Thread.sleep(2000);
		
//		Entering Activation Date
		
		System.out.println("Entering Activation Date");
		
		waitForClickabilityOf(acDate);
		
		WebElement Date = driver.findElement(acDate);
		
		Date.clear();
		
		Date.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Entering Activation Time
		
		System.out.println("Entering Activation Time");
		
		waitForClickabilityOf(acTime);
		
		WebElement Time = driver.findElement(acTime);
		
		Time.clear();
		
		Time.sendKeys(Keys.ENTER);
		
//		Again selecting the Time
		
		Thread.sleep(2000);
		
		Date.click();
		
		Date.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		if (MappingGameType.equals("Quiz")) {
			
			System.out.println("Selecting the Game Type As Quiz");
			
			waitForClickabilityOf(mapGameType);
			
			Select GameTypeDropDown = new Select(driver.findElement(mapGameType));
			
			GameTypeDropDown.selectByIndex(1);
			
			Thread.sleep(2000);
			
//			Clicking On Select All Check Box
			
			System.out.println("Clicking On Select All Check Box");
			
			waitForClickabilityOf(selectAllQuizCheckBox);
			
			driver.findElement(selectAllQuizCheckBox).click();
						
			
		} else if (MappingGameType.equals("Location")) {
			
			System.out.println("Selecting the Game Type As Location");
			
			waitForClickabilityOf(mapGameType);
			
			Select GameTypeDropDown = new Select(driver.findElement(mapGameType));
			
			GameTypeDropDown.selectByIndex(2);
			
			Thread.sleep(2000);
			
//			Clicking On Select All Check Box
			
			System.out.println("Clicking On Select All Check Box");
			
			waitForClickabilityOf(selectAllLocationCheckBox);
			
			driver.findElement(selectAllLocationCheckBox).click();
						
		}else {
			
			System.out.println("Selecting the Game Type As Make a Friend");
			
//			Clicking On Select All Check Box
			
			System.out.println("Selecting User Connection Box");
			
			waitForClickabilityOf(selectUserCheckBox);
			
			driver.findElement(selectUserCheckBox).click();
						
		}
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		
		return new Badges(driver);
		
	}

}
