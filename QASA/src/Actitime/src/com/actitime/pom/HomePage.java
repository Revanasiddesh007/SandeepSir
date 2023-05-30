package Actitime.src.com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement lgOut;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksTab;	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLgOut() {
		return lgOut;
	}

	public void setLgOut(WebElement lgOut) {
		this.lgOut = lgOut;
	}

	public WebElement getTasksTab() {
		return tasksTab;
	}

	public void setTasksTab(WebElement tasksTab) {
		this.tasksTab = tasksTab;
	}
}
