package ul.acl.pacman.controller;

import java.awt.event.KeyEvent;



/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 * controleur de type KeyListener
 * 
 */
public class PacmanController implements GameController {

	/**
	 * commande en cours
	 */
	private Cmd commandeEnCours;
	
	/**
	 * construction du controleur par defaut le controleur n'a pas de commande
	 */
	public PacmanController() {
		this.commandeEnCours = Cmd.IDLE;
	}

	/**
	 * quand on demande les commandes, le controleur retourne la commande en
	 * cours
	 * 
	 * @return commande faite par le joueur
	 */
	public Cmd getCommand() {
		return this.commandeEnCours;
	}

	@Override
	/**
	 * met a jour les commandes en fonctions des touches appuyees
	 */
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		// si on appuie sur 'q',commande joueur est gauche
		case KeyEvent.VK_Q:
		case KeyEvent.VK_LEFT:
			this.commandeEnCours = Cmd.LEFT;
			break;
		case KeyEvent.VK_S:
		case KeyEvent.VK_DOWN:
			this.commandeEnCours = Cmd.DOWN;
			break;
		case KeyEvent.VK_Z:
		case KeyEvent.VK_UP:
			this.commandeEnCours = Cmd.UP;
			break;
		case KeyEvent.VK_D:
		case KeyEvent.VK_RIGHT:
			this.commandeEnCours = Cmd.RIGHT;
			break;
		}

	}

	@Override
	/**
	 * met a jour les commandes quand le joueur relache une touche
	 */
	public void keyReleased(KeyEvent e) {
		this.commandeEnCours = Cmd.IDLE;
	}

	@Override
	/**
	 * ne fait rien
	 */
	public void keyTyped(KeyEvent e) {

	}

}
