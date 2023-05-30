package HandlingListBox;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabetOrder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/revan/Desktop/Hotel.html");
		WebElement selected = driver.findElement(By.id("mtr"));
		Select s = new Select(selected);
		List<WebElement> all = s.getOptions();
		ArrayList<String> ls = new ArrayList<String>();
		for (int i = 0; i < all.size(); i++) {
			ls.add(all.get(i).getText());
		}
		Collections.sort(ls);
		for (Object o : ls) {
			System.out.println(o);
		}
		driver.close();
	}
}
