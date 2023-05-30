package com.actitime.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
	@Test
	public void VerifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Soogle";
		String aTitle = driver.getTitle();
		if (aTitle.equals(eTitle)) {
			System.out.println("Title is Matching and pass");
		} else {
			System.out.println("Tile is not Matching and fail");
		}
		driver.close();
	}
}