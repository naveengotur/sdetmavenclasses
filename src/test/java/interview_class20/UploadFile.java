package interview_class20;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	public static void main(String[]args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		//direct upload the file using sendkeys
//		WebElement file= driver.findElement(By.id("file-upload"));
//		file.sendKeys("C:\\Users\\DELL\\eclipse-workspace\\com.sdetmavenproject\\screeshot\\homepage.png");		
//		Thread.sleep(5000);
//		
		//Using Robot class methods
		WebElement file= driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", file);
		
		Thread.sleep(5000);
		
		/*
		 * 1.Copy the path
		 * 2.Control+v
		 * 3.Enter
		 * */
		
		Robot rb= new Robot();
		rb.delay(2000);
		
		//put the path file in clipboard
		StringSelection ss= new StringSelection("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\com.sdetmavenproject\\\\screeshot\\\\homepage.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);		
		
		//control + v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.close();
		
	}

}
