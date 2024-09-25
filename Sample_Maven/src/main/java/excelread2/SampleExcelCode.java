package excelread2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcelCode {
	
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	
public static String ReadStringValue (int i, int j) throws IOException {
	f=  new FileInputStream ("C:\\Users\\hp\\Desktop\\ExcelReadDistrict.xlsx");
	w= new XSSFWorkbook (f);
	s=w.getSheet("Sheet1");
	XSSFRow r= s.getRow(i);
	XSSFCell c=r.getCell(j);	
	return c.getStringCellValue();	
	
}
public static double ReadIntegerValue (int i, int j) throws IOException {
	f=  new FileInputStream ("C:\\Users\\hp\\Desktop\\ExcelReadDistrict.xlsx");
	w= new XSSFWorkbook (f);
	s=w.getSheet("Sheet1");
	XSSFRow r= s.getRow(i);
	XSSFCell c=r.getCell(j);	
	return c.getNumericCellValue();
	
	
	
	
}
}
