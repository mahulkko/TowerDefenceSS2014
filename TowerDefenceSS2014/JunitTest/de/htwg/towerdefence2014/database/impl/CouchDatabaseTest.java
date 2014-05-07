package de.htwg.towerdefence2014.database.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import de.htwg.towerdefence2014.database.couchdb.CouchDatabase;
import de.htwg.towerdefence2014.model.IMob;
import de.htwg.towerdefence2014.model.impl.Game;
import de.htwg.towerdefence2014.model.impl.Mob;
import de.htwg.towerdefence2014.model.impl.Player;
import de.htwg.towerdefence2014.model.impl.PlayingField;
import de.htwg.towerdefence2014.model.impl.Tower;

public class CouchDatabaseTest extends TestCase {

	CouchDatabase couchDB;
	
	Game game;
	
	Player player;
	
	PlayingField pField;
	
	Tower tower;
	
	List<IMob> mobs;
	
	public void setUp() throws IOException {
		couchDB = new CouchDatabase();
		game = new Game();
		game.setId(1);
		player = new Player();
		tower = new Tower();
		mobs = new ArrayList<IMob>();
		for(int i = 0; i < 5; ++i) {
			mobs.add(new Mob());
		}
		
		pField = new PlayingField(2,2);
		pField.setListMob(1, 1, mobs);
		pField.setTower(0, 1, tower);
		
		game.setPlayer(player);
		game.setPlayingField(pField);
	}
	
	/**
	 * Tests for the field
	 */
	public void testDoc() {
		couchDB.create();
		couchDB.update(game);
		Game newGame = couchDB.read().get(0);
		couchDB.delete(game);
	}

}
