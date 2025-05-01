package day43_TestAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

	@Test
	void test_hardassertions() {
	System.out.println("Testing..");
	System.out.println("Testing..");

	Assert.assertEquals(1,1);

	System.out.println("Testing..");
	System.out.println("Testing..");

	} // result is pass

	@Test
	void test_hardassertions2() {
	System.out.println("Testing..");
	System.out.println("Testing..");

	Assert.assertEquals(1,2);

	System.out.println("Testing..");
	System.out.println("Testing..");
	}
	//softassertion
	@Test
	void test_softassertions1() {
	System.out.println("Testing..");
	System.out.println("Testing..");

	SoftAssert sa = new SoftAssert();
	sa.assertEquals(1,2);

	System.out.println("Testing..");
	System.out.println("Testing..");

	} // result is pass [but this is wrong]

	//softassertion
	@Test
	void test_softassertions() {
	System.out.println("Testing..");
	System.out.println("Testing..");

	SoftAssert sa = new SoftAssert();
	sa.assertEquals(1,2);

	System.out.println("Testing..");
	System.out.println("Testing..");

	sa.assertAll(); //mandatory

	} // result is fail [this is correct]

	
	} 

