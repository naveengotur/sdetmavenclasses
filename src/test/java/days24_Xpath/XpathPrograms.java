package days24_Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPrograms {

	public static void main(String[]args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//single Attribute
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		Thread.sleep(2000);
		
		//multiple Attribute
		driver.findElement(By.xpath("//input[@type='text'][@name='q']")).sendKeys("testing");
		Thread.sleep(2000);
		
		// with and Operator
		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("Heloo");
		Thread.sleep(2000);
		
		// with or Operator
		driver.findElement(By.xpath("//input[@type='text' or @name='q']")).sendKeys("Hai");
		Thread.sleep(2000);
		
		//with text()
		driver.findElement(By.xpath("//a[text()='Computers ']")).click();
		
	
		boolean status = driver.findElement(By.xpath("//strong[text()='Featured products']")).isDisplayed();
		Thread.sleep(3000);
		System.out.println("Displayedstatus is "+status);
		
		String getStatus = driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
		System.out.println("Getstatus is "+getStatus);
		
		//xpath  with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("test");
		
		//xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("Test");
		
		//xpath with Chained xpath
		boolean imgdisplay= driver.findElement(By.xpath("(//div[@class='picture']/a/img)[1]")).isDisplayed();
		
		System.out.println("imageDisplayed "+imgdisplay);
		
		driver.close();
		
	}
}
