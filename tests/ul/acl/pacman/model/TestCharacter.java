package ul.acl.pacman.model;

import org.junit.Test;

import sun.org.mozilla.javascript.internal.EcmaError;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.character.Hero;

import static org.junit.Assert.assertEquals;

public class TestCharacter {


    @Test
    public void moveLeft() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.left);
        assertEquals(- Character.getVitesse(), h.x());
    }

    @Test
    public void moveRight() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.right);
        assertEquals(Character.getVitesse(), h.x());
    }


    @Test
    public void moveUp() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.up);
        assertEquals(- Character.getVitesse(), h.y());
    }


    @Test
    public void moveDown() throws Exception{
        Hero h = new Hero(0,0);
        h.move(Direction.down);
        assertEquals(Character.getVitesse(), h.y());
    }



    @Test
    public void moveLeftNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.left);
        assertEquals(-10 - Character.getVitesse(), h.x());
    }

    @Test
    public void moveRightNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.right);
        assertEquals(-10 + Character.getVitesse(), h.x());
    }


    @Test
    public void moveUpNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.up);
        assertEquals(-10 - Character.getVitesse(), h.y());
    }


    @Test
    public void moveDownNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        h.move(Direction.down);
        assertEquals(-10 + Character.getVitesse(), h.y());
    }


    @Test(expected = Exception.class)
    public void moveUpBoundary() throws Exception{
        Hero h = new Hero(0,Integer.MIN_VALUE);
        h.move(Direction.up);
    }

    @Test(expected = Exception.class)
    public void moveDownBoundary() throws Exception{
        Hero h = new Hero(0,Integer.MAX_VALUE);
        h.move(Direction.down);
    }

    @Test(expected = Exception.class)
    public void moveLeftBoundary() throws Exception{
        Hero h = new Hero(Integer.MIN_VALUE, 0);
        h.move(Direction.left);
    }

    @Test(expected = Exception.class)
    public void moveRightBoundary() throws Exception{
        Hero h = new Hero(Integer.MAX_VALUE, 0);
        h.move(Direction.right);
    }


    @Test (expected=Exception.class)
    public void moveNullValue() throws Exception{
        Hero h = new Hero(Integer.MAX_VALUE, 0);
        h.move(null);
    }



}