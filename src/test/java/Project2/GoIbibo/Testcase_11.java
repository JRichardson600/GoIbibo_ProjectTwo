//TC-11-Validate if after clicking on book button in the search page user is able to enter text filed like pincode, state, radio button,Firstname, lastname,email id , modile no , promo code etc

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

public class Testcase_11 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_LogicGoIbibo1.class, groups = "Smoke")
	public void ValidateFieldsOnPage_11() throws InterruptedException, EncryptedDocumentException, IOException {
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

		// asssetions
		a5.CheckOnpromoCodeTf();// promoCode
		a5.CheckExistingFields();// ExistingFields
		a5.CheckOnbillingAddTf();// billing Add
		a5.CheckOnpincodeTF();// pincode
		a5.CheckOnstateDD();// state DD
	}
}