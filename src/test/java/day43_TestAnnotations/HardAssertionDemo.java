package day43_TestAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {

	@Test
	void test(){

	//comparing the String
	Assert.assertEquals("navy", "navy"); //-> result is pass

	//comparing the integer
	Assert.assertEquals(123,456); //result is failed

	//compare the string and integer
	Assert.assertEquals("abc", 132); //result is failed
	Assert.assertEquals("132", 132); //result is failed

	//new method -> assertNotEquals
	Assert.assertNotEquals(123, 123); //failed
	Assert.assertNotEquals(123, 465); //passed

	Assert.assertTrue(true); //passed
	Assert.assertTrue(false); //false

	Assert.assertTrue(1==2); //failed
	Assert.assertTrue(1==1); //pass

	Assert.assertFalse(1==2); //pass
	Assert.assertFalse(1==1); //false

	//directly fail the method, using assert class.
	Assert.fail(); //failed

	}	
}
