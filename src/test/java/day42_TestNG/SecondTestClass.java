package day42_TestNG;

import org.testng.annotations.Test;

public class SecondTestClass {
	//order of execution ->default value is zero(0)
	/* Open app, login, logout*/
	@Test(priority=1)
	void openApp()
	{
	System.out.println("Opening Application");
	}
	@Test(priority=2)
	void login()
	{
	System.out.println("login Application");
	}
	@Test
	void logout()
	{
	System.out.println("logout Application");
	}
	
}
