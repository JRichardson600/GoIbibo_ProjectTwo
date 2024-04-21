//TC-8-Check for seat selection during the booking process

package Project2.GoIbibo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Data_Fetching_GoIbibo;
import Utility.Listeners_Class;

@Listeners(Listeners_Class.class)

public class Testcase_08 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_LogicGoIbibo1.class, groups = { "Regression", "System",
			"Smoke" })
	public void CheckSeatSelection_8() throws InterruptedException, EncryptedDocumentException, IOException {
		Data_Fetching_GoIbibo d1 = new Data_Fetching_GoIbibo();
		d1.fetch();

		GoIbibo_B2C_HomePage_1 a1 = new GoIbibo_B2C_HomePage_1(driver);
		Reporter.log("Routing to the Homepage is Done");

		a1.clickOnClosBtnPopUP();
		Reporter.log("Routing to the Registration Pop up is Done");

		GoIbibo_B2C_HomePage_After_Login_3 a3 = new GoIbibo_B2C_HomePage_After_Login_3(driver);

		a3.clickOnMultiCityTripCb();

		a3.clickOnfromTf();// Click On from Tf
		a3.passInFromTf();// Pass in the from Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in From text field is Done");

		a3.passInDestinationTf();// Pass in the destination Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in TO text field is Done");

		a3.clickOnflightOneDepartureDate1();
		a3.clickOnMoveToNextMonth();
		a3.clickOndatePicker1();
		Reporter.log("Selecting Dates is done");

		a3.clickOndestinationMultiCityTf();// Click On destinationMultiCityTf
		a3.passInMultiCityDestinationTf();// Pass in the multi citydestination Tf1
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in TO MultiCityTf is Done");

		a3.clickOndepartureDateTf2();// Click On DatePicker field 1
		a3.clickOnDepartureDatePicker_2();// Click On DatePicker and select one date
		Reporter.log("Selecting Dates is done");

		a3.clickOnTravellerAndClassArrow();
		a3.clickOnOptions();
		a3.clickChangeNoOfPassenger();
		a3.clickOndoneBtn();
		Reporter.log("Clicking On the Traveller & Class Arrow is Done");

		a3.clickOnSearchresults_btn();// Click On Search results
		Reporter.log("Click on search results button is Done");

		GoIbibo_B2C_SearchResults_5 a4 = new GoIbibo_B2C_SearchResults_5(driver);
		a4.clickOnbookBtnSearchResults();
		Reporter.log("Click on book button is Done");

		GoIbibo_B2C_ReviewBookingPage_6 a5 = new GoIbibo_B2C_ReviewBookingPage_6(driver);
		a5.clickOnCheckBoxIhaveReadTC();

		// pass Adult 1 deatils
		a5.slectGenderAdult1();
		a5.passAdultDeatils1();
		Reporter.log("Passing values in for Adult1 is Done");

		// pass Adult 2 deatils
		a5.clickOnadult2();
		a5.slectGenderAdult2();
		a5.passAdultDeatils2();
		Reporter.log("Passing values in for Adult2 is Done");

		// pass Child 1 deatils
		a5.clickOnChild1();
		a5.slectChild1();
		a5.passchildDeatils1();
		Reporter.log("Passing values in for Child1 is Done");

		// pass email id and Phone no deatils
		a5.passEmailId();
		a5.passPhoneNo();
		Reporter.log("Passing values in for EmailId and PhoneNo is Done");

		a5.clickOnConfirmDeatils();// Click On Confirm Deatils
		a5.clickOnReviewBookingPgProceedBtn();// Click On Review Booking Page Proceed Btn

		a5.clickOnThatsCorrectTextBtn();// Click On Thats Correct Text Btn
		Reporter.log("Routing to seat booking page done");

		GoIbibo_B2C_SeatBookingPage_7 a6 = new GoIbibo_B2C_SeatBookingPage_7(driver);
		a6.clickOnCustomSeats();// Click On Custom Seats
		// a6.clickOnSeatsAutoSug();// Click On Custom Seats Auto Sug
		Reporter.log("Custom Seats selection is Done");

		a6.CheckCustomSeatsEnabled();// assertion

	}
}