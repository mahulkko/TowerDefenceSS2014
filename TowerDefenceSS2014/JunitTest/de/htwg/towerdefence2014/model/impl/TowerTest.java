package de.htwg.towerdefence2014.model.impl;

import java.io.IOException;
import de.htwg.towerdefence2014.model.ITower;
import junit.framework.TestCase;

/**
 * TesCase for class Tower
 * @author Christoph Knetschke and Martin Hulkkonen
 *
 */
public class TowerTest extends TestCase {
	
	/**
	 * Tower instance one
	 */
	ITower tower;
	
	/**
	 * Tower instance two
	 */
	ITower tower2;
	
	/**
	 * Set up the test
	 */
	public void setUp() throws IOException {
		tower = new Tower(1, 1, 1, 1, 1.0);
		tower2 = new Tower();
	}
	
	/**
	 * Test for the tower
	 */
	public void testDoc() {
		
		// Set and Get Damage
		tower.setDamage(1);
		assertEquals(1,tower.getDamage());
		
		// Set and Get Speed
	    tower.setSpeed(1);
		assertEquals(1,tower.getSpeed());
		
		// Set and Get Range
		tower.setRange(1);
		assertEquals(1,tower.getRange());
		
		// Set and Get HitRate
		tower.setHitRate(1.0);
		assertEquals(1.0,tower.getHitRate());
		
		// CalcDamage 
		assertEquals(1,tower.calcDamage());
		tower.setHitRate(0.0);
		assertEquals(0,tower.calcDamage());
		
		// Set and Get NumberShoot
		tower.setNumberOfShoot(1);
		assertEquals(1,tower.getNumberOfShoot());
	}
}