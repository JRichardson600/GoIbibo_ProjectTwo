package Project2.GoIbibo;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utility.Data_Fetching_GoIbibo;
import Utility.Listeners_Class;

public class GoIbibo_B2C_ReviewBookingPage_6 extends Listeners_Class {
	// Step-1-locationg the elements

	@FindBy(xpath = "(//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 iCEsUc'])[1]")
	WebElement checkBoxIhaveReadTC;

	@FindBy(xpath = "(//div//div//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee'])")
	WebElement genderAdult1;

	@FindBy(xpath = "(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[1]")
	WebElement adultFirstName1;

	@FindBy(xpath = "(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[2]")
	WebElement adultLastName1;

	@FindBy(xpath = "(//span[@class='padL20 padR20 font14'])[2]")
	WebElement adult2;

//	@FindBy(xpath = "(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[1]")
//	WebElement adultFirstName2;

	@FindBy(xpath = "(//span[@class='padL20 padR20 font14'])[3]")
	WebElement child1;

	@FindBy(xpath = "(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 dEvRMR width100'])")
	WebElement emailId;

	@FindBy(xpath = "(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[3]")
	WebElement phoneNo;

	@FindBy(xpath = "//div//label[@for='confirm_check']")
	WebElement confirmDeatils;

	@FindBy(xpath = "//div//div//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav f500 wid25 font16']")
	WebElement reviewBookingPgProceedBtn;

	@FindBy(xpath = "//div//div//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 reviewTravellerOverlaystyles__RtdCorrBtn-sc-w2a3p-7 eTrRGk iYGKjl']")
	WebElement ThatsCorrectTextBtn;

	@FindBy(xpath = "//input[@class='offersstyle__PromoInput-sc-4s1lmm-3 MxPRW']")
	WebElement promoCodeTf;

	@FindBy(xpath = "//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 cptpSl']")
	WebElement cabCb;

	@FindBy(xpath = "(//input[@class='sc-eBHhsj fYsyIB'])[1]")
	WebElement billingAddTf;

	@FindBy(xpath = "(//input[@class='sc-eBHhsj fYsyIB'])")
	WebElement pincodeTF;

	@FindBy(xpath = "//p[@class='sc-dExYaf fFgTQr']")
	WebElement stateDD;

	@FindBy(xpath = "(//div//ul//li[@class='sc-kqGoIF fhNnA'])[17]")
	WebElement KarnatakaStateDD;

	@FindBy(xpath = "//button[@class='offersstyle__ApplyButton-sc-4s1lmm-4 bZxjHc']")
	WebElement PromoCodeApply_Btn;

	@FindBy(xpath = "//div[@class='dF font18 padR10 alignItemsCenter']")
	WebElement InvlidPromoCodeTextCheck;

	// button[@class='multicitystyles__BookButton-sc-taovnj-27 gAZjKT txtUpper']
	// font14 flex1 white']

	// Step-2-writing the methods

	public void clickOnCheckBoxIhaveReadTC() throws InterruptedException {
		Thread.sleep(2500);
		checkBoxIhaveReadTC.click();
//		Thread.sleep(500);
//		checkBoxIhaveReadTC.click();
	}

	public void slectGenderAdult1() throws InterruptedException {
		Thread.sleep(500);
		Select s1 = new Select(genderAdult1);
		s1.selectByIndex(1);
	}

	public void passAdultDeatils1() throws InterruptedException {

		Thread.sleep(500);
		adultFirstName1.sendKeys("Ramachandra");
		Thread.sleep(250);
		adultLastName1.sendKeys("Singh");
	}

	public void clickOnadult2() throws InterruptedException {
		Thread.sleep(500);
		adult2.click();
	}

	public void slectGenderAdult2() throws InterruptedException {
		Thread.sleep(500);
		Select s1 = new Select(genderAdult1);
		s1.selectByIndex(2);
	}

	public void passAdultDeatils2() throws InterruptedException {
		Thread.sleep(500);
		adultFirstName1.sendKeys("Katrina");
		Thread.sleep(250);
		adultLastName1.sendKeys("Kaif");
	}

	public void clickOnChild1() throws InterruptedException {
		Thread.sleep(500);
		child1.click();
	}

	public void slectChild1() throws InterruptedException {
		Thread.sleep(500);
		Select s1 = new Select(genderAdult1);
		s1.selectByIndex(2);
	}

