package com.task.dynamic_column.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dynamic_column.entity.Test;
import com.task.dynamic_column.repository.TestRepository;

@Service
public class TestService {
	@Autowired
	private TestRepository repository;
	
	public Test addData(String title) {
		Test t = new Test();
		t.setTitle(title);
		return repository.save(t);
	}
}
