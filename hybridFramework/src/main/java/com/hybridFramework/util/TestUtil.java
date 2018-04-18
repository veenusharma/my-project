package com.hybridFramework.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;

public class TestUtil {

	public static XSSFWorkbook wb ;
 	 public static  XSSFSheet sheet ;
 	public static Object[][] data = null;
 	 WebDriver driver;
 	 public static FileInputStream fis;
 	 public static String TESTDATA_SHEET_PATH = "C:\\Users\\sharmava\\eclipse-workspace\\hybridFramework\\src\\main\\java\\com\\hybridFramework\\data\\DtvCreateTestData.xlsx";
  
 	 public Object[][] xssfDataSheet(String sheetName)
 	 {
 		 try {
			fis = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		 try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		 sheet= wb.getSheet(sheetName);
 		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
 		for (int i=0;i < sheet.getLastRowNum();i++)
 		{
 			for(int j =0;j<sheet.getRow(0).getLastCellNum();j++)
 				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
 			
 			
 		}
 		return data;
 	 }
 	
}
