package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AutomationAddCartPage;
import pages.AutomationAddressPage;
import pages.AutomationCartSummaryPage;
import pages.AutomationCheckOutPage;
import pages.AutomationHomePage;
import pages.AutomationIndexPage;
import pages.AutomationLoginPage;
import pages.AutomationProductPage;
import pages.AutomationSearchPage;
import pages.BankHomeObject;
import pages.BankLoginObject;

public class AutomationTest {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
	}
	@Test
	public void test() {
		AutomationIndexPage index=new AutomationIndexPage(driver);
		AutomationLoginPage login=index.loginCredentials();
		AutomationHomePage home = login.LoginValidation("admin22@gmail.com", "admin@123");
		//assertEquals(home.getUname(), "Suryakumar Yadav");
		AutomationSearchPage search = home.search_Bar();
//		AutomationProductPage product=search.searchData("dress");
//	AutomationAddCartPage cart = product.complete_Product_Data();
////		AutomationCheckOutPage check = cart.addToCart();
//		AutomationCartSummaryPage cartSummary = check.checkOut();
//		AutomationAddressPage address = cartSummary.proceedToCheckOut();
		
	}
}
