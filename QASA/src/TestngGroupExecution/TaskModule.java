package TestngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule extends BaseClass {
	@Test(groups  = {"SmokeTest", "RegressionTest"})
	public void CreateTask() {
		Reporter.log("CreateTask", true);
	}

	@Test(groups = "RegressionTest")
	public void ModifyTask() {
		Reporter.log("ModifyTask", true);
	}

	@Test(priority = 1,groups = "RegressionTest")
	public void DeletTask() {
		Reporter.log("DeletTask", true);
	}
}
