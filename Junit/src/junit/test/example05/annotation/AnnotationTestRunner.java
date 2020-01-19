package junit.test.example05.annotation;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AnnotationTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AnnotationTest.class);
		List<Failure>  failures = result.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}
}
