package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebDriverCommonLib;
import com.actitime.pom.ActiveCustomersAndProjects;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskPage;
@Listeners(com.actitime.genericlib.ListernerCls.class)
public class CreateUserNew extends baseclass{
@Test
public void testCreateUser() throws Exception {
	System.out.println("CreateUserNew");
	/*read common data and testScripts data from external resource*/
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	String customer=flib.getExcelData("Sheet1", 1, 0);
	wlib.waitForPageToLoad();
		/*navigate to task page*/
	Thread.sleep(2000);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.taskClick();
	
	/*navigate to create project and customer page and create customer*/
	TaskPage t=new TaskPage(driver);
	t.projectandcutomerclick();
	
	ActiveCustomersAndProjects a=new ActiveCustomersAndProjects(driver);	
	/*click on create customer with customer name*/
	a.createCustomerclick();
	a.setCreateNewCustomer(customer);
	Thread.sleep(1000);
	a.createCustomerBtnClick();
	Thread.sleep(1000);
	
}
	
}

