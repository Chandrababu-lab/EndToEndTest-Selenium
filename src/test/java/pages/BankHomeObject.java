package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankHomeObject {

	WebDriver driver;
	
	By name = By.id("divWelcome");
	
	public BankHomeObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public String getUserName() {
		return driver.findElement(name).getText();
	}
	
	
	
}
