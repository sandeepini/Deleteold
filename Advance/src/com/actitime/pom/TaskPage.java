package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(linkText="Projects & Customers")
	private WebElement projectandcutomer;
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*business method for logout*/
	public void projectandcutomerclick() {
		projectandcutomer.click();
	}
}
