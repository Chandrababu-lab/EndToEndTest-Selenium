package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoProductPage {

WebDriver driver;
	
	By color = By.xpath("//*[@id=\"color_11\"]");
	By imgClick = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");
	
	
	public AutoProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public AutoAddCartPage complete_Product_Data() {
		driver.findElement(imgClick).click();
		driver.findElement(color).click();
		return new AutoAddCartPage(driver);
	}
	

}
