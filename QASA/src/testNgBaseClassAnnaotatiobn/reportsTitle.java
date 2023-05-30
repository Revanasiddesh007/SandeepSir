package testNgBaseClassAnnaotatiobn;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class reportsTitle extends BaseClass{
@Test
public void Report () {
	driver.findElement(By.id("container_reports")).click();
	String title = driver.getTitle();
	Reporter.log(title, true);
}
}
