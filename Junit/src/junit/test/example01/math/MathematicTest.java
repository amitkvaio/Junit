package junit.test.example01.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MathematicTest {
	int a ;
	int b ;
	Mathematic math = new Mathematic();
	
	@Before
	public void setUp() {
		System.out.println("Math:"+math);
		a=20;
		b=10;
		System.out.println("setup");
	}
	
	@Test
	public void addTest() {
		int res = math.add(a, b);
		assertEquals(res, 30);
	}
	
	@Test
	public void multiplyTest() {
		int res = math.multiply(a, b);
		assertEquals(res, 200);
	}
	
	@Test
	public void divisionTest() {
		int res = Mathematic.division(a, b);
		assertEquals(res, 2);
	}
	
	@Test
	public void subtractTest() {
		int res = Mathematic.subtraction(a, b);
		assertEquals(res, 10);
	}
}
