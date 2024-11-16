package com.spring.learning_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

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
		var person = new Person("David", 20, new Address("Nikunja", "Dhaka"));
		return person;
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address()); // by method call
	}
	
	@Bean
	public Person person3(String name, int age, Address address3) {
		return new Person(name, age, address3); // by parameters
	}
	
	@Bean(name = "address2")
	public Address address() {
		var address = new Address("Bashundhara", "Dhaka");
		return address;
	}
	
	@Bean(name = "address3")
	public Address address3() {
		var address = new Address("Gulshan", "Dhaka");
		return address;
	}
	
}
