package day43_TestAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1 {

	@Test
	void testTitle() { 
	String exp_title="opencart";
	String act_title="openshop";

	//old Method [conditional method]
	if(exp_title.equals(act_title)) {
	System.out.println("Test passed");
	}
	else{
	System.out.println("Test Failed");
	}

	//New Method [Assert method]
	Assert.assertEquals(exp_title, act_title);

	//or conditional with assert
	if(exp_title.equals(act_title)) {
	System.out.println("Test passed");
	Assert.assertTrue(true);
	}
	else{
	System.out.println("Test Failed");
	Assert.assertTrue(false);
	}

	}
	
}
