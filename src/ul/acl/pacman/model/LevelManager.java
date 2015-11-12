package ul.acl.pacman.model;

import java.util.ArrayList;
import java.util.List;

import ul.acl.pacman.model.maze.Maze;

public class LevelManager implements UpdateInterface{
	
	protected List<GameObject> characters;
	
	protected Maze maze;
	
	public LevelManager () {
		characters = new ArrayList<GameObject>();
	}
	
	public void updateCharacter(Hero h) {
		for(GameObject gO : characters)
			gO.update(this);
	}
	
	@Override
	public void updateHero(Hero h) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateMaze(Maze m) {
		// TODO Auto-generated method stub
	}
}
