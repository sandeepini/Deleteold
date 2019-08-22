package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.testscript.baseclass;

public class WebDriverCommonLib {
public void waitForPageToLoad() {
	baseclass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void waitForElementPresent(WebElement we) {
	WebDriverWait wait=new WebDriverWait(baseclass.driver,10);
	wait.until(ExpectedConditions.visibilityOf(we));
}
public void waitForElement(WebElement we) {
	int count=0;
	while(count<=20)
	try {
		we.isEnabled();
		break;
	}
	catch(Exception e) {
		count++;
	}
//	public void select(WebElement element,String text) {
//		Select select=new Select(element);
//		select.selectByVisibleText(text);
//		
//	}
//	public void select(WebElement element,int index) {
//		Select select=new Select(element);
//		select.selectByIndex(index);
//		
//	}
}

}
