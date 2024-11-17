package com.spring.learning_spring_framework;

import com.spring.learning_spring_framework.game.GameRunner;
import com.spring.learning_spring_framework.game.MarioGame;
import com.spring.learning_spring_framework.game.PacManGame;
import com.spring.learning_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
