package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * <b>PersistentTower class</b>
 * <br>
 * Create a PersistentTower Object for the CoucheDB Database
 * @author chknetsc
 */
public class PersistentTower extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	/** the UID for the serialization */
	private static final long serialVersionUID = -8802270163038398649L;

	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private Integer id;
	
	/** Damage of the tower */
	private int damage;

	/** Range of the tower */
	private int range;

	/** Speed of the tower */
	private int speed;

	/** Number of shoots from the tower. With this parameter the tower can deal splash damage on each round. */
	private int numberShoot;

	/** Hitrate of the tower. Hitrate is the change to deal a hit with max damage. */
	private double hitrate; 
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	/**
	 * Default Constructor
	 */
	public PersistentTower () {
	}

	/************************************************************
	 * Public methods
	 ***********************************************************/

	/**
	 * @return Returns the max damage that the tower can make
	 */
	public int getDamage() {
		return damage;
	}

	/**
    * @param damage - Set the max damage that the tower can make
    */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	/**
     * @return Returns the shooting range of the tower
     */
	public int getRange() {
		return range;
	}

	/**
     * @param range - Set the shooting range of the tower
     */
	public void setRange(int range) {
		this.range = range;
	}

	/**
     * @return Returns the attacking speed of the tower
     */
	public int getSpeed() {
		return speed;
	}

	/**
     * @param speed - Set the attacking speed of the tower
     */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
     * @return Returns the number of shoots. With this parameter the tower can deal splash damage on each round.
     */
	public int getNumberShoot() {
		return numberShoot;
	}

	/**
     * @param numbershoot - Set the number of shoots of the tower. With this parameter the tower can deal splash damage on each round.
     */
	public void setNumberShoot(int numberShoot) {
		this.numberShoot = numberShoot;
	}

	/**
     * @return Returns the hitrate of the tower. Hitrate is the change to deal a hit with max damage.
     */
	public double getHitrate() {
		return hitrate;
	}

	/**
     * @param hitrate - Set the hitrate of the tower. Hitrate is the change to deal a hit with max damage.
     */
	public void setHitrate(double hitrate) {
		this.hitrate = hitrate;
	}
}
