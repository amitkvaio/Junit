package junit.test.example04.asert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AssertExample {
	int num;
	String temp,str;
	
	@Before
	public void setUp() {
		num=5;
		temp=null;
		str="Junit is working fine";
		System.out.println("From before method of AssertExample!!");
	} 
	
	@Test 
   public void testAdd() {
 
      System.out.println("From testAdd() method of AssertExample!!");
		//check for equality 
      assertEquals("Junit is working fine", str); 
       
      //check for false condition 
      assertFalse(num > 6); 
 
      //check for not null value | Here temp is pointing to null so this test case is getting failed
      assertNotNull(str); 
      
      // check for null value
      assertNull(temp);
      
      // check for true condition
      assertTrue(num == 5);
            
   } 
}
