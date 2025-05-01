package day46_TestNG_Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class OrangeHRM {

	WebDriver driver;
	@BeforeClass
	void setup() throws Exception {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}

	@Test(priority=1)
	void testLogo(){
	boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed(); //result is pass
	Assert.assertEquals(logo,true);
	}

	@Test(priority=2)
	void testAppUrl(){
	Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/"); //result is failed
	}

	@Test(priority=3, dependsOnMethods={"testAppUrl"})
	void testHomePageTitle(){
	Assert.assertEquals(driver.getTitle(),"OrangeHRM"); //result is skipped
	}

	@AfterClass
	void tearDown(){
	driver.quit();
	}
	
}
