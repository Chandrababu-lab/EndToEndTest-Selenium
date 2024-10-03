package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationCartSummaryPage {
	
	WebDriver driver;
	
	By proceedtocheck = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");	
	
	public AutomationCartSummaryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public AutomationAddressPage proceedToCheckOut() {
		driver.findElement(proceedtocheck).click();
		return new AutomationAddressPage(driver);
	}

}
