package junit.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Test1.class,Test2.class})

public class TestSuiteClass {
	public void test() {
		
	}
}

/*
We can directly run it or we can also run with the help of testRunner class.

*/