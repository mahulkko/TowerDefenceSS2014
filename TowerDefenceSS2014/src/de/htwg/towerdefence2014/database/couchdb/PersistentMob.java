package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;


public class PersistentMob extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	private static final long serialVersionUID = -1908272019895680801L;
	

	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private Integer id;
	
	private int health;	
	
	private int speed;
	
	public PersistentField fild;
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentMob () {
	}
	

	/************************************************************
	 * Public methods
	 ***********************************************************/

	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public PersistentField getFild() {
		return fild;
	}


	public void setFild(PersistentField fild) {
		this.fild = fild;
	}
}
