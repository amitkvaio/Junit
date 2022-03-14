package com.amit.powermock;

public class Utility {
	static int staticMethod(long value) {
		// Some complex logic is done here...
		throw new RuntimeException("I dont want to be executed. I will anyway be mocked out.");
	}

	public static String staticMethod(String call) {
		return call;
	}
}