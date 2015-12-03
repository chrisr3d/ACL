package ul.acl.pacman.engine;

import java.io.IOException;

import ul.acl.pacman.controller.Cmd;
import ul.acl.pacman.controller.GameController;
import ul.acl.pacman.model.LevelManager;
import ul.acl.pacman.model.character.Hero;
import ul.acl.pacman.model.maze.Maze;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 * moteur de game generique.
 * On lui passe un game et un afficheur et il permet d'executer un game.
 */
public class GameEngineGraphical {

	/**
	 * le game a executer
	 */
	private Game game;

	/**
	 * l'afficheur a utiliser pour le rendu
	 */
	private GamePainter gamePainter;

	/**
	 * le controlleur a utiliser pour recuperer les commandes
	 */
	private GameController gameController;

	/**
	 * l'interface graphique
	 */
	private GraphicalInterface gui;

	/**
	 * construit un moteur
	 * 
	 * @param game
	 *            game a lancer
	 * @param gamePainter
	 *            afficheur a utiliser
	 * @param gameController
	 *            controlleur a utiliser
	 *            
	 */
	public GameEngineGraphical(Game game, GamePainter gamePainter, GameController gameController) {
		// creation du game
		this.game = game;
		this.gamePainter = gamePainter;
		this.gameController = gameController;
	}

	/**
	 * permet de lancer le game
	 * @throws IOException 
	 */
	public void run() throws InterruptedException, IOException {

		// creation de l'interface graphique
		this.gui = new GraphicalInterface(this.gamePainter,this.gameController);

		// boucle de game
		while (!this.game.isFinished()) {

			LevelManager l = new LevelManager(new Maze(0,0), new Hero(0,0));
			while (true){
				
				// demande controle utilisateur
				Cmd c = this.gameController.getCommand();

				// fait evoluer le game
				this.game.update(c);

				// affiche le game
				this.gui.paint();
				// met en attente
				
				l.update(c);
				Thread.sleep(100);
				
			}
		}
	}

}
