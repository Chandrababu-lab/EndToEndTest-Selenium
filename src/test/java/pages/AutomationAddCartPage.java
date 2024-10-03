package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationAddCartPage {
	
	WebDriver driver;
	
	By addcart  = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	
	public AutomationAddCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutomationCheckOutPage addToCart() {
		driver.findElement(addcart).click();
		return new AutomationCheckOutPage(driver);
	}
	
}
