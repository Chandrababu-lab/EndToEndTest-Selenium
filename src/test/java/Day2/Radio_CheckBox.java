package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radio_CheckBox {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void radio() {
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1 =  driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		radio1.click();
		System.out.println("Radio1 is selected");
		
		radio2.click();
		System.out.println("Radio2 is selected");
		
		//checkbox selection
		
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		check1.click();
		if(check1.isSelected()) {
			System.out.println("Checkbox is selected");
		}else {
			System.out.println("Checkbox is not selected");
		}	
	}
	
	@Test
	public void check() {
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement check = driver.findElement(By.id("persist_box"));
		 for (int i=0; i<2; i++) {											
	            check.click (); 			
	            System.out.println("Facebook Persists Checkbox Status is -  "+check.isSelected());							
	        }
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
