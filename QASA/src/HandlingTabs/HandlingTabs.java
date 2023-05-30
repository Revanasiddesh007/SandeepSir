package HandlingTabs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWh = driver.getWindowHandles();
		System.out.println(allWh.size());
		for (String Wh : allWh) {
			driver.switchTo().window(Wh);
			System.out.println(Wh);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}
}
