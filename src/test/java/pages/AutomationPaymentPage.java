package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPaymentPage {
	
	WebDriver driver;
	
	By paymentOption = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"); 

	public AutomationPaymentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutomationOrderSummaryPage paymentOption() {
		driver.findElement(paymentOption).click();
		return new AutomationOrderSummaryPage(driver);
	}
	
}
