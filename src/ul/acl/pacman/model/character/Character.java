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

    public static int getVitesse() {
        return Character.vitesse;
    }

    public void move(Direction d) throws Exception {
        switch (d){
            case left:
                if(x + vitesse <= Integer.MIN_VALUE + vitesse)
                    throw new Exception("wtf");
                x -= vitesse;
                break;
            case right:
                if(x - vitesse >= Integer.MAX_VALUE - vitesse)
                    throw new Exception("wtf");
                x += vitesse;
                break;
            case up:
                if(y + vitesse <= Integer.MIN_VALUE + vitesse)
                    throw new Exception("wtf");
                y -= vitesse;
                break;
            case down:
                if(y - vitesse >= Integer.MAX_VALUE - vitesse)
                    throw new Exception("wtf");
                y += vitesse;
                break;
            default:
                throw new Exception("wtf");
        }
    }

}
