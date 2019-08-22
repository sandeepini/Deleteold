package delete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
@Test
public void testlogin() {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	Loginpage l=new Loginpage(driver);
	l.setuser("admin","manager");
	Entertimepage e =new Entertimepage(driver);
	e.click();
//	driver.findElement(By.xpath("//a[@class='content selected tasks']")).click();
//	driver.findElement(By.xpath("//span[@id='ext-gen10']")).click();
}
 
}
