package ul.acl.pacman.engine;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 * 
 * represente la maniere de dessiner sur un JPanel
 * 
 */
public interface GamePainter {

	/**
	 * methode dessiner a completer. Elle construit une image correspondant au
	 * jeu. Game est un attribut de l'afficheur
	 * 
	 * @param image
	 *            image sur laquelle dessiner
	 * @throws IOException 
	 */
	public abstract void draw(BufferedImage image) throws IOException;

	public abstract int getWidth();

	public abstract int getHeight();
	
}
