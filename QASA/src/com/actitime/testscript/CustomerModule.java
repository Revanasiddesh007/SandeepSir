package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNgBaseClassAnnaotatiobn.BaseClass;
@Listeners (com.actitime.Generic1.ListenersImplimentation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void CreatCustomer() {
		Reporter.log("CreatCustomer", true);
		Assert.fail();
	}
}