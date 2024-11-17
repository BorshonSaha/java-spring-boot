package com.spring.learning_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learning_spring_framework.helloworld.HelloWorldConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

//	@Autowired - for field based dependency injection
	Dependency1 dependency1;
//	@Autowired - for field based dependency injection
	Dependency2 dependency2;
	
//	Constructor based dependency injection
	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor based dependency injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
//  Setter based dependency injection
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter injection - dependency1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter injection - dependency2");
//		this.dependency2 = dependency2;
//	}

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class BusinessCalculationService {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(bean -> System.out.println(bean));

			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}

}