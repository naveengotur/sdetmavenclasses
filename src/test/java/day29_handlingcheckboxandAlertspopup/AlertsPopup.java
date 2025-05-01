package day29_handlingcheckboxandAlertspopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPopup {
public static void main(String[]args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Thread.sleep(3000);
	//Step-1 handle ok button
	//normal alert handle
	driver.switchTo().alert().accept();
	
	//handle alert with create object
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Thread.sleep(3000);
	Alert myalert = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(myalert.getText());
	myalert.accept();
	
	//Step-2 Confirmation Alert - Ok & Cancel
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	//handle alert with create object
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Alert myalert2 = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(myalert.getText());
	myalert2.accept();
	
	//Step-3 Prompt alert - Input box
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert myalert3 = driver.switchTo().alert();
	Thread.sleep(3000);
	myalert3.sendKeys("Hello");
	Thread.sleep(3000);
	System.out.println(myalert3.getText());
	myalert3.accept();

	
	driver.close();
	
	
	
	
	
}
}
