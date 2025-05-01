package day29_handlingcheckboxandAlertspopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthenticationPop_up {
public static void main(String[]args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver =  new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	driver.get("http://the-internet.herokuapp.com/basic_auth");
	
	//Handle sending username and password in the url
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
}
	
}
