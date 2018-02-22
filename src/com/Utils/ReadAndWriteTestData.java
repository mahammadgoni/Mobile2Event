package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadAndWriteTestData {
	
//	String testDataPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Test Data/TestData.xlsx";
	
	String testDataPath = "/Users/goni/Documents/ImportUser_Template.xlsx";
	
	String sheetName = "Users";
	
	
	@SuppressWarnings("resource")
	public void readData() throws InvalidFormatException, IOException{
		
		File file = new File(testDataPath);
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet(sheetName);
		
		int rowCount  = s.getLastRowNum() -s.getFirstRowNum();
		
		for (int i = 0; i < rowCount; i++) {
			
			Row row = s.getRow(i);
			
			for (int j = 0; j < row.getLastCellNum(); j++) {
				
				System.out.println(row.getCell(j).getStringCellValue()+"!!");
				
//				String data = row.getCell(j).getStringCellValue();
				
			}
			
		}
		
	
		
	}
	
	public static void main(String agrs[]) throws InvalidFormatException, IOException{
		
		ReadAndWriteTestData objectFile = new ReadAndWriteTestData();
		
		objectFile.readData();
	}

}
