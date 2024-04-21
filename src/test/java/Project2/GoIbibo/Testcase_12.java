//TC-12-login to page, search the floght and logout

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

public class Testcase_12 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_LogicGoIbibo1.class )
	public void ValidateLogin_Logout_12() throws InterruptedException, EncryptedDocumentException, IOException {
		Data_Fetching_GoIbibo d1 = new Data_Fetching_GoIbibo();
		d1.fetch();
		
		GoIbibo_B2C_HomePage_1 a1 = new GoIbibo_B2C_HomePage_1(driver);
		Reporter.log("Routing to the Homepage is Done");
		a1.passMobNumTf();
		Reporter.log("Routing to the Registration Pop up is Done");

		GoIbibo_B2C_RegistrationPage_Pop_up_2 a2 = new GoIbibo_B2C_RegistrationPage_Pop_up_2(driver);
		a2.clickOnIllDoitLaterBtn();
		Reporter.log("Routing to the Complete Registration is Done");

		GoIbibo_B2C_HomePage_After_Login_3 a3 = new GoIbibo_B2C_HomePage_After_Login_3(driver);

		a3.clickOnCloseBtn();

		a3.clickOnRoundTripCb();// Click On Round Trip
		Reporter.log("Clicking On the Round Trip is Done");

		a3.clickOnfromTf();// Click On from Tf
		a3.passInFromTf();// Pass in the from Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in From text field is Done");

		a3.passInDestinationTf();// Pass in the destination Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in TO text field is Done");

		a3.clickOnTravellerAndClassArrow();
		a3.clickOnOptions();
		Reporter.log("Clicking On the Traveller & Class Arrow is Done");

		// a3.checkFirstClassEnabled();// assertion

		a3.clickOndoneBtn();

		a3.clickOnflightOneDepartureDate1();
		a3.clickOnMoveToNextMonth();
		a3.clickOndatePicker1();
		Reporter.log("Selecting Dates is done");
		
		a3.clickOnMoveToNextMonth();
		a3.clickOndatePicker1();
		Reporter.log("Selecting Dates is done");

		a3.clickOnSearchresults_btn();
		Reporter.log("Click on search results button is Done");

		GoIbibo_B2C_HomePage_Trip_Page_4 a4 = new GoIbibo_B2C_HomePage_Trip_Page_4(driver);
		a4.ClickOnHeyTraveller_btn();
		Reporter.log("Routing to the profile settings details page is done");

		GoIbibo_B2C_Profile_page_8 a5 = new GoIbibo_B2C_Profile_page_8(driver);
		a5.ClickOnlogOut_btn();
		a5.ClickOnYeslogOut_btn();
		Reporter.log("Click on logout is Done");

		GoIbibo_B2C_Post_Logout_page_9 a6 = new GoIbibo_B2C_Post_Logout_page_9(driver);
		a6.Check_Login_btn();

	}
}