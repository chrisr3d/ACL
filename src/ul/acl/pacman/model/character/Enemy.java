package ul.acl.pacman.model.character;

import ul.acl.pacman.model.visitors.UpdateVisitor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

/**
 * Created by Nicolas on 03/12/15.
 */
public class Enemy extends Character{

    public Enemy(int x, int y){
        super(x, y);
        this.width = 20;
        this.height = 25;
    }

    public void update(UpdateVisitor visitor) {
        visitor.updateEnemy(this);
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
