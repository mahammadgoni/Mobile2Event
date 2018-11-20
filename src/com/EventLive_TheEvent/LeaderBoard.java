package com.EventLive_TheEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class LeaderBoard extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnLiveEvent = By.xpath("//li[@id='LV']//a[@href='javascript:void(0);']");
	
	By clickOnLeaderBoard = By.xpath("//li[@id='Leaderboard']");
	
	By businessCardScore = By.xpath("//tbody//tr[2]//td[2]//input[1]");
	
	By businessCarsMaxScore = By.xpath("//tbody//tr[2]//td[3]//input[1]");
	
	By businessCardSaveBtn = By.xpath("//tbody//tr[2]//td[4]//input[1]");
	
//	Advance Leader Board Elements
	
	By advanceTab = By.xpath("//a[@id='ContentPlaceHolder1_AdvanceTabLab']");
	
	By scoringCriteriaDropDown = By.xpath("//select[@id='ddlScoringCriteria']");
	
	By activityScore = By.xpath("//input[@id='txtActivityScore']");
	
	By maxPermissibleScore = By.xpath("//input[@id='txtMaxPermissibleScore']");
	
	By selectAllPersion = By.xpath("//input[@id='chkUserHeader']");
	
	By selectAllGroup = By.xpath("//input[@id='chkUserGroupHeader']");
		
	By saveBtn = By.xpath("//*[@id='btnAdvScoreSave']");
	
//	View Leader Board Elements
	
	By clickOnLeaderBoardView = By.xpath("//*[@id='btnAdvScoreSave']");
	
	By userDetails = By.xpath("//div[@id='UpdatePanel2']");
	
	By clientDetails = By.xpath("//div[@id='UpdatePanel1']");
	
	

	public LeaderBoard(WebDriver driver) {
		super(driver);
		
	}
	
//	Edit Activity Points
	
	public LeaderBoard editActivityPoints(String EmailId, String Password,String EventFullName,String NewScore) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Live Events");
		
		waitForClickabilityOf(clickOnLiveEvent);
		
		driver.findElement(clickOnLiveEvent).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Leader Board");
		
		waitForClickabilityOf(clickOnLeaderBoard);
		
		driver.findElement(clickOnLeaderBoard).click();
		
		Thread.sleep(2000);
		
//		Storing the Score Points
		
		System.out.println("Entering the Score Points");
		
		waitForClickabilityOf(businessCardScore);
		
		String Score = driver.findElement(businessCardScore).getText();
		
		Thread.sleep(2000);
		
		driver.findElement(businessCardScore).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(businessCardScore).sendKeys(NewScore);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(businessCardSaveBtn);
		
		driver.findElement(businessCardSaveBtn).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(businessCardScore);
		
		String Score1 = driver.findElement(businessCardScore).getText();
		
		Thread.sleep(2000);
		
		if (Score==Score1) {
			
			System.out.println("Failed to Verify Leader Board Points ");
			
		} else {
			
			System.out.println("Successfully Verified Leader Board Points");
			

		}
		
		
		
		
		return new LeaderBoard(driver);
		
	}
	
//	Advance Leader Board
	
	public LeaderBoard advanceLeaderBoard(String EmailId, String Password,String EventFullName,String ActivityScore,String MaxScore,String Criteria) throws InterruptedException{
		
		
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
		
		System.out.println("Clicking on Live Events");
		
		waitForClickabilityOf(clickOnLiveEvent);
		
		driver.findElement(clickOnLiveEvent).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Leader Board");
		
		waitForClickabilityOf(clickOnLeaderBoard);
		
		driver.findElement(clickOnLeaderBoard).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Advance Tab");
		
		waitForClickabilityOf(advanceTab);
		
		driver.findElement(advanceTab).click();
		
		Thread.sleep(2000);
		
		Select CriteriaDropDown = new Select(driver.findElement(scoringCriteriaDropDown));
		
		if (Criteria=="Group") {
			
			System.out.println("Selecting Group ");
			
			CriteriaDropDown.selectByVisibleText("Group");
			
			Thread.sleep(2000);
			
			System.out.println("Selecting Group");
			
			waitForClickabilityOf(selectAllGroup);
			
			driver.findElement(selectAllGroup).click();
			
		} else {
			
			System.out.println("Selecting Specific Person ");
			
			CriteriaDropDown.selectByVisibleText("Specific Person");
			
			Thread.sleep(2000);
			
			System.out.println("Selecting Specific Person");
			
			waitForClickabilityOf(selectAllPersion);
			
			driver.findElement(selectAllPersion).click();

		}
		
		Thread.sleep(2000);
		
		System.out.println("Entering Activity Score");
		
		waitForClickabilityOf(activityScore);
		
		driver.findElement(activityScore).sendKeys(ActivityScore);
		
		Thread.sleep(2000);
		
		System.out.println("Entering Max Activity Score");
		
		waitForClickabilityOf(maxPermissibleScore);
		
		driver.findElement(maxPermissibleScore).sendKeys(MaxScore);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		return new LeaderBoard(driver);
		
	}
	
	
//	Leader Board View Test Method
	
	public LeaderBoard leaderBoardView(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Live Events");
		
		waitForClickabilityOf(clickOnLiveEvent);
		
		driver.findElement(clickOnLiveEvent).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Leader Board");
		
		waitForClickabilityOf(clickOnLeaderBoard);
		
		driver.findElement(clickOnLeaderBoard).click();
		
		Thread.sleep(2000);
				
		String currenWindow = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Leader Board View ");
		
		waitForClickabilityOf(clickOnLeaderBoardView);
		
		driver.findElement(clickOnLeaderBoardView).click();
		
		Thread.sleep(2000);
		
		for (String nextWindow : driver.getWindowHandles()) {
			
			System.out.println("Switching to New Window");
			
			driver.switchTo().window(nextWindow);
			
		}
		
		Thread.sleep(2000);
		
		boolean UserDetails = driver.findElement(userDetails).isDisplayed();
		
		Thread.sleep(2000);
		
		boolean ClientsDetails = driver.findElement(clientDetails).isDisplayed();
		
		System.out.println("Closing new Window");
		
		driver.close();
		
		driver.switchTo().window(currenWindow);
		
		if (UserDetails==true & ClientsDetails==true) {
			
			System.out.println("Successfully Verified the Leader Board View");
			
		} else {
			
			System.out.println("Failed to Verify the Leader Board View");
			

		}
		
		
		return new LeaderBoard(driver);
		
	}
	
	

}
