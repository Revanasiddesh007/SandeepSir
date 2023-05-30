package testNgBaseClassAnnaotatiobn;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.generic.FileLib;


public class BaseClass {	
public static	WebDriver driver;
public WebDriverWait wait;
public Properties p;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("Open Borwser", true);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closeBrowsere() {
		Reporter.log("CloseBrowser", true);
		driver.close();
	}

	@BeforeMethod
	public void Login() throws IOException {
		Reporter.log("Login", true);
		FileInputStream fis = new FileInputStream("./data1/commondata.property");
        p = new Properties();
        p.load(fis);
        String url = p.getProperty("url");
       String un = p.getProperty("username");
       String pwd = p.getProperty("password");
        driver.get(url);
        driver.findElement(By.id("username")).sendKeys(un);
        driver.findElement(By.name("pwd")).sendKeys(pwd);
        driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout", true);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
	}

	
}
