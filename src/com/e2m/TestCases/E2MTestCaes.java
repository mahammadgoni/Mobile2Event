package com.e2m.TestCases;

import java.awt.AWTException;
import java.text.ParseException;

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
import com.UserManagement.AddUser;
import com.UserManagement.DeleteUser;
import com.UserManagement.EditUserDetails;
import com.Utils.BrowserSetUp;
import com.Utils.GetScreenShot;

//@Listeners({ GetScreenShot.class })

public class E2MTestCaes extends BrowserSetUp {

//	 Please select the Browser before run all the Test Cases

//	String BrowserName = "Firefox";

	String BrowserName = "Chrome";

	String EmailId = "ethan.taylor@yopmail.com";

	String Password = "#e2m321";

	String BulkUserPath = "/Users/goni/Documents/E2MDatas/ImportUser_Template.xlsx";
	
	String UploadAttendeePath = "/Users/goni/Documents/E2MDatas/ImportMapuserdata_Template.xlsx";
	
//	Event Name Should be Unique in Every Run
	
//	String EventFullName = "Google IO";
	
	String EventFullName = "Nokia 2 Pre Launch Event";
	
	String EventShortName = "Nokia 2";
	
	String SessionTitle = "Networking";
	
	String TrackName = "Parking";
	
	String Location = "Ground Floor";

	@BeforeClass
	public void setUp() throws InterruptedException {

		openBrowser(BrowserName);

	}

	@AfterClass
	public void tearDown() {

		quitAllBrowser();

	}
	
	@AfterMethod
	public void afterMethod(){
		
		logOut();
		
		methodSeparation();
		
	}

//	@Test(priority = 1,alwaysRun=true)
//	public void loginToAccountTest() throws InterruptedException {
//
//		System.out.println("Executing : Login To Account Test");
//
//		new LoginToAccount(driver).loginToAccount(EmailId, Password);
//		
//
//	}
//	
//	@Test(priority = 2,alwaysRun=true)
//	public void forgotPasswordTest() throws InterruptedException, AWTException {
//
//		System.out.println("Executing : Forgot Password Test");
//
//		new ForgotPassword(driver).forgotPassword("jakesoly@mailinator.com", "#e2m321");
//		
//
//	}
//	
//	@Test(priority = 3,alwaysRun=true)
//	public void deleteSelectedUserTest() {
//
//		System.out.println("Executing : Delete Selected User Test");
//
//
//		new DeleteUser(driver).deleteSelectedUser(EmailId, Password);
//		
//
//	}
//	
//	@Test(priority = 4,alwaysRun=true)
//	public void deleteAllSelectedUserTest() {
//
//		System.out.println("Executing : Delete All Selected User Test");
//
//		new DeleteUser(driver).deleteAllUser(EmailId, Password);
//		
//		
//	}
//	
//	@Test(priority = 5,alwaysRun=true)
//	public void undoUserDeletionTest() {
//
//		System.out.println("Executing : Undo User Deletion Test");
//
//		new DeleteUser(driver).undoUserDeletion(EmailId, Password);
//
//
//	}
//	
//	@Test(priority = 6,alwaysRun=true)
//	public void purgeAllUserTest() {
//
//		System.out.println("Executing : Purge All User Test");
//
//		new DeleteUser(driver).purgeAllUser(EmailId, Password);
//
//		
//	}
//	
//	@Test(priority = 7,alwaysRun=true)
//	public void addVerifiedUserTest() throws InterruptedException {
//
//		System.out.println("Executing : Add Verified User Test");
//
//		new AddUser(driver).addVerifiedUser(EmailId, Password, "Kevin", "Ms", "kevinms@yopmail.com");
//		
//
//	}
//
//	@Test(priority = 8,alwaysRun=true)
//	public void addUnverifiedUserTest() throws InterruptedException {
//
//		System.out.println("Executing : Add Unverified User Test");
//
//		new AddUser(driver).addUnverifiedUser(EmailId, Password, "Liam", "Neson", "liamneson@yopmail.com");
//		
//
//	}
//
//	@Test(priority = 9,alwaysRun=true)
//	public void bulkUserUploadTest() throws InterruptedException {
//
//		System.out.println("Executing : Bulk User Upload Test");
//
//		new AddUser(driver).userBulkUpload(EmailId, Password, BulkUserPath);
//		
//
//	}
//	
//	@Test(priority = 10,alwaysRun=true)
//	public void newEventCreationTest() {
//
//		System.out.println("Executing : New Event Creation Test");
//
//		new NewEvent(driver).newEventCreation(EmailId, Password, EventFullName, EventShortName);
//
//
//	}
//	
//	@Test(priority = 11,alwaysRun=true)
//	public void addSessionToEventTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Session to Event Test");
//		
//		new AddSessions(driver).addSessions(EmailId, Password, EventFullName,SessionTitle,TrackName,Location);
//
//	}
//	
//	@Test(priority = 12,alwaysRun=true)
//	public void addSessionWithTrackAndLocationToEventTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Session with Track and Location to Event Test");
//		
//		new AddSessions(driver).addSessionsWithTrackAndLocation(EmailId, Password, EventFullName,SessionTitle,TrackName,Location);
//
//	}
//	
//	@Test(priority = 13,alwaysRun=true)
//	public void addSessionWithOutTrackAndLocationToEventTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Session without Track and Location to Event Test");
//		
//		new AddSessions(driver).addSessionsWithOutTrackAndLocation(EmailId, Password, EventFullName, SessionTitle, Location);
//
//	}
//	
//	@Test(priority = 14,alwaysRun=true)
//	public void addCheckInRegistrationWithTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Check In Registration With Track Session to Event Test");
//		
//		new AddSessions(driver).addCheckInRegistrationSession(EmailId, Password, EventFullName, TrackName, Location,true);
//
//	}
//	
//	@Test(priority = 15,alwaysRun=true)
//	public void addCheckInRegistrationWithOutTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Check In Registration without Track Location Session to Event Test");
//		
//		new AddSessions(driver).addCheckInRegistrationSession(EmailId, Password, EventFullName, TrackName, Location,false);
//
//	}
//	
//	@Test(priority = 16,alwaysRun=true)
//	public void addBreakfastTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Breakfast Type Session to Event Test");
//		
////		Please Add Meal Type as : Breakfast 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Breakfast");
//
//	}
//	
//	@Test(priority = 17,alwaysRun=true)
//	public void addLunchTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Lunch Type Session to Event Test");
//		
////		Please Add Meal Type as : Lunch 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Lunch");
//
//	}
//	
//	@Test(priority = 18,alwaysRun=true)
//	public void addTeaTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Tea Type Session to Event Test");
//		
////		Please Add Meal Type as : Tea 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Tea");
//
//	}
//	
//	@Test(priority = 19,alwaysRun=true)
//	public void addDinnerTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Dinner Type Session to Event Test");
//		
////		Please Add Meal Type as : Dinner 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Dinner");
//
//	}
//	
//	@Test(priority = 20,alwaysRun=true)
//	public void addNetworkingWithTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Networking With Track Session to Event Test");
//		
//		new AddSessions(driver).addNetworkingSession(EmailId, Password, EventFullName, TrackName, Location,true);
//
//	}
//	
//	@Test(priority = 21,alwaysRun=true)
//	public void addnetworkingWithOutTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Networking Without Track Location Session to Event Test");
//		
//		new AddSessions(driver).addNetworkingSession(EmailId, Password, EventFullName, TrackName, Location,false);
//
//	}
//	
//	@Test(priority = 22,alwaysRun=true)
//	public void addPollWithFreeTextTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Free Text Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Free Text");
//
//	}
//	
//	@Test(priority = 23,alwaysRun=true)
//	public void addPollWithSingleChoiceTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Single Choice Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Single");
//
//	}
//	
//	@Test(priority = 24,alwaysRun=true)
//	public void addPollWithMultipleChoiceTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Multiple Choice Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Multiple");
//
//	}
//	
//	@Test(priority = 25,alwaysRun=true)
//	public void addPollWithDropDownListTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Dropdown List Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Dropdown");
//
//	}
//	
//	@Test(priority = 26,alwaysRun=true)
//	public void uploadLinkTypeResourceTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Upload Link Type Resource Test");
//		
//		new AddSessions(driver).addResources(EmailId, Password, EventFullName, SessionTitle, "Link");
//
//	}
//	
//	@Test(priority = 27,alwaysRun=true)
//	public void uploadFileTypeResourceTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Upload File Type Resource Test");
//		
//		new AddSessions(driver).addResources(EmailId, Password, EventFullName, SessionTitle, "File");
//
//	}
//	
//	@Test(priority = 28,alwaysRun=true)
//	public void seatingArrangementTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Seating Arrangement Test");
//		
//		new AddSessions(driver).seatingArrangement(EmailId, Password, EventFullName, SessionTitle, "Clerk Table", true);
//
//	}
//	
//	@Test(priority = 29,alwaysRun=true)
//	public void addSessionCapacityTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Session Capacity Test");
//		
//		new AddSessions(driver).addSessionCapacity(EmailId, Password, EventFullName, SessionTitle);
//
//	}
//	
//	@Test(priority = 30,alwaysRun=true)
//	public void addSessionGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Session Group Test");
//		
//		new AddSessions(driver).addSessionGroup(EmailId, Password, EventFullName, SessionTitle, true);
//
//	}
//	
//	@Test(priority = 31,alwaysRun=true)
//	public void addSessionUsersTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Session Users Test");
//		
//		new AddSessions(driver).addSessionGroup(EmailId, Password, EventFullName, SessionTitle, false);
//
//	}
//	
//	@Test(priority = 32,alwaysRun=true)
//	public void mapSessionToPollTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Session to Poll Test");
//		
//		new PollOrVote(driver).mapSessionToPoll(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 33,alwaysRun=true)
//	public void mapSessionToPollAnonymousEnabledTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Session to Poll with Anonymous Submission and Set Time Enabled Test");
//		
//		new PollOrVote(driver).mapSessionToPollAnonymousSetTime(EmailId, Password, EventFullName);
//		
//	}
//	
//	@Test(priority = 34,alwaysRun=true)
//	public void mapSessionToPollSetDateTimeEnabledTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Session to Poll with Anonymous Submission,Set Date/Time Enabled Test");
//		
//		new PollOrVote(driver).pollMappingUpdation(EmailId, Password, EventFullName, "Session", true, true, false);
//	}
//	
//	@Test(priority = 35,alwaysRun=true)
//	public void mapSessionToPollSelectTimeEnabledTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Session to Poll with Anonymous Submission,Select Time Enabled Test");
//		
//		new PollOrVote(driver).pollMappingUpdation(EmailId, Password, EventFullName, "Session", true, false, true);
//	}
//	
//	@Test(priority = 35,alwaysRun=true)
//	public void viewPollDetailsTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : View Poll Details Test");
//		
//		new PollOrVote(driver).viewPoll(EmailId, Password, EventFullName);
//		
//	}
//	
//	@Test(priority = 36,alwaysRun=true)
//	public void clonePollorVoteTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Clone Poll/Vote Test");
//		
//		new PollOrVote(driver).clonePoll(EmailId, Password, EventFullName);
//		
//	}
//	
//	@Test(priority = 37,alwaysRun=true)
//	public void downloadOnePollReportTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Download One Poll/Vote Report Test");
//		
//		new PollOrVote(driver).downloadReport(EmailId, Password, EventFullName, "One");
//		
//	}
//	
//	@Test(priority = 38,alwaysRun=true)
//	public void downloadAllPollReportTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Download All Poll/Vote Report Test");
//		
//		new PollOrVote(driver).downloadReport(EmailId, Password, EventFullName, "All");
//		
//	}
//	
//	@Test(priority = 39,alwaysRun=true)
//	public void addRatingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Question Rate Test");
//		
//		new Rate(driver).addRate(EmailId, Password, EventFullName);
//		
//	}
//		
//	
//	@Test(priority = 40,alwaysRun=true)
//	public void addSpeakersTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Speakers to Event Test");
//		
//		new AddSpeakers(driver).addSpeakers(EmailId, Password, EventFullName, "Jam", "Jelly");
//
//	}
//	
//	@Test(priority = 41,alwaysRun=true)
//	public void mapSessionWithRandomUserTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Map Session with Random User Test");
//		
//		new AddSpeakers(driver).mapSessionWithRandomSpeaker(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 42,alwaysRun=true)
//	public void createSpeakerAndMapWithCreateSessionTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Create Speaker and Map with Create Session Test");
//		
//		new AddSpeakers(driver).createSpeakerAndMapWithCreateSession(EmailId, Password, EventFullName, "Himmy", "Deo", "Pre Match");
//
//	}
//	
//	@Test(priority = 43,alwaysRun=true)
//	public void downloadQRCodeTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Download QR Code Test");
//		
//        new AddAttendees(driver).downloadQRCode(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 44,alwaysRun=true)
//	public void mapUserRolesTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map User Roles Test");
//		
//        new AddAttendees(driver).mapUserRoles(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 45,alwaysRun=true)
//	public void attendeeVisibilityTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Disable Attendee Visibility Test");
//		
//        new AddAttendees(driver).attendeeVisibility(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 46,alwaysRun=true)
//	public void manageGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Manage Group Test");
//		
//        new AddAttendees(driver).manageGroup(EmailId, Password, EventFullName, "Team Ford");
//
//	}
//	
//	@Test(priority = 47,alwaysRun=true)
//	public void matchMakingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Match Making Test");
//		
//        new AddAttendees(driver).matchMaking(EmailId, Password, EventFullName, "AutoGym");
//
//	}
//	
//	@Test(priority = 48,alwaysRun=true)
//	public void importAttendeesTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Import Attendees Test");
//		
//        new AddAttendees(driver).importAttendees(EmailId, Password, EventFullName, UploadAttendeePath);
//
//	}
//	
//	@Test(priority = 49,alwaysRun=true)
//	public void addExhibitorTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Exhibitor Test");
//		
//        new AddExhibitors(driver).addExhibitor(EmailId, Password, EventFullName, "Peter");
//
//	}
//	
//	@Test(priority = 50,alwaysRun=true)
//	public void exhibitorListTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Exhibitor List Test");
//		
//        new AddExhibitors(driver).exhibitorList(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 51,alwaysRun=true)
//	public void mapExhibitorWithUserTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Exhibitor with User Test");
//		
//        new AddExhibitors(driver).mapExhibitorWithUser(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 52,alwaysRun=true)
//	public void mapExhibitorWithUserGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Exhibitor with User Group Test");
//		
//        new AddExhibitors(driver).mapExhibitorWithUserGroup(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 53,alwaysRun=true)
//	public void addSponsorTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Sponsor Test");
//		
//        new AddSponsors(driver).addSponsor(EmailId, Password, EventFullName, "3M");
//
//	}
//	
//	@Test(priority = 54,alwaysRun=true)
//	public void sponsorListTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Sponsor List Test");
//		
//        new AddSponsors(driver).sponsorList(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 55,alwaysRun=true)
//	public void mapSponsorWithUserTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Sponsor with User Test");
//		
//		new AddSponsors(driver).mapSponsorWithUser(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 56,alwaysRun=true)
//	public void mapSponsorWithUserGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Sponsor with User Group Test");
//		
//		new AddSponsors(driver).mapSponsorWithUserGroup(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 58,alwaysRun=true)
//	public void uploadE2MDataTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Upload E2MData Test");
//		
//		new UploadData(driver).e2mDataImport(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 59,alwaysRun=true)
//	public void geniusMeetingsConfigTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Genius Meeting Config Test");
//		
//		new ConfigureMeetings(driver).configGeniusMetting(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 60,alwaysRun=true)
//	public void oneToOneMeetingConfigTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : One to One Meeting Config Test");
//		
//		new ConfigureMeetings(driver).configOneToOneMeeting(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 61,alwaysRun=true)
//	public void mappingExpertTopicWithUserGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Mapping Expert Topic With User Group Test");
//		
//		new ExpertTopicMapping(driver).addExpertTopicMapping(EmailId, Password, EventFullName, "Group");
//
//	}
//	
//	@Test(priority = 62,alwaysRun=true)
//	public void mappingExpertTopicWithSelectedUserTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Mapping Expert Topic With Selected User Test");
//		
//		new ExpertTopicMapping(driver).addExpertTopicMapping(EmailId, Password, EventFullName, "User");
//
//	}
//	
//	@Test(priority = 63,alwaysRun=true)
//	public void mappingExpertTopicWithAllUserTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Mapping Expert Topic With All User Test");
//		
//		new ExpertTopicMapping(driver).addExpertTopicMapping(EmailId, Password, EventFullName, "All");
//
//	}
//	
//	@Test(priority = 64,alwaysRun=true)
//	public void uploadMeetingsTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Upload Meetings Test");
//		
//		new UploadMeetings(driver).meetingsUpload(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 65,alwaysRun=true)
//	public void setUpGeneralMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Set Up General Meeting Test");
//		
//		new SetUpMeetings(driver).setUpGeneralMeeting(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 66,alwaysRun=true)
//	public void setUpGeniusMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Set Up Genius Meeting Test");
//		
//		new SetUpMeetings(driver).setUpGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//	
////	Need to Check from Here
//	
//	@Test(priority = 67,alwaysRun=true)
//	public void viewOneToOneMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : View One To One Meeting Test");
//		
//		new ManageMeetings(driver).viewGenMeeting(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 68,alwaysRun=true)
//	public void acceptOneToOneMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Accept One To One Meeting Test");
//		
//		new ManageMeetings(driver).acceptGenMeeting(EmailId, Password, EventFullName);
//
//	}
	
