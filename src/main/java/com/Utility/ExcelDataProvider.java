package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		
		String path1="C:\\Users\\Omsai\\Documents\\java automation\\Batch_12_Framework\\TestData\\test.xlsx";
		FileInputStream fis1=new FileInputStream(path1);
	    wb=new XSSFWorkbook(fis1);
	}
        public String getStringData(String sheetname,int row,int cell) {
        	return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
        	
    }
}
