package day47_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithoutPF {

	WebDriver driver;
	//Constructor
	LoginPageWithoutPF(WebDriver driver) {

	this.driver= driver;

	}

	//locators
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@plaecholder=Password']");
	By btn_login_loc = By.xpath("//button[text()='Login']");

	//Actions method
	public void setUserName(String user) {
	driver.findElement(txt_username_loc).sendKeys(user);
	}

	public void setPassword(String pwd) {
	driver.findElement(txt_password_loc).sendKeys(pwd);
	}

	public void clickLogin() {
	driver.findElement(btn_login_loc).click();
	}
	
}
