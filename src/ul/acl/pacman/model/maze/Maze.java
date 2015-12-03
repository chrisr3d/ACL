package ul.acl.pacman.model.maze;

import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;
import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.visitors.UpdateVisitor;
import ul.acl.pacman.model.character.*;

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

	public boolean endReached(Character character) {
		
		return true;
	}

	@Override
	public void update(UpdateVisitor visitor){
		visitor.updateMaze(this);
	}

}
