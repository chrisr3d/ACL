package ul.acl.pacman.model.character;

import ul.acl.pacman.model.ImageFactory;
import ul.acl.pacman.model.visitors.UpdateVisitor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;


public class Phantom extends Enemy{

    public Phantom(int x, int y){
        super(x, y);
        this.width = 20;
        this.height = 25;
    }

    @Override
    public void update(UpdateVisitor visitor) {
        visitor.updatePhantom(this);
    }

    @Override
    public Image getImage(){

        return ImageFactory.getInstance().monster;
    }
}
