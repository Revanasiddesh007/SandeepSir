package TestngGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule extends BaseClass {

	@Test (priority = 1,groups = "RegressionTest")
	public void creatModule () {
		Reporter.log("CreateModule", true);
	}
	@Test(groups  = {"SmokeTest", "RegressionTest"})
	public void ModifyModule() {
		Reporter.log("ModifyModule", true);
	}
	@Test(groups = "RegressionTest")
	public void DeleteModule() {
		Reporter.log("DeleteModule", true);
	}
}
