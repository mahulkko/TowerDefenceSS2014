package de.htwg.towerdefence2014.database.impl;

import junit.framework.TestCase;

import java.io.IOException;

import de.htwg.towerdefence2014.model.impl.PlayingField;


/**
 * TestCase for Class field
 */
public class Db4oDatabaseTest extends TestCase {
	
	Db4oDatabase db4o;
	
	PlayingField pField;
	
	public void setUp() throws IOException {
		db4o = new Db4oDatabase();
		pField = new PlayingField(5, 5);
	}
	
	/**
	 * Tests for the field
	 */
	public void testDoc() {
		db4o.create();
		db4o.update(pField);
		
		assertEquals(pField, db4o.read());
		
		db4o.update(pField);
		db4o.delete(pField);
	}
}
