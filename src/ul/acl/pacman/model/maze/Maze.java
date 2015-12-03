package ul.acl.pacman.model.maze;

import java.util.ArrayList;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.obstacle.Obstacle;
import ul.acl.pacman.model.visitors.Visitor;

/**
 * Describes the whole maze
 */

public class Maze extends GameObject{
	protected ArrayList<Obstacle> obstacles;

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
