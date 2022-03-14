package com.amit.business.hamcrest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.amit.business.TodoBusinessImpl;
import com.amit.data.api.TodoService;

//MockitoJUnitRunner make sure that all the mock
//are created and auto wired as per the need

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockUsingAnnotationWithRule {

	@Mock
	TodoService todoServiceMock;
	//Equivalent to TodoService todoServiceMock = mock(TodoService.class);
	
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;
	//Equivalent to TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	
	@Captor
	ArgumentCaptor<String> captor;
	//Equivalent to ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
	
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
