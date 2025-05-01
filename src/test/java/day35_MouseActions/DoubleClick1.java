package day35_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
	public static void main(String[]args) throws Exception{

		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();

		//switch to frame
		driver.switchTo().frame("iframeResult");

		WebElement tf1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement tf2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btn = driver.findElement(By.xpath("//button[text()='Copy Text']"));

		tf1.clear();  //clears tf1
		tf1.sendKeys("Good morning");

		//Double click action on the button
		Actions act = new Actions(driver);

		act.doubleClick(btn).perform();
        Thread.sleep(4000);
		//validation tf2 should contains "Good morning"

		if(tf2.getText().equals("Good morning"))
		{
		System.out.println("Text Copied");
		}
		else{
		System.out.println("Text not copied properly");
		}

		//or
		//String text = tf2.getText();
		//or 
		 String text = tf2.getAttribute("value");

		System.out.println("Capture"+text);
		if(text.equals("Good morning"))
		{
		System.out.println("Text Copied");
		}
		else{
		System.out.println("Text not copied properly");
		}
		
		
		driver.close();
		}
}
