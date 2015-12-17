package ul.acl.pacman.model.visitors;

import ul.acl.pacman.model.Direction;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.WayOut;
import ul.acl.pacman.model.character.Enemy;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.character.Phantom;
import ul.acl.pacman.model.maze.Maze;
import ul.acl.pacman.model.obstacle.Obstacle;

import java.util.Random;


/**
 * Created by Nicolas on 24/11/15.
 */
public class UpdateVisitor{

    public UpdateVisitor() {}

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
            if(d != null && LevelManager.getInstance().getMaze().canMove(hero, d) ) {
                System.out.println("je peux bouger");
                if(LevelManager.getInstance().getMaze().endReached(hero)){
                    LevelManager.getInstance().setGameEnded(true);
                }
                hero.move(d);
            }

    }

    public void visit(WayOut wayOut) {
        // TODO faire  cette methode
    }

    public void updateMaze(Maze m) {
        // TODO
    }
    
    public void updateObstacle(Obstacle o){
    	
    }

    public void updatePhantom(Phantom phantom) {
        int nbdire;
        Direction d = phantom.lastDirection;
        if(phantom.tempo == 6) {
            Random rn = new Random();
            nbdire= rn.nextInt() % 4;
    System.out.println("nbdire: " + nbdire);
            switch (nbdire) {
                case 0:
                    d = Direction.left;
                    break;
                case 1:
                    d = Direction.right;
                    break;
                case 2:
                    d = Direction.down;
                    break;
                case 3:
                    d = Direction.up;
                    break;
                default:
                    break;
            }
            phantom.tempo = 0;
        }

        if((LevelManager.getInstance().getMaze().canMove(phantom, d))) {
            phantom.move(d);
            phantom.lastDirection = d;
        }
        System.out.println("fdjksfdskl = " + phantom.tempo);
        phantom.tempo ++;
    }
}
