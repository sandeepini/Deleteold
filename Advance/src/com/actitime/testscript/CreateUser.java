package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebDriverCommonLib;

public class CreateUser extends baseclass{

	public static void main(String[] args) throws Exception {
		/*read common data and testScripts data from external resource*/

		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		String customer=flib.getExcelData("Sheet1", 1, 0);
		String URL=flib.getPropertyData("url");
		String Username=flib.getPropertyData("username");
		String password=flib.getPropertyData("password");

		/*launch browser*/
		 driver=new FirefoxDriver();
		/*enter the url*/
		wlib.waitForPageToLoad();
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		/*navigate to task page*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		/*navigate to create task page and create task*/
		
		driver.findElement(By.linkText("Projects & Customers")).click();
		
		driver.findElement(By.xpath("//span[.='Create Customer']")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(customer);
		driver.findElement(By.xpath("//span[.='Create Customer']")).click();;
		Thread.sleep(2000);
		/*logout from app*/
		driver.findElement(By.linkText("Logout")).click();
		/*close browser*/
		driver.close();
	}

}
