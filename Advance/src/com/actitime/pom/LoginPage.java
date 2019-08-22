package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericlib.WebDriverCommonLib;

public class LoginPage {
@FindBy(name="username")
private WebElement un;
@FindBy(name="pwd")
private WebElement pw;
@FindBy(xpath="//div[.='Login ']")
private WebElement lgbt;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setuser(String username,String password) {
	un.sendKeys(username);
	pw.sendKeys(password);
	lgbt.click();
}
}
