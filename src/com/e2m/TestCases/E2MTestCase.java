package com.e2m.TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.CommonActions.ForgotPassword;
import com.CommonActions.LoginToAccount;
import com.EventAgendaSetup.AddAttendees;
import com.EventAgendaSetup.AddExhibitors;
import com.EventAgendaSetup.AddSessions;
import com.EventAgendaSetup.AddSpeakers;
import com.EventAgendaSetup.AddSponsors;
import com.EventAgendaSetup.UploadData;
import com.EventGamification.Badges;
import com.EventGamification.Locations;
import com.EventGamification.MakeAFriend;
import com.EventGamification.QuizOrTrivia;
import com.EventGamification.ScoringRules;
import com.EventLive_TheEvent.PollOrVote;
import com.EventLive_TheEvent.Rate;
import com.EventManagement.CloneEvent;
import com.EventManagement.MapUserToEvent;
import com.EventManagement.NewEvent;
import com.EventMeetings.ConfigureMeetings;
import com.EventMeetings.ExpertTopicMapping;
import com.EventMeetings.ManageMeetings;
import com.EventMeetings.SetUpMeetings;
import com.EventMeetings.UploadMeetings;
import com.EventSetup.AboutEvent;
import com.EventSetup.AppBranding;
import com.EventSetup.AppMenu;
import com.EventSetup.FloorMap;
import com.EventSetup.Resources;
import com.UserManagement.AddUser;
import com.UserManagement.DeleteUser;
import com.UserManagement.EditUserDetails;
import com.UserManagement.RolesAndPrivileges;
import com.UserManagement.UpdateUserCredentials;
import com.Utils.BrowserSetUp;
import com.Utils.GetScreenShot;

// This Listener is for taking screen shot

@Listeners({ GetScreenShot.class })

public class E2MTestCase extends BrowserSetUp {
	
	

	// Browser Set Up Method
	@BeforeClass
	public void setUp() throws InterruptedException, InvalidFormatException, IOException {

		openBrowser();

	}

	// Browser Close Method
	@AfterClass
	public void tearDown() {

		quitAllBrowser();

	}

	// Logout Method
	@AfterMethod
	public void afterMethod() throws IOException, InvalidFormatException {

		logOut();

		methodSeparation();

	}

