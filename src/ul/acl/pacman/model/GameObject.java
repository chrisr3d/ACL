package ul.acl.pacman.model;

/**
 * Created by baptiste on 11/11/15.
 */
public abstract class GameObject {


    public int x, y;

    public GameObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    abstract public void update();

    abstract public void draw();

}
