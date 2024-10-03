package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationShippingPage {
	
	WebDriver driver;
	
	By checkbox=By.xpath("//*[@id=\"cgv\"]");
	By proceedshipping = By.xpath("//*[@id=\"form\"]/p/button/span");

	public AutomationShippingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutomationPaymentPage proceedShipping() {
		driver.findElement(checkbox).click();
		driver.findElement(proceedshipping).click();
		return new AutomationPaymentPage(driver);
	}
	
}