	// Test Cases Methods

//	 @Test(priority = 1,alwaysRun=true)
//	 public void loginToAccountTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Login To Account Test");
//	
//	 new LoginToAccount(driver).loginToAccount(EmailId, Password);
//	
//	 }
//	
//	 @Test(priority = 2,alwaysRun=true)
//	 public void forgotPasswordTest() throws InterruptedException, AWTException {
//	
//	 System.out.println("Executing : Forgot Password Test");
//	
//	 new ForgotPassword(driver).forgotPassword("jakesoly@mailinator.com", "#e2m321");
//	
//	 }
//	
//	 @Test(priority = 3,alwaysRun=true)
//	 public void deleteSelectedUserTest() throws InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Delete Selected User Test");
//	
//	
//	 new DeleteUser(driver).deleteSelectedUser(EmailId, Password);
//	
//	 }
//	
//	 @Test(priority = 4,alwaysRun=true)
//	 public void deleteAllSelectedUserTest() throws InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Delete All Selected User Test");
//	
//	 new DeleteUser(driver).deleteAllUser(EmailId, Password);
//	
//	 }
//	
//	 @Test(priority = 5,alwaysRun=true)
//	 public void undoUserDeletionTest() throws InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Undo User Deletion Test");
//	
//	 new DeleteUser(driver).undoUserDeletion(EmailId, Password);
//	
//	 }
//	
//	 @Test(priority = 6,alwaysRun=true)
//	 public void purgeAllUserTest() throws InvalidFormatException, IOException, InterruptedException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Purge All User Test");
//	
//	 new DeleteUser(driver).purgeAllUser(EmailId, Password);
//	
//	 }
//	
//	 @Test(priority = 7,alwaysRun=true)
//	 public void addVerifiedUserTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Add Verified User Test");
//	
//	 new AddUser(driver).addVerifiedUser(EmailId, Password, "Kevin", "Ms", "kevinms@yopmail.com");
//	
//	 }
//	
//	 @Test(priority = 8,alwaysRun=true)
//	 public void addUnverifiedUserTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Add Unverified User Test");
//	
//	 new AddUser(driver).addUnverifiedUser(EmailId, Password, "Liam", "Neson", "liamneson@yopmail.com");
//	
//	 }
//	
//	 @Test(priority = 9,alwaysRun=true)
//	 public void bulkUserUploadTest() throws InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String BulkUserUploadPath = getCellData(1, 12);
//	
//	 System.out.println("Executing : Bulk User Upload Test");
//	
//	 new AddUser(driver).userBulkUpload(EmailId, Password, home+BulkUserUploadPath);
//	
//	 }
//	
//	 @Test(priority = 10,alwaysRun=true)
//	 public void resetPasswordTest() throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Reset User Password Test");
//	
//	 new EditUserDetails(driver).resetUserPassword(EmailId, Password);
//	
//	 }
//	
//	
//	 @Test(priority = 11,alwaysRun=true)
//	 public void changeUserDetailsTest() throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Change User Details Test");
//	
//	 new EditUserDetails(driver).editAndChangeUserDetails(EmailId, Password);
//	
//	 }
//	
//	 @Test(priority = 12,alwaysRun=true)
//	 public void addCMSRolesAndPrivilegesTest() throws ParseException,InterruptedException, AWTException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 System.out.println("Executing : Add CMS Roles and Privileges Test");
//	
//	 new RolesAndPrivileges(driver).addRoleAndPrivilege(EmailId, Password);
//	
//	 }
//	
//	 @Test(priority = 13,alwaysRun=true)
//	 public void updateUserCredentialsTest() throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Update User Credentials Test");
//	
//	 new UpdateUserCredentials(driver).updateCredentials(EmailId, Password, EventFullName);
//	
//	 }
//	
//	 @Test(priority = 14,alwaysRun=true)
//	 public void newEventCreationTest() throws InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 String EventShortName = getCellData(1, 8);
//	
//	 System.out.println("Executing : New Event Creation Test");
//	
//	 new NewEvent(driver).newEventCreation(EmailId, Password, EventFullName, EventShortName);
//	
//	 }
//	
//	 @Test(priority = 15,alwaysRun=true)
//	 public void viewEventInfoTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : View Event Info Test");
//	
//	 new AboutEvent(driver).eventInfo(EmailId, Password, EventFullName);
//	
//	 }
//	
//	 @Test(priority = 16,alwaysRun=true)
//	 public void addVenueTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Add Venue Test");
//	
//	 new AboutEvent(driver).addVenue(EmailId, Password, EventFullName, "Madison Square Garden", "Madison Square North, New York, NY, USA");
//	
//	 }
//	
//	 @Test(priority = 17,alwaysRun=true)
//	 public void addDisclaimerTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Add Disclaimer Test");
//	
//	 new AboutEvent(driver).addDisclaimer(EmailId, Password, EventFullName);
//	
//	 }
//	
//	 @Test(priority = 18,alwaysRun=true)
//	 public void addSocialLinkTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 String EventShortName = getCellData(1, 8);
//	
//	 System.out.println("Executing : Add Social Link Test");
//	
//	 new AboutEvent(driver).addSocialLink(EmailId, Password, EventFullName, EventShortName);
//	
//	 }
//	
//	 @Test(priority = 19,alwaysRun=true)
//	 public void addUsefulInfoTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 String EventShortName = getCellData(1, 8);
//	
//	 System.out.println("Executing : Add Useful Info Test");
//	
//	 new AboutEvent(driver).addUseFullInfo(EmailId, Password, EventFullName, EventShortName);
//	
//	 }
//	
//	 @Test(priority = 20,alwaysRun=true)
//	 public void bulkUplloadUsefulInfoTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Bulk Upload Useful Info Test");
//	
//	 new AboutEvent(driver).bulkUploadUsefullInfo(EmailId, Password, EventFullName);
//	
//	 }
//	
//	 @Test(priority = 21,alwaysRun=true)
//	 public void logoAndThemeUploadTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Upload Logo and Theme Test");
//	
//	 new AppBranding(driver).logoAndTheme(EmailId, Password, EventFullName);
//	
//	 }
//	
//	 @Test(priority = 22,alwaysRun=true)
//	 public void eventBackgroundImageTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Event Background Image Test");
//	
//	 new AppBranding(driver).eventBackground(EmailId, Password, EventFullName);
//	
//	 }
//	
//	
//	 @Test(priority = 23,alwaysRun=true)
//	 public void eventBannerNoLinkTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Event Banner with Nolink Test");
//	
//	 new AppBranding(driver).eventBanner(EmailId, Password, EventFullName, "NoLink");
//	
//	 }
//	
//	
//	 @Test(priority = 24,alwaysRun=true)
//	 public void eventBannerInternalLinkTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Event Banner Internal Link Test");
//	
//	 new AppBranding(driver).eventBanner(EmailId, Password, EventFullName, "Internal");
//	
//	 }
//	
//	 @Test(priority = 25,alwaysRun=true)
//	 public void eventBannerExternalTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Event Banner with External Link Test");
//	
//	 new AppBranding(driver).eventBanner(EmailId, Password, EventFullName, "External");
//	
//	 }
//	
//	 @Test(priority = 26,alwaysRun=true)
//	 public void addMenuCategoryTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Add New Menu Category Test");
//	
//	 new AppMenu(driver).addNewCategory(EmailId, Password, EventFullName, "Mac");
//	
//	 }
//	 
////	 Don't Run this
////	
////	 @Test(priority = 27,alwaysRun=true)
////	 public void manageCategoryTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
////	
////	 String EmailId = getCellData(1, 5);
////	
////	 String Password = getCellData(1, 6);
////	
////	 String EventFullName = getCellData(1, 7);
////	
////	 System.out.println("Executing : Manage Category Test");
////	
////	 new AppMenu(driver).manageCategory(EmailId, Password, EventFullName);
////	
////	 }
//	
//	 @Test(priority = 27,alwaysRun=true)
//	 public void addMenuTest() throws ParseException, InterruptedException,	 InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 System.out.println("Executing : Add Menu Test");
//	
//	 new AppMenu(driver).addMenuItem(EmailId, Password, EventFullName,"Siri");
//	
//	 }
//	 
////	 Don't Run this
////	
////	 @Test(priority = 29,alwaysRun=true)
////	 public void manageMenuOrderingTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
////	
////	 String EmailId = getCellData(1, 5);
////	
////	 String Password = getCellData(1, 6);
////	
////	 String EventFullName = getCellData(1, 7);
////	
////	 System.out.println("Executing : Manage Menu Ordering Test");
////	
////	 new AppMenu(driver).manageMenuOrdering(EmailId, Password, EventFullName);
////	
////	 }
//	 
//	@Test(priority = 28, alwaysRun = true)
//	public void uploadFileTypeResourceTest() throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String FilePath = "/Users/goni/Documents/workspace/WebSpiders/Mobile2Event/Test Data/ResourceData/ResourcesData.pdf";
//
//		System.out.println("Executing : Upload File Type Resource Test");
//
//		new Resources(driver).uploadFileResouce(EmailId, Password, EventFullName, FilePath);
//
//	}
//
//	@Test(priority = 28, alwaysRun = true)
//	public void uploadResourceTest() throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Upload Resource Test");
//
//		new Resources(driver).uploadResouce(EmailId, Password, EventFullName, SessionTitle);
//
//	}
//
//	@Test(priority = 29, alwaysRun = true)
//	public void addResourcesCategoryTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Resources Category Test");
//
//		new Resources(driver).addResourceCategory(EmailId, Password, EventFullName, "ResCat");
//
//	}
//
//	@Test(priority = 30, alwaysRun = true)
//	public void mapResourcesTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Resources Test");
//
//		new Resources(driver).mapResources(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 31, alwaysRun = true)
//	public void publishResourcesTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Publish Resources Test");
//
//		new Resources(driver).publishResource(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 32, alwaysRun = true)
//	public void downloadResourceQRCodeTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String EventShortName = getCellData(1, 8);
//
//		System.out.println("Executing : Download Resource QR Code Test");
//
//		new Resources(driver).downloadQRCode(EmailId, Password, EventFullName, EventShortName);
//
//	}
//	
//	@Test(priority = 33, alwaysRun = true)
//	public void addCustomInAppResourcesTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String ResourcesInAppPath = getCellData(1, 14);
//
//		System.out.println("Executing : Add Custom In App Resources Test");
//
//		new Resources(driver).addCustomResourcesInApp(EmailId, Password, EventFullName, "Automation InApp", ResourcesInAppPath);
//
//	}
//	
//	@Test(priority = 34, alwaysRun = true)
//	public void addCustomOutsideResourcesTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String ResourcesOutsidePath = getCellData(1, 15);
//
//		System.out.println("Executing : Add Custom Outside Resources Test");
//
//		new Resources(driver).addCustomResourcesOutside(EmailId, Password, EventFullName, "Automation Outside",ResourcesOutsidePath );
//
//	}
//	  	 
//
//	@Test(priority = 35, alwaysRun = true)
//	public void addSessionToEventTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Session to Event Test");
//
//		new AddSessions(driver).addSessions(EmailId, Password, EventFullName, SessionTitle, TrackName, Location);
//
//	}
//
//	@Test(priority = 36, alwaysRun = true)
//	public void addSessionWithTrackAndLocationToEventTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Session with Track and Location to Event Test");
//
//		new AddSessions(driver).addSessionsWithTrackAndLocation(EmailId, Password, EventFullName, SessionTitle,	TrackName, Location);
//
//	}
//
//	@Test(priority = 37, alwaysRun = true)
//	public void addSessionWithOutTrackAndLocationToEventTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Session without Track and Location to Event Test");
//
//		new AddSessions(driver).addSessionsWithOutTrackAndLocation(EmailId, Password, EventFullName, SessionTitle,Location);
//
//	}
//
//	@Test(priority = 38, alwaysRun = true)
//	public void addCheckInRegistrationWithTrackSessionTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String TrackName = getCellData(1, 10);
//		
//		String SessionTitle = getCellData(1, 9);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Check In Registration With Track Session to Event Test");
//
//		new AddSessions(driver).addCheckInRegistrationSession(EmailId, Password, EventFullName, TrackName,SessionTitle, Location,true);
//
//	}
//
//	@Test(priority = 39, alwaysRun = true)
//	public void addCheckInRegistrationWithOutTrackSessionTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//		
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Check In Registration without Track Location Session to Event Test");
//
//		new AddSessions(driver).addCheckInRegistrationSession(EmailId, Password, EventFullName, TrackName,SessionTitle, Location,false);
//
//	}
//
//	@Test(priority = 40, alwaysRun = true)
//	public void addBreakfastTypeSessionTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Breakfast Type Session to Event Test");
//
//		// Please Add Meal Type as : Breakfast
//
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName,SessionTitle, TrackName, Location,	"Breakfast");
//
//	}
//
//	@Test(priority = 41, alwaysRun = true)
//	public void addLunchTypeSessionTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Lunch Type Session to Event Test");
//
//		// Please Add Meal Type as : Lunch
//
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName,SessionTitle, TrackName, Location, "Lunch");
//
//	}
//
//	@Test(priority = 42, alwaysRun = true)
//	public void addTeaTypeSessionTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Tea Type Session to Event Test");
//
//		// Please Add Meal Type as : Tea
//
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, SessionTitle, TrackName, Location, "Tea");
//
//	}
//
//	@Test(priority = 43, alwaysRun = true)
//	public void addDinnerTypeSessionTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Dinner Type Session to Event Test");
//
//		// Please Add Meal Type as : Dinner
//
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName,SessionTitle, TrackName, Location, "Dinner");
//
//	}
//
//	@Test(priority = 44, alwaysRun = true)
//	public void addNetworkingWithTrackSessionTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Networking With Track Session to Event Test");
//
//		new AddSessions(driver).addNetworkingSession(EmailId, Password, EventFullName,SessionTitle, TrackName, Location, true);
//
//	}
//
//	@Test(priority = 45, alwaysRun = true)
//	public void addnetworkingWithOutTrackSessionTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String SessionTitle = getCellData(1, 9);
//
//		String TrackName = getCellData(1, 10);
//
//		String Location = getCellData(1, 11);
//
//		System.out.println("Executing : Add Networking Without Track Location Session to Event Test");
//
//		new AddSessions(driver).addNetworkingSession(EmailId, Password, EventFullName, SessionTitle,TrackName, Location, false);
//
//	}
//
//	@Test(priority = 46, alwaysRun = true)
//	public void addPollWithFreeTextTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Add Poll to Session with Free Text Question Test");
//
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Free Text");
//
//	}
//
//	@Test(priority = 47, alwaysRun = true)
//	public void addPollWithSingleChoiceTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Add Poll to Session with Single Choice Question Test");
//
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Single");
//
//	}
//
//	@Test(priority = 48, alwaysRun = true)
//	public void addPollWithMultipleChoiceTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Add Poll to Session with Multiple Choice Question Test");
//
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Multiple");
//
//	}
//
//	@Test(priority = 49, alwaysRun = true)
//	public void addPollWithDropDownListTest()throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Add Poll to Session with Dropdown List Question Test");
//
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Dropdown");
//
//	}
//
//
//	 @Test(priority = 50,alwaysRun=true)
//	 public void uploadLinkTypeResourceTest() throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//	
//	 String EmailId = getCellData(1, 5);
//	
//	 String Password = getCellData(1, 6);
//	
//	 String EventFullName = getCellData(1, 7);
//	
//	 String SessionTitle = getCellData(1, 9);
//	
//	 System.out.println("Executing : Upload Link Type Resource to Session Test");
//	
//	 new AddSessions(driver).addResources(EmailId, Password, EventFullName, SessionTitle, "Link");
//	
//	 }
//
//	@Test(priority = 51, alwaysRun = true)
//	public void seatingArrangementTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Seating Arrangement Test");
//
//		new AddSessions(driver).seatingArrangement(EmailId, Password, EventFullName, SessionTitle, "Clerk Table", true);
//
//	}
//
//	@Test(priority = 52, alwaysRun = true)
//	public void addSessionCapacityTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Add Session Capacity Test");
//
//		new AddSessions(driver).addSessionCapacity(EmailId, Password, EventFullName, SessionTitle);
//
//	}
//
//	@Test(priority = 53, alwaysRun = true)
//	public void addSessionGroupTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Add Session Group Test");
//
//		new AddSessions(driver).addSessionGroup(EmailId, Password, EventFullName, SessionTitle, true);
//
//	}

