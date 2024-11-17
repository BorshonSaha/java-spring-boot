package com.spring.learning_spring_framework.game;

public class PacManGame implements GamingConsole {
	public void up() {
		System.out.println("Pacman Jump");
	}
	
	public void down() {
		System.out.println("Pacman Go into a hole");
	}
	
	public void left() {
		System.out.println("Pacman Go back");
	}
	
	public void right() {
		System.out.println("Pacman Accelerate");
	}
}
