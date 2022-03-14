package com.amit.business.hamcrest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.amit.business.TodoBusinessImpl;
import com.amit.data.api.TodoService;


public class TodoBusinessImplMockUsingAnnotation {
	@Rule
	public MockitoRule mockitorule = MockitoJUnit.rule();  
	
	@Mock
	TodoService todoServiceMock;
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;
	
	@Captor
	ArgumentCaptor<String> captor;
	
	@Test
	public void usingMockitoBDD() {
		// Given
		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("amit")).willReturn(allTodos);
		// when
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("amit");
		// then
		assertThat(todos.size(), is(2));
	}
	
	@Test
	public void testDeleteStringNotRelatedToSpring_UsingBDD_CaptureArguments() {
		// Given
		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("amit")).willReturn(allTodos);
		
		// when
		todoBusinessImpl.deletedosWhichareNotRelatedToSpring("amit");
		// then
		//Not related to spring
		then(todoServiceMock).should().deleteTodo(captor.capture());
		assertThat(captor.getValue(), is("Learn to Dance"));
	}
	
	@Test
	public void testDeleteStringNotRelatedToSpring_UsingBDD_CaptureMultipleArguments() {
		// Given
		List<String> allTodos = Arrays.asList("Learn Java","Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("amit")).willReturn(allTodos);
		// when
		todoBusinessImpl.deletedosWhichareNotRelatedToSpring("amit");
		// then
		//Not related to spring
		then(todoServiceMock).should(times(2)).deleteTodo(captor.capture());
		assertThat(captor.getAllValues().size(), is(2));
	}
}


/*
==> We have used the JUnit runner (MockitoJUnitRunner). 
	It makes the test dependent on that particular runner.

==> We cannot use multiple runners in the same test. 
	To overcome this problem.
	 	We should follow JUnit rules that makes the test more flexible. 
	 		It allows us to use multiple rules in the same test.
*/