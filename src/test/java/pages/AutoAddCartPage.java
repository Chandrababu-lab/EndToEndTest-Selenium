package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AutoAddCartPage {
	
	WebDriver driver;
	By addcart  = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
//	*[@id="add_to_cart"]/button/span
	
	public AutoAddCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public AutoCheckOutPage addToCart() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(addcart).click();
		return new AutoCheckOutPage(driver);
	}

}
