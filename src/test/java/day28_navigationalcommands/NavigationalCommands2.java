package day28_navigationalcommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands2 {

	public static void main(String[]args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.navigate().to("https://www.orangehrm.com/");	
      

		//navigate to the backward
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//navigate to the forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
}
