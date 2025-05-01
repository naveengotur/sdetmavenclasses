package day43_TestAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	@BeforeClass
	void login() {
	System.out.println("Login");

	}

	@AfterClass
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
