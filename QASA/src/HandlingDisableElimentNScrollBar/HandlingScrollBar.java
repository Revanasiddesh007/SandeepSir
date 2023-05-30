package HandlingDisableElimentNScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j = (JavascriptExecutor) driver;  // type casting
	j.executeScript("window.scrollBy(0,3000)");
}
}
