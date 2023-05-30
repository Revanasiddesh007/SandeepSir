package HandlingTabs; // Assignment Questions

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitimeAcessment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Read Service Agreement")));
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Read
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> AllWh = driver.getWindowHandles();
		System.out.println(AllWh.size());
		for (String Wh : AllWh) { 
			driver.switchTo().window(Wh);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Online Terms")) {
				List<WebElement> elements = driver
						.findElements(By.xpath("//div[@id='main']//div[@class='entry-content']//h2"));
				for (WebElement ele : elements) {
					System.out.println(ele.getText());
				}
				driver.quit();
			}
		}
	}
}
