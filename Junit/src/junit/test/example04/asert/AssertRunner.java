package junit.test.example04.asert;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AssertExample.class);
		List<Failure> list = result.getFailures();
		for (Failure failure : list) {
			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
