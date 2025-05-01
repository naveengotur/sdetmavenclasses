package day43_TestAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test
	void pqr() {
	System.out.println("Test 2");
	}

	@AfterSuite
	void as()  {
	System.out.println("After Suite");
	}

	@BeforeSuite
	void bs()  {
	System.out.println("Before suite");
	}

}
