package com.actitime.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssetsion1 {

	@Test
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Soogle";
		String aTitle = driver.getTitle();
		Assert.assertEquals(eTitle, aTitle); // This is Hard Assertion
		driver.close(); // Hard Assertion is not allow to exicute further codes, whenever previos code is fails
	}
}
