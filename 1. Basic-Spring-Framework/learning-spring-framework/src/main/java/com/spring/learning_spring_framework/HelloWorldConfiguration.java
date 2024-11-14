package com.spring.learning_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

// Address - firstLine and city
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Borshon";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var person = new Person("David", 20);
		return person;
	}
	
	@Bean
	public Address address() {
		var address = new Address("Bashundhara", "Dhaka");
		return address;
	}
	
}
