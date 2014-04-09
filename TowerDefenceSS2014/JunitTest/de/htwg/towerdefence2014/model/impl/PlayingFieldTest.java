package de.htwg.towerdefence2014.model.impl;

import java.io.IOException;
import java.util.LinkedList;

import de.htwg.towerdefence2014.model.IMob;
import de.htwg.towerdefence2014.model.IPlayingField;
import de.htwg.towerdefence2014.model.ITower;
import de.htwg.towerdefence2014.util.enums.FieldType;
import junit.framework.TestCase;

public class PlayingFieldTest extends TestCase {
	
	IPlayingField f;
	IPlayingField field;
	ITower tower;
	IMob mob1;
	IMob mob2;
	IMob mob3;
	
	public void setUp() throws IOException {
		this.f = new PlayingField();
		this.field = new PlayingField(10,10);
		this.f.initPlayingField(10, 10);
		this.tower = new Tower(1,1,1,1,1.0);
		this.mob1 = new Mob();
		this.mob1.setHealth(100);
		this.mob1.setSpeed(2);
		this.mob2 = new Mob();
		this.mob2.setHealth(100);
		this.mob2.setSpeed(2);
		this.mob3 = new Mob();
		this.mob3.setHealth(100);
		this.mob3.setSpeed(2);
	}
	
	public void testDoc() {
		
		// Set Tower
		assertEquals(false, this.f.setTower(11, 11, this.tower));
		assertEquals(false, this.f.setTower(8, 11, this.tower));
		assertEquals(false, this.f.setTower(11, 8, this.tower));
		assertEquals(true, this.f.setTower(9, 9, this.tower));
		
		
		// Get Tower
		assertEquals(null,this.f.getTower(11, 11));
		assertEquals(null,this.f.getTower(8, 11));
		assertEquals(null,this.f.getTower(11, 8));
		assertEquals(this.tower,this.f.getTower(9, 9));
		
		
		// Is Set Tower
		assertEquals(false,this.f.isSetTower(11, 11));
		assertEquals(false,this.f.isSetTower(8, 11));
		assertEquals(false,this.f.isSetTower(11, 8));
		assertEquals(true,this.f.isSetTower(9, 9));
		
		// Delete Tower
		assertEquals(null,this.f.deleteTower(11, 11));
		assertEquals(null,this.f.deleteTower(8, 11));
		assertEquals(null,this.f.deleteTower(11, 8));
		assertEquals(this.tower,this.f.deleteTower(9, 9));
		
		// Set Mob
		assertEquals(false,this.f.setMob(11, 11, this.mob1));
		assertEquals(false,this.f.setMob(8, 11, this.mob1));
		assertEquals(false,this.f.setMob(11, 8, this.mob1));
		assertEquals(true,this.f.setMob(8, 8, this.mob1));
		assertEquals(true,this.f.setMob(8, 8, this.mob2));
		
		// Get Mob
		assertEquals(null,this.f.getMobs(11, 11));
		assertEquals(null,this.f.getMobs(8, 11));
		assertEquals(null,this.f.getMobs(11, 8));
		LinkedList<IMob> mobs = new LinkedList<IMob>();
		assertEquals(mobs,this.f.getMobs(1, 1));
		
		// Set List mob
		mobs.add(mob3);
		assertEquals(false,this.f.setListMob(11, 11, mobs));
		assertEquals(false,this.f.setListMob(8, 11, mobs));
		assertEquals(false,this.f.setListMob(11, 8, mobs));
		assertEquals(true,this.f.setListMob(2, 2, mobs));
		
		// Get Number of mobs
		assertEquals(-1,this.f.getNumberOfMobs(11, 11));
		assertEquals(-1,this.f.getNumberOfMobs(8, 11));
		assertEquals(-1,this.f.getNumberOfMobs(11, 8));
		assertEquals(2,this.f.getNumberOfMobs(8, 8));
		
		// Delete all mobs
		assertEquals(false,this.f.deleteAllMobs(11, 11));
		assertEquals(false,this.f.deleteAllMobs(1, 11));
		assertEquals(false,this.f.deleteAllMobs(11, 1));
		assertEquals(true,this.f.deleteAllMobs(2, 2));
		
		// Delete Dead Mobs
		assertEquals(false,this.f.deleteDeadMobs(11, 11));
		assertEquals(false,this.f.deleteDeadMobs(1, 11));
		assertEquals(false,this.f.deleteDeadMobs(11, 1));
		assertEquals(false,this.f.deleteDeadMobs(8, 8));
		
		// Get Type of
		assertEquals(FieldType.UNDEFINED ,this.f.getTypeOf(11, 11));
		assertEquals(FieldType.UNDEFINED ,this.f.getTypeOf(1, 11));
		assertEquals(FieldType.UNDEFINED ,this.f.getTypeOf(11, 1));
		assertEquals(FieldType.NONE ,this.f.getTypeOf(1, 1));
	}
}

