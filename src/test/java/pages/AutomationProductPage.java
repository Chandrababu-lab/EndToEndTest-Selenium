package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationProductPage {
	
	WebDriver driver;
	
	By color = By.xpath("//*[@id=\"color_11\"]");
	
	
	public AutomationProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutoAddCartPage complete_Product_Data() {
		driver.findElement(color).click();
		return new AutoAddCartPage(driver);
	}
	
}
