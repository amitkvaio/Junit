package com.amit.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
import java.util.List;

import org.junit.Test;

public class ListInterfaceMockTest {

	//Testing with one return value
	@Test
	public void testMockListSizeMethod_Case1() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
		//We can call any number of times it will return list size as 2
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	//Testing with multiple return value
	@Test
	public void testMockListSizeMethod_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);
		assertEquals(2, listMock.size());
		//In Which order we are returning the values in the same order it will get it
		assertEquals(3, listMock.size());
		assertEquals(4, listMock.size());
	}
	
	//Testing with default value
	@Test
	public void testMockListGetMethod_defaultNull() {
		List listMock = mock(List.class);
		//Nice Mock
		assertEquals(null, listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	//Testing with specified return value
	@Test
	public void testMockListGetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("getMethod");
		assertEquals("getMethod", listMock.get(0));
	}
	
	//Testing with specified and null return value
	@Test
	public void testMockListGetMethod_retunNull() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("getMethod");
		assertEquals("getMethod", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	//Testing fixed return values for every index for list
	@Test
	public void testMockListGetMethod_anyInt() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("getMethod");
		assertEquals("getMethod", listMock.get(0));
		assertEquals("getMethod", listMock.get(1));
		assertEquals("getMethod", listMock.get(2));
		assertEquals("getMethod", listMock.get(3));
	}
	
	//Testing with RuntimeException
	@Test(expected = RuntimeException.class)
	public void testMockListGetMethod_throwAnException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong!!"));
		assertEquals("getMethod", listMock.get(0));
	}
	
	/*
	Given : Initial setup
	when : actual method call
	then : assert statemetn
	*/
}
