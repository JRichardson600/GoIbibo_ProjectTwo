//TC-14-Check user is able to search the domestic round trip flight

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

public class Testcase_14 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_LogicGoIbibo1.class , groups="Smoke")
	public void ValidateDomesticRoundTrip_14() throws InterruptedException, EncryptedDocumentException, IOException {
		Data_Fetching_GoIbibo d1 = new Data_Fetching_GoIbibo();
		d1.fetch();
		
		GoIbibo_B2C_HomePage_1 a1 = new GoIbibo_B2C_HomePage_1(driver);
		Reporter.log("Routing to the Homepage is Done");
		a1.clickOnClosBtnPopUP();
		Reporter.log("Routing to the Registration Pop up is Done");

		GoIbibo_B2C_HomePage_After_Login_3 a3 = new GoIbibo_B2C_HomePage_After_Login_3(driver);

		a3.clickOnRoundTripCb();
		Reporter.log("Clicking On Round Trip Cb is Done");

		a3.clickOnfromTf();// Click On from Tf
		a3.passInFromTf();// Pass in the from Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in From text field is Done");

		a3.passInDestinationTf();// Pass in the destination Tf
		a3.clickOnAutoSug();// Click On Auto suggestion
		Reporter.log("Passing values in TO text field is Done");
		
		a3.clickOnSearchresults_btn();// Click On Searchresults
		Reporter.log("Click on search results button is Done");

		GoIbibo_B2C_HomePage_Trip_Page_4 a4 = new GoIbibo_B2C_HomePage_Trip_Page_4(driver);
		a4.CheckTwoWayCb();// assertion

	}
}