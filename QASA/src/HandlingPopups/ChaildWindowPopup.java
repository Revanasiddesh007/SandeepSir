package HandlingPopups;  //Chaild Window (Browser) Popup

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChaildWindowPopup {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	String wh = driver.getWindowHandle();
	System.out.println(wh);
	//getting the adress of the current browser
	driver.close();
}
}
