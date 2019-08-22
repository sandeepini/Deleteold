package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebDriverCommonLib;
import com.actitime.pom.ActiveCustomersAndProjects;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskPage;
@Listeners(com.actitime.genericlib.ListernerCls.class)
public class DeleteUser extends baseclass{
	@Test 
	public void testDeleteUser() throws Exception {
		Reporter.log("DeleteUser",true);
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		//String customer=flib.getExcelData("Sheet1", 1, 0);
		wlib.waitForPageToLoad();
		/*navigate to task page*/
		Thread.sleep(2000);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.taskClick();
		//driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		/*navigate to create task page and create task*/
		TaskPage t=new TaskPage(driver);
		t.projectandcutomerclick();
		ActiveCustomersAndProjects a=new ActiveCustomersAndProjects(driver);
		a.customerchkboxclick();
		a.deleteCustbtnclick();
		a.deleteWindowbtnclick();
	}
}
