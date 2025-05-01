package day23_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[]args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//tag id tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Puma");
		Thread.sleep(2000);
		
		//without tagname id
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("");
		Thread.sleep(2000);

		//tag class  tag.classname
		driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("Test");
		Thread.sleep(2000);
		
		//without tagename
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Testing");
		Thread.sleep(4000);

		//tag attribute tag[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Test");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Test");
		Thread.sleep(4000);
		
		//without tag attribute
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Test");
		Thread.sleep(4000);

		//tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("test");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("test");
		Thread.sleep(4000);
		
		
		driver.close();
		
		
	}
}
