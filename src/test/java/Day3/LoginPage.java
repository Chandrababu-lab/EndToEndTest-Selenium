package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;

	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	WebElement loginBtn;
	
	LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUser(String user) {
		email.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		loginBtn.click();
	}

}
