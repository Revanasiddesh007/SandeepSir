package Actitime.src.com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

import Actitime.src.com.actitime.pom.HomePage;
import Actitime.src.com.actitime.pom.TaskListPage;

@Listeners(Actitime.src.com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("Create Customer",true);
	FileLib f=new FileLib();
	String customerName = f.getexcelData("CreateCustomer",1,2);
	String customerDesc = f.getexcelData("CreateCustomer",1,3);
	HomePage h = new HomePage(driver);
	h.getTasksTab().click();	
    TaskListPage t = new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getCustomerNameTbx().sendKeys(customerName);
	t.getCustomerDescriptionTbx().sendKeys(customerDesc);
	t.getSelectCustomerDD().click();
	t.getBigBangCompany().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(5000);
	String actualText = t.getActualCustomerCreated().getText();
	Assert.assertEquals(actualText, customerName);
	}
}  






