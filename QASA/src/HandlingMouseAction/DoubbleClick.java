package HandlingMouseAction; // Assignment Question

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubbleClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.vtiger.com/");
	driver.findElement(By.partialLinkText("Resources")).click();
	driver.findElement(By.partialLinkText("Customers")).click();
	WebElement targetEle = driver.findElement(By.id("loginspan"));
	Actions a = new Actions(driver);
	a.doubleClick(targetEle).perform();
	String rTitle = driver.getTitle();
	String aTitle = "Login - Vtiger";
	if (rTitle.equals(aTitle)) {
		System.out.println("Titel test case is pass:= "+rTitle);
	}else {
		System.out.println("Title test case is failed ");
	}
	driver.quit();
}
}
