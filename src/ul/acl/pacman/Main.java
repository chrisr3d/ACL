package ul.acl.pacman;

import ul.acl.pacman.controller.PacmanController;
import ul.acl.pacman.engine.Game;
import ul.acl.pacman.engine.GameEngineGraphical;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.PacmanGame;
import ul.acl.pacman.model.PacmanPainter;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;

public class Main {

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
		
		// creation du jeu particulier et de son afficheur
		Game game = new PacmanGame("helpFilePacman.txt");
		PacmanPainter painter = new PacmanPainter();
		PacmanController controller = new PacmanController();

		// classe qui lance le moteur de jeu generique
		GameEngineGraphical engine = new GameEngineGraphical(game, painter, controller);
		try {
			engine.run();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		LevelManager l = new LevelManager(new Maze(0,0));
		l.addCharacter(new Hero(0,0));
		while (true){
			l.update();
			l.draw();
		}
		*/

	}

}
