package junit.test.example01.math;

public class Mathematic {

	public  int add(int a, int b) {
		return a + b;
	}

	public  int multiply(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		if (a > b)
			return a / b;
		return 0;
	}

	public static int subtraction(int a, int b) {
		if (a > b) {
			return a - b;
		} else {
			return b - a;
		}
	}
}
