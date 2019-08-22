package delete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id="username")
private WebElement us;
@FindBy(name="pwd")
private WebElement pw;
@FindBy(id="loginButton")
private WebElement bt;
public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void setuser(String usr,String pwd) {
	us.sendKeys(usr);
	pw.sendKeys(pwd);
	bt.click();
}
}
