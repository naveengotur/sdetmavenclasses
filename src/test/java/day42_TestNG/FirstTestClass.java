package day42_TestNG;

import org.testng.annotations.Test;

public class FirstTestClass {
	/* Open app, login, logout*/
	@Test
	void openApp()
	{
	System.out.println("Opening Application");
	}
	@Test
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
