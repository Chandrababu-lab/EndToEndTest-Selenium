package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoPaymentPage {
	
	WebDriver driver;
	
	By paymentOption = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"); 


	public AutoPaymentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutoOrderSummaryPage paymentOption() {
		driver.findElement(paymentOption).click();
		return new AutoOrderSummaryPage(driver);
	}
	
	
	
}
