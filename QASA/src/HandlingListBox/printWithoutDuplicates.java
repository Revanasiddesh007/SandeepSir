package HandlingListBox;

import java.time.Duration;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printWithoutDuplicates {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/revan/Desktop/Hotel.html");
		WebElement selected = driver.findElement(By.id("mtr"));
		Select s = new Select(selected);
	       List<WebElement> all = s.getOptions();
	       HashSet<Object> hs = new HashSet<>();
	   for ( WebElement menu: all) {
		hs.add(menu.getText());
	}
	  System.out.println("All Menu");  
	  for (Object sl : hs) {
		System.out.println(sl);
	}
	}
}
