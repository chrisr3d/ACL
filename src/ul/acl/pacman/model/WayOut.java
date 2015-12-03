package ul.acl.pacman.model;

import ul.acl.pacman.model.visitors.UpdateVisitor;

/**
 * Created by Nicolas on 03/12/15.
 */
public class WayOut extends GameObject{

    public WayOut(int x, int y){
        super(x, y);
    }


    public void update(UpdateVisitor v) {
        v.visit(this);
    }
}
