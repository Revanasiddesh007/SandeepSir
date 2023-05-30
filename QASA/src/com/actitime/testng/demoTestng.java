package com.actitime.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTestng {
@Test
	public void demoTest() {
		Reporter.log("hi");
		Reporter.log("bye", false);
		Reporter.log("Good", true);
		System.out.println("hi Whatsapp");

	}
}