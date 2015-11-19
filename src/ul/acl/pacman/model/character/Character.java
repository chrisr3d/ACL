package ul.acl.pacman.model.character;

import ul.acl.pacman.model.*;

/**
 * Created by baptiste on 11/11/15.
 */
public abstract class Character extends GameObject {
	
	protected static int vitesse = 10;

    public Character(int x, int y){
        super(x,y);
        
    }

    public void move(Direction d) throws Exception {
        switch (d){
            case left:
                x -= vitesse;
                break;
            case right:
                x += vitesse;
                break;
            case up:
                y -= vitesse;
                break;
            case down:
                y += vitesse;
                break;
            default:
                throw new Exception("wtf");
        }
    }

}
