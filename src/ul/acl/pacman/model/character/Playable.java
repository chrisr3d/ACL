package ul.acl.pacman.model.character;

/**
 * Created by baptiste on 11/11/15.
 */
public abstract class Playable extends Character {


    public Playable(int x,int y){
        super(x, y);
    }

    @Override
    public void draw(){
        System.out.println(this.position.x + " " + this.position.y);
    }


}
