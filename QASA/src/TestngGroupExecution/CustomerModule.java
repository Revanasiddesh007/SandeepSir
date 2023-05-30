package TestngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule extends BaseClass {

	@Test (groups  = {"SmokeTest", "RegressionTest"})
	public void CreatCustomer() {
		Reporter.log("CreateCustomer", true);
	}

	@Test (priority = 1,groups = "RegressionTest")
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer", true);
	}

	@Test(priority = 2,groups = "RegressionTest")
	public void DeleteCustomer() {
		Reporter.log("DeleteCustomer", true);
	}

}
