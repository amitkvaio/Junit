package junit.test.example01.math;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MathematicRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathematicSuite.class);
		List<Failure> failures = result.getFailures();
		for (Failure failure : failures) {
			System.out.println("getMessage:"+failure.getMessage());
			System.out.println("getTestHeader:"+failure.getTestHeader());
			System.out.println("getDescription:"+failure.getDescription());
			System.out.println("getException:"+failure.getException());
			System.out.println("-----------");
			System.out.println(failure.toString());
			System.out.println("getTrace:"+failure.getTrace());
		 
		}
		System.out.println(result.wasSuccessful());
	}
}
