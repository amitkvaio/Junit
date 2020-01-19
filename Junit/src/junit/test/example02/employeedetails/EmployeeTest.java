package junit.test.example02.employeedetails;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	EmployeeDetails e1,e2;
	EmployeeBusinessLogic empLogic;
	@Before
	public void setUp() {
		empLogic = new EmployeeBusinessLogic();
		e1 = new EmployeeDetails("Amit", 6000, 29);
		e2 = new EmployeeDetails("Anil", 15000, 28);
	}
	
	@Test
	public void testYearlySalary() {
		int yearlySal = empLogic.calculateYearlySalary(e1);
		assertEquals(72000, yearlySal);
	}
	
	@Test
	public void testAppraisal() {
		int yearlySal = empLogic.calculateAppraisal(e2);
		assertEquals(1000, yearlySal);
	}
}
