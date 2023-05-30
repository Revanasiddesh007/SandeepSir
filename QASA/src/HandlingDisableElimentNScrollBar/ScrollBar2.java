package HandlingDisableElimentNScrollBar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar2 { // scroll botom to top
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		// scroll to botom of webpage
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		// scroll to top of webpage
		j.executeScript("window.scrollTo(0,0)");
	}
}
