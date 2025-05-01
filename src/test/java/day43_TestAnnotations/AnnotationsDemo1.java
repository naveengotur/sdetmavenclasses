package day43_TestAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {

	@BeforeMethod
	void login() {
	System.out.println("Login");

	}

	@AfterMethod
	void logout() {
	System.out.println("Logout");

	}

	@Test(priority=1)
	void search() {
	System.out.println("This is searching....");

	}

	@Test(priority=2)
	void Advancedsearch() {
	System.out.println("This is Advanced searching....");

	}
}
