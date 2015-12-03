package ul.acl.pacman.model.maze;

/**
 * Created by Nicolas on 03/12/15.
 */

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.Position;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.obstacle.Obstacle;

public class TestMazeEndReached {

    @Before
    public void initClass() {
        new LevelManager(new Maze(0, 0), new Hero(0, 0));
    }

    @Test
    public void testRightFalse(){
        Maze maze = LevelManager.getInstance().getMaze();
        LevelManager.getInstance().hero.position = new Position(5, 5);

        assertTrue(!maze.endReached(LevelManager.getInstance().hero));
    }

}
