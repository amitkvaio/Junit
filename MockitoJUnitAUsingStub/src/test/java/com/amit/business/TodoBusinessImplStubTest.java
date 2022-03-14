package com.amit.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.amit.data.api.TodoService;
import com.amit.data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testUsingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("amit");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void testUsingAStub_checkingAfterAddition() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("amit");
		todos.add("Spring boot");
		assertEquals(3, todos.size());
	}
	
	@Test
	public void testUsingAStub_checkingSpringWord() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> listWithString = todoBusinessImpl.retrieveTodosRelatedToSpring("amit");
		assertTrue(listWithString.get(0).contains("Spring"));
	}
	
	@Test
	public void testUsingAStub_checkingSpringWord_withInvalidUser() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> listWithString = todoBusinessImpl.retrieveTodosRelatedToSpring("santosh");
		assertTrue(listWithString.contains("spring"));
	}
}
