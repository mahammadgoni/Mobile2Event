package com.EventGamification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class ScoringRules extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnGamification = By.xpath("//li[@id='GM']//a[@href='javascript:void(0);']");
	
	By clickOnScoringRules = By.xpath("//a[@class='ChangeArrow menu-hidden-arrow'][contains(text(),'Scoring Rules')]");
	
	By selectGameType = By.xpath("//*[@id='ContentPlaceHolder1_ddlgametype']");
	
	By firstAttempt = By.xpath("//*[@id='ContentPlaceHolder1_txtattempt1']");
	
	By secondAttempt = By.xpath("//*[@id='ContentPlaceHolder1_txtattempt2']");
	
	By successiveAttempt = By.xpath("//*[@id='ContentPlaceHolder1_txtattempt3']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_lblError']");

	public ScoringRules(WebDriver driver) {
		super(driver);
		
	}
	
	public ScoringRules addScoringRules(String EmailId, String Password,String EventFullName,String GameType,String Score1st,String Score2nd,String Score3rd) throws InterruptedException{
		
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
		
//		Clicking on Locations
		
		System.out.println("Clicking on Scoring Rules");
		
		waitForClickabilityOf(clickOnScoringRules);
		
		driver.findElement(clickOnScoringRules).click();
		
		Thread.sleep(2000);
		
//		Verifying Game Type
		
		if (GameType.equals("Location")) {
			
			System.out.println("Selecting the Game Type As Location");
			
			waitForClickabilityOf(selectGameType);
			
			Select GameTypeDropDown = new Select(driver.findElement(selectGameType));
			
			GameTypeDropDown.selectByIndex(1);
			
		} else {
			
			System.out.println("Selecting the Game Type As Quiz/Trivia");

		}
		
		Thread.sleep(2000);
		
//		Entering First Attempt Point
		
		System.out.println("Entering First Attempt Point");
		
		waitForClickabilityOf(firstAttempt);
		
		driver.findElement(firstAttempt).clear();
		
		driver.findElement(firstAttempt).sendKeys(Score1st);
		
		Thread.sleep(2000);
		
//		Entering 2nd Attempt Point
		
		System.out.println("Entering 2nd Attempt Point");
		
		waitForClickabilityOf(secondAttempt);
		
		driver.findElement(secondAttempt).clear();
		
		driver.findElement(secondAttempt).sendKeys(Score2nd);
		
//		Entering Successive Attempt Point
		
		System.out.println("Entering Successive Attempt Point");
		
		waitForClickabilityOf(successiveAttempt);
		
		driver.findElement(successiveAttempt).clear();
		
		driver.findElement(successiveAttempt).sendKeys(Score3rd);
		
		Thread.sleep(2000);
		
//		Clicking on Save Button to Create the Scoring Rules
		
		System.out.println("Clicking on Save Button to Create the Scoring Rules");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
		
//		Storing the Message
		
		String Message = driver.findElement(successMessage).getText();
		
		if (Message.equals("Score Saved Successfully")) {
			
			System.out.println("Succefully Created the Scoring Rules ");
			
		} else {
			
			System.out.println("Failed to Create Scoring Rules");

		}
		
	
		return new ScoringRules(driver);
		
	}

}
