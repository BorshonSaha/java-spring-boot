package com.spring.learning_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//		1: Launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
//		2: Configure that things that we want Spring to manage
//		HelloWorldConfiguration class - @Configaration
//		name method - @Bean
		
//		3: Retrieving beans managed by beans
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
	}

}
