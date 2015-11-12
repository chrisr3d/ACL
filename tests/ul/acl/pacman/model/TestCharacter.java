package ul.acl.pacman.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
        try {
            h.move(Direction.right);
        }catch (Exception e){

        }
        assertEquals(h.x(), 1);
    }


    @Test
    public void moveUp() throws Exception{
        Hero h = new Hero(0,0);
        try {
            h.move(Direction.up);
        }catch (Exception e){

        }
        assertEquals(h.y(), -1);
    }


    @Test
    public void moveDown() throws Exception{
        Hero h = new Hero(0,0);
        try {
            h.move(Direction.down);
        }catch (Exception e){

        }
        assertEquals(h.y(), 1);
    }



    @Test
    public void moveLeftNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.left);
        }catch (Exception e){

        }
        assertEquals(h.x(), -11);
    }

    @Test
    public void moveRightNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.right);
        }catch (Exception e){

        }assertEquals(h.x(), -9);
    }


    @Test
    public void moveUpNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.up);
        }catch (Exception e){

        }
        assertEquals(h.y(), -11);
    }


    @Test
    public void moveDownNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.down);
        }catch (Exception e){

        }assertEquals(h.y(), -9);
    }


    @Test
    public void moveUpBoundary() throws Exception{
        Hero h = new Hero(0,Integer.MIN_VALUE);
        h.move(Direction.up);
        assertEquals(h.y(), Integer.MAX_VALUE);
    }

    @Test
    public void moveDownBoundary() throws Exception{
        Hero h = new Hero(0,Integer.MAX_VALUE);
        h.move(Direction.down);
        assertEquals(h.y(), Integer.MIN_VALUE);
    }

    @Test
    public void moveLeftBoundary() throws Exception{
        Hero h = new Hero(Integer.MIN_VALUE, 0);
        h.move(Direction.left);
        assertEquals(h.x(), Integer.MAX_VALUE);
    }

    @Test
    public void moveRightBoundary() throws Exception{
        Hero h = new Hero(Integer.MAX_VALUE, 0);
        h.move(Direction.right);
        assertEquals(h.x(), Integer.MIN_VALUE);
    }

    @Test (expected=Exception.class)
    public void moveNullValue() throws Exception{
        Hero h = new Hero(Integer.MAX_VALUE, 0);
        h.move(null);
    }



}