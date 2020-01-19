package junit.test.example04.asert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestStringAssertions {

	String str1, str2, str3, str4, str5;
	int var1, var2;
	String[] expectedArr = { "one", "two", "three" };
	String[] resultArr = { "one", "two", "three" };

	@Before
	public void setUp() {
		str1 = new String("abc");
		str2 = new String("abc");
		str3 = null;
		str4 = "abc";
		str5 = "abc";

		var1 = 5;
		var2 = 6;
	}
	
	@Test
	public void testAssertion() {
		//check that tow object are equal
		assertEquals(str1, str2);
		
		//check that a given condition is true
		assertTrue(var1 < var2);
		
		//check that a given condition is false
		assertFalse(var1 > var2);
		
		//check that given object is null
		assertNull(str3);
		
		//check that given string/object is not null
		assertNotNull(str1);
		
		//check if the two object reference pointing to the same object
		assertSame(str4, str5);
		
		//check if the two object reference not pointing to the same object
		assertNotSame(str1, str4);
		
		//check whether tow arrays are equal to each other
		assertArrayEquals(expectedArr, resultArr);
		 
	}
}