//	@Test(priority = 54, alwaysRun = true)
//	public void addSessionUsersTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String SessionTitle = getCellData(1, 9);
//
//		System.out.println("Executing : Add Session Users Test");
//
//		new AddSessions(driver).addSessionGroup(EmailId, Password, EventFullName, SessionTitle, false);
//
//	}
//
//	@Test(priority = 55, alwaysRun = true)
//	public void mapSessionToPollTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Session to Poll Test");
//
//		new PollOrVote(driver).mapSessionToPoll(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 56, alwaysRun = true)
//	public void mapSessionToPollAnonymousEnabledTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Session to Poll with Anonymous Submission and Set Time Enabled Test");
//
//		new PollOrVote(driver).mapSessionToPollAnonymousSetTime(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 57, alwaysRun = true)
//	public void mapSessionToPollSetDateTimeEnabledTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Session to Poll with Anonymous Submission,Set Date/Time Enabled Test");
//
//		new PollOrVote(driver).pollMappingUpdation(EmailId, Password, EventFullName, "Session", true, true, false);
//	}
//
//	@Test(priority = 58, alwaysRun = true)
//	public void mapSessionToPollSelectTimeEnabledTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Session to Poll with Anonymous Submission,Select Time Enabled Test");
//
//		new PollOrVote(driver).pollMappingUpdation(EmailId, Password, EventFullName, "Session", true, false, true);
//	}
//
//	@Test(priority = 59, alwaysRun = true)
//	public void viewPollDetailsTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : View Poll Details Test");
//
//		new PollOrVote(driver).viewPoll(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 60, alwaysRun = true)
//	public void clonePollorVoteTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Clone Poll/Vote Test");
//
//		new PollOrVote(driver).clonePoll(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 61, alwaysRun = true)
//	public void downloadOnePollReportTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Download One Poll/Vote Report Test");
//
//		new PollOrVote(driver).downloadReport(EmailId, Password, EventFullName, "One");
//
//	}
//
//	@Test(priority = 62, alwaysRun = true)
//	public void downloadAllPollReportTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Download All Poll/Vote Report Test");
//
//		new PollOrVote(driver).downloadReport(EmailId, Password, EventFullName, "All");
//
//	}
//
//	@Test(priority = 63, alwaysRun = true)
//	public void addRatingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Question Rate Test");
//
//		new Rate(driver).addRate(EmailId, Password, EventFullName);
//
//	}

