package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoAddressPage {

	WebDriver driver;
	By checkbox = By.xpath("//*[@id=\"addressesAreEquals\"]");
	By proceedToCheck = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");

	
	public AutoAddressPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public AutoShippingPage proceedAddress() {
		driver.findElement(checkbox).click();
		driver.findElement(proceedToCheck).click();
		return new AutoShippingPage(driver);
	}
	
}
