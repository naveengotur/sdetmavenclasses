package interview_class20;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_20 {

	public static void main(String[]args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		/*
		//Full page of screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File(".\\screeshot\\homepage.png");
		
		FileUtils.copyFile(src, trg);
		*/
		
		//section of screenshot
		
		WebElement section = driver.findElement(By.partialLinkText("oxd-sheet"));
		
		File src= section.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("..\\screenshot\\login.png");
		
		FileUtils.copyFile(src,trg);
		
		
		
		
		
		
		driver.close();
		
	}
	
}
