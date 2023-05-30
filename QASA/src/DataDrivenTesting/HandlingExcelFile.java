package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// get java represented object of the physical file
		FileInputStream fis = new FileInputStream("./data1/testScript.xlsx");
		// creat a workbook or open the excel
		Workbook wb = WorkbookFactory.create(fis);
		// get the controll of the sheet, then row, then cell read the data
		String data = wb.getSheet("CreatCustomer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);
	}
}
