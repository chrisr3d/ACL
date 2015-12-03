package ul.acl.pacman.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ul.acl.pacman.engine.GamePainter;
import ul.acl.pacman.model.character.Character;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.obstacle.Obstacle;


/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 * afficheur graphique pour le game
 * 
 */
public class PacmanPainter implements GamePainter {

	/**
	 * la taille des cases
	 */
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 720;

	/**
	 * appelle constructeur parent
	 * 
	 * @param game
	 *            le jeutest a afficher
	 */
	public PacmanPainter() {
	}

	/**
	 * methode  redefinie de Afficheur retourne une image du jeu
	 * @throws IOException 
	 */
	@Override
	public void draw(BufferedImage im) throws IOException {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		/*crayon.setColor(Color.blue);*/
		Image imageHero = ImageIO.read(new File("resources/Sprite_Link_TMC.gif"));
		File f = new File("resources/obstacle.jpg");
		Image imageObstacle = ImageIO.read(f);
		Hero hero = LevelManager.getInstance().hero;
		Obstacle obstacle = LevelManager.getInstance().obstacle;
		for(GameObject c : LevelManager.getInstance().characters){
			crayon.drawImage(c.getImage(), c.position.x, c.position.y, c.width, c.height, null, null);
		}
		for(Obstacle c : LevelManager.getInstance().getMaze().obstacles){
			crayon.drawImage(c.getImage(), c.position.x, c.position.y, c.width, c.height, null, null);
		}

	}

	@Override
	public int getWidth() {
		return WIDTH;
	}

	@Override
	public int getHeight() {
		return HEIGHT;
	}

}
