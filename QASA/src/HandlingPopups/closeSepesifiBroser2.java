package HandlingPopups; //Chaild Window (Browser) Popup

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeSepesifiBroser2 {
	public static void main(String[] args) {
		System.out.println("Enter the title to be close");
		Scanner sc = new Scanner(System.in);
		String eTitel = sc.nextLine();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		for (String Wh : allWh) {
			driver.switchTo().window(Wh);
			String title = driver.getTitle();
			if (title.contains(eTitel)) {
				driver.close();
			}
		}
	}
}