package day40_datadriveTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcel {

	public static void main(String[]args) throws Exception {
	//FileInputStream file = new FileInputStream(Set.getProperty("full path of file"));
		//or 
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheetname");
		//or XSSFSheet sheet = workbook.getSheetAt(0);

		int totalRows = sheet.getLastRowNum();

		int totalCells = sheet.getRow(0).getLastCellNum();

		System.out.println("Number of rows"+totalRows);  //5
		System.out.println("Number of cells"+totalCells); //4

		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow currentRow =  sheet.getRow(r);

		for(int c=0; c<totalCells; c++)
		{
			XSSFCell cell = currentRow.getCell(c);
		 System.out.println(cell.toString()+"\t");

		}
		System.out.println();
		}
		workbook.close();
		file.close();
		
	}
}

