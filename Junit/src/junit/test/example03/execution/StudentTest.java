package junit.test.example03.execution;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	Student s0,s1,s2,s3,s4;
	
	@Before
	public void setUp(){
		System.out.println("-----------------------------");
		System.out.println("In Before method");
		s0= new Student(0, "ABC", 34);
		s1= new Student(1, "Amit", 35);
		s2= new Student(2, "Ajit", 50);
		s3= new Student(3, "karan", 60);
		s4= new Student(4, "Raja", 70);
	}
	
	@Test
	public void testFail() {
		System.out.println("In testFail test method");
		s0.cal_Grade();
		assertEquals("Fail", s0.grade);
		s0.Display();
	}
	
	@Test
	public void testPass() {
		System.out.println("In testPass test method");
		s1.cal_Grade();
		assertEquals("Pass Class", s1.grade);
		s1.Display();
	}
	
	@Test
	public void testSecond() {
		System.out.println("In testSecond test method");
		s2.cal_Grade();
		assertEquals("Second Class", s2.grade);
		s2.Display();
	}
	
	@Test
	public void testFirst() {
		System.out.println("In testFirst test method");
		s3.cal_Grade();
		assertEquals("First Class", s3.grade);
		s3.Display();
	}
	
	@Test
	public void testDistinction() {
		System.out.println("In testDistinction test method");
		s4.cal_Grade();
		assertEquals("Distinction", s4.grade);
		s4.Display();
	}
}
