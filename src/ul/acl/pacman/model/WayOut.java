package ul.acl.pacman.model;

import ul.acl.pacman.model.visitors.UpdateVisitor;

/**
 * Created by Nicolas on 03/12/15.
 */
public class WayOut extends GameObject{


    public void accept(UpdateVisitor v) {
        v.visit(this);
    }
}
