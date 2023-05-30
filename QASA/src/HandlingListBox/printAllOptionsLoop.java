package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllOptionsLoop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/revan/Desktop/Hotel.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s = new Select(slvListBox);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
		driver.close();
		
	}
}
