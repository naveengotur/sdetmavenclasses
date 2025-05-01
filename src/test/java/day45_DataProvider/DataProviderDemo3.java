package day45_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Data Provide class with praticular data provider

public class DataProviderDemo3 {

WebDriver driver ;

@BeforeClass
void setup() {
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test (dataProvider="dp")
void testLogin(String email, String pwd) throws Exception {
driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pwd");
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
@AfterClass
void tearDown() {
driver.close();
}

@DataProvider(name="dp",indices= {0,1})
Object[][] loginData() {

Object data[][] = {  {"abc@gmail.com","test123"},
                     {"xyz@gmail.com","test012"},
                     {"john@gmail.com","test@123"}, 
                     {"pavanol123@gmail.com","test@123"}

  };

return data;
}
}

