package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoOrderSummaryPage {
	
	WebDriver driver;
	
	By orderConfirm = By.xpath("//*[@id=\"cart_navigation\"]/button/span");

	
	public AutoOrderSummaryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutoOrderConfirmationPage orderPlaced() {
		driver.findElement(orderConfirm).click();
		return new AutoOrderConfirmationPage(driver);
	}
	
}
