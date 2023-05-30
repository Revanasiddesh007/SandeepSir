package TestngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeClass(groups  = {"SmokeTest", "RegressionTest"})
	public void OpenBrowser() {
		Reporter.log("OpenBrowser", true);
	}

	@AfterClass(groups  = {"SmokeTest", "RegressionTest"})
	public void CloseBrowser() {
		Reporter.log("CloseBrowser", true);
	}

	@BeforeMethod(groups  = {"SmokeTest", "RegressionTest"})
	public void Login() {
		Reporter.log("Login", true);
	}

	@AfterMethod(groups  = {"SmokeTest", "RegressionTest"})
	public void logout() {
		Reporter.log("Logout", true);
	}
}
