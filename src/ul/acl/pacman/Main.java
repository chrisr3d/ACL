package ul.acl.pacman;

import ul.acl.pacman.controller.PacmanController;
import ul.acl.pacman.engine.GameEngineGraphical;
import ul.acl.pacman.model.PacmanGame;
import ul.acl.pacman.model.PacmanPainter;

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
