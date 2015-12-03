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

public class LevelManager {
	
	public static LevelManager instance = null;
	
	protected List<GameObject> characters;

	private Boolean GameEnded = false;
	
	public Hero hero;
	public WayOut wayOut;
	
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
		characters = new ArrayList<GameObject>();
		this.cmd = null;
		LevelManager.instance = this;
		this.hero = h;
		characters.add(hero);
		this.wayOut = new WayOut(100, 100);
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

	public void setGameEnded(Boolean gameEnded) {
		GameEnded = gameEnded;
	}

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

	public boolean isFinished() {
		return this.GameEnded;
	}



}
