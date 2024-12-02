package com.task.dynamic_column.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.task.dynamic_column.entity.Test;
import com.task.dynamic_column.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService service;
	
	@MutationMapping
	public Test addData(@Argument String title) {
		return service.addData(title);
	}
}
