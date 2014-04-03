package de.htwg.towerdefence2014.model.impl;

import java.io.IOException;

import de.htwg.towerdefence2014.model.IPlayer;
import de.htwg.towerdefence2014.model.impl.Player;
import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	IPlayer player;
	
	
	public void setUp() throws IOException {
		player = new Player();
	}
	
	public void testDoc() {
		
		// Set and Get Name 
		player.setName("Rudolf");
		assertEquals("Rudolf", player.getName());
		
		// Set and Get Life
		player.setLife(13);
		assertEquals(13, player.getLife());
		
		// Set and Get Money
		player.setMoney(50);
		assertEquals(50, player.getMoney());
		
	}

}
