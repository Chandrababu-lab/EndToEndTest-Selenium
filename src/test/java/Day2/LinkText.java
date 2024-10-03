package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkText {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/link.html");
	}
	@Test
	public void linkText() {
		driver.findElement(By.linkText("click here")).click();
		System.out.println("Title of the page is "+driver.getTitle());
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
