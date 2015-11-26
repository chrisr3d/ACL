package ul.acl.pacman.model;

import org.junit.Test;

import sun.org.mozilla.javascript.internal.EcmaError;
import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.Position;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.character.Hero;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCharacter {

    /*
        TEST
        Methode : Hero.process()
     */
    @Test
    public void moveLeft() throws Exception{
        Hero h = new Hero(0,0);
        Position p = h.processMove(Direction.left);
        assertEquals(- Character.getVitesse(), p.x);
    }

    @Test
    public void moveRight() throws Exception{
        Hero h = new Hero(0,0);
        Position p = h.processMove(Direction.right);
        assertEquals(Character.getVitesse(), p.x);
    }


    @Test
    public void moveUp() throws Exception{
        Hero h = new Hero(0,0);
        Position p = h.processMove(Direction.up);
        assertEquals(- Character.getVitesse(), p.y);
    }


    @Test
    public void moveDown() throws Exception{
        Hero h = new Hero(0,0);
        Position p = h.processMove(Direction.down);
        assertEquals(Character.getVitesse(), p.y);
    }



    @Test
    public void moveLeftNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        Position p = h.processMove(Direction.left);
        assertEquals(-10 - Character.getVitesse(), p.x);
    }

    @Test
    public void moveRightNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        Position p = h.processMove(Direction.right);
        assertEquals(-10 + Character.getVitesse(), p.x);
    }


    @Test
    public void moveUpNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        Position p = h.processMove(Direction.up);
        assertEquals(-10 - Character.getVitesse(), p.y);
    }


    @Test
    public void moveDownNegatif() throws Exception{
        Hero h = new Hero(-10,-10);
        Position p = h.processMove(Direction.down);
        assertEquals(-10 + Character.getVitesse(), p.y);
    }


    @Test(expected = Exception.class)
    public void moveUpBoundary() throws Exception{
        Hero h = new Hero(0,Integer.MIN_VALUE);
        h.processMove(Direction.up);
    }

    @Test(expected = Exception.class)
    public void moveDownBoundary() throws Exception{
        Hero h = new Hero(0,Integer.MAX_VALUE);
        h.processMove(Direction.down);
    }

    @Test(expected = Exception.class)
    public void moveLeftBoundary() throws Exception{
        Hero h = new Hero(Integer.MIN_VALUE, 0);
        h.processMove(Direction.left);
    }

    @Test(expected = Exception.class)
    public void moveRightBoundary() throws Exception{
        Hero h = new Hero(Integer.MAX_VALUE, 0);
        h.processMove(Direction.right);
    }


    @Test (expected=Exception.class)
    public void moveNullValue() throws Exception{
        Hero h = new Hero(Integer.MAX_VALUE, 0);
        h.processMove(null);
    }



    /*
        TEST
        methode : Hero.collision()
     */

    @Test
    public void collisionCorrectPosition() throws Exception{
        Hero h = new Hero(Hero.getVitesse(), Hero.getVitesse());
        boolean b = h.collision(Direction.down);
        assertTrue(b);
    }

    @Test
    public void collisionRightTopLeft() throws Exception {
        Hero h = new Hero(0, 10);
        boolean b = h.collision(Direction.up);
        assertTrue(b);
    }

    @Test
    public void collisionBounderyDownRight() throws Exception {
        Hero h = new Hero(PacmanPainter.WIDTH - Hero.getVitesse() - 10, PacmanPainter.HEIGHT - Hero.getVitesse() - 10);
        boolean b = h.collision(Direction.down);
        assertTrue(b);
    }

    @Test
    public void collisionBounderyDownRight2() throws Exception {
        Hero h = new Hero(PacmanPainter.WIDTH - Hero.getVitesse() - 10, PacmanPainter.HEIGHT - Hero.getVitesse() - 10);
        boolean b = h.collision(Direction.right);
        assertTrue(b);
    }

    @Test
    public void collisionRightTopLeftFail() throws Exception {
        Hero h = new Hero(0, 0);
        boolean b = h.collision(Direction.up);
        assertTrue(!b);
    }

    @Test
    public void collisionBounderyDownRightFail() throws Exception {
        Hero h = new Hero(PacmanPainter.WIDTH - Hero.getVitesse(), PacmanPainter.HEIGHT - Hero.getVitesse());
        boolean b = h.collision(Direction.down);
        assertTrue(!b);
    }

    @Test
    public void collisionBounderyDownRightFail2() throws Exception {
        Hero h = new Hero(PacmanPainter.WIDTH - Hero.getVitesse(), PacmanPainter.HEIGHT - Hero.getVitesse());
        boolean b = h.collision(Direction.right);
        assertTrue(!b);
    }

}