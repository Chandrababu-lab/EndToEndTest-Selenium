package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationOrderSummaryPage {
	
	WebDriver driver;
	
	By orderConfirm = By.xpath("//*[@id=\"cart_navigation\"]/button/span");

	public AutomationOrderSummaryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutoOrderConfirmationPage orderPlaced() {
		driver.findElement(orderConfirm).click();
		//System.out.println("Order Placed Successfully!");
		return new AutoOrderConfirmationPage(driver);
	}
}
