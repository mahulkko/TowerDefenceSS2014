package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;


public class PersistentPlayer extends CouchDbDocument {

	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	private static final long serialVersionUID = -5550626038474233529L;
	
	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private String id;
	
	private String name;
	
	private int money;
	
	private int life;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentPlayer () {
	}


	/************************************************************
	 * Public methods
	 ***********************************************************/

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}
}
