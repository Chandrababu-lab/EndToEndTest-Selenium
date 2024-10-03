package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoSearchPage {
	
	WebDriver driver;
	By Search_Add = By.xpath("//*[@id=\"search_query_top\"]");
	By Btn_submit = By.name("submit_search");

	public AutoSearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public AutoProductPage searchData(String data) {
		driver.findElement(Search_Add).sendKeys(data);
		driver.findElement(Btn_submit).click();
		return new AutoProductPage(driver);
	}

}
