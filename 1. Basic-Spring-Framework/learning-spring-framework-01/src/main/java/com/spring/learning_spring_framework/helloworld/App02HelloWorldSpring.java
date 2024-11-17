package com.spring.learning_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//		1: Launch a spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
//			2: Configure that things that we want Spring to manage
//			HelloWorldConfiguration class - @Configaration
//			name method - @Bean

//			3: Retrieving beans managed by beans
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(name -> System.out.println(name));
			// .forEach(System.out::println);

			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			// No qualifying bean of type 'com.spring.learning_spring_framework.Person'
			// available: expected single matching bean but found 4:
			// person,person2,person3,person4
		}
	}

}