//	@Test(priority = 64, alwaysRun = true)
//	public void addSpeakersTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Speakers to Event Test");
//
//		new AddSpeakers(driver).addSpeakers(EmailId, Password, EventFullName, "Jam", "Jelly");
//
//	}
//
//	@Test(priority = 65, alwaysRun = true)
//	public void mapSessionWithRandomUserTest()	throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Session with Random User Test");
//
//		new AddSpeakers(driver).mapSessionWithRandomSpeaker(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 66, alwaysRun = true)
//	public void createSpeakerAndMapWithCreateSessionTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Create Speaker and Map with Create Session Test");
//
//		new AddSpeakers(driver).createSpeakerAndMapWithCreateSession(EmailId, Password, EventFullName, "Himmy", "Deo","Pre Match");
//
//	}

//	@Test(priority = 67, alwaysRun = true)
//	public void downloadQRCodeTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Download QR Code Test");
//
//		new AddAttendees(driver).downloadQRCode(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 68, alwaysRun = true)
//	public void mapUserRolesTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map User Roles Test");
//
//		new AddAttendees(driver).mapUserRoles(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 69, alwaysRun = true)
//	public void attendeeVisibilityTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Disable Attendee Visibility Test");
//
//		new AddAttendees(driver).attendeeVisibility(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 70, alwaysRun = true)
//	public void manageGroupTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Manage Group Test");
//
//		new AddAttendees(driver).manageGroup(EmailId, Password, EventFullName, "Team Ford");
//
//	}
//
//	@Test(priority = 71, alwaysRun = true)
//	public void matchMakingTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Match Making Test");
//
//		new AddAttendees(driver).matchMaking(EmailId, Password, EventFullName, "AutoGym");
//
//	}
//
//	@Test(priority = 72, alwaysRun = true)
//	public void importAttendeesTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String UploadAttendeePath = getCellData(1, 13);
//
//		System.out.println("Executing : Import Attendees Test");
//
//		new AddAttendees(driver).importAttendees(EmailId, Password, EventFullName, home+UploadAttendeePath);
//
//	}
//
//	@Test(priority = 73, alwaysRun = true)
//	public void addExhibitorTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String ExbtrPath = getCellData(1, 18);
//
//		System.out.println("Executing : Add Exhibitor Test");
//
//		new AddExhibitors(driver).addExhibitor(EmailId, Password, EventFullName, "Peter", "Gold",home+ExbtrPath);
//
//	}
//
//	@Test(priority = 74, alwaysRun = true)
//	public void addSecondExhibitorTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String ExbtrPath = getCellData(1, 18);
//
//		System.out.println("Executing : Add Second Exhibitor Test");
//
//		new AddExhibitors(driver).addExhibitor(EmailId, Password, EventFullName, "Parker", "Silver",home+ExbtrPath);
//
//	}
//
//	@Test(priority = 75, alwaysRun = true)
//	public void exhibitorListTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Exhibitor List Test");
//
//		new AddExhibitors(driver).exhibitorList(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 76, alwaysRun = true)
//	public void mapExhibitorWithUserTest()
//			throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Exhibitor with User Test");
//
//		new AddExhibitors(driver).mapExhibitorWithUser(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 77, alwaysRun = true)
//	public void mapExhibitorWithUserGroupTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map Exhibitor with User Group Test");
//
//		new AddExhibitors(driver).mapExhibitorWithUserGroup(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 78, alwaysRun = true)
//	public void addSponsorTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String SpnsrPath = getCellData(1, 19);
//
//		System.out.println("Executing : Add Sponsor Test");
//
//		new AddSponsors(driver).addSponsor(EmailId, Password, EventFullName, "3M",home+SpnsrPath);
//
//	}
//
//	@Test(priority = 79, alwaysRun = true)
//	public void sponsorListTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Sponsor List Test");
//
//		new AddSponsors(driver).sponsorList(EmailId, Password, EventFullName);
//
//	}

	@Test(priority = 80, alwaysRun = true)
	public void mapSponsorWithUserTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {

		String EmailId = getCellData(1, 5);

		String Password = getCellData(1, 6);

		String EventFullName = getCellData(1, 7);

		System.out.println("Executing : Map Sponsor with User Test");

		new AddSponsors(driver).mapSponsorWithUser(EmailId, Password, EventFullName);

	}

	@Test(priority = 81, alwaysRun = true)
	public void mapSponsorWithUserGroupTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {

		String EmailId = getCellData(1, 5);

		String Password = getCellData(1, 6);

		String EventFullName = getCellData(1, 7);

		System.out.println("Executing : Map Sponsor with User Group Test");

		new AddSponsors(driver).mapSponsorWithUserGroup(EmailId, Password, EventFullName);

	}

