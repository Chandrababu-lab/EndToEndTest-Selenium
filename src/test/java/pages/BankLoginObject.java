package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankLoginObject {

	WebDriver driver;

	By username = By.id("body_txtUserID");
	By password = By.id("body_txtPassword");
	By login_btn = By.id("body_btnLogin");

	public BankLoginObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public BankHomeObject loginValidUser(String uname, String pass) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login_btn).click();
		return new BankHomeObject(driver);
	}

}
