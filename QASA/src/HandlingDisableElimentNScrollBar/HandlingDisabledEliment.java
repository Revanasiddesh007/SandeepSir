package HandlingDisableElimentNScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledEliment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/revan/Desktop/Disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver r = (RemoteWebDriver) driver;   //downcasting
		r.executeScript("document.getElementById('d2').value='manager'"); 
		
	}
}
