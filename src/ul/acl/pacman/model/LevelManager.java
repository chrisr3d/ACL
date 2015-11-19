package ul.acl.pacman.model;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;
import java.io.BufferedReader;

public class LevelManager implements UpdateInterface{
	
	public static LevelManager instance = null;
	
	protected List<GameObject> characters;
	
	protected Hero hero;
	
	protected Maze maze;
	
	public LevelManager (Maze m, Hero h) {
		this.maze = m;
		characters = new ArrayList<GameObject>();
		LevelManager.instance = this;
		this.hero = h;
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

	public void draw(){
		for(GameObject gO : characters)
			gO.draw();
		maze.draw();
	}

	public void update() {
		for(GameObject gO : characters)
			gO.update(this);
		maze.update(this);
	}
	
	@Override
	public void updateHero(Hero h) {
		System.out.println("choisir une direction: q/s/d/z:");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = b.readLine();
			Direction d = null;
			switch (s){
				case "q":
					d = Direction.left;
					break;
				case "d":
					d = Direction.right;
					break;
				case "s":
					d = Direction.down;
					break;
				case "z":
					d = Direction.up;
					break;
			}
			if(d != null) {
				h.move(d);
			}
			else{
				System.out.println("mauvaise direction");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateMaze(Maze m) {
		// TODO Auto-generated method stub
	}

}
