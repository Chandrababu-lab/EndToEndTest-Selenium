package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationCheckOutPage {

	WebDriver driver;

	By checkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	public AutomationCheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public AutomationCartSummaryPage checkOut() {
		driver.findElement(checkout).click();
		return new AutomationCartSummaryPage(driver);
	}
	
}
