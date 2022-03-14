package com.amit.business.bdd;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.amit.business.TodoBusinessImpl;
import com.amit.data.api.TodoService;

public class TodoBusinessImplMockBDDTestt_Arguments {

	// BDD methods are very similar to mockito methods.
	// it having Given, when, then
	@Test
	public void usingMockitoBDD() {
		// Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("amit")).willReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		// when
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("amit");
		
		// then
		assertThat(todos.size(), is(2));
	}
	
	@Test
	public void testDeleteStringNotRelatedToSpring_UsingBDD_CaptureArguments() {
		//Declare Argument captor
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		//Define Argument captor on specific method call
		//Capture the argument.
		
		
		// Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("amit")).willReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		// when
		todoBusinessImpl.deletedosWhichareNotRelatedToSpring("amit");
		// then
		//Not related to spring
		then(todoServiceMock).should().deleteTodo(captor.capture());
		assertThat(captor.getValue(), is("Learn to Dance"));
		
	}
	
	@Test
	public void testDeleteStringNotRelatedToSpring_UsingBDD_CaptureMultipleArguments() {
		//Declare Argument captor
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		//Define Argument captor on specific method call
		//Capture the argument.
		
		// Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Java","Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("amit")).willReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		// when
		todoBusinessImpl.deletedosWhichareNotRelatedToSpring("amit");
		// then
		//Not related to spring
		then(todoServiceMock).should(times(2)).deleteTodo(captor.capture());
		assertThat(captor.getAllValues().size(), is(2));
	}
}
