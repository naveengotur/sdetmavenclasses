package day46_TestNG_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//implement the Listners class
public class MyListener implements ITestListener {

	//it will execute once when start
	public void  onStart(ITestContext context) {
	System.out.println("Test Execution is started");
	}
	//it will execute on every test method
	public void  onTestStart(ITestResult result) {
	System.out.println("Test  started");
	}

	public void onTestSuccess(ITestResult result) {
	System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Test failed");
	}

	public void onTestSkipped(ITestResult result) {
	System.out.println("Test skipped");
	}

	public void onFinish(ITestContext context) {
	System.out.println("Test Execution is completed");
	}
}
