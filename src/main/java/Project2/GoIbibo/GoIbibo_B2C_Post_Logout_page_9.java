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

public class GoIbibo_B2C_Post_Logout_page_9 extends Listeners_Class {
	// Step-1-locationg the elements

	@FindBy(xpath = "//button[@class='sc-19vq0g0-6 gvmlSY']")
	WebElement Login_btn;

	// Step-2-writing the methods

	public void Check_Login_btn() throws InterruptedException {
		Thread.sleep(500);
		if (Login_btn.isDisplayed() && Login_btn.isDisplayed()) {
			System.out.println(Login_btn.isDisplayed() && Login_btn.isEnabled());
			Assert.assertTrue((Login_btn.isDisplayed() && Login_btn.isEnabled()));
		}

	}

	// step 3 - initialization of elements
	public GoIbibo_B2C_Post_Logout_page_9(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