	@Test(priority = 69,alwaysRun=true)
	public void rescheduleOneToOneMeetingTest() throws ParseException, InterruptedException, AWTException {

		System.out.println("Executing : Reschedule One To One Meeting Test");
		
		new ManageMeetings(driver).rescheduleGenMeeting(EmailId, Password, EventFullName);

	}
//	
//	@Test(priority = 70,alwaysRun=true)
//	public void cancelOneToOneMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Cancel One To One Meeting Test");
//		
//		new ManageMeetings(driver).cancelGenMeeting(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 71,alwaysRun=true)
//	public void deleteOneToOneMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Delete One To One Meeting Test");
//		
//		new ManageMeetings(driver).deleteGenMeeting(EmailId, Password, EventFullName);
//
//	}
//	
	@Test(priority = 72,alwaysRun=true)
	public void viewGeniusMeetingTest() throws ParseException, InterruptedException, AWTException {

		System.out.println("Executing : View Genius Meeting Test");
		
		new ManageMeetings(driver).viewGeniusMeeting(EmailId, Password, EventFullName);

	}
	
	@Test(priority = 73,alwaysRun=true)
	public void acceptGeniusMeetingTest() throws ParseException, InterruptedException, AWTException {

		System.out.println("Executing : Accept Genius Meeting Test");
		
		new ManageMeetings(driver).acceptGeniusMeeting(EmailId, Password, EventFullName);

	}
	
