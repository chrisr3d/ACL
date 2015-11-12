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



}