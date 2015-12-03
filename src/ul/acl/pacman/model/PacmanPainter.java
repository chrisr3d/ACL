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

	/**
	 * appelle constructeur parent
	 *
	 */
	public PacmanPainter() {
		this.hero = LevelManager.getInstance().hero;
		this.wayOut = LevelManager.getInstance().wayOut;
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
