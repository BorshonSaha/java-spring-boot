package com.spring.learning_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learning_spring_framework.helloworld.HelloWorldConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.learning_spring_framework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}