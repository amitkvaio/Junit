package com.amit.business.bdd;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.amit.business.TodoBusinessImpl;
import com.amit.data.api.TodoService;

public class TodoBusinessImplMockBDDTest {

	// BDD methods are very similar to mockito methods.
	// it having Given, when, then
	@Test
	public void usingMockito() {
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
}
