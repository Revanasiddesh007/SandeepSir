package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data1/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		// get last row number witch contains data
		int count = wb.getSheet("InvalidLogin").getLastRowNum();
		for (int i = 1; i <= count; i++) {
			String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un + "  " + pw);
		}
	}
}
