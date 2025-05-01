package day28_navigationalcommands;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[]args) throws MalformedURLException, Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.navigate().to("https://demo.nopcommerce.com/");
//		
//		Thread.sleep(3000);
//		
//		driver.manage().window().maximize();
//		
//		driver.close();
		
		URL url =new URL("https://demo.nopcommerce.com/");
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
	
}
