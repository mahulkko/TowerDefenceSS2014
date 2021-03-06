package de.htwg.towerdefence2014.TowerDefence;

import org.apache.log4j.BasicConfigurator;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.towerdefence2014.gui.impl.GUITowerDefence;

/**
 * @author Christoph Knetschke and Martin Hulkkonen
 * <br>
 * <b>TowerDefence - Main Class</b>
 */
public class TowerDefence {

	/************************************************************
	 * Main function
	 ***********************************************************/
	
	/**
	 * <b>Main function of the tower defence game</b>
	 * @param args - not used at the moment
	 */
	public static void main(String[] args) {
		
		/**
	     * Logger
	     */
	    BasicConfigurator.configure();
	    
	    // Set up Google Gui Model
	    Injector injector = Guice.createInjector(new TowerDefenceModul());
	    
	    // Start the gui - only for testing right now
	    GUITowerDefence gui = new GUITowerDefence();
	}
}
