package HandlingPopups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("file:///C:/Users/revan/Desktop/Naukari.html");
	File f = new File ("./data1/Resume.dox.odt");
	String absalutePath=f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(absalutePath);
 }
}