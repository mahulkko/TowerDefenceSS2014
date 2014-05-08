package de.htwg.towerdefence2014.database.impl;

import junit.framework.TestCase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.htwg.towerdefence2014.database.hibernate.HibernateDatabase;
import de.htwg.towerdefence2014.model.IMob;
import de.htwg.towerdefence2014.model.impl.Game;
import de.htwg.towerdefence2014.model.impl.Mob;
import de.htwg.towerdefence2014.model.impl.Player;
import de.htwg.towerdefence2014.model.impl.PlayingField;
import de.htwg.towerdefence2014.model.impl.Tower;


/**
 * TestCase for Class field
 */
public class HibernateDatabaseTest extends TestCase {
	
	HibernateDatabase hibDatabase;
	
	Game game;
	
	Player player;
	
	PlayingField pField;
	
	Tower tower;
	
	List<IMob> mobs;
	
	public void setUp() throws IOException {
		hibDatabase = new HibernateDatabase();
		
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
		hibDatabase.create();
		hibDatabase.update(game);
//		hibDatabase.read().get(0);
//		hibDatabase.delete(game);
//		hibDatabase.deleteAll();
	}
}
