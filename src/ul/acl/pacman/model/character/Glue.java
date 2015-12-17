package ul.acl.pacman.model.character;

import ul.acl.pacman.model.visitors.UpdateVisitor;


import ul.acl.pacman.model.ImageFactory;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;


public class Glue extends Enemy{


    public Character toStick;
    public Glue(int x, int y){
        super(x, y);
        this.width = 20;
        this.height = 25;
        toStick = null;
    }

    @Override
    public void update(UpdateVisitor visitor) {
        visitor.updateGlue(this);
    }
    
    public void stickTo(Character c){
      toStick = c;
    }

    @Override
    public Image getImage(){
        return ImageFactory.getInstance().glue;
    }
}
