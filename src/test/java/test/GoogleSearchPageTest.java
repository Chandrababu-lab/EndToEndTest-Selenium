package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.GooglePageObject;

public class GoogleSearchPageTest {
	
	WebDriver driver;
	
	@Test
	public void googleSearchTest() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		GooglePageObject GoogleObject = new GooglePageObject(driver);
		
		GoogleObject.search_Data("Automation step by step");
		GoogleObject.search_Btn();
	}
	
	

}
