package ul.acl.pacman.model.maze;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.PacmanPainter;
import ul.acl.pacman.model.Position;
import ul.acl.pacman.model.visitors.*;
import ul.acl.pacman.model.character.Character;


/**
 * Describes the whole maze
 */
public class Maze extends GameObject{

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
		catch (Exception e){5

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

	@Override
	public void update(UpdateVisitor visitor){
		visitor.updateMaze(this);
	}

}
