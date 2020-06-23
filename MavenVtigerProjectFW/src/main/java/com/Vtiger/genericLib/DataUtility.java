package com.Vtiger.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
public String getDataFromProperty(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
	
	Properties p=new Properties();
	p.load(fis);
	
	String value = p.getProperty(key);
	return value;
}

public String getDataFromExcel(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis1 =new FileInputStream("./src/test/resources/TestData.xlsx");
	Workbook book = WorkbookFactory.create(fis1);
	String value = book.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
}
