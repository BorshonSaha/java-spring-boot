package com.spring.learning_spring_framework.game;

public class GameRunner {
	private SuperContraGame game;

	public GameRunner(SuperContraGame game) {
		super();
		this.game = game;
	}

	public void run() {
		System.out.println("Running game : " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
