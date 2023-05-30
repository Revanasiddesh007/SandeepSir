package testngAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class customerModule {

	@Test
	public void creatCustomer() {
	Reporter.log("CreatCustomer", true);	
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);
	}
	@BeforeMethod
	public void Login () {
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout", true);
	}
	@BeforeClass
	public void openBroser() {
		Reporter.log("openBrowser", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
	}
	
	
}
