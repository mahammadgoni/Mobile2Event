package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.gargoylesoftware.htmlunit.javascript.host.worker.Worker;

public class ReadAndWriteTestData {
	
	String testDataPath = "/Users/goni/Documents/workspace/WebSpiders/Event2Mobile/Test Data/TestData.xlsx";
	
	
	public void readData() throws FileNotFoundException{
		
		File file = new File(testDataPath);
		
		FileInputStream fis = new FileInputStream(file);
		
//		Workbook wb  = new XSSF
		
	}

}
