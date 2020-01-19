package junit.test.example03.execution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class StudentTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(StudentTestSuit.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
// Test Runner is used for executing the test cases.