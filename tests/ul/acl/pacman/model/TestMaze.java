package ul.acl.pacman.model;

import org.junit.Assert;
import org.junit.Test;
import ul.acl.pacman.model.character.*;
import ul.acl.pacman.model.maze.*;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.Direction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMaze{

    @Test
    public void canMoveNormal(){}
        Maze maze = new Maze();
        assertTrue(maze.canMove(new Hero(10, 10), Direction.right));
    }


    @Test
    public void isOutOfBoundNormal(){}
        Maze maze = new Maze();
        assertTrue(maze.isOutOfBound(new Hero(0,10), Direction.left));
    }

    @Test
    public void isNotOutOfBound(){}
        Maze maze = new Maze();
        assertTrue(maze.isOutOfBound(new Hero(100,10), Direction.left));
    }


    @Test
    public void isNotOutOfBoundBoundary(){}
        Maze maze = new Maze();
        assertTrue(maze.isOutOfBound(new Hero(Integer.MIN_VALUE,10), Direction.left));
    }


    @Test
    public void isObstacleNormal(){}
        //canMove(Character character, Direction direction) {
    }
    @Test
    public void endReachedNormal(){}
        //canMove(Character character, Direction direction) {
    }


}

