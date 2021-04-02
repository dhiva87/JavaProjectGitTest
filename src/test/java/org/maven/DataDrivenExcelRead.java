package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcelRead {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\revathy\\eclipse-workspace\\MavenSample\\ExcelFile\\SampleExcelRead.xlsx");
		//Convert file into byte stream
		FileInputStream str = new FileInputStream(f);
		
		//Fetch the Workbook
		Workbook book = new XSSFWorkbook(str);
		
		//Fetch the particular sheet from workbook
		Sheet s=book.getSheet("Sheet1");
		
		//Fetch the particular Row from sheet based on index
		Row r=s.getRow(1);
		
		//Fetch the particular Cell from sheet based on index
		Cell c= r.getCell(2);
		System.out.println(c);
		
		//Find Cell Type
		int type =c.getCellType();
		System.out.println(type);
		
		//Date 
		if(DateUtil.isCellDateFormatted(c)) {
			//retrieve date value from excel
			Date d = c.getDateCellValue();
			System.out.println(d);
			//convert date into user define format
			SimpleDateFormat forma = new SimpleDateFormat("dd-MMM-yy");
			String value=forma.format(d);
			System.out.println(value);
		}
		else
			System.out.println("else part");
	}
}
