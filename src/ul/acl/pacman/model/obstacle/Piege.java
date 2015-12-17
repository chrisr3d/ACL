package ul.acl.pacman.model.obstacle;

import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.ImageFactory;
import ul.acl.pacman.model.visitors.UpdateVisitor;

import java.awt.*;

/**
 * Created by Nicolas on 17/12/15.
 */
public class Piege extends Obstacle{

    public Piege(int x, int y) {
        super(x, y);
        this.width = 30;
        this.height = 30;
    }
    @Override
    public void update(UpdateVisitor visitor) {
        visitor.updatePiege(this);
    }

    @Override
    public Image getImage() {
        return ImageFactory.getInstance().trap;
    }

    public boolean isPiege() {return true;}
}
