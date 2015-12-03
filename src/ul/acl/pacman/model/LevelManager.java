package ul.acl.pacman.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ul.acl.pacman.controller.Cmd;
import ul.acl.pacman.engine.Game;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;
import ul.acl.pacman.model.obstacle.Obstacle;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.visitors.UpdateVisitor;

public class LevelManager implements Game{
	
	public static LevelManager instance = null;
	
	protected List<Character> characters;
	
	protected Hero hero;
	
	protected Maze maze;
	public Cmd cmd;

	private UpdateVisitor updateVisitor = null;

	public Obstacle obstacle = new Obstacle(500, 500);

	public Cmd getCmd() {
		return this.cmd;
	}
	public Maze getMaze(){return maze;}
	
	public LevelManager (Maze m, Hero h) {
		this.maze = m;
		characters = new ArrayList<Character>();
		this.cmd = null;
		LevelManager.instance = this;
		this.hero = h;
		characters.add(hero);
	}
	
	public static LevelManager getInstance() {
		return LevelManager.instance;
	}

	public void addCharacter(Character c){
		characters.add(c);
	}
	
	public Hero getHero() {
		return this.hero;
	}


	@Override
	public void update(Cmd userCmd) {
		this.cmd = userCmd;
		if(updateVisitor == null) {
			updateVisitor = new UpdateVisitor();
		}
		for(GameObject gO : characters) {
			gO.update(updateVisitor);
		}
		maze.update(updateVisitor);
		
	}



	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
