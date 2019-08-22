package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.genericlib.ListernerCls.class)
public class EditUser extends baseclass{
@Test 
public void testEditUser() {
	Reporter.log("EditUser",true);
	Assert.fail();
}
}
