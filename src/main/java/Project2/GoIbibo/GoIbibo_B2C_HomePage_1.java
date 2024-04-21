package Project2.GoIbibo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Data_Fetching_GoIbibo;

public class GoIbibo_B2C_HomePage_1 extends Data_Fetching_GoIbibo {
	// Step-1-locationg the elements

	@FindBy(xpath = "//input[@class='loginCont__input']")
	WebElement mobNumTf;

	@FindBy(xpath = "//span[@class='logSprite icClose']")
	WebElement closBtnPopUP;

	@FindBy(xpath = "//input[@class='verifyOtpCont__otpFiled ']")
	WebElement otpFieldTf;

	@FindBy(xpath = "//p[@class='sc-jlwm9r-1 ewETUe']")
	WebElement sideBanner;

	// Step-2-writing the methods

	public void passMobNumTf() throws InterruptedException {
		// mobNumTf.sendKeys("7892472840");
		 //mobNumTf.sendKeys("8971449614");
		//mobNumTf.sendKeys("9916455168");
		mobNumTf.sendKeys(mob_1);
	}

	public void clickOnClosBtnPopUP() throws InterruptedException {
		Thread.sleep(250);
		closBtnPopUP.click();

		Thread.sleep(500);
		sideBanner.click();

		// mobNumTf.sendKeys("8971449614");
	}

	public void clickOnsideBanner() throws InterruptedException {

		Thread.sleep(500);
		sideBanner.click();

		// mobNumTf.sendKeys("8971449614");
	}

	public void passIncorrectOtpFieldTf() throws InterruptedException {
		Thread.sleep(1500);
		otpFieldTf.sendKeys("9864");
	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_HomePage_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
