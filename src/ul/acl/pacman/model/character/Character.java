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

    public Position processMove(Direction direction) throws Exception {
        Position p = new Position(position);

        switch (direction){
            case left:
                if(this.position.x + vitesse <= Integer.MIN_VALUE + vitesse)
                    throw new Exception("wtf");
                p.x -= vitesse;
                break;
            case right:
                if(this.position.x - vitesse >= Integer.MAX_VALUE - vitesse)
                    throw new Exception("wtf");
                p.x += vitesse;
                break;
            case up:
                if(this.position.y + vitesse <= Integer.MIN_VALUE + vitesse)
                    throw new Exception("wtf");
                p.y -= vitesse;
                break;
            case down:
                if(this.position.y - vitesse >= Integer.MAX_VALUE - vitesse)
                    throw new Exception("wtf");
                p.y += vitesse;
                break;
            default:
                throw new Exception("wtf");
        }
        return p;
    }

    public void move(Direction direction) throws Exception {
        this.position = processMove(direction);
    }

}
