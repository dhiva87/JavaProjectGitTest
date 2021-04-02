package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\revathy\\eclipse-workspace\\MavenSample\\ExcelFile\\SampleExcelWrite.xlsx");
		FileInputStream str1 = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(str1);
		Sheet s=book.getSheet("Sheet1");
		Row r=s.createRow(5);
		Cell c=r.createCell(3);
		c.setCellValue("Dhivagar");
		FileOutputStream str = new FileOutputStream(f);
		book.write(str);
		System.out.println("done");
	}

}
