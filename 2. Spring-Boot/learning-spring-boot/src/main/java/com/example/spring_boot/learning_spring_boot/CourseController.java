package com.example.spring_boot.learning_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
			new Course(1, "Spring Boot", "Udemy"),
			new Course(2, "Microservices", "Udemy"),
			new Course(3, "Docker", "Udemy")
		); 
	}
}