	public void passchildDeatils1() throws InterruptedException {
		Thread.sleep(500);
		adultFirstName1.sendKeys("Jhansi");
		Thread.sleep(250);
		adultLastName1.sendKeys("Rani");
	}

	public void passEmailId() throws InterruptedException {
		Thread.sleep(250);
		emailId.sendKeys("test987654@gmail.com");

	}

	public void passPhoneNo() throws InterruptedException {
		Thread.sleep(250);
		phoneNo.sendKeys("9876543210");

	}

	public void clickOnConfirmDeatils() throws InterruptedException {
		Thread.sleep(250);
		confirmDeatils.click();

	}

	public void clickOnReviewBookingPgProceedBtn() throws InterruptedException {
		Thread.sleep(250);
		reviewBookingPgProceedBtn.click();

	}

	public void CheckOnThatsCorrectTextBtn() throws InterruptedException {
		Thread.sleep(250);
		System.out.println(ThatsCorrectTextBtn.getText());
		Assert.assertEquals(ThatsCorrectTextBtn.getText(), "That’s Correct");

	}

	public void clickOnThatsCorrectTextBtn() throws InterruptedException {
		Thread.sleep(250);
		ThatsCorrectTextBtn.click();

	}

	public void CheckOnpromoCodeTf() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("promoCodeTfenabled?? : " + promoCodeTf.isDisplayed());
		Assert.assertTrue(promoCodeTf.isDisplayed());
	}

	public void clickOncabCb() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("cabCb?? : " + cabCb.isDisplayed());
		Assert.assertTrue(cabCb.isDisplayed());
		if (cabCb.isDisplayed() == true) {
			cabCb.click();
		}
	}

	public void CheckOnbillingAddTf() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("billingAddTf?? : " + billingAddTf.isDisplayed());
		Assert.assertTrue(billingAddTf.isDisplayed());
		if (billingAddTf.isDisplayed() == true) {
			billingAddTf.sendKeys("134 - 4th floor Cauvery Enclave ChikkaBanavara-560094");
		}
	}

	public void passValuesTobillingAddTf() throws InterruptedException {
		Thread.sleep(250);
		billingAddTf.sendKeys("134 - 4th floor Cauvery Enclave ChikkaBanavara-560094");

	}

	public void CheckOnpincodeTF() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("pincodeTF?? : " + pincodeTF.isDisplayed());
		Assert.assertTrue(pincodeTF.isDisplayed());
		if (pincodeTF.isDisplayed() == true) {
			pincodeTF.sendKeys("560094");
		}
	}

	public void passValuesTopincodeTF() throws InterruptedException {
		Thread.sleep(250);
		pincodeTF.sendKeys("560094");

	}

	public void CheckOnstateDD() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("stateDD?? : " + stateDD.isDisplayed());
		Assert.assertTrue(stateDD.isDisplayed());
//		Select s1 = new Select(stateDD);
//		s1.selectByVisibleText("Karnataka");
	}

	public void passValueForstateDD() throws InterruptedException {
		Thread.sleep(250);
		stateDD.click();
		Thread.sleep(250);
		KarnatakaStateDD.click();
	}

	public void CheckExistingFields() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("adultFirstName1?? : " + adultFirstName1.isDisplayed());
		Assert.assertTrue(adultFirstName1.isDisplayed());

		System.out.println("adultLastName1?? : " + adultLastName1.isDisplayed());
		Assert.assertTrue(adultLastName1.isDisplayed());

		System.out.println("emailId?? : " + emailId.isDisplayed());
		Assert.assertTrue(emailId.isDisplayed());

		System.out.println("phoneNo?? : " + phoneNo.isDisplayed());
		Assert.assertTrue(phoneNo.isDisplayed());

	}

	public void PassValues_promoCodeTf() throws InterruptedException {
		Thread.sleep(250);
		promoCodeTf.sendKeys("9876543210");
		PromoCodeApply_Btn.click();
	}

	public void checkInvlidPromoCodeTextCheck() throws InterruptedException {
		Thread.sleep(250);
		System.out.println(InvlidPromoCodeTextCheck.getText());
		Assert.assertEquals(InvlidPromoCodeTextCheck.getText(), "Promo code is not valid");

	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_ReviewBookingPage_6(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
