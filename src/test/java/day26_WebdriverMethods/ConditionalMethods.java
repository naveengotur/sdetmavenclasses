package day26_WebdriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[]args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		//isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("logo is displayed "+logo.isDisplayed());
		//or
		
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);

		//isEnabled()
		boolean status1 = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status1);

		//isSelected()
		WebElement radio_male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement radio_female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        
		Thread.sleep(3000);
		
		System.out.println("Before Selection");
		System.out.println(radio_male.isSelected());  //false
		System.out.println(radio_female.isSelected());//false
		
		System.out.println("After selecting the male radio button");
		radio_male.click(); //click on male radio button
		System.out.println(radio_male.isSelected());  //true
		System.out.println(radio_female.isSelected());//false
		Thread.sleep(3000);

		
		System.out.println("After selecting the female radio button");
		radio_female.click(); //click on female radio button
		System.out.println(radio_male.isSelected());  //false
		System.out.println(radio_female.isSelected());//true
		Thread.sleep(3000);
		
		//or
		boolean btnSelected= driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("btn selected "+btnSelected);
		Thread.sleep(3000);
	
		driver.close();
	}
}
