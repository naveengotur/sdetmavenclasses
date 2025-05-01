package day43_TestAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void xyz() {
	System.out.println("Test 2");
	}

	@AfterTest
	void at() {
	System.out.println("After Test");
	}
	
}
