package ul.acl.pacman.model;

import ul.acl.pacman.model.visitors.UpdateVisitor;
import java.awt.Image;

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

    public abstract void update(UpdateVisitor visitor);

    public boolean collideWith(Position p, int width, int height){
        return          (   p.x < position.x && p.x + width > position.x
                        || p.x >= position.x && p.x <= position.x + this.width)
                    &&  (   p.y < position.y && p.y + height > position.y
                        || p.y >= position.y && p.y <= position.y + this.height);
    }

    public abstract Image getImage();
}
