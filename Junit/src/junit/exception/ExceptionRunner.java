package junit.exception;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExceptionRunner {
	public static void main(String[] args) {
		Result result  = JUnitCore.runClasses(Exception.class);
		List<Failure> list = result.getFailures();
		for (Failure failure : list) {
			System.out.println(failure.getTrace());
		}
		System.out.println(result.wasSuccessful());
	}
}
