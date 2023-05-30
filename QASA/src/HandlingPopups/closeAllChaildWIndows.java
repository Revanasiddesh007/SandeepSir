package HandlingPopups; //Chaild Window (Browser) Popup

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAllChaildWIndows {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pWh = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		for (String wh : allWh) {
			driver.switchTo().window(wh);
			if (!(pWh.equals(wh))) {
				driver.close();
			}
		}
	}
}