	@Test(priority = 74,alwaysRun=true)
	public void rescheduleGeniusMeetingTest() throws ParseException, InterruptedException, AWTException {

		System.out.println("Executing : Reschedule Genius Meeting Test");
		
		new ManageMeetings(driver).rescheduleGeniusMeeting(EmailId, Password, EventFullName);

	}
//	
//	@Test(priority = 75,alwaysRun=true)
//	public void cancelGeniusMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Cancel Genius Meeting Test");
//		
//		new ManageMeetings(driver).cancelGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 76,alwaysRun=true)
//	public void deleteGeniusMeetingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Delete Genius Meeting Test");
//		
//		new ManageMeetings(driver).deleteGeniusMeeting(EmailId, Password, EventFullName);
//
//	}
//	
//	Till Here
	
	
//	@Test(priority = 77,alwaysRun=true)
//	public void resetPasswordTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Reset User Password Test");
//		
//		new EditUserDetails(driver).resetUserPassword(EmailId, Password);
//
//	}
	
	
//	@Test(priority = 78,alwaysRun=true)
//	public void changeUserDetailsTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Change User Details Test");
//		
//		new EditUserDetails(driver).editAndChangeUserDetails(EmailId, Password);
//
//	}
	
		
//	@Test(priority = 7,alwaysRun=true)
//	public void cloneToNewEventTest() {
//
//		System.out.println("Executing : Clone To New Event Test");
//
//		new CloneEvent(driver).cloneToNewEvent(EmailId, Password, EventFullName, EventShortName);
//
//	}
//	
//	
//	@Test(priority = 11,alwaysRun=true)
//	public void mapUserToAnEventTest() throws InterruptedException {
//
//		System.out.println("Executing : Map User To An Event Test");
//		
//		new MapUserToEvent(driver).mapUserToEvent(EmailId, Password, "CTech Symposium", "kevinms@yopmail.com");
//
//	}
//	
//	



}
