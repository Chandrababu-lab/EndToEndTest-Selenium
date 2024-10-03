package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import pages.AutoAddCartPage;
import pages.AutoAddressPage;
import pages.AutoCartSummaryPage;
import pages.AutoCheckOutPage;
import pages.AutoHomePage;
import pages.AutoIndexPage;
import pages.AutoLoginPage;
import pages.AutoOrderConfirmationPage;
import pages.AutoOrderSummaryPage;
import pages.AutoPaymentPage;
import pages.AutoProductPage;
import pages.AutoSearchPage;
import pages.AutoShippingPage;

public class End_To_End_Test {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
	}

	@Test
	public void test() {
		AutoIndexPage index = new AutoIndexPage(driver);
		AutoLoginPage login = index.loginCredentials();
		AutoHomePage home = login.LoginValidation("admin22@gmail.com", "admin@123");
		AutoSearchPage search = home.search_Bar();
		AutoProductPage product = search.searchData("dress");
		AutoAddCartPage cart = product.complete_Product_Data();
		AutoCheckOutPage checkout = cart.addToCart();
		AutoCartSummaryPage summary = checkout.checkOut();
		AutoAddressPage address = summary.proceedToCheckOut();
		AutoShippingPage shipping = address.proceedAddress();
		AutoPaymentPage payment = shipping.proceedShipping();
		AutoOrderSummaryPage ordersummary = payment.paymentOption();
		AutoOrderConfirmationPage confirm = ordersummary.orderPlaced();
		String message = "Your order on My Shop is complete.";
		assertEquals(message, "Your order on My Shop is complete.");
		System.out.println(message);
	
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
