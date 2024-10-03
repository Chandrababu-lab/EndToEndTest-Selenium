package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	static WebDriver driver;
	@Test
	public static void googleSearch() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		GoogleSearchPage.text_Box(driver).sendKeys("Automation Step By Step");
		GoogleSearchPage.button_search(driver).click();
		
//		driver.close();
		
		System.out.println("Tested successfully!");
		
	}
}
