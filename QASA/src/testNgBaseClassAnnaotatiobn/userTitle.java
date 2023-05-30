package testNgBaseClassAnnaotatiobn;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class userTitle extends BaseClass{
@Test
public void usersTitle () {
	driver.findElement(By.id("container_users")).click();
	String title = driver.getTitle();
	Reporter.log(title, true);
}
}
