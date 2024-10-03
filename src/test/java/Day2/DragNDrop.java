package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragNDrop {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

	}

	@Test
	public void dragNdrop() {
		WebElement From = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
