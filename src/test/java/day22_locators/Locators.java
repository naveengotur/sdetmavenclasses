package day22_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.id("userName")).sendKeys("naveen");
		
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("currentAddress")).sendKeys("returning the closest version;");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("CdpVersionFinder findNearestMatch");
		
		driver.findElement(By.id("submit")).click();
		
		driver.close();
		
	}
}
