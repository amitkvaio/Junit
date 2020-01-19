package junit.test.example06.parameter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeCheckTest {
	
	private PrimeCheck primeCheck;
	private Integer inputNumber;
	private Boolean expectedResult;
	
	
	@Before
	public void initialize() {
		primeCheck = new PrimeCheck();
	}
	
	public PrimeCheckTest(Integer input, Boolean expected) {
		this.inputNumber=input;
		this.expectedResult = expected;
	}
	
	//Each parameter should be placed as an argument here
	//Every time runner triggers, it will pass the arguments
	//from parameters we defined in primeNumbers() method
	
	@Parameters
	public static Collection primeNumber() {
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{29,true},
		});
	}
	
	//This test will run 5 times since we have 6 parameter defined.
	@Test
	public void testPrimerNumberChecker() {
		System.out.println("Parameterized Number is : "+inputNumber);
		Boolean actual = primeCheck.primeNumberCheck(inputNumber);
		assertEquals(expectedResult,actual );
	}
}
