package day40_datadriveTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {
	public static void main(String[]args) throws Exception
	 {

FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile2.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook();

	XSSFSheet sheet = workbook.createSheet("Data2");

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter how many rows");  //3
	int noOfrows = sc.nextInt();

	System.out.println("Enter how many cells"); //5
	int noOfcells = sc.nextInt();

	for(int r=0; r<=noOfrows; r++ )
	{
	 XSSFRow currentrow= sheet.createRow(r);  //enter the value

	for(int c=0; c<noOfcells; c++)
	{
	 XSSFCell cell = currentrow.createCell(c); //enter the value
	 cell.setCellValue(sc.next());
	}

	}


	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File is created");

	}
}
