package junit.test.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerDemo {
	public static void main(String[] args) {
		//Result result = JUnitCore.runClasses(Test1.class,Test2.class);
		//or
		Result result = JUnitCore.runClasses(TestSuiteClass.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
// Test Runner is used for executing the test cases.