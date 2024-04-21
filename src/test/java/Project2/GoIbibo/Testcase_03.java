//TC-3-Test login with invalid credentials and ensure proper error messages are displayed

package Project2.GoIbibo;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon.ProjectOne.Amz_B2C_HomePage_1;
import Amazon.ProjectOne.Amz_B2C_Registration_Page_2;
import Utility.Data_Fetching_GoIbibo;
import Utility.Listeners_Class;

@Listeners(Listeners_Class.class)

public class Testcase_03 extends Launch_Quit {

	@Test(retryAnalyzer = Utility.Retry_Logic.class , groups= {"Smoke","System"})
	public void InvalidCredCheck_Testcase_3() throws InterruptedException, EncryptedDocumentException, IOException {
		Data_Fetching_GoIbibo d1 = new Data_Fetching_GoIbibo();
		d1.fetch();

		GoIbibo_B2C_HomePage_1 a1 = new GoIbibo_B2C_HomePage_1(driver);
		Reporter.log("Routing to the Homepage is Done");
		a1.passMobNumTf();
		a1.passIncorrectOtpFieldTf();// pass incorrect OTP
		Reporter.log("Routing to the Registration Pop up is Done");

		GoIbibo_B2C_RegistrationPage_Pop_up_2 a2 = new GoIbibo_B2C_RegistrationPage_Pop_up_2(driver);
		a2.checkErrorMsg();// Check the error msg
		Reporter.log("Routing to the Complete Registration is Done");

	}

}