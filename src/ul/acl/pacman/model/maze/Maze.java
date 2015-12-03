package ul.acl.pacman.model.maze;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.visitors.Visitor;

/**
 * Describes the whole maze
 */
public class Maze extends GameObject{

	public Maze(int x, int y) {
		super(x, y);
	}

	public boolean canMove(Character charactere, Direction direction) {
		return true;
	}

	@Override
	public void draw() {

	}

	@Override
	public void accept(Visitor visitor){
		visitor.visit(this);
	}

}
