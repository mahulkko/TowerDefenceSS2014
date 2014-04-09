package de.htwg.towerdefence2014.model.impl;

import junit.framework.TestCase;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import de.htwg.towerdefence2014.model.IMob;
import de.htwg.towerdefence2014.model.ITower;
import de.htwg.towerdefence2014.util.enums.FieldType;

/**
 * TestCase for Class field
 */
public class FieldTest extends TestCase {
	
	/**
	 * Instance of the field
	 */
	Field field;
	
	/**
	 * Instance of the tower
	 */
	ITower tower;
	
	/**
	 * Mob instance 1
	 */
	IMob mob;
	
	/**
	 * Mob instance 2
	 */
	IMob mob2;
	
	/**
	 * mob instance 3
	 */
	IMob mob3;
	
	/**
	 * Set up the test
	 */
	public void setUp() throws IOException {
		field = new Field();
		tower = new Tower(1, 1, 1, 1, 1.0);
		mob = new Mob();
		mob2 = new Mob();
		mob3 = new Mob();
	}
	
	/**
	 * Tests for the field
	 */
	public void testDoc() {
		
		// Check type of the field
		assertEquals(FieldType.NONE, field.getTypeOf());
		
		// Set and get a  tower
		assertEquals(true, field.setTower(tower));
		assertEquals(false, field.setTower(tower));
		assertEquals(tower, field.getTower());
		
		// Set a mob
		assertEquals(false, field.setMob(mob));
		
		// Check type of the field
		assertEquals(FieldType.TOWER, field.getTypeOf());
		
		// Delete tower
		assertEquals(tower, field.deleteTower());
		assertEquals(null, field.deleteTower());
		
		// Set a mob
		assertEquals(true, field.setMob(mob));
		
		// Check type of the field
		assertEquals(FieldType.MOB, field.getTypeOf());
		
		// Delete a mob
		assertEquals(true, field.deleteAllMobs());
		assertEquals(false, field.deleteAllMobs());
		
		// Set a mob
		assertEquals(true, field.setMob(mob));
		assertEquals(true, field.setMob(mob2));
		mob.setHealth(0);
		
		// Delete a dead mob
		assertEquals(true, field.deleteDeadMobs());
		assertEquals(false, field.deleteDeadMobs());
		
		// Delete a mob
		assertEquals(true, field.deleteAllMobs());
		mob.setHealth(30);
		
		// Add a list
		List<IMob> list = new LinkedList<IMob>();
		list.add(mob);
		list.add(mob2);
		list.add(mob3);
		
		assertEquals(true, field.setTower(tower));
		assertEquals(false, field.setListMob(list));
		assertEquals(tower, field.deleteTower());
		
		assertEquals(true, field.setListMob(list));
		assertEquals(list, field.getMobs());
		
		
	}
}
