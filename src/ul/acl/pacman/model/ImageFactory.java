package ul.acl.pacman.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

/**
 * Created by Nicolas on 03/12/15.
 */
public class ImageFactory {
    private static ImageFactory ourInstance = null;

    public static ImageFactory getInstance(){
        if(ourInstance == null)
            ourInstance = new ImageFactory();
        return ourInstance;
    }

    public Image hero;
    public Image wayOut;
    public Image obstacle;

    private ImageFactory(){
        try {
            hero = ImageIO.read(new File("resources/Sprite_Link_TMC.gif"));
            wayOut = ImageIO.read(new File("resources/door.gif"));
            obstacle = ImageIO.read(new File("resources/obstacle.jpg"));
        }catch(Exception e){
            System.out.println("lol");
        }
    }


}
