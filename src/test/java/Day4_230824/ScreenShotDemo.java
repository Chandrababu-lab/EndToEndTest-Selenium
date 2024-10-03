package Day4_230824;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utility.TakeScreenShot;

public class ScreenShotDemo extends TakeScreenShot{

	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void screenShotTest() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("ScreenShotDemo");
		TakeScreenShot.screenShot(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
