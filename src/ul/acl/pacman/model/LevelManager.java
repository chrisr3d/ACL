package ul.acl.pacman.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import ul.acl.pacman.engine.Cmd;
import ul.acl.pacman.engine.Game;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;

public class LevelManager implements Game{
	
	protected List<GameObject> characters;
	
	protected Maze maze;
	private Cmd cmd;
	
	
	public LevelManager (Maze m) {
		this.maze = m;
		characters = new ArrayList<GameObject>();
		this.cmd = null;
	}



	public void addCharacter(Character c){
		characters.add(c);
	}

	public void draw(){
		for(GameObject gO : characters)
			gO.draw();
		maze.draw();

	}



	public void updateHero(Hero h) {
		/*
		System.out.println("choisir une direction: q/s/d/z:");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		*/
		try {
			//String s = b.readLine();
			Direction d = null;
			switch (this.cmd){
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
			}
			if(d != null) {
				h.move(d);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateMaze(Maze m) {
		// TODO Auto-generated method stub
	}



	@Override
	public void update(Cmd userCmd) {
		this.cmd = userCmd;
		for(GameObject gO : characters)
			gO.update(this);
		maze.update(this);
		
	}



	@Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
