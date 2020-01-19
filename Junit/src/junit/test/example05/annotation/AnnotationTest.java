package junit.test.example05.annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationTest{
	static int beforeClassCount=1;
	static int afterClassCount=1;
	static int beforeCount=1;
	static int afterCount=1;
	
	@Before
	public void setUp() {
		System.out.println("Execution count fo before method is :"+beforeCount++);
	}
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Execution count of beforeClass method is:"+beforeClassCount++);
	}
	
	@Test
	public void test1() {
		System.out.println("\t Test anotation from test1 method");
	}
	
	@Test
	public void test2() {
		System.out.println("\t Test anotation from test2 method");
	}
	
	@Test
	public void test3() {
		System.out.println("\t Test anotation from test3 method");
	}
	
	@Test
	public void test4() {
		System.out.println("\t Test anotation from test4 method");
	}
	
	@Test
	public void test5() {
		System.out.println("\t Test anotation from test5 method");
	}
	
	@After
	public void tearDown() {
		System.out.println("Execution count of After method is :"+afterCount++);
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Execution count of after class method is:"+afterClassCount++);
	}
}
