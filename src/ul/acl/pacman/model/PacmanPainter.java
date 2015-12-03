package ul.acl.pacman.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ul.acl.pacman.engine.GamePainter;
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

	Hero hero;

	WayOut wayOut;

	Image imageObstacle;

	Obstacle obstacle;

	/**
	 * appelle constructeur parent
	 *
	 */
	public PacmanPainter() throws Exception{
		this.hero = LevelManager.getInstance().hero;
		this.wayOut = LevelManager.getInstance().wayOut;
		File f = new File("resources/obstacle.jpg");
		imageObstacle = ImageIO.read(f);
		obstacle = LevelManager.getInstance().obstacle;
	}

	/**
	 * methode  redefinie de Afficheur retourne une image du jeu
	 * @throws IOException 
	 */
	@Override
	public void draw(BufferedImage im) throws IOException {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		/*crayon.setColor(Color.blue);*/

		System.out.println(this.hero.position.x);
		try {
			crayon.drawImage(ImageFactory.getInstance().wayOut, wayOut.position.x, wayOut.position.y,wayOut.width, wayOut.height, null, null);
			crayon.drawImage(ImageFactory.getInstance().hero, hero.position.x,hero.position.y ,hero.width, hero.height, null, null);
			crayon.drawImage(imageObstacle, 150, 150, obstacle.width, obstacle.height, null, null);
			crayon.drawImage(imageObstacle, 525, 600, obstacle.width, obstacle.height, null, null);
			crayon.drawImage(imageObstacle, 430, 250, obstacle.width, obstacle.height, null, null);
			crayon.drawImage(imageObstacle, 900, 350, obstacle.width, obstacle.height, null, null);
		}
		catch (Exception e){
			System.out.println("CONNARD");
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
