package ul.acl.pacman.model;

/**
 * Created by baptiste on 11/11/15.
 */
public abstract class Playable extends Character {


    public Playable(int x,int y){
        super(x, y);
    }

    public void update(){
        try {
            move(Direction.left);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void draw(){
        System.out.println(x + " " + y);

    }


}
