package day27_waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[]args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		WebElement loginBtn = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Login ']")));
		
		txtusername.sendKeys("Admin");
		Thread.sleep(2000);
		
		txtpassword.sendKeys("admin123");
		Thread.sleep(2000);
		
		loginBtn.click();
		Thread.sleep(4000);
		
		driver.close();
		
	}
}
