package ul.acl.pacman.model.maze;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.visitors.UpdateVisitor;
import ul.acl.pacman.model.PacmanPainter;
import ul.acl.pacman.model.Position;
import ul.acl.pacman.model.obstacle.Obstacle;

import java.util.ArrayList;



/**
 * Describes the whole maze
 */

public class Maze extends GameObject{
	protected ArrayList<Obstacle> obstacles;

	public Maze(int x, int y) {
		super(x, y);
		width = PacmanPainter.WIDTH;
		height = PacmanPainter.HEIGHT;
	}

	public boolean canMove(Character character, Direction direction) {
		try {
			Position p = character.processMove(direction);
			return !isObstacle(p, character.width, character.height) && ! isOutOfBound(p, character.width, character.height);
		}
		catch (Exception e){
			return false;
		}

	}

	private boolean isOutOfBound(Position p, int width, int height){
		return 		p.x < 0
				|| p.x + width > this.width
				|| p.y < 0
				|| p.y + height > this.height;
	}
	private boolean isObstacle(Position p ,int width,int height){
		return false;//TODO
	}

	public boolean endReached(Character character) {
		
		return true;
	}

	@Override
	public void update(UpdateVisitor visitor){
		visitor.updateMaze(this);
	}

}
