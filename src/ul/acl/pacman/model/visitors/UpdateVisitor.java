package ul.acl.pacman.model.visitors;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.character.Playable;
import ul.acl.pacman.model.maze.Maze;


/**
 * Created by Nicolas on 24/11/15.
 */
public class UpdateVisitor{

    public UpdateVisitor() {    }

    public void updateHero(Hero hero){
        System.out.println("update hero");

            Direction d = null;
            switch (LevelManager.getInstance().getCmd()){
                case LEFT:
                    d = Direction.left;
                    break;
                case RIGHT:
                    d = Direction.right;
                    break;
                case DOWN:
                    d = Direction.down;
                    break;
                case UP:
                    d = Direction.up;
                    break;
                default:
                    break;
            }
            if(d != null && LevelManager.getInstance().getMaze().canMove(hero, d) ) {//TODO: sortie d'écran
                System.out.println("je bouge");
                hero.move(d);
            }

    }

    public void updateMaze(Maze m) {
        // TODO
    }
}
