package ul.acl.pacman.model.visitors;

import org.junit.Before;
import org.junit.Test;
import ul.acl.pacman.controller.Cmd;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.Position;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicolas on 26/11/15.
 */

public class TestUpdateVisitor {

    @Before
    public void initialize() {

    }

    @Test
    public void TestNominalDown() {
        Hero h = new Hero(50,50);
        new LevelManager(new Maze(1000, 1000), h);
        UpdateVisitor updateVisitor = new UpdateVisitor();
        LevelManager.getInstance().cmd = Cmd.DOWN;

        updateVisitor.visit(h);

        assertEquals(60, h.position.y);
    }

    @Test
    public void TestNominalLeft() {
        Hero h = new Hero(50,50);
        new LevelManager(new Maze(1000, 1000), h);
        UpdateVisitor updateVisitor = new UpdateVisitor();
        LevelManager.getInstance().cmd = Cmd.LEFT;

        updateVisitor.visit(h);

        assertEquals(40, h.position.x);
    }

    @Test
    public void TestNominalUp() {
        Hero h = new Hero(50,50);
        new LevelManager(new Maze(1000, 1000), h);
        UpdateVisitor updateVisitor = new UpdateVisitor();
        LevelManager.getInstance().cmd = Cmd.UP;

        updateVisitor.visit(h);

        assertEquals(40, h.position.y);
    }

    @Test
    public void TestNominalRight() {
        Hero h = new Hero(50,50);
        new LevelManager(new Maze(1000, 1000), h);
        UpdateVisitor updateVisitor = new UpdateVisitor();
        LevelManager.getInstance().cmd = Cmd.RIGHT;

        updateVisitor.visit(h);

        assertEquals(60, h.position.x);
    }

    @Test
    public void TestBounderyUp() {
        Hero h = new Hero(5,5);
        new LevelManager(new Maze(1000, 1000), h);
        UpdateVisitor updateVisitor = new UpdateVisitor();
        LevelManager.getInstance().cmd = Cmd.UP;

        updateVisitor.visit(h);

        assertEquals(5, h.position.y);
    }

}
