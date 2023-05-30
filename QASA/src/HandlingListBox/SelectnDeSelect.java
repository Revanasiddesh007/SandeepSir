package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectnDeSelect { // **imp
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/revan/Desktop/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for (int i = 0; i < count; i++) {
			s.selectByIndex(i);
		}
		for (int i = count - 1; i >= 0; i--) {
			s.deselectByIndex(i);
		}
	}
}