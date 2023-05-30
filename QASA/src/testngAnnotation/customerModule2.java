package testngAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class customerModule2 {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser", true);
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("cloaeBrowser", true);
	}
             
	@BeforeMethod
	public void Login() {
		Reporter.log("Login", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout", true);
	}

	@Test(priority = 1, invocationCount = 2)
	public void editCustomer() {
		Reporter.log("editCustomer", true);
	}

	@Test
	public void registerCustomer() {
		Reporter.log("registerCustomer", true);
	}

	@Test
	public void deletCustomer() {
		Reporter.log("deleteCustomer", true);
	}
}
