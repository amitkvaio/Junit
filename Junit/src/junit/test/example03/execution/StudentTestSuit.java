package junit.test.example03.execution;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({  
	StudentTest.class 
	}) 
	 
public class StudentTestSuit {

}

//A test suite is a bundle of few unite test cases which are used to run them together.
