package ul.acl.pacman;

import ul.acl.pacman.model.GameObject;
import ul.acl.pacman.model.Hero;

public class PacmanGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hero h = new Hero(0,0);
		try {
			while (true){
				h.update();
				h.draw();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
