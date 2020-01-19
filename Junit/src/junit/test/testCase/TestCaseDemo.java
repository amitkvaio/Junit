package junit.test.testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseDemo extends TestCase {
	protected double fValue1;
	protected double fValue2;

	@Override
	@Before
	public void setUp() {
		System.out.println("Sets up the fixture, for example, open a network connection.");
	}

	@Test
	public void testAdd() {
		// count the number of test cases
		System.out.println("No of Test Case = " + this.countTestCases());

		// test getName
		String name = this.getName();
		System.out.println("Test Case Name = " + name);

		// test setName
		this.setName("testNewAdd");
		String newName = this.getName();
		System.out.println("Updated Test Case Name = " + newName);
	}

	// tearDown used to close the connection or clean up activities
	@Override
	@After
	public void tearDown() {
		System.out.println("Tears down the fixture, for example, close a network connection.");
	}
}
