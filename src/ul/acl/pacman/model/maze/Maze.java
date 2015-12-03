package ul.acl.pacman.model.maze;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.PacmanPainter;
import ul.acl.pacman.model.Position;
import ul.acl.pacman.model.*;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.visitors.UpdateVisitor;
import ul.acl.pacman.model.obstacle.Obstacle;

import java.util.ArrayList;



/**
 * Describes the whole maze
 */

public class Maze extends GameObject{


	public List<Obstacle> obstacles;

	public Maze(int x, int y) {
		super(x, y);
		width = PacmanPainter.WIDTH;
		height = PacmanPainter.HEIGHT;
		obstacles = new ArrayList<>();
		obstacles.add(new Obstacle(100, 100));
		obstacles.add(new Obstacle(525, 600));
		obstacles.add(new Obstacle(430, 250));
		obstacles.add(new Obstacle(900, 350));
	}

	public boolean canMove(Character character, Direction direction) {
		try {
			System.out.println(character.position.x + " " + character.position.y);
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
		for(Obstacle o : obstacles){
			if (o.collideWith(p, width, height)){
				return true;
			}
		}
		return false;
	}

	public boolean endReached(Character character) {
		WayOut wayOut = LevelManager.getInstance().wayOut;

		return wayOut.position.x <= character.position.x &&
				wayOut.position.x + wayOut.width >= character.position.y + character.width &&
				wayOut.position.y <= character.position.y &&
				wayOut.position.x + wayOut.width >= character.position.y + character.width;
	}

	@Override
	public void update(UpdateVisitor visitor){
		visitor.updateMaze(this);
	}

	@Override
	public Image getImage(){
		return null;
	}
}
