package com.amit.business.bdd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListInterfaceBDDMockTest {

	//Testing with one return value
	@Test
	public void testMockListSizeMethod_Case1() {
		//Given
		List listMock = mock(List.class);
		
		//when
		given(listMock.size()).willReturn(2);
		
		//then
		assertThat(listMock.size(),is(2));
		//We can call any number of times it will return list size as 2
		assertThat(listMock.size(),is(2));
		assertThat(listMock.size(),is(2));
		assertThat(listMock.size(),is(2));
	}
	
	//Testing with multiple return value
	@Test
	public void testMockListSizeMethod_ReturnMultipleValues() {
		List listMock = mock(List.class);
		given(listMock.size()).willReturn(2).willReturn(3).willReturn(4);
		assertThat(listMock.size(),is(2));
		//In Which order we are returning the values in the same order it will get it
		assertThat(listMock.size(),is(3));
		assertThat(listMock.size(),is(4));
	}
	
	//Testing with default value
	@Test
	public void testMockListGetMethod_defaultNull() {
		List listMock = mock(List.class);
		//Nice Mock
		assertThat(listMock.get(0),equalTo(null));
		assertThat(listMock.get(1),equalTo(null));
		assertThat(listMock.get(1),is(equalTo(null)));
	}
	
	//Testing with specified return value
	@Test
	public void testMockListGetMethod() {
		List listMock = mock(List.class);
		given(listMock.get(0)).willReturn("getMethod");
		assertThat("getMethod", is(listMock.get(0)));
	}
	
	//Testing with specified and null return value
	@Test
	public void testMockListGetMethod_retunNull() {
		List listMock = mock(List.class);
		given(listMock.get(0)).willReturn("getMethod");
		assertThat("getMethod", is(listMock.get(0)));
		assertThat(listMock.get(1),equalTo(null));
	}
	
	//Testing fixed return values for every index for list
	@Test
	public void testMockListGetMethod_anyInt() {
		List listMock = mock(List.class);
		given(listMock.get(anyInt())).willReturn("getMethod");
		assertThat("getMethod", is(listMock.get(0)));
		assertThat("getMethod", is(listMock.get(1)));
		assertThat("getMethod", is(listMock.get(2)));
		assertThat("getMethod", is(listMock.get(3)));
	}
	
	//Testing with RuntimeException
	@Test(expected = RuntimeException.class)
	public void testMockListGetMethod_throwAnException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong!!"));
		assertThat("getMethod", is(listMock.get(0)));
	}
	
	/*
	Given : Initial setup
	when : actual method call
	then : assert statemetn
	*/
}
