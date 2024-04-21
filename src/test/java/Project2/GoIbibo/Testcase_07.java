//TC-7-test for multi-city Flight search

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

public class Testcase_07 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_LogicGoIbibo1.class, groups = { "System", "Smoke" })
	public void CheckMultiCityFlightSearch_7() throws InterruptedException, EncryptedDocumentException, IOException {
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

		a3.clickOnAddAnotherFlight_1();// Click On AddAnotherFlight button
		Reporter.log("Add one more Flight is done");

		a3.clickOndestinationMultiCityTf2();// Click On destinationMultiCityTf2
		a3.passInMultiCityDestinationTf2();// Pass in the multi citydestination Tf2
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in TO MultiCityTf2 is Done");

		a3.clickOnAddDepartureDate_2();// Click On DatePicker field 2
		a3.clickOnDepartureDatePicker_3();// Click On DatePicker and select one date
		Reporter.log("Selecting Dates is done");

		a3.clickOnStudentsCb();// Click On Students Cb
		a3.clickOnSearchresults_btn();// Click On Search results
		Reporter.log("Click on search results button Done");

		a3.checkmultiCityValidate();// assertion

	}
}