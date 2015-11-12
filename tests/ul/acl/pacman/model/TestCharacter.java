package ul.acl.pacman.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ul.acl.pacman.model.Hero;

public class TestCharacter {


    @Test
    public void moveLeft() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.left);
        assertEquals(h.x(), -1);
    }

    @Test
    public void moveRight() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.right);
        assertEquals(h.x(), 1);
    }


    @Test
    public void moveUp() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.up);
        assertEquals(h.y(), -1);
    }


    @Test
    public void moveDown() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.down);
        assertEquals(h.y(), 1);
    }



    @Test
    public void moveLeftNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.left);
        assertEquals(h.x(), -11);
    }

    @Test
    public void moveRightNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.right);
        assertEquals(h.x(), -9);
    }


    @Test
    public void moveUpNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.up);
        assertEquals(h.y(), -11);
    }


    @Test
    public void moveDownNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.down);
        assertEquals(h.y(), -9);
    }



}