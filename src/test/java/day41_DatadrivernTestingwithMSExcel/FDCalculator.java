package day41_DatadrivernTestingwithMSExcel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[]args) throws Exception{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-desposit-calculator-SBI-BS0001.html");
		driver.manage().window().maximize();

		String filePath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";

		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");

		for(int i=1; i<=rows; i++) {

		//read data from excel
		String principalamt = ExcelUtils.getCellData(filePath, "Sheet1", i ,0);
		String rateofintereset = ExcelUtils.getCellData(filePath, "Sheet1", i ,1);
		String period1 = ExcelUtils.getCellData(filePath, "Sheet1", i ,2);
		String period2 = ExcelUtils.getCellData(filePath, "Sheet1", i ,3);
		String freq = ExcelUtils.getCellData(filePath, "Sheet1", i ,4);
		String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i ,5);

		//pass above data into application
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principalamt);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofintereset);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);

		Select perdrop = new Select( driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		perdrop.selectByVisibleText(period2);

		Select fredrop = new Select( driver.findElement(By.xpath("//select[@id='frequency']")));
		fredrop.selectByVisibleText(freq);

		driver.findElement(By.xpath("//div[@class ='cal-div']//a[1]")).click(); //clicked on calculate

		//validation
		String act_mvalue= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

		if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
		{
		System.out.println("Test Passed");
		ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "passed");
		ExcelUtils.fillGreenColor(filePath, "sheet1", i, 7);
		}
		else{

		System.out.println("Test failed");
		ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "failed");
		ExcelUtils.fillRedColor(filePath, "sheet1", i, 7);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='PL5']")).click(); //clicked on clear button

		} //ending of for loop

		driver.quit();

		}

}
