package ul.acl.pacman.model;

import ul.acl.pacman.model.visitors.UpdateVisitor;
import ul.acl.pacman.model.ImageFactory;
import java.awt.*;

/**
 * Created by Nicolas on 03/12/15.
 */
public class WayOut extends GameObject{

    public WayOut(int x, int y){
        super(x, y);
        this.height = 30;
        this.width = 30;

    }


    public void update(UpdateVisitor v) {
        v.visit(this);
    }

    @Override
    public Image getImage(){
        try {
            return 	ImageFactory.getInstance().wayOut;
        } catch (Exception e) {
            return null;
        }

    }
}
