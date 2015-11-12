package ul.acl.pacman;

import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.Hero;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.maze.Maze;

public class PacmanGame {

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
