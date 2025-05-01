package interview_class20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	public static void main(String[]args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
		
		WebElement input2 = driver.findElement(By.xpath("//textarea[@name='text2']"));
		
		input1.sendKeys("Welcome");
		
		Actions act = new Actions(driver);
		//Control+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		
		//Control+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		
		//Tab button
		act.sendKeys(Keys.TAB);
		act.perform();
		Thread.sleep(2000);
		
		//Control+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		
		//comaretext
		if(input1.getAttribute("value").equals(input2.getAttribute("Value")))
			System.out.println("textcopied");
		else
			System.out.println("text not copied");
		
		driver.close();
	}

}
