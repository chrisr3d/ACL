package ul.acl.pacman.model;

import ul.acl.pacman.model.visitors.Visitor;

/**
 * Created by baptiste on 11/11/15.
 */
public abstract class GameObject {


    public Position position;

    public int height;
    public int width;

    public GameObject(int x, int y){
        position = new Position(x, y);
    }

    public abstract void accept(Visitor visitor);

    abstract public void draw();


}
