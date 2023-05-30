package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLib {
	public static void main(String[] args) throws IOException {
		FileLib f = new FileLib();
		System.out.println(f.getPropertyData("url"));
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getPropertyData("password"));
		System.out.println(f.getexcelData("CreatCustomer", 1, 2));
		f.setExcelData("CreatCustomer", 1, 4, "Skipped");

	}
}
