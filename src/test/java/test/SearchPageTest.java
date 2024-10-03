package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AutomationSearchPage;

public class SearchPageTest {
	WebDriver driver;
//	AutomationSearchPage page=new AutomationSearchPage(driver);
	@BeforeTest
	public void setUp() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
	}
	
	@Test
	public void test() {
		AutomationSearchPage.searchData("dress");
	}
}
