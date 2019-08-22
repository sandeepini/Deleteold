package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
@FindBy(xpath="//a[@class='logout']")
private WebElement lgout;
@FindBy(xpath="(//div[@class='img'])[2]")
private WebElement task;
public EnterTimeTrackPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
/*business method for logout*/
public void logoutclick() {
	lgout.click();
}
public void taskClick() {
	task.click();
}
}
