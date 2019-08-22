package delete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entertimepage {
	@FindBy(xpath="//a[@class='content selected tasks']")
	private WebElement ts;
	@FindBy(xpath="//span[@id='ext-gen10']")
	private WebElement dd;
	public Entertimepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void click() {
		ts.click();
		dd.click();
		//bt.click();
	}
}
