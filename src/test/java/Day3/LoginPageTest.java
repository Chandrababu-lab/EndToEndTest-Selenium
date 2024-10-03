package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	}

	@Test
	public void loginTest() {
		LoginPage lp=new LoginPage(driver);
		lp.setUser("admin22@gmail.com");
		lp.setPassword("admin@123");
		lp.login();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
