package pages;

import org.openqa.selenium.WebDriver;

public class AutoOrderConfirmationPage {
	
	WebDriver driver;
	
	public AutoOrderConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void display() {
		System.out.println("Order placed Successfully!");
	}

}
