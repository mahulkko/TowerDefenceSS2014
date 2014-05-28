package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * <b>PersistentPlayer class</b>
 * <br>
 * Create a PersistentPlayer object for the CoucheDB Database
 * @author chknetsc
 */
public class PersistentPlayer extends CouchDbDocument {

	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	/** the UID for the serialization */
	private static final long serialVersionUID = -5550626038474233529L;
	
	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private String id;
	
	/** the name of the Player */
	private String name;
	
	/** the money from the Player */
	private int money;
	
	/** the life of the Player */
	private int life;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	/**
	 * Default Contructor
	 */
	public PersistentPlayer () {
	}


	/************************************************************
	 * Public methods
	 ***********************************************************/

	/**
	 * @return - the name of the Player
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name - set the name of the Player
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return - the money of the Player
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param name - set the money of the Player
	 */
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * @return - the life of the Player
	 */
	public int getLife() {
		return life;
	}

	/**
	 * @param name - set the life of the Player
	 */
	public void setLife(int life) {
		this.life = life;
	}
}
