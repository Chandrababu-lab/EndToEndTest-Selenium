package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoIndexPage {
	static WebDriver driver;

	static By sign_in = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	public AutoIndexPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public static AutoLoginPage loginCredentials() {
		driver.findElement(sign_in).click();
		return new AutoLoginPage(driver);
	}
}
