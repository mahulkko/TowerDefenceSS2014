package de.htwg.towerdefence2014.database.impl;

import junit.framework.TestCase;

import java.io.IOException;

import de.htwg.towerdefence2014.model.impl.Game;
import de.htwg.towerdefence2014.model.impl.Player;
import de.htwg.towerdefence2014.model.impl.PlayingField;


/**
 * TestCase for Class field
 */
public class Db4oDatabaseTest extends TestCase {
	
	Db4oDatabase db4o;
	
	PlayingField pField;
	
	Player player;
	
	Game game;
	
	public void setUp() throws IOException {
		db4o = new Db4oDatabase();
		pField = new PlayingField(5, 5);
		player = new Player();
		game = new Game(pField, player);
	}
	
	/**
	 * Tests for the field
	 */
	public void testDoc() {
		db4o.create();
		db4o.update(game);
		db4o.read().get(0);
		db4o.delete(game);
	}
}
