package HandlingMouseAction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MousHoveringActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vtiger.com/");
        WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		WebElement phNo = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]"));
		System.out.println(phNo.getText());
		// additional 
		List<WebElement> address = driver.findElements(By.xpath("//p[contains(text(),'Bengaluru')]/../p"));
		 for (WebElement ad : address) {
			String fullAd = ad.getText();
			System.out.println(fullAd);
		}
		 driver.quit();
	}

}
