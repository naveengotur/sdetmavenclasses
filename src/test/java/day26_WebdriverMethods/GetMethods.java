package day26_WebdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {
	public static void main(String[]args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//getTitle() of the webpage
		String titleOfpage= driver.getTitle();
		System.out.println("Title of page "+titleOfpage);  //OrangeHRM

		//getCurrentUrl() ->returns URL of the page.
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		//getPageSource() ->returns Sourcepage
	//	System.out.println(driver.getPageSource());
//
//		//getWindowHandle() -> returns ID of the single browser Window
		String windowId= driver.getWindowHandle();
		System.out.println("Window ID"+windowId); 
//
//		//getWindowHandles() returns Id's of the multiple browser window
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will opens new browser window
		Thread.sleep(5000);

		Set<String> windowIDs= driver.getWindowHandles();  //each window id's are unique, we used Set<String>.
		System.out.println("Window IDs "+windowIDs); 
		
		driver.quit();
		
	}

}
