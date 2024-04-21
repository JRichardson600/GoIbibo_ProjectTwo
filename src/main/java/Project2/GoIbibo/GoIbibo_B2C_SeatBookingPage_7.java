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

public class GoIbibo_B2C_SeatBookingPage_7 extends Listeners_Class {
	// Step-1-locationg the elements

	@FindBy(xpath = "//img[@src='https://imgak.goibibo.com/flights-gi-assets/images/aerial/seats/circle.png']")
	List<WebElement> ListOfActiveSeats;

	@FindBy(xpath = "(//img[@class='price-list-newstyles__SeatPriceElementImg-sc-1x6dz85-6 kUOdzE'])[2]")
	WebElement customSeats;

	@FindBy(xpath = "//span[@class='seatText  white']")
	WebElement seatHighlighted1;

	@FindBy(xpath = "(//div[@class='flight-detailstyles__TicketDetailWrap-sc-1i6unua-32 dhTlMw'])[1]")
	WebElement Flighinfo1;

	@FindBy(xpath = "(//div[@class='flight-detailstyles__TicketDetailWrap-sc-1i6unua-32 dhTlMw'])[2]")
	WebElement Flighinfo2;

	@FindBy(xpath = "//div[@class='font18 f600 txtUpper marginB5']")
	WebElement faredetail;

	@FindBy(xpath = "(//div[@class='baggagestyles__BagImgWrap-sc-1u4f2jb-14 huuEpp alignItemsCenter justifyCenter dF fGS0'])[1]")
	WebElement Bagagdetail1;

	@FindBy(xpath = "(//div[@class='baggagestyles__BagImgWrap-sc-1u4f2jb-14 huuEpp alignItemsCenter justifyCenter dF fGS0'])[2]")
	WebElement Bagagdetail2;

	@FindBy(xpath = "(//div[@class='baggagestyles__BagImgWrap-sc-1u4f2jb-14 huuEpp alignItemsCenter justifyCenter dF fGS0'])[3]")
	WebElement Bagagdetail3;

	@FindBy(xpath = "(//div[@class='f600 font18'])[2]")
	WebElement cancellationText;

	@FindBy(xpath = "//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav width100 f500 font16']")
	WebElement proceedToPaymentOnReviewBooking;

	@FindBy(xpath = "//div[@class='dF font18 padR10 alignItemsCenter']")
	WebElement paymentBlockedMsg;

	// button[@class='multicitystyles__BookButton-sc-taovnj-27 gAZjKT txtUpper
	// font14 flex1 white']

	// Step-2-writing the methods

	public void clickOnSeatsAutoSug() throws InterruptedException {
		Thread.sleep(500);
		int count_sug = ListOfActiveSeats.size(); // get size or length of the auto-suggestion
		System.out.println(count_sug);

		ListOfActiveSeats.get(count_sug - 3).click();
	}

	public void clickOnCustomSeats() throws InterruptedException {
		Thread.sleep(500);
		customSeats.click();

	}

	public void CheckCustomSeatsEnabled() throws InterruptedException {
		Thread.sleep(500);
		System.out.println(customSeats.isEnabled());
		Assert.assertTrue(customSeats.isEnabled());

	}

	public void CheckFlightInfo() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("Flighinfo1 : " + Flighinfo1.isDisplayed());
		System.out.println("Flighinfo2 : " + Flighinfo2.isDisplayed());
		Assert.assertTrue(Flighinfo1.isDisplayed());
		Assert.assertTrue(Flighinfo2.isDisplayed());

	}

	public void Checkfaredetail() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("faredetail : " + faredetail.isDisplayed());
		Assert.assertTrue(faredetail.isDisplayed());

	}

	public void CheckBagagdetails() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("Bagagdetail1 : " + Bagagdetail1.isDisplayed());
		System.out.println("Bagagdetail2 : " + Bagagdetail2.isDisplayed());
		System.out.println("Bagagdetail3 : " + Bagagdetail3.isDisplayed());

		Assert.assertTrue(Bagagdetail1.isDisplayed());
		Assert.assertTrue(Bagagdetail2.isDisplayed());
		Assert.assertTrue(Bagagdetail3.isDisplayed());

	}

	public void CheckcancellationText() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("cancellationText : " + cancellationText.isDisplayed());
		Assert.assertTrue(cancellationText.isDisplayed());

	}

	public void CheckproceedToPaymentOnReviewBooking() throws InterruptedException {
		Thread.sleep(250);
		proceedToPaymentOnReviewBooking.click();
	}

	public void CheckPaymentBlockedMsg() throws InterruptedException {
		Thread.sleep(250);
		System.out.println("paymentBlockedMsg.getText() : " + paymentBlockedMsg.getText());
		Assert.assertEquals(paymentBlockedMsg.getText(), "Re-confirmation Failed With Airline...");
	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_SeatBookingPage_7(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
