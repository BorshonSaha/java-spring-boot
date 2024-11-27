package com.springboot.jpa_and_hibernate.course.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			insert into course(id, name, author)
			values(1, 'Learn AWS', 'Mark');

			""";
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
