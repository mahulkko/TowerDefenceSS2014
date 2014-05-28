package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * <b>PersistentMob class</b>
 * <br>
 * Create a PersistentMob Object for the CoucheDB Database
 * @author chknetsc
 */
public class PersistentMob extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	/** the UID for the serialization */
	private static final long serialVersionUID = -1908272019895680801L;
	
	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private Integer id;
	
	/** the health of the mob */
	private int health;	
	
	/** the speed of the mob */
	private int speed;
	
	/** the fild where the mob is located */
	public PersistentField fild;
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	/**
	 * Default Constructor
	 */
	public PersistentMob () {
	}
	

	/************************************************************
	 * Public methods
	 ***********************************************************/

	/**
	 * @return - the health of the mob
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health - set the health of the mob
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return - the speed of the mob
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed - set the speed of the mob
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * @return - the fild where the mob is located
	 */
	public PersistentField getFild() {
		return fild;
	}

	/**
	 * @param fild - set the fild where the mob is located
	 */
	public void setFild(PersistentField fild) {
		this.fild = fild;
	}
}