//	@Test(priority = 82, alwaysRun = true)
//	public void uploadE2MDataTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String E2MDataPath =  getCellData(1, 14);
//
//		System.out.println("Executing : Upload E2MData Test");
//
//		new UploadData(driver).e2mDataImport(EmailId, Password, EventFullName,home+E2MDataPath);
//
//	}
//
//	@Test(priority = 83, alwaysRun = true)
//	public void addFloorMapTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String EventShortName = getCellData(1, 8);
//
//		System.out.println("Executing : Add Floor Map Test");
//
//		new FloorMap(driver).addFloorMap(EmailId, Password, EventFullName, EventShortName + " Floor Map");
//
//	}
//
//	@Test(priority = 84, alwaysRun = true)
//	public void saveWayFinderTest() throws ParseException, InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Save Way Finder Test");
//
//		new FloorMap(driver).wayFinderCreation(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 85, alwaysRun = true)
//	public void geniusMeetingsConfigTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Genius Meeting Config Test");
//
//		new ConfigureMeetings(driver).configGeniusMetting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 86, alwaysRun = true)
//	public void oneToOneMeetingConfigTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : One to One Meeting Config Test");
//
//		new ConfigureMeetings(driver).configOneToOneMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 87, alwaysRun = true)
//	public void mappingExpertTopicWithUserGroupTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Mapping Expert Topic With User Group Test");
//
//		new ExpertTopicMapping(driver).addExpertTopicMapping(EmailId, Password, EventFullName, "Group");
//
//	}
//
//	@Test(priority = 88, alwaysRun = true)
//	public void mappingExpertTopicWithSelectedUserTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Mapping Expert Topic With Selected User Test");
//
//		new ExpertTopicMapping(driver).addExpertTopicMapping(EmailId, Password, EventFullName, "User");
//
//	}
//
//	@Test(priority = 89, alwaysRun = true)
//	public void mappingExpertTopicWithAllUserTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Mapping Expert Topic With All User Test");
//
//		new ExpertTopicMapping(driver).addExpertTopicMapping(EmailId, Password, EventFullName, "All");
//
//	}
//
//	@Test(priority = 90, alwaysRun = true)
//	public void uploadMeetingsTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//		
//		String MeetingUploadPath = getCellData(1, 17);
//
//		System.out.println("Executing : Upload Meetings Test");
//
//		new UploadMeetings(driver).meetingsUpload(EmailId, Password, EventFullName,home+MeetingUploadPath);
//
//	}
//
//	@Test(priority = 91, alwaysRun = true)
//	public void setUpGeneralMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Set Up General Meeting Test");
//
//		new SetUpMeetings(driver).setUpGeneralMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 92, alwaysRun = true)
//	public void setUpGeniusMeetingTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Set Up Genius Meeting Test");
//
//		new SetUpMeetings(driver).setUpGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	// Need to Check from Here
//
//	@Test(priority = 93, alwaysRun = true)
//	public void viewOneToOneMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : View One To One Meeting Test");
//
//		new ManageMeetings(driver).viewGenMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 94, alwaysRun = true)
//	public void acceptOneToOneMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Accept One To One Meeting Test");
//
//		new ManageMeetings(driver).acceptGenMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 95, alwaysRun = true)
//	public void rescheduleOneToOneMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Reschedule One To One Meeting Test");
//
//		new ManageMeetings(driver).rescheduleGenMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 96, alwaysRun = true)
//	public void cancelOneToOneMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Cancel One To One Meeting Test");
//
//		new ManageMeetings(driver).cancelGenMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 97, alwaysRun = true)
//	public void deleteOneToOneMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Delete One To One Meeting Test");
//
//		new ManageMeetings(driver).deleteGenMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 98, alwaysRun = true)
//	public void viewGeniusMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : View Genius Meeting Test");
//
//		new ManageMeetings(driver).viewGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 99, alwaysRun = true)
//	public void acceptGeniusMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Accept Genius Meeting Test");
//
//		new ManageMeetings(driver).acceptGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 100, alwaysRun = true)
//	public void rescheduleGeniusMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Reschedule Genius Meeting Test");
//
//		new ManageMeetings(driver).rescheduleGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 101, alwaysRun = true)
//	public void cancelGeniusMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Cancel Genius Meeting Test");
//
//		new ManageMeetings(driver).cancelGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 102, alwaysRun = true)
//	public void deleteGeniusMeetingTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Delete Genius Meeting Test");
//
//		new ManageMeetings(driver).deleteGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//
////	// Till Here
//
//	@Test(priority = 103, alwaysRun = true)
//	public void addQuizOrTriviaTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Quiz Or Trivia Test");
//
//		new QuizOrTrivia(driver).addQuizOrTrivia(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 104, alwaysRun = true)
//	public void addLocationQuestionsTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Location Questions Test");
//
//		new Locations(driver).addLocations(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 105, alwaysRun = true)
//	public void createQuizScoringRuleTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Create Quiz Scoring Rules Test");
//
//		new ScoringRules(driver).addScoringRules(EmailId, Password, EventFullName, "Quiz", "100", "75", "50");
//
//	}
//
//	@Test(priority = 106, alwaysRun = true)
//	public void createLocationScoringRulesTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Create Location Scoring Rules Test");
//
//		new ScoringRules(driver).addScoringRules(EmailId, Password, EventFullName, "Location", "100", "75", "50");
//
//	}
//
//	@Test(priority = 107, alwaysRun = true)
//	public void addUserConnectionTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add User Connection Test");
//
//		new MakeAFriend(driver).addConnectionRules(EmailId, Password, EventFullName);
//
//	}
//
//	@Test(priority = 108, alwaysRun = true)
//	public void addBadgeAndMapWithQuizTest()	throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Badge and Map with Quiz Test");
//
//		new Badges(driver).addBadges(EmailId, Password, EventFullName, "Quiz Map", "Quiz");
//
//	}
//
//	@Test(priority = 109, alwaysRun = true)
//	public void addBadgeAndMapWithLocationTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Badge and Map with LocationTest");
//
//		new Badges(driver).addBadges(EmailId, Password, EventFullName, "Location Map", "Location");
//
//	}
//
//	@Test(priority = 110, alwaysRun = true)
//	public void addBadgeAndMapWithUserTest()throws ParseException, InterruptedException, AWTException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Add Badge and Map with User Test");
//
//		new Badges(driver).addBadges(EmailId, Password, EventFullName, "Making Friend Map", "User");
//
//	}
//
//	@Test(priority = 111, alwaysRun = true)
//	public void cloneToNewEventTest() throws InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5); 
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		String EventShortName = getCellData(1, 8);
//
//		System.out.println("Executing : Clone To New Event Test");
//
//		new CloneEvent(driver).cloneToNewEvent(EmailId, Password, EventFullName, EventShortName);
//
//	}
//
//	@Test(priority = 112, alwaysRun = true)
//	public void mapUserToAnEventTest() throws InterruptedException, InvalidFormatException, IOException {
//
//		String EmailId = getCellData(1, 5);
//
//		String Password = getCellData(1, 6);
//
//		String EventFullName = getCellData(1, 7);
//
//		System.out.println("Executing : Map User To An Event Test");
//
//		new MapUserToEvent(driver).mapUserToEvent(EmailId, Password, EventFullName, "kevinms@yopmail.com");
//
//	}
	
	@Test (priority = 113, alwaysRun = true)
	public void appTutorialTest() throws InvalidFormatException, IOException, InterruptedException{
		
		String EmailId = getCellData(1, 5);

		String Password = getCellData(1, 6);

		String EventFullName = getCellData(1, 7);
		
		System.out.println("Executing : App Tutorial Test");
		
		new AboutEvent(driver).appTutorial(EmailId, Password, EventFullName);
		
		
		
	}

}
