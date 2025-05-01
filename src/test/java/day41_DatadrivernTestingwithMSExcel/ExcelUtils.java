package day41_DatadrivernTestingwithMSExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook   wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int getRowCount (String xlfile, String xlsheet) throws Exception
	{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	int rowcount = ws.getLastRowNum();
	wb.close();
	fi.close();
	return rowcount;

	}

	public static int getCellCount (String xlfile, String xlsheet, int rownum) throws Exception
	{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	int cellcount = row.getLastCellNum();
	wb.close();
	fi.close();
	return cellcount;
	}
	//Read data from the cell and empty cell
	public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws Exception
	{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	cell = row.getCell(colnum);

	String data;
	try {
	//Data = cell.toString();
	//or
	DataFormatter formatter = new DataFormatter();
	data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String
	}
	catch (Exception e) { 
	data = " ";
	}

	wb.close();
	fi.close();
	return data;
	}

	//writing the data into the cell.
	//both combination of reading and writing we are doing.
	public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws Exception{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	cell = row.createCell(colnum);
	cell .setCellValue(data);
	fo= new FileOutputStream(xlfile);
	wb.write(fo);
	wb.close();
	fi.close();
	fo.close();

	}

	//adding the color into cell, it is optional,
	//Without loop, this method will not call mulitple times, call only once.
	public static void fillGreenColor(String xlfile, String xlsheet, int rownum, int colnum) throws Exception{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	cell = row.getCell(colnum);

	style = wb.createCellStyle();

	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

	cell.setCellStyle(style);
	fo=new FileOutputStream(xlfile);
	wb.write(fo);
	wb.close();
	fi.close();
	fo.close();

	}

	//adding the color into cell, it is optional.
	//Without loop, this method will not call mulitple times, call only once.
	public static void fillRedColor(String xlfile, String xlsheet, int rownum, int colnum) throws Exception{
	fi = new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlsheet);
	row = ws.getRow(rownum);
	cell = row.getCell(colnum);

	style = wb.createCellStyle();

	style.setFillForegroundColor(IndexedColors.RED.getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

	cell.setCellStyle(style);
	fo=new FileOutputStream(xlfile);
	wb.write(fo);
	wb.close();
	fi.close();
	fo.close();

	}

	}

