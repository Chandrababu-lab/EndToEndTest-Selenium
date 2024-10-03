package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoLoginPage {
	static WebDriver driver;
	
	static By uname=By.name("email");
	static By pass = By.name("passwd");
	static By signIn_Btn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	

	
	public AutoLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public AutoHomePage LoginValidation(String uname1,String pass1) {
		driver.findElement(uname).sendKeys(uname1);
		driver.findElement(pass).sendKeys(pass1);
		driver.findElement(signIn_Btn).click();
		return new AutoHomePage(driver);
	}
}
