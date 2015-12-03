package ul.acl.pacman.model.character;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.visitors.UpdateVisitor;

/**
 * Created by baptiste on 11/11/15.
 */
public class Hero extends Playable{

    public Hero(int x, int y){
        super(x, y);
		this.width = 25;
		this.height = 25;

    }

	public void update(UpdateVisitor visitor) {
		visitor.updateHero(this);
	}



}
