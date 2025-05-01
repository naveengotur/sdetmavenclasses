package day29_handlingcheckboxandAlertspopup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[]args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1.select the specific checkbox
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		Thread.sleep(3000);
		
		
		//2.select all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		Thread.sleep(3000);
		
		//for loop
		for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
			
		}
		Thread.sleep(3000);
		//enchanced loop
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		Thread.sleep(3000);
		
		//3.Select last checkboxes
		//total no of checkboxes - how many checkboxes want to select = starting index.
		//7-3 = 4 (stating index)
		for(int i=4; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(3000);
		
		//4. select first 3 checkboxes
		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(3000);
		
		
		//5.Whichever checkbox are selected, need to unselector unselect checkboxes if they are selected.
		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(3000);
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
}
