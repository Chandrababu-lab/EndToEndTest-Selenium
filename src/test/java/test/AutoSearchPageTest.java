package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AutoHomePage;
import pages.AutoIndexPage;
import pages.AutoLoginPage;
import pages.AutoProductPage;
import pages.AutoSearchPage;

public class AutoSearchPageTest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
	}
	
	@Test
	public void test() {
		AutoIndexPage index=new AutoIndexPage(driver);
		AutoLoginPage login=index.loginCredentials();
		AutoHomePage home = login.LoginValidation("admin22@gmail.com", "admin@123");
		AutoSearchPage search = home.search_Bar();
		AutoProductPage product = search.searchData("dress");

}
}
