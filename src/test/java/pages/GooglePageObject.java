package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePageObject {
	
	WebDriver driver;
	
	By text_search = By.name("q");
	By search_btn = By.name("btnK");
	
	public GooglePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void search_Data(String text) {
	driver.findElement(text_search).sendKeys(text);;
	}
	
	public void search_Btn() {
		driver.findElement(search_btn).click();
	}
	

}
