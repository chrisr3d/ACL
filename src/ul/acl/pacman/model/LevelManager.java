package ul.acl.pacman.model;

import ul.acl.pacman.model.maze.Maze;

public class LevelManager {
	
	protected Character character;
	
	protected Maze maze;
	
	public LevelManager () {
		this.character = new Character();
	}
	
	public void updateCharacter(Character c) {
		c.update(maze);
	}
}
