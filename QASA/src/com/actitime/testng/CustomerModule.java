package com.actitime.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test (priority = 1, invocationCount = 3)
	public void CreatCustomer() {
		Reporter.log("Creatr Customer", true);
	}
	@Test(priority = 2, dependsOnMethods = "CreatCustomer")
	public void ModifyCustomer() {
		Reporter.log("Modify Customer", true);
	}
	@Test(priority = 3, dependsOnMethods = {"CreatCustomer","ModifyCustomer" }) 
	public void DeletCustomer() {
		Assert.fail(); // intensionally failed
		Reporter.log("Delete Customer", true);	
	}
}
