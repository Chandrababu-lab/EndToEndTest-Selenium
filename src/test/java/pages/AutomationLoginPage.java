package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationLoginPage {

	WebDriver driver;
	
	By uname=By.name("email");
	By pass = By.name("passwd");
	By signIn_Btn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	

	
	public AutomationLoginPage(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver=driver1;
	}

	public AutomationHomePage LoginValidation(String uname1,String pass1) {
		driver.findElement(uname).sendKeys(uname1);
		driver.findElement(pass).sendKeys(pass1);
		driver.findElement(signIn_Btn).click();
		return new AutomationHomePage(driver);
	}
}

