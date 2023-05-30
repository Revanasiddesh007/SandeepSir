package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calenderPopup {// (hiddenDivisionPopup)
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		WebElement policyNumber = driver.findElement(By.id("policynumber"));
		policyNumber.sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement dobMonth = driver.findElement(By.xpath("//select[@aria-label=\"Select month\"]"));
		Select s = new Select(dobMonth);
		s.selectByIndex(7);
		WebElement dobYear = driver.findElement(By.xpath("//select[@aria-label=\"Select year\"]"));
		Select y = new Select(dobYear);
		y.selectByVisibleText("1989");
		WebElement date = driver.findElement(By.xpath("(//a[contains(.,'8')])[1]"));
		date.click();
		WebElement mobileNumber = driver.findElement(By.id("alternative_number"));
		mobileNumber.sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		try {
			WebElement errormessage = driver.findElement(By.id("policynumberErrorK"));
			System.out.println(errormessage.getText());

		} catch (NoSuchElementException e) {
			System.out.println("Policy number is validated");
		}

		driver.quit();
	}

}
