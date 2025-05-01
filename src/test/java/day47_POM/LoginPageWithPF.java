package day47_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPF {

	WebDriver driver;
	//constructor
	public void LoginPageWithPF(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //Mandatory
	}

//	//constructor
//	void LoginPageWithPF(WebDriver driver) {
//	this.driver = driver;
//	PageFactory.initElements(driver, this); //Mandatory
//
//	}

	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;

	@FindBy(xpath="//input[text()='Login']")
	WebElement btn_login;

	//multiple webElement
	@FindBy(tagName="a")
	List<WebElement> links;


	//Actions Method
	public  void setUserName(String user) {
	txt_username.sendKeys(user);

	}

	public void setPassword(String pwd) {
	txt_password.sendKeys(pwd);
	}

	public void clickLogin() {
	btn_login.click();
	}
	
}
