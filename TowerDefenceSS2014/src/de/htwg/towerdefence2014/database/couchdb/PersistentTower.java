package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;


public class PersistentTower extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	private static final long serialVersionUID = -8802270163038398649L;
	

	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private Integer id;
	
	private int damage;

	private int range;

	private int speed;

	private int numberShoot;

	private double hitrate; 
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentTower () {
	}

	/************************************************************
	 * Public methods
	 ***********************************************************/

	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getNumberShoot() {
		return numberShoot;
	}


	public void setNumberShoot(int numberShoot) {
		this.numberShoot = numberShoot;
	}


	public double getHitrate() {
		return hitrate;
	}


	public void setHitrate(double hitrate) {
		this.hitrate = hitrate;
	}
}
