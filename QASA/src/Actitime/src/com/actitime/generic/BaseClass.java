package Actitime.src.com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
	
		Actitime.src.com.actitime.pom.LoginPage l = (Actitime.src.com.actitime.pom.LoginPage) driver;
		l.setLogin(un, pw);
	}
	@AfterMethod
	public void logOut() {
		Reporter.log("logOut",true);
		com.actitime.pom.HomePage h=new com.actitime.pom.HomePage(driver);
		h.setLogout();
	}
	
	
	
}
