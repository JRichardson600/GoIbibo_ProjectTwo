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
import org.testng.Assert;

import Utility.Data_Fetching_GoIbibo;
import Utility.Listeners_Class;

public class GoIbibo_B2C_HomePage_Trip_Page_4 extends Listeners_Class {
	// Step-1-locationg the elements

	@FindBy(xpath = "(//input[@class='search-widget-uistyles__RadioButton-sc-f6e3g4-4 fSwMTB'])[1]")
	WebElement OneWayCb;

	@FindBy(xpath = "(//input[@class='search-widget-uistyles__RadioButton-sc-f6e3g4-4 fSwMTB'])[2]")
	WebElement TwoWayCb;

	@FindBy(xpath = "//div[@class='sc-fifgRP iKzBkA']")
	WebElement HeyTraveller_btn;

	@FindBy(xpath = "//p[@class='sc-gEvEer kPKMkg']")
	WebElement ViewYourProfile_btn;

	@FindBy(xpath = "//span[@class='sc-11civud-2 gyfaAe']")
	WebElement logOut_btn;

	// Step-2-writing the methods

	public void CheckOneWayCb() throws InterruptedException {
		System.out.println(OneWayCb.isSelected());
		Assert.assertTrue(OneWayCb.isSelected());
	}

	public void CheckTwoWayCb() throws InterruptedException {

		Thread.sleep(10000);
		System.out.println(TwoWayCb.isSelected());
		Assert.assertTrue(TwoWayCb.isSelected());
	}

	public void ClickOnHeyTraveller_btn() throws InterruptedException {
		Thread.sleep(10000);
		Actions a1 = new Actions(driver);
		a1.moveToElement(HeyTraveller_btn).perform();
		Thread.sleep(500);
		ViewYourProfile_btn.click();

	}

	public void ClickOnlogOut_btn() throws InterruptedException {
		Thread.sleep(10000);
		logOut_btn.click();

	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_HomePage_Trip_Page_4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
