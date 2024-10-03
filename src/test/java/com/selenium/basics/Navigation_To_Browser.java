package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Navigation_To_Browser {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@Test
	public void searchData() {
	 WebElement searchData =  driver.findElement(By.name("q"));
	 searchData.sendKeys("Automation Testing");
	 searchData.submit();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
