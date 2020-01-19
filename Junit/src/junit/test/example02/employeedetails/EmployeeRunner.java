package junit.test.example02.employeedetails;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmployeeRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(EmployeeSuite.class);
		List<Failure> failures = result.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
		System.out.println("Failure Count : "+result.getFailureCount());
		System.out.println("Ignore Count :"+result.getFailureCount());
		System.out.println("Get Run time :"+result.getRunTime());
	}
}
