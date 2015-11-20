package ul.acl.pacman.model.character;

import ul.acl.pacman.controller.ControllerListener;
import ul.acl.pacman.model.LevelManager;

/**
 * Created by baptiste on 11/11/15.
 */
public class Hero extends Playable{

    public Hero(int x, int y){
        super(x, y);

    }

	@Override
	public void update(LevelManager levelManager) {
		levelManager.updateHero(this);
	}




}
