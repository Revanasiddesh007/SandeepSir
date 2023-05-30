package testNgBaseClassAnnaotatiobn;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class taskTitle extends BaseClass {
	@Test
	public void tasksList() {
		driver.findElement(By.id("container_tasks")).click();
		String title = driver.getTitle();
		Reporter.log(title, true);
	}
}
