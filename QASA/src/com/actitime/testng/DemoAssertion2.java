package com.actitime.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion2 {

	@Test
	public void VerifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Soogle";
		String aTitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		driver.close();
		s.assertAll();
	}
	
}
