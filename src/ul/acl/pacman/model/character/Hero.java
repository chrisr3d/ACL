package ul.acl.pacman.model.character;

import java.awt.Image;

import ul.acl.pacman.model.ImageFactory;
import ul.acl.pacman.model.visitors.UpdateVisitor;

/**
 * Created by baptiste on 11/11/15.
 */
public class Hero extends Playable{

    public Hero(int x, int y){
        super(x, y);
		this.width = 20;
		this.height = 25;

    }

	public void update(UpdateVisitor visitor) {
		visitor.updateHero(this);
	}

	@Override
	public Image getImage(){
		return ImageFactory.getInstance().hero;
	}

	@Override
	public boolean isHero() {return true;}

}
