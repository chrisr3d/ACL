package ul.acl.pacman.model.maze;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;

/**
 * Describes the whole maze
 * it contains everything inside the maze (player, enemies, walls etc)
 */
public class Maze extends GameObject{

	public Maze(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public boolean canMove(Character charactere, Direction direction) {
		return true;
	}
	
	@Override
	public void update() {
	}

	@Override
	public void draw() {
		
	}
}
