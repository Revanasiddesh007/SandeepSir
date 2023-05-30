package HandlingPopups;  //Chaild Window (Browser) Popup

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clossAllWithoutQuit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	Set<String> allWh = driver.getWindowHandles();
	for (String Wh : allWh) {
		driver.switchTo().window(Wh);
		driver.close();
	}
}
}
