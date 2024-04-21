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

public class GoIbibo_B2C_Profile_page_8 extends Listeners_Class {
	// Step-1-locationg the elements

	@FindBy(xpath = "//span[@class='sc-11civud-2 gyfaAe']")
	WebElement logOut_btn;

	@FindBy(xpath = "//button[@class='sc-sypgwv-6 kkbZLK']")
	WebElement YeslogOut_btn;

	// Step-2-writing the methods

	public void ClickOnlogOut_btn() throws InterruptedException {
		Thread.sleep(500);
		logOut_btn.click();

	}

	public void ClickOnYeslogOut_btn() throws InterruptedException {
		Thread.sleep(500);
		YeslogOut_btn.click();

	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_Profile_page_8(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

