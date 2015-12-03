package ul.acl.pacman.model.maze;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.Position;
import ul.acl.pacman.model.visitors.*;
/**
 * Describes the whole maze
 */
public class Maze extends GameObject{

	public Maze(int x, int y) {
		super(x, y);
	}

	public boolean canMove(Character character, Direction direction) {
		return ! isObstacle(character.processMove(d), character.width, character.height);
	}

	private boolean isObstacle(Position p ,int width,int height){
		return true;//TODO
	}

	@Override
	public void update(UpdateVisitor visitor){
		visitor.updateMaze(this);
	}

}
