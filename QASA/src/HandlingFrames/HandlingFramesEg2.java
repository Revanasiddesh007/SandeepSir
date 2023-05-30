package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesEg2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/revan/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1"); // f1=html value of atribute
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys(" c");
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys(" d");
	}
}
