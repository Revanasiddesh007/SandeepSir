package com.actitime.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BatchExicution {

	@Test(priority = 1)
	public void ProjectModule() {
		Reporter.log("ProjectModule", true);
	}
	@Test(priority = 2 , dependsOnMethods = "TaskModule")
	public void CustomerModule() {
		Reporter.log("CustomerModule", true);
	}
	@Test(priority = 3)
	public void TaskModule() {
		Reporter.log("TaskModule", true);
	}
}
