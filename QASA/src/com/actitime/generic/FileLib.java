package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a gemeric for data driven gtesting
 * @author revan
 *
 */
public class FileLib {
	/**
	 * This is a generic method for reading the data from the property file
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data1/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

	/**
	 * This is generic method for reading the data from the Excel file.
	 * 
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getexcelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("data1/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return Data;
	}

	/**
	 * This is generic method for writing the data to the Excel file
	 * 
	 * @param sheetNme
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetName, int row, int cell, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("data1/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("data1/testScript.xlsx");
		wb.write(fos);
		wb.close();
	}
}