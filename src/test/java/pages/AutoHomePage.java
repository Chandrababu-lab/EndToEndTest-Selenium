package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.AutoSearchPageTest;

public class AutoHomePage {
	
	WebDriver driver;
	
	By name = By.id("search_query_top");

	public AutoHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutoSearchPage search_Bar() {
		driver.findElement(name).click();
		return new AutoSearchPage(driver);
	}
}
