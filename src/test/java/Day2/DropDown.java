package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}

	@Test
	public void dropDown() {
	Select dropdown = new Select(driver.findElement(By.name("country")));
	dropdown.selectByVisibleText("INDIA");
	dropdown.selectByIndex(3);
	dropdown.selectByValue("CONGO");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
