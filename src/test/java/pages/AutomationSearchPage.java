package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationSearchPage {
	
	static WebDriver driver;

	static By Search_Add = By.xpath("//*[@id=\"search_query_top\"]");
	
	public AutomationSearchPage(WebDriver  driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
//	public AutomationProductPage searchData(String data) {
//		driver.findElement(Search_Add).sendKeys(data);
//		return new AutomationProductPage(driver);
//	}
//	
	public static void searchData(String data) {
		try {
			driver.findElement(Search_Add).sendKeys(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
