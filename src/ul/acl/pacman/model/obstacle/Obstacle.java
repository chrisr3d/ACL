package ul.acl.pacman.model.obstacle;

import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.visitors.UpdateVisitor;

public class Obstacle extends GameObject{

	public Obstacle(int x, int y) {
		super(x, y);
		this.width = 50;
		this.height = 50;
	}

	@Override
	public void update(UpdateVisitor visitor) {
		visitor.updateObstacle(this);
	}



}
