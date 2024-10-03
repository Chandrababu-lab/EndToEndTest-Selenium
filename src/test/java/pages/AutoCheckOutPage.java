package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AutoCheckOutPage {
	
	WebDriver driver;

	By checkout = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span");
	
	
	public AutoCheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public AutoCartSummaryPage checkOut() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(checkout).click();
		return new AutoCartSummaryPage(driver);
	}

	
	

}
