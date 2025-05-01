package day45_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DataProviderDemo1 {


WebDriver driver ;

void setup() {
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

void testLogin() throws Exception {
driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pavanol123@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
driver.findElement(By.xpath("//input[@value='Login']")).click();
Thread.sleep(2000);

boolean status = driver.findElement(By.xpath("")).isDisplayed();
if(status==true) {
driver.findElement(By.xpath("")).click();
Assert.assertTrue(true);
}
else {
Assert.fail();
}
}

void tearDown() {
driver.close();
}
}
