package day28_navigationalcommands;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs= driver.getWindowHandles();
		/*
		//Approach 1
		List<String> windowList=new ArrayList(windowIDs);	
		String parentId=windowList.get(0);
		String childId=windowList.get(1);
		//get the parent title
		System.out.println(driver.getTitle());
		//Switch to child Window and get the child title
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		//switch to parent window and get the parent title
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		*/
		
		//Approach 2
		for(String windId : windowIDs)
		{
			String title = driver.switchTo().window(windId).getTitle();
			if(title.equals("OrangeHRM")|| title.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
			{
				System.out.println(driver.getCurrentUrl());
				
			}
		}
		
		
		driver.close();
	}
}
