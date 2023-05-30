package HandlingMouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick { // ContextClick
	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		WebElement Link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions a = new Actions(driver);
		a.contextClick(Link).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);

		driver.quit();
	}
}
