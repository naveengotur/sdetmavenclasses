package day40_datadriveTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataSpecificRowandCell {
	public static void main(String[]args) throws Exception
	 {
		FileOutputStream  file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfilerandom.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook();

	XSSFSheet sheet = workbook.createSheet("Data2");

	XSSFRow row = sheet.createRow(3);

	XSSFCell cell = row.createCell(4);

	cell.setCellValue("Welcome");

	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File is created");

	}
	
}
