package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveCustomersAndProjects {
	@FindBy(xpath="//span[.='Create Customer']")
	private WebElement CreateCustomer;
	@FindBy(xpath="//a[contains(.,'HDFC_01')]/../../../../../..//input[@type='checkbox']")
	private WebElement Customerchkbox;
	@FindBy(xpath="//input[@onclick='deleteCustomersProjects(this.form)']")
	private WebElement DeleteCustbtn;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement DeleteWindowbtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement CreateNewCustomer;
	@FindBy(xpath="//span[.='Create Customer']")
	private WebElement CreateCustomerBtn;
	public ActiveCustomersAndProjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*business method for logout*/
	public void createCustomerclick() {
		CreateCustomer.click();
	}
	public void customerchkboxclick() {
		Customerchkbox.click();
	}
	public void deleteCustbtnclick() {
		DeleteCustbtn.click();
	}
	public void deleteWindowbtnclick() {
		DeleteWindowbtn.click();
	}
	
	
	/*business method for logout*/
	public void setCreateNewCustomer(String customername) {
		CreateNewCustomer.sendKeys(customername);
		
	}
	public void createCustomerBtnClick() {
		CreateCustomerBtn.click();
	}
}
