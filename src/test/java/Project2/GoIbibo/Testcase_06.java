//TC-6-Validate search results for different classes(ecocnomy, business, firt class)

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

public class Testcase_06 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_LogicGoIbibo1.class, groups = "Smoke")
	public void CheckDiffClassesForFlight_6() throws InterruptedException, EncryptedDocumentException, IOException {
		Data_Fetching_GoIbibo d1 = new Data_Fetching_GoIbibo();
		d1.fetch();

		GoIbibo_B2C_HomePage_1 a1 = new GoIbibo_B2C_HomePage_1(driver);
		Reporter.log("Routing to the Homepage is Done");
		a1.clickOnClosBtnPopUP();
		Reporter.log("Routing to the Registration Pop up is Done");

		GoIbibo_B2C_HomePage_After_Login_3 a3 = new GoIbibo_B2C_HomePage_After_Login_3(driver);
		a3.clickOnRoundTripCb();// Click On Round Trip
		Reporter.log("Clicking On the Round Trip is Done");

		a3.clickOnfromTf();// Click On from Tf
		a3.passInFromTf();// Pass in the from Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in From text field is Done");

		a3.passInDestinationTf();// Pass in the destination Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in TO text field is Done");

		a3.clickOnTravellerAndClassArrow();// Click On Traveller & Class Arrow
		a3.clickOnOptions();// Click On Options
		Reporter.log("Clicking On the Traveller & Class Arrow is Done");

		a3.checkFirstClassEnabled();// assertion

		a3.clickOndoneBtn();// Click On Done button

	}
}