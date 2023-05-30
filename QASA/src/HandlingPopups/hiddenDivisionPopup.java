package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);  //this programe is only works on Thread.sleep condition of synchronisation
		WebElement hidPopup = driver.findElement(By.xpath("(//button)[2]"));
		hidPopup.click();
	//	wait.until(ExpectedConditions.visibilityOf(hidPopup)).click();  // X not working properly
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button)[2]"))).click();  // X not working atall
	}

}
