package ul.acl.pacman;

import java.io.IOException;

import ul.acl.pacman.controller.PacmanController;
import ul.acl.pacman.engine.GameEngineGraphical;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.PacmanGame;
import ul.acl.pacman.model.PacmanPainter;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;

public class Main {

	/*
	   // creation du jeu particulier et de son afficheur
<<<<<<< HEAD

=======
		PacmanGame game = new PacmanGame("helpFilePacman.txt");
		PacmanPainter painter = new PacmanPainter();
		PacmanController controller = new PacmanController();

		// classe qui lance le moteur de jeu generique
		GameEngineGraphical engine = new GameEngineGraphical(game, painter, controller);
		engine.run();
>>>>>>> 73313df8476b1f75e57e6bba7d1dd32b843d3f71
	 */
	
	
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PacmanGame game = new PacmanGame("helpFilePacman.txt");

		new LevelManager(new Maze(0,0), new Hero(0,0));
		PacmanPainter painter=null;
		try {
			painter = new PacmanPainter();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		PacmanController controller = new PacmanController();

		// classe qui lance le moteur de jeu generique
		GameEngineGraphical engine = new GameEngineGraphical(game, painter, controller);

		engine.run();
	

	}

}
