package Project2.GoIbibo;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoIbibo_B2C_RegistrationPage_Pop_up_2 {
	// Step-1-locationg the elements

	@FindBy(xpath = "(//input[@class='loginCont__input'])[1]")
	WebElement fullNameTf;

	@FindBy(xpath = "(//input[@class='loginCont__input'])[2]")
	WebElement emailIdTf;

	@FindBy(xpath = "(//button[@class='sc-feUZmu bHpjfF'])")
	WebElement letsGoBtn;

	@FindBy(xpath = "//div[@class='sc-fUnMCh fqemLL']//button[@type='button']")
	WebElement illDoitLaterBtn;

	@FindBy(xpath = "//p[@class='errorMessage']")
	WebElement errorMsgTf;

	public String str;

	// Step-2-writing the methods

	public void passFullNameTf() throws InterruptedException {
		Thread.sleep(500);
		fullNameTf.sendKeys("Richardson J");
	}

	public void passemailIdTf() throws InterruptedException {
		Thread.sleep(500);
		Random random = new Random();

		// Generate a random 5-digit number
		int randomNumber = random.nextInt(90000) + 10000;

		// Print the random number
		//System.out.println("Random 5-digit number: " + randomNumber);
		emailIdTf.sendKeys("jrichardson" + randomNumber + "@gmail.com");
	}

	public void clickOnletsGoBtn() throws InterruptedException {
		Thread.sleep(500);
		letsGoBtn.click();
	}

	public void clickOnIllDoitLaterBtn() throws InterruptedException {
		Thread.sleep(500);
		illDoitLaterBtn.click();
	}

	public void checkErrorMsg() throws InterruptedException {
		Thread.sleep(2500);
		str = errorMsgTf.getText();
		System.out.println(str);
		Assert.assertEquals(str, "Please enter a valid OTP");

	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_RegistrationPage_Pop_up_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
