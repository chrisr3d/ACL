package ul.acl.pacman.model;

/**
 * Created by baptiste on 11/11/15.
 */
public class Hero extends Playable{

    public Hero(int x, int y){
        super(x, y);
    }

	@Override
	public void update(LevelManager levelManager) {
		levelManager.updateCharacter(this);
	}



}
