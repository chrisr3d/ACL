package ul.acl.pacman.model.character;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.visitors.UpdateVisitor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

/**
 * Created by Nicolas on 03/12/15.
 */
public abstract class Enemy extends Character{

    public Direction lastDirection = null;
    public int tempo = 0;

    public Enemy(int x, int y){
        super(x, y);
        this.width = 20;
        this.height = 25;
    }


    @Override
    public Image getImage(){
        try {
            return ImageIO.read(new File("resources/Sprite_Link_TMC.gif"));
        }
        catch (Exception e){
            return null;
        }
    }


}
