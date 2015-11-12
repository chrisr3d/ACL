package ul.acl.pacman.model;

import ul.acl.pacman.controller.ControllerListener;

/**
 * Created by baptiste on 11/11/15.
 */
public class Hero extends Playable{

    ControllerListener l;
    public Hero(int x, int y){
        super(x, y);
        l = new ControllerListener();

    }





}
