package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoShippingPage {
	
	WebDriver driver;
	
	By checkbox=By.xpath("//*[@id=\"cgv\"]");
	By proceedshipping = By.xpath("//*[@id=\"form\"]/p/button/span");
	
	public AutoShippingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutoPaymentPage proceedShipping() {
		driver.findElement(checkbox).click();
		driver.findElement(proceedshipping).click();
		return new AutoPaymentPage(driver);
	}
	
}
