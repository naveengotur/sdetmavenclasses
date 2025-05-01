package day44_DependencyMethodsandGroupingTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods3 {
	@Test(priority=1)
	void openApp()
	{
	Assert.assertTrue(true);
	}

	@Test(priority=2, dependsOnMethods={"openApp"})
	void login()
	{
	 Assert.assertTrue(false);
	}

	@Test(priority=3, dependsOnMethods={"login"})
	void search()
	{
	Assert.assertTrue(true);
	}

	@Test(priority=4, dependsOnMethods={"login"})
	void advSearch()
	{
	Assert.assertTrue(true);
	}

	@Test(priority=5, dependsOnMethods={"login"})
	void logout()
	{
	Assert.assertTrue(true);
	}

// -> result is 1 is pass, 1 is failed, 3 is skipped.
}
