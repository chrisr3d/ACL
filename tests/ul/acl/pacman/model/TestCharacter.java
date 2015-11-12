package ul.acl.pacman.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import ul.acl.pacman.model.Hero;
import ul.acl.pacman.model.Character;
import ul.acl.pacman.model.*;

public class TestCharacter {


    @Test
    public void moveLeft(){
        Hero h = new Hero(0,0);
        h.move(Direction.left);
        assertEquals(h.x(), -1);
    }

    @Test
    public void moveRight(){
        Hero h = new Hero(0,0);
        h.move(Direction.right);
        assertEquals(h.x(), 1);
    }


    @Test
    public void moveUp(){
        Hero h = new Hero(0,0);
        h.move(Direction.up);
        assertEquals(h.y(), -1);
    }


    @Test
    public void moveDown(){
        Hero h = new Hero(0,0);
        h.move(Direction.down);
        assertEquals(h.y(), 1);
    }



    @Test
    public void moveLeftNegatif(){
        Hero h = new Hero(-10,-10);
        h.move(Direction.left);
        assertEquals(h.x(), -11);
    }

    @Test
    public void moveRightNegatif(){
        Hero h = new Hero(-10,-10);
        h.move(Direction.right);
        assertEquals(h.x(), -9);
    }


    @Test
    public void moveUpNegatif(){
        Hero h = new Hero(-10,-10);
        h.move(Direction.up);
        assertEquals(h.y(), -11);
    }


    @Test
    public void moveDownNegatif(){
        Hero h = new Hero(-10,-10);
        h.move(Direction.down);
        assertEquals(h.y(), -9);
    }



}