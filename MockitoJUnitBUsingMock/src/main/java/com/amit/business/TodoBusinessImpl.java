package com.amit.business;

import java.util.ArrayList;
import java.util.List;

import com.amit.data.api.TodoService;

//TodoBusinessImpl SUT - System under test
//TodoService Dependency
public class TodoBusinessImpl {
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		//Mockito mocks are nice mock they return default
		//values when they are not stubbed.
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
