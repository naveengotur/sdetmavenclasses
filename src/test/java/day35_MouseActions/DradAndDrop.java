package day35_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DradAndDrop {
	public static void main(String[]args) throws Exception{

		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		//drag and drop
		WebElement rome= driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));

		act.dragAndDrop(rome,italy).perform();
		
		Thread.sleep(4000);
		
		driver.close();


}}
