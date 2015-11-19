package ul.acl.pacman;

import ul.acl.pacman.engine.GameEngineGraphical;
import ul.acl.pacman.model.Hero;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.PacmanController;
import ul.acl.pacman.model.PacmanGame;
import ul.acl.pacman.model.PacmanPainter;
import ul.acl.pacman.model.maze.Maze;

public class Main {

	/*
	   // creation du jeu particulier et de son afficheur

	 */
	
	
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		PacmanGame game = new PacmanGame("helpFilePacman.txt");
		PacmanPainter painter = new PacmanPainter();
		PacmanController controller = new PacmanController();

		// classe qui lance le moteur de jeu generique
		GameEngineGraphical engine = new GameEngineGraphical(game, painter, controller);
		engine.run();
		

	}

}
