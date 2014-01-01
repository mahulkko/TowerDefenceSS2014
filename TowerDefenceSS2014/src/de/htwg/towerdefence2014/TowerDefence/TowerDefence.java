package de.htwg.towerdefence2014.TowerDefence;

import org.apache.log4j.BasicConfigurator;
import de.htwg.towerdefence2014.model.IPlayer;
import de.htwg.towerdefence2014.model.impl.Player;

/**
 * @author Christoph Knetschke and Martin Hulkkonen
 * <br>
 * <b>TowerDefence - Main Class</b>
 */
public class TowerDefence {

	/**
	 * <b>Main function of the tower defence game</b>
	 * @param args - not used at the moment
	 */
	public static void main(String[] args) {
		
		/**
         * Logger
         */
        BasicConfigurator.configure();
        
		System.out.println("TowerDefence");
		IPlayer player = new Player();
		//TODO(mh): write here the startup code for the game
	}
}
