package ul.acl.pacman.model.obstacle;

import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.visitors.Visitor;

public class Obstacle extends GameObject{

	public Obstacle(int x, int y) {
		super(x, y);
		this.width = 50;
		this.height = 50;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void draw() {
		
	}

}
