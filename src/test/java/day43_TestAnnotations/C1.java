package day43_TestAnnotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@Test
	void abc() {
	System.out.println("Test 1");
	}

	@BeforeTest
	void bt() {
	System.out.println("Before Test");
	}

	
}
