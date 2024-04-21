package Project2.GoIbibo;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utility.Data_Fetching_GoIbibo;
import Utility.Listeners_Class;
import dev.failsafe.Timeout;

public class GoIbibo_B2C_HomePage_After_Login_3 extends Listeners_Class {
	// Step-1-locationg the elements
	
	//public WebDriver driver;

	@FindBy(xpath = "//p[@class='sc-jlwm9r-1 ewETUe']")
	WebElement popUpCloseBtn;

	@FindBy(xpath = "(//p[@class='sc-gEvEer gpfTmR'])[1]")
	WebElement onWayCb;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	WebElement fromTf;

	@FindBy(xpath = "//input[@type='text']")
	WebElement fromTf1;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]")
	WebElement destinationTf;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]//p")
	WebElement destinationTf2;

	@FindBy(xpath = "//span[@class='autoCompleteTitle ']")
	List<WebElement> listOfSuggestion;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]")
	WebElement destinationTf1;

	@FindBy(xpath = "//span[@class='sc-12foipm-86 cRVyVW']")
	WebElement searchresults_btn;

	@FindBy(xpath = "(//p[@class='sc-gEvEer gpfTmR'])[2]")
	WebElement roundTripCb;

	@FindBy(xpath = "//span[@class='sc-12foipm-22 cUvQPq fswDownArrow fswDownArrowTraveller']")
	WebElement TravellerAndClassArrow;

	@FindBy(xpath = "//li[@class='sc-12foipm-60 fdVINr']")
	WebElement economy_Btn;

	@FindBy(xpath = "(//li[@class='sc-12foipm-60 bZpfUw'])[1]")
	WebElement premium_economy_Btn;

	@FindBy(xpath = "(//li[@class='sc-12foipm-60 bZpfUw'])[2]")
	WebElement business_Btn;

	@FindBy(xpath = "(//li[@class='sc-12foipm-60 bZpfUw'])[3]")
	WebElement first_class_Btn;

	@FindBy(linkText = "Done")
	WebElement done_Btn;

	@FindBy(xpath = "(//p[@class='sc-gEvEer gpfTmR'])[3]")
	WebElement multiCityTripCb;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld  '])")
	WebElement multiCitydestinationTf2;

	@FindBy(xpath = "(//span[@class='sc-12foipm-22 cUvQPq fswDownArrow'])[1]")
	WebElement departureArrow1;

	@FindBy(xpath = "(//span[@class='sc-12foipm-22 cUvQPq fswDownArrow'])[2]")
	WebElement departureArrow_2;

	@FindBy(xpath = "(//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected'])")
	WebElement departureDatePicker_1;

	@FindBy(xpath = "(//div[@class='DayPicker-Day'])[25]")
	WebElement departureDatePicker_2;

	@FindBy(linkText = "Add Another Flight")
	WebElement addAnotherFlight_1;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld '])[10]")
	WebElement addDepartureDate_2;

	@FindBy(xpath = "(//div[@class='DayPicker-Day'])[32]")
	WebElement departureDatePicker_3;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld '])[6]")
	WebElement destinationMultiCityTf;

	@FindBy(xpath = "(//div[@class='sc-12foipm-16 wRKJm fswFld '])[9]")
	WebElement destinationMultiCityTf2;

	@FindBy(xpath = "//p[@class='sc-12foipm-20 bhnHeQ']")
	WebElement departureDateTf2;

	@FindBy(xpath = "//div[text()='Multicity Flights']")
	WebElement multiCityValidate;

	@FindBy(xpath = "// span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")
	WebElement departurePicker1;

	@FindBy(xpath = "(//p[@class='fsw__price green'])[30]")
	WebElement datePicker3;

	@FindBy(xpath = "(//div[@class='sc-12foipm-103 czeAkn'])[3]")
	WebElement defencePersonnaleCb;

	@FindBy(xpath = "(//span[@class='sc-12foipm-65 ljgJsP'])[2]")
	WebElement NoOfAdultPassenger;

	@FindBy(xpath = "(//span[@class='sc-12foipm-65 ljgJsP'])[4]")
	WebElement NoOfChildrenPassenger;

	@FindBy(xpath = "(//span[@class='sc-12foipm-22 cUvQPq fswDownArrow'])")
	WebElement flightOneDepartureDate1;

	@FindBy(xpath = "(//span[@class='DayPicker-NavButton DayPicker-NavButton--next'])")
	WebElement MoveToNextMonth;

	@FindBy(xpath = "(//p[@class='fsw__price green'])[1]")
	WebElement datePicker1;

	@FindBy(xpath = "//span[@class='sc-12foipm-84 ddHDin']")
	WebElement oneWayCb;
	
	@FindBy(xpath = "(//div[@class='sc-12foipm-103 czeAkn'])[1]")
	WebElement StudentsCb;

	// p[@class='sc-12foipm-20 bhnHeQ']

	// Step-2-writing the methods
	
	
	
	//WebDriverWait wait=new WebDriverWait(driver,null);
	
	

	public void clickOnCloseBtn() throws InterruptedException {
		Thread.sleep(2500);
		popUpCloseBtn.click();
	}

	public void clickOnOneWayCb() {
		onWayCb.click();
	}

	public void clickOnfromTf() {
		fromTf.click();
	}

	public void passInFromTf() throws InterruptedException {
		Thread.sleep(1000);
		fromTf1.sendKeys("Bengaluru");
	}

	public void clickOnAutoSug() throws InterruptedException {
		Thread.sleep(1000);
		int count_sug = listOfSuggestion.size(); // get size or length of the auto-suggestion
		listOfSuggestion.get(count_sug - 10).click();
	}

	public void clickDestinationTf() throws InterruptedException {
		destinationTf.click();
		Thread.sleep(1000);
		// destinationTf.sendKeys("Chennai");
	}

	public void passInDestinationTf() throws InterruptedException {
		fromTf1.sendKeys("Chennai");
	}

	public void clickOnSearchresults_btn() throws InterruptedException {
		Thread.sleep(500);
		searchresults_btn.click();
	}

	public void clickOnMultiCityTripCb() {
		multiCityTripCb.click();
	}

	public void clickOnTravellerAndClassArrow() {
		TravellerAndClassArrow.click();
	}

	public void clickOnOptions() throws InterruptedException {
		Thread.sleep(250);
		economy_Btn.click();

		Thread.sleep(250);
		premium_economy_Btn.click();

		Thread.sleep(250);
		business_Btn.click();

		Thread.sleep(250);
		first_class_Btn.click();

		Thread.sleep(250);
		premium_economy_Btn.click();

	}

	public void clickOndoneBtn() {
		done_Btn.click();
	}

	public void checkFirstClassEnabled() {
		System.out.println(economy_Btn.isEnabled());
		// Assert.assertTrue(economy_Btn.isSelected());
	}

	public void clickOnRoundTripCb() {
		roundTripCb.click();
	}

	public void clickOnDepartureArrow2() {
		departureArrow_2.click();
	}

	public void clickDestinationTf2() throws InterruptedException {
		multiCitydestinationTf2.click();
		// destinationTf.sendKeys("Chennai");
	}

	public void clickOndestinationMultiCityTf() throws InterruptedException {
		destinationMultiCityTf.click();
		// destinationTf.sendKeys("Chennai");
	}

	public void passInMultiCityDestinationTf() throws InterruptedException {
		Thread.sleep(1000);
		fromTf1.sendKeys("New Delhi");
	}

	public void clickOnDepartureDatePicker_1() {
		departureDatePicker_1.click();
	}

	public void clickOnAddAnotherFlight_1() throws InterruptedException {
		Thread.sleep(1000);
		addAnotherFlight_1.click();
	}

	public void clickOnestinationMultiCityTf2() throws InterruptedException {
		Thread.sleep(1000);
		destinationMultiCityTf2.click();
	}

	public void passInMultiCityDestinationTf2() throws InterruptedException {
		Thread.sleep(1000);
		fromTf1.sendKeys("Bengaluru");
	}

	public void clickOnAddDepartureDate_2() throws InterruptedException {
		addDepartureDate_2.click();
	}

	public void clickOnDepartureDatePicker_3() throws InterruptedException {
		departureDatePicker_3.click();
	}

	public void clickOndestinationMultiCityTf2() throws InterruptedException {
		destinationMultiCityTf2.click();
		// destinationTf.sendKeys("Chennai");
	}

	public void clickOndepartureDateTf2() throws InterruptedException {
		departureDateTf2.click();
		// destinationTf.sendKeys("Chennai");
	}

	public void clickOnDepartureDatePicker_2() throws InterruptedException {
		Thread.sleep(500);
		departureDatePicker_2.click();
		// destinationTf.sendKeys("Chennai");
	}

	public void checkmultiCityValidate() throws InterruptedException {
		Thread.sleep(500);
		System.out.println(multiCityValidate.isDisplayed());
		Assert.assertTrue(multiCityValidate.isDisplayed());
		// destinationTf.sendKeys("Chennai");
	}

	public void clickOnDeparturePicker1() throws InterruptedException {
		Thread.sleep(500);
		departurePicker1.click();
	}

	public void clickOndatePicker3() throws InterruptedException {
		Thread.sleep(500);
		datePicker3.click();
	}

	public void clickOndefencePersonnaleCb() throws InterruptedException {
		Thread.sleep(500);
		defencePersonnaleCb.click();
	}

	public void clickChangeNoOfPassenger() throws InterruptedException {
		Thread.sleep(250);
		NoOfAdultPassenger.click();
		Thread.sleep(250);
		NoOfChildrenPassenger.click();
	}

	public void clickOnflightOneDepartureDate1() throws InterruptedException {
		Thread.sleep(250);
		flightOneDepartureDate1.click();

	}

	public void clickOnMoveToNextMonth() throws InterruptedException {
		Thread.sleep(250);
		MoveToNextMonth.click();
		MoveToNextMonth.click();

	}

	public void clickOndatePicker1() throws InterruptedException {
		Thread.sleep(250);
		datePicker1.click();

	}

	public void checkOneWay() throws InterruptedException {
		Thread.sleep(500);
		System.out.println(oneWayCb.isDisplayed());
		Assert.assertTrue(oneWayCb.isDisplayed());
		// destinationTf.sendKeys("Chennai");
	}
	
	public void clickOnStudentsCb() throws InterruptedException {
		Thread.sleep(250);
		StudentsCb.click();

	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_HomePage_After_Login_3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
