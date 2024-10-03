package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Navigation_Alerts {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.navigate().to("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
	}

	@Test
	public void T1() throws Throwable {
		driver.findElement(By.id("alertButton")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	@Test
	public void T2() {
		driver.findElement(By.id("confirmButton")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
