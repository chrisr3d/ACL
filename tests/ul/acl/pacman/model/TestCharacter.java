package ul.acl.pacman.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class TestCharacter {


    @Test
    public void moveLeft(){
        ul.acl.pacman.model.Hero h ;
        h = new ul.acl.pacman.model.Hero(0,0);
        try {
            h.move(Direction.left);
        }catch (Exception e){

        }
            assertEquals(h.x(), -1);
    }

    @Test
    public void moveRight(){
        Hero h = new Hero(0,0);
        try {
            h.move(Direction.right);
        }catch (Exception e){

        }
        assertEquals(h.x(), 1);
    }


    @Test
    public void moveUp(){
        Hero h = new Hero(0,0);
        try {
            h.move(Direction.up);
        }catch (Exception e){

        }
        assertEquals(h.y(), -1);
    }


    @Test
    public void moveDown(){
        Hero h = new Hero(0,0);
        try {
            h.move(Direction.down);
        }catch (Exception e){

        }
        assertEquals(h.y(), 1);
    }



    @Test
    public void moveLeftNegatif(){
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.left);
        }catch (Exception e){

        }
        assertEquals(h.x(), -11);
    }

    @Test
    public void moveRightNegatif(){
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.right);
        }catch (Exception e){

        }assertEquals(h.x(), -9);
    }


    @Test
    public void moveUpNegatif(){
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.up);
        }catch (Exception e){

        }
        assertEquals(h.y(), -11);
    }


    @Test
    public void moveDownNegatif(){
        Hero h = new Hero(-10,-10);
        try {
            h.move(Direction.down);
        }catch (Exception e){

        }assertEquals(h.y(), -9);
    }



}