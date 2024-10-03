package com.hms.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BasePage {

	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void initilaize(String browser, String url) {
		String basePath = System.getProperty("user.dir");

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", basePath + "src\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			break;
		default:
			driver = new ChromeDriver();
			driver.get(url);
		}
	}

	@BeforeClass
	@Parameters({ "browserName", "url" })
	public void setUp(String browserName, String url1) {
		initilaize(browserName, url1);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
