package day47_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2WithPFDiffMethod {

	WebDriver driver;
	//constructor
	LoginPage2WithPFDiffMethod(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this); //Mandatory
	}

	//Locators
	@FindBy(how= How.XPATH, using="//input[@placeholder='Username']")
	WebElement txt_username;

	@FindBy(how = How.XPATH, using="//input[@placeholder='Password']")
	WebElement txt_password;

	@FindBy(how = How.XPATH, using ="//input[text()='Login']")
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
