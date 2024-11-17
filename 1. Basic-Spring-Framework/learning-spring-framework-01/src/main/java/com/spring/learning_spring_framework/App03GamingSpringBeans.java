package com.spring.learning_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learning_spring_framework.game.GameRunner;
import com.spring.learning_spring_framework.game.GamingConsole;
import com.spring.learning_spring_framework.game.MarioGame;
import com.spring.learning_spring_framework.game.PacManGame;
import com.spring.learning_spring_framework.game.SuperContraGame;
import com.spring.learning_spring_framework.helloworld.HelloWorldConfiguration;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
