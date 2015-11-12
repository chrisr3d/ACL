package ul.acl.pacman.model;

import ul.acl.pacman.model.maze.Maze;

public class LevelManager {
	
	protected Hero hero;
	
	protected Maze maze;
	
	public LevelManager () {
		this.hero = new Hero(10, 10);
	}
	
	public void updateCharacter(Hero h) {
		h.update();
	}
}
