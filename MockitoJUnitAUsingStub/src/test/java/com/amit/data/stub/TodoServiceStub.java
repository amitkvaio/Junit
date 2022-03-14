package com.amit.data.stub;

import java.util.Arrays;
import java.util.List;

import com.amit.data.api.TodoService;

public class TodoServiceStub implements TodoService {
	public List<String> retrieveTodos(String user) {
		if (getUserList().contains(user))
			return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		return Arrays.asList("");
	}

	public static List<String> getUserList() {
		return Arrays.asList("amit", "kumar", "ajit", "prajapati");
	}
}
