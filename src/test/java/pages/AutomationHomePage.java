package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationHomePage {

	WebDriver driver;

	//By name = By.xpath("//*[@id=\"search_query_top\"]");

	public AutomationHomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

//	public String getUname() {
//		return driver.findElement(name).getText();
//	}

	public AutomationSearchPage search_Bar() {
		//driver.findElement(name).click();
		return new AutomationSearchPage(driver);
	}

}
