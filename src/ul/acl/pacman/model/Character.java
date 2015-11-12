package ul.acl.pacman.model;

import ul.acl.pacman.model.*;

/**
 * Created by baptiste on 11/11/15.
 */
public abstract class Character extends GameObject {

    public Character(int x, int y){
        super(x,y);
        
    }

    public void move(Direction d) throws Exception {
        switch (d){
            case left:
                x -= 1;
                break;
            case right:
                x +=1;
                break;
            case up:
                y -= 1;
                break;
            case down:
                y += 1;
                break;
            default:
                throw new Exception("wtf");
        }
    }

}
