package day40_datadriveTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[]args) throws Exception{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");;
        XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("data");

		XSSFRow row1 = sheet.createRow(0);

		   row1.createCell(0).setCellValue("Welcome");
		   row1.createCell(1).setCellValue(1234);
		   row1.createCell(2).setCellValue("Automation");

		XSSFRow row2 = sheet.createRow(1);

		   row2.createCell(0).setCellValue("JAVA");
		   row2.createCell(1).setCellValue(456);
		   row2.createCell(2).setCellValue("Selenium");

		XSSFRow row3 = sheet.createRow(2);

		   row3.createCell(0).setCellValue("C#");
		   row3.createCell(1).setCellValue(4);
		   row3.createCell(2).setCellValue("playwright");

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");

		}
	
}
