package Actitime.src.com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customerNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionTbx;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company'  and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;
	
	public void setAddNewBtn(WebElement addNewBtn) {
		this.addNewBtn = addNewBtn;
	}

	public void setNewCustomerOption(WebElement newCustomerOption) {
		this.newCustomerOption = newCustomerOption;
	}

	public void setCustomerNameTbx(WebElement customerNameTbx) {
		this.customerNameTbx = customerNameTbx;
	}

	public void setCustomerDescriptionTbx(WebElement customerDescriptionTbx) {
		this.customerDescriptionTbx = customerDescriptionTbx;
	}

	public void setSelectCustomerDD(WebElement selectCustomerDD) {
		this.selectCustomerDD = selectCustomerDD;
	}

	public void setBigBangCompany(WebElement bigBangCompany) {
		this.bigBangCompany = bigBangCompany;
	}

	public void setCreateCustomerBtn(WebElement createCustomerBtn) {
		this.createCustomerBtn = createCustomerBtn;
	}

	public void setActualCustomerCreated(WebElement actualCustomerCreated) {
		this.actualCustomerCreated = actualCustomerCreated;
	}

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}
	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}
	public WebElement getCustomerDescriptionTbx() {
		return customerDescriptionTbx;
	}
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
	
}















