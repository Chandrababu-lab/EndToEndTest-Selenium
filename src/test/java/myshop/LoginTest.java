package myshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() {
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("admin22@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
