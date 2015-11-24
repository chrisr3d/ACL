package ul.acl.pacman.model.character;

import ul.acl.pacman.controller.ControllerListener;
import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.visitors.UpdateVisitor;
import ul.acl.pacman.model.visitors.Visitor;

/**
 * Created by baptiste on 11/11/15.
 */
public class Hero extends Playable{

    public Hero(int x, int y){
        super(x, y);
		this.width = 10;
		this.height = 10;

    }

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public boolean collision(Direction direction) throws Exception{
		return super.collision(direction);
	}


}
