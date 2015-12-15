package ul.acl.pacman.model;

//import org.junit.Assert;
import org.junit.Test;
import ul.acl.pacman.model.character.*;
import ul.acl.pacman.model.maze.Maze;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.Direction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMaze{

    @Test
    public void canMoveNormal(){
        Maze maze = new Maze();
        assertTrue(maze.canMove(new Hero(10, 10), Direction.right));
    }


    @Test
    public void isOutOfBoundNormal(){
        Maze maze = new Maze();
        assertTrue(maze.isOutOfBound(new Position(-1,10), 100, 100));
    }

    @Test
    public void isNotOutOfBound(){
        Maze maze = new Maze();
        assertTrue(maze.isOutOfBound(new Position(100,10), 99999999, 100));
    }


    @Test
    public void isNotOutOfBoundBoundary(){
        Maze maze = new Maze();
        //assertTrue(maze.isOutOfBound(new Position(Integer.MIN_VALUE,10), Direction.left));
    }


    @Test
    public void isObstacleNormal(){
        //canMove(Character character, Direction direction) {
    }
    @Test
    public void endReachedNormal(){
        //canMove(Character character, Direction direction) {
    }


}

