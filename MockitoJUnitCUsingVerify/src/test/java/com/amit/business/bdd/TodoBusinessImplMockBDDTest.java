package com.amit.business.bdd;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.amit.business.TodoBusinessImpl;
import com.amit.data.api.TodoService;

public class TodoBusinessImplMockBDDTest {

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
	public void testDeleteStringNotRelatedToSpring_UsingBDD() {
		// Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("amit")).willReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		// when
		todoBusinessImpl.deletedosWhichareNotRelatedToSpring("amit");
		// then
		//Not related to spring
		verify(todoServiceMock).deleteTodo("Learn to Dance");
		verify(todoServiceMock,times(1)).deleteTodo("Learn to Dance");
		//Gives error
		//verify(todoServiceMock,times(2)).deleteTodo("Learn to Dance");
		verify(todoServiceMock,atLeastOnce()).deleteTodo("Learn to Dance");
		
		//Gives error
		//verify(todoServiceMock,atLeast(5)).deleteTodo("Learn to Dance");
		verify(todoServiceMock,never()).deleteTodo("Learn Spring");
		verify(todoServiceMock,never()).deleteTodo("Learn Spring MVC");
		
	}
}
