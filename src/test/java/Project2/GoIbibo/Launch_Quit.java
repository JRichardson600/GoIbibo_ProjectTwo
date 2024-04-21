package Project2.GoIbibo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import Utility.Listeners_Class;
import Utility.Listeners_Class3;
import Utility.Retry_Logic;
import Utility.Listeners_Class3;

public class Launch_Quit extends Listeners_Class {

	@BeforeMethod
	@Parameters("browser")
	public void precondition(String name_of_browser) {

		if (name_of_browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (name_of_browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		if (name_of_browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://www.goibibo.com/");
		//driver.get("https://www.goibibo.+"envFile"+.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void closure_activity() throws InterruptedException, IOException {
		System.out.println("Thanks test case is done");
		Thread.sleep(2500);

		 driver.quit();// end of execution

	}
}
