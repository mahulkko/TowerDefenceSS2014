package de.htwg.towerdefence2014.model.impl;

import java.io.IOException;

import de.htwg.towerdefence2014.model.IMob;
import junit.framework.TestCase;

public class MobTest extends TestCase {
	
	IMob mob;
	IMob mob2;
	
	public void setUp() throws IOException {
		mob = new Mob();
		mob2 = new Mob(100, 10);
	}
	
	public void testDoc() {
		
		// Set and Get live
		mob.setHealth(10);
		assertEquals(10, mob.getHealth());
		
		// Set and Get Speed
		mob.setSpeed(2);
		assertEquals(2, mob.getSpeed());
		
		// mobDead
		assertEquals(false, mob.isDead());
		mob.setHealth(0);
		assertEquals(true, mob.isDead());
	}
}
