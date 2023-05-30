package testNgBaseClassAnnaotatiobn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeTrack extends BaseClass {

	@Test
	public void titleTrack () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("container_tt"));
		String title = driver.getTitle();
		Reporter.log(title, true);
	}
}
