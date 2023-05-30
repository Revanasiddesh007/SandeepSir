package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writtenDataToExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data1/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("CreatCustomer").getRow(1).getCell(4).setCellValue("Pass");
		// get the physical file format of the java represntative object
		FileOutputStream fos = new FileOutputStream("./data1/testScript.xlsx");
		// save yhe workbook (acgtual writting happens hear)
		wb.write(fos);
		// close the workbook
		wb.close();
	}
}
