package day29_handlingcheckboxandAlertspopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertUsingExplicitWait {
public static void main(String[]args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver(); 
	
	WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Thread.sleep(2000);
	
	Alert myalert = myWait.until(ExpectedConditions.alertIsPresent());
	Thread.sleep(3000);
	System.out.println(myalert.getText());
	
	myalert.accept();
	
	driver.close();
	
	
}
}
