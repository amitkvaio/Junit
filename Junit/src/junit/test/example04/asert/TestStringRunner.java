package junit.test.example04.asert;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestStringRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestStringAssertions.class);
		List<Failure> failures = result.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}
}
