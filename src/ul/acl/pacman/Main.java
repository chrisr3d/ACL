package ul.acl.pacman;

import java.io.IOException;

import ul.acl.pacman.controller.PacmanController;
import ul.acl.pacman.engine.GameEngineGraphical;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.PacmanGame;
import ul.acl.pacman.model.PacmanPainter;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;
import ul.acl.pacman.model.obstacle.Obstacle;

public class Main {


	
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PacmanGame game = new PacmanGame("helpFilePacman.txt");
		Maze maze = new Maze();
		new LevelManager(maze, new Hero(0,0));

		maze.obstacles.add(new Obstacle(100, 100));
		maze.obstacles.add(new Obstacle(525, 600));
		maze.obstacles.add(new Obstacle(430, 250));
		maze.obstacles.add(new Obstacle(900, 350));
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
