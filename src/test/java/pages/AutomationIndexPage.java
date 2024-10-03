package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationIndexPage {
	
	WebDriver driver;

	By sign_in = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	public AutomationIndexPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public AutomationLoginPage loginCredentials() {
		driver.findElement(sign_in).click();
		return new AutomationLoginPage(driver);
	}
	
}
