package com.spring.learning_spring_framework;

import com.spring.learning_spring_framework.game.GameRunner;
import com.spring.learning_spring_framework.game.MarioGame;
import com.spring.learning_spring_framework.game.PacMan;
import com.spring.learning_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacMan();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
