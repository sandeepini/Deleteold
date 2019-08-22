package delete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class del {
	@Test
	public void testlogin() throws Exception {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("(//div[@class='img'])[3]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("(//div[@class='img'])[4]")).click();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@id='ext-gen10']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//img[@class='x-form-radio'])[2]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//span[@class='checkbox'])[1]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//span[.='Close']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	Thread.sleep(700);
	driver.quit();
}
}

