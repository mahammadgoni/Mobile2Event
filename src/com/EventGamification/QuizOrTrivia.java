package com.EventGamification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class QuizOrTrivia extends BaseSetUp{
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnGamification = By.xpath("//li[@id='GM']//a[@href='javascript:void(0);']");
	
	By clickOnQuiz = By.xpath("//li[@id='Quiz']");
	
	By scanQRYes = By.xpath("//*[@id='ContentPlaceHolder1_rbtnQRCodeAccess_0']");
	
	By scanQRNo = By.xpath("//*[@id='ContentPlaceHolder1_rbtnQRCodeAccess_1']");
	
	By clickOnNewQuestion = By.xpath("//a[@href='QuizTriviaAddEdit.aspx'][contains(text(),'New Question')]");
	
	By quizLocation = By.xpath("//*[@id='ContentPlaceHolder1_txtLocation']");
	
	By quizScore = By.xpath("//*[@id='ContentPlaceHolder1_txtScore']");
	
	By quizAttempts = By.xpath("//*[@id='ContentPlaceHolder1_txtRetries']");
	
	By quizDate = By.xpath("//*[@id='ContentPlaceHolder1_txtEndDate']");
	
	By quizTime = By.xpath("//*[@id='ContentPlaceHolder1_txtToTime']");
	
	By locationDescription = By.xpath("//*[@id='ContentPlaceHolder1_txtLocationDescription']");
	
	By questionOrTask = By.xpath("//*[@id='ContentPlaceHolder1_txtQuestionTask']");
	
	By qOption1 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn1Text']");
	
	By rB1 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn1']");
	
	By qOption2 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn2Text']");
	
	By rB2 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn2']");
	
	By qOption3 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn3Text']");
	
	By rB3 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn3']");
	
	By qOption4 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn4Text']");
	
	By rB4 = By.xpath("//*[@id='ContentPlaceHolder1_rdobtn1Text']");
	
	By successMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtSuccessmsg']");
	
	By failureScanMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtFailMessageWrongLoc']");
	
	By failureAnswerMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtFaliuremsgwrongans']");
	
	By failureAttemptsMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtFailanswerattempts']");
	
	By failureIfInactive = By.xpath("//*[@id='ContentPlaceHolder1_txtinactivelocation']");
	
	By failureIfPlayedMessage = By.xpath("//*[@id='ContentPlaceHolder1_txtalreadyplayed']");
	
	By saveBtn = By.xpath("//*[@id='ContentPlaceHolder1_btnSave']");
	
	By deleteBtn = By.xpath("//*[@id='ContentPlaceHolder1_gvResources_imgDel_0']");
	
	By generateAllQRs = By.xpath("//a[@id='ContentPlaceHolder1_btnDownloadBC']");
	
	
	
	

	public QuizOrTrivia(WebDriver driver) {
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

//		Clicking on Gamification
		
		System.out.println("Clicking on Gamification");
		
		waitForClickabilityOf(clickOnGamification);
		
		driver.findElement(clickOnGamification).click();
		
//		Clicking on Quiz or Trivia
		
		System.out.println("Clicking on Quiz or Trivia");
		
		waitForClickabilityOf(clickOnQuiz);
		
		driver.findElement(clickOnQuiz).click();
		
	}
	
	public void commonQuestionAdd(boolean ScanQRCode,String Location,String Score,String Question,String Option1,String Option2,String Option3,String Option4,String CorrectOption) throws InterruptedException{
		
		Thread.sleep(2000);
		
//		Clicking on New  Quiz or Trivia
		
		System.out.println("Clicking on New  Quiz or Trivia");
		
		waitForClickabilityOf(clickOnNewQuestion);
		
		driver.findElement(clickOnNewQuestion).click();
		
		Thread.sleep(2000);
		
//		Verifying the Input 
		
		if (ScanQRCode==true) {
			
//			Clicking on Yes Radio Button
			
			System.out.println("Clicking on Yes Radio Button");
			
			waitForClickabilityOf(scanQRYes);
			
			driver.findElement(scanQRYes).click();
			
			
		} else {
			
//			Clicking on No Radio Button
			
			System.out.println("Clicking on No Radio Button");
			
			waitForClickabilityOf(scanQRNo);
			
			driver.findElement(scanQRNo).click();

		}		
		
		Thread.sleep(2000);
		
//		Clicking on Location
		
		System.out.println("Entering the Location");
		
		waitForClickabilityOf(quizLocation);
		
		driver.findElement(quizLocation).sendKeys(Location);
		
		Thread.sleep(2000);
		
//		Entering the Score
		
		System.out.println("Entering the Score");
		
		waitForClickabilityOf(quizScore);
		
		driver.findElement(quizScore).sendKeys(Score);
		
		Thread.sleep(2000);
		
//		Entering Attempts
		
		System.out.println("Entering Attempts");
		
		waitForClickabilityOf(quizAttempts);
		
		driver.findElement(quizAttempts).sendKeys("3");
		
		Thread.sleep(2000);
		
//		Selecting Activation Date
		
		System.out.println("Selecting Activation Date");
		
		waitForClickabilityOf(quizDate);
		
		WebElement Date = driver.findElement(quizDate);
		
		Date.click();
		
		Date.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Selecting Activation Time
		
		System.out.println("Selecting Activation Time");
		
		waitForClickabilityOf(quizTime);
		
		WebElement Time = driver.findElement(quizTime);
		
		Time.click();
		
		Time.sendKeys(Keys.UP,Keys.ENTER);
		
		Thread.sleep(2000);
		
//		Entering Location Description
		
		System.out.println("Entering Location Description");
		
		waitForClickabilityOf(locationDescription);
		
		driver.findElement(locationDescription).sendKeys("This is Automation Testing Location Description");
		
		Thread.sleep(2000);
		
//		Entering Question or Task
		
		System.out.println("Entering Question or Task");
		
		waitForClickabilityOf(questionOrTask);
		
		driver.findElement(questionOrTask).sendKeys(Question);
		
		Thread.sleep(2000);
		
//		Entering 1st Question Option
		
		System.out.println("Entering 1st Question Option");
		
		waitForClickabilityOf(qOption1);
		
		driver.findElement(qOption1).sendKeys(Option1);
		
		Thread.sleep(2000);
		
//		Entering 2nd Question Option
		
		System.out.println("Entering 2nd Question Option");
		
		waitForClickabilityOf(qOption2);
		
		driver.findElement(qOption2).sendKeys(Option2);
		
		Thread.sleep(2000);
		
//		Entering 3rd Question Option
		
		System.out.println("Entering 3rd Question Option");
		
		waitForClickabilityOf(qOption3);
		
		driver.findElement(qOption3).sendKeys(Option3);
		
		Thread.sleep(2000);
		
//		Entering 4th Question Option
		
		System.out.println("Entering 4th Question Option");
		
		waitForClickabilityOf(qOption4);
		
		driver.findElement(qOption4).sendKeys(Option4);
		
		Thread.sleep(2000);
		
		if (CorrectOption.equals("B")) {
			
//			Selecting 2nd Option as Correct Answer
			
			System.out.println("Selecting 2nd Option as Correct Answer");
			
			waitForClickabilityOf(rB2);
			
			driver.findElement(rB2).click();
			
		} else if (CorrectOption.equals("C")) {
			
//			Selecting 3rd Option as Correct Answer
			
			System.out.println("Selecting 3rd Option as Correct Answer");
			
			waitForClickabilityOf(rB3);
			
			driver.findElement(rB3).click();
			
		} else if (CorrectOption.equals("D")) {
			
//			Selecting 4th Option as Correct Answer
			
			System.out.println("Selecting 4th Option as Correct Answer");
			
			waitForClickabilityOf(rB4);
			
			driver.findElement(rB4).click();
			
		}
		
		Thread.sleep(2000);
		
//		"Entering Success Message"
		
		System.out.println("Entering Success Message");
		
		waitForClickabilityOf(successMessage);
		
		driver.findElement(successMessage).clear();
		
		driver.findElement(successMessage).sendKeys("Congratulations, you have answered correctly! You have earned $$ points! WOW");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Location Scanned
		
		System.out.println("Entering Failure Message If wrong Location Scanned");
		
		waitForClickabilityOf(failureScanMessage);
		
		driver.findElement(failureScanMessage).clear();
		
		driver.findElement(failureScanMessage).sendKeys("You have scanned the wrong location. Please check the instructions and try with new location!");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Answer Given
		
		System.out.println("Entering Failure Message If wrong Answer Given");
		
		waitForClickabilityOf(failureAnswerMessage);
		
		driver.findElement(failureAnswerMessage).clear();
		
		driver.findElement(failureAnswerMessage).sendKeys("Sorry, that is the incorrect answer!  You did not earn any points :(  Sorry");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Location Scanned
		
		System.out.println("Entering Failure Message If Attempt Exhusted");
		
		waitForClickabilityOf(failureAttemptsMessage);
		
		driver.findElement(failureAttemptsMessage).clear();
		
		driver.findElement(failureAttemptsMessage).sendKeys("Sorry, you have exhausted all the attempts.  You did not earn any points, but please try again on the next question!");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Location Scanned
		
		System.out.println("Entering Failure Message If Inavtive Location Scanned");
		
		waitForClickabilityOf(failureIfInactive);
		
		driver.findElement(failureIfInactive).clear();
		
		driver.findElement(failureIfInactive).sendKeys("This location is not yet unlocked.  Please try again later.");
		
		Thread.sleep(2000);
		
//		Entering Failure Message If wrong Location Scanned
		
		System.out.println("Entering Failure Message If already been Played");
		
		waitForClickabilityOf(failureIfPlayedMessage);
		
		driver.findElement(failureIfPlayedMessage).clear();
		
		driver.findElement(failureIfPlayedMessage).sendKeys("This location has already been played successfully.");
		
		Thread.sleep(2000);
		
//		Clicking On Save Button
		
		System.out.println("Clicking On Save Button");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
				
		
	}
	
//	Creating Quiz or Trivia
	
	public QuizOrTrivia addQuizOrTrivia(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
		Thread.sleep(2000);
		
//		Creating the 1st Questions
		
		commonQuestionAdd(true, "Automation Game Room", "100", "What is your Domain?", ".Net", "pHp", "Java", "Python", "D");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Creating the 2nd Questions
		
		commonQuestionAdd(true, "Automation Gym Room", "100", "Which Year is this?", "2015", "2016", "2018", "2019", "C");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Creating the 3rd Questions
		
		commonQuestionAdd(false, "Automation Code Room", "100", "Which Month is this?", "December", "May", "June", "July", "B");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Creating the 4th Questions
		
		commonQuestionAdd(false, "Automation Test Room", "100", "When the Event will Start?", "6.00 AM", "7.00 PM", "8.00 AM", "9.00 PM", "A");
		
		Thread.sleep(2000);
		
		try {
			popUpHandeling();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
//		Clicking On Generate All QRs
		
		System.out.println("Clicking On Generate All QRs");
		
		waitForClickabilityOf(generateAllQRs);
		
		driver.findElement(generateAllQRs).click();
		
		Thread.sleep(2000);
		
//		Checking No Of Questions
		
		waitForClickabilityOf(deleteBtn);
		
		boolean ExistQsNo = driver.findElement(deleteBtn).isDisplayed();
						
		if (ExistQsNo==true) {
			
			System.out.println("Succefully Added Quiz Questions ");
			
		} else {
			
			System.out.println("Failed to Add Quiz Questions");

		}
					
		return new QuizOrTrivia(driver);
		
	}

}
