package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BankHomeObject;
import pages.BankLoginObject;

public class BankLoginTest {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.82.180.36/Common/Login.aspx");
	}
	@Test
	public void test() {
		BankLoginObject login = new BankLoginObject(driver);
		BankHomeObject home = login.loginValidUser("donhere", "don@123");
		assertEquals(home.getUserName(), "Welcome donhere");
	}
}
