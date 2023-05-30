package HandlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllSelectOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/revan/Desktop/Hotel.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s = new Select(slvListBox);
		List<WebElement> allselectOptions = s.getAllSelectedOptions();
		int count = allselectOptions.size();
		System.out.println("number of selected = " + count);
		for (int i = 0; i < count; i++) {
			String text = allselectOptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}