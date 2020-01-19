//Example of Exception Test.
package junit.exception;

import org.junit.Before;
import org.junit.Test;

public class Exception {
	int a, b, c;

	@Before
	public void setU() {
		a = 10;
		b = 0;
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void test() {
		c = a / b;
		System.out.println("Division : " + c);
	}

	/*@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void test1() {
		c = a / b;
		System.out.println("Division : " + c);
	}*/
}
