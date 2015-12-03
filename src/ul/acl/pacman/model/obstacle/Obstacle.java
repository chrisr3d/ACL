package ul.acl.pacman.model.obstacle;

import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.ImageFactory;
import ul.acl.pacman.model.visitors.UpdateVisitor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class Obstacle extends GameObject{

	public Obstacle(int x, int y) {
		super(x, y);
		this.width = 195;
		this.height = 195;
	}

	@Override
	public void update(UpdateVisitor visitor) {
		visitor.updateObstacle(this);
	}


		@Override
		public Image getImage(){
			return ImageFactory.getInstance().obstacle;
	}

}
