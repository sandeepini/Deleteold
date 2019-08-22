package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebDriverCommonLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class baseclass {
	public static WebDriver driver;
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	int x = 10;
	@BeforeTest
	public void  launchBrowser() throws Exception {
		String browserName = flib.getPropertyData("browser");
		
		if(browserName.equals("firefox")) {	
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
			//driver.manage().window().maximize();
				}
		else if(browserName.equals("ie")) {
			
			driver=new InternetExplorerDriver();
		}
		
	}
	@BeforeMethod
	public void login() throws Exception {
		String URL=flib.getPropertyData("url");
		String Username=flib.getPropertyData("username");
		String password=flib.getPropertyData("password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		LoginPage l=new LoginPage(driver);
		l.setuser(Username, password);
	}
	@AfterMethod
	public void logout() throws Exception {
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[@class='logout']")).click();
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.logoutclick();
		Thread.sleep(2000);
	}
	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}}
