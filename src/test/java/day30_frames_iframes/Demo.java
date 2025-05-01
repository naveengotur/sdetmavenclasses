package day30_frames_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import interview_class20.JavaScriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
public static void main(String[]args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://ui.vision/demo/webtest/frames/");
	
	driver.manage().window().maximize();
	//Frame-1
	WebElement  frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome to frame 1");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	
	//Frame-2
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome to frame2");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	
	//Frame-3
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome to frame3");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	
	//Frame-4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Welcome to frame4");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		/*
		//directly clicking
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("//div[@class='rq8Mwb']")).click();

		//Store in Js and click action
		WebElement rdbutton = driver.findElements(By.xpath("//div[@class='rq8Mwb']")).click();
		JavaScriptExecutor js= (JavaScriptExecutor)driver;
		js.executeScript("arguments[0].click();", rdbutton);

		driver.switchTo().defaultContent();  //go back to page.
		*/
	driver.close();
	
}
}
