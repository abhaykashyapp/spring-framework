package com.project1.spring_framework;

import com.project1.spring_framework.game.GameRunner;
import com.project1.spring_framework.game.MarioGame;
import com.project1.spring_framework.game.PacmanGame;
import com.project1.spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {
public static void main(String[] args) {
//	var game = new MarioGame();
//	var game = new SuperContraGame();
	var game = new PacmanGame();

	var gameRunner = new GameRunner(game);
	gameRunner.run();
		
	
}
}
