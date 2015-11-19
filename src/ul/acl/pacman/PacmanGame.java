package ul.acl.pacman;

import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.Hero;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.maze.Maze;

public class PacmanGame {

	/*
	   // creation du jeu particulier et de son afficheur
		PacmanGame game = new PacmanGame("helpFilePacman.txt");
		PacmanPainter painter = new PacmanPainter();
		PacmanController controller = new PacmanController();

		// classe qui lance le moteur de jeu generique
		GameEngineGraphical engine = new GameEngineGraphical(game, painter, controller);
		engine.run();
	 */
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LevelManager l = new LevelManager(new Maze(0,0));
		l.addCharacter(new Hero(0,0));
		while (true){
			l.update();
			l.draw();
		}

	}

}
