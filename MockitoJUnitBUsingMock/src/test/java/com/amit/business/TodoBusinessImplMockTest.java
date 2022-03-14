package com.amit.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.amit.data.api.TodoService;

public class TodoBusinessImplMockTest {

	

	@Test
	public void usingMockito() {
		// This is called mocking a dependency
		TodoService todoServiceMock = mock(TodoService.class);

		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		/*
		When retrieveTodos is called on todoServiceMock returns default values.
		i.e retrieveTodos method suppose to return List<String> but it will return [] empty list.
		and we want list of values like allToDos.
		So need to add thenReturn then it will return the same list.
		We called specific retrieveTodos method to return specific value.
		We have called retrieveTodos by passing "amit" and its return allTodos back 
		*/
		
		
		when(todoServiceMock.retrieveTodos("amit")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("amit");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void usingMockito_WithEmptyArrayList() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> allTodos = Arrays.asList();
		when(todoServiceMock.retrieveTodos("amit")).thenReturn(allTodos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("amit");
		assertEquals(0, todos.size());
	}
}
/*
What is mocking?
Mocking is creating objects that simulate the behaviour of real objects.
unlike stubs, mocks can be dynamically created form the code at the runtime.
Mocks offer more functionality than stubbing.
we can verify methods calls and a lots of other things.
mock is method defined in Mockito class
we can mock a class or a interface.
*/

