package de.htwg.towerdefence2014.model.impl;

import de.htwg.towerdefence2014.gameSettings.GameSettings;
import de.htwg.towerdefence2014.model.ITower;

/**
 * <b>Tower Class</b>
 * <br>
 * Implements ITower Interface
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public class Tower implements ITower {
	
	/**
	 * Damage of the tower
	 */
	private int damage;
	
	/**
	 * Range of the tower
	 */
	private int range;
	
	/**
	 * Speed of the tower
	 */
	private int speed;
	
	/**
	 * Number of shoots from the tower. With this parameter the tower can deal splash damage on each round.
	 */
	private int numberShoot;
	
	/**
	 * Hitrate of the tower. Hitrate is the change to deal a hit with max damage.
	 */
	private double hitrate; 
	
	/**
	 * Default constructor - initialize a tower with the default values
	 */
	public Tower() {
		this.damage = GameSettings.getTowerDamage();
		this.range = GameSettings.getTowerRange();
		this.speed = GameSettings.getTowerSpeed();
		this.numberShoot = GameSettings.getTowerNumberOfShoot();
		this.hitrate = GameSettings.getTowerHitRate();
	}
	
	/**
	 * <b>Tower constructor - initialize a tower with the given values</b>
	 * @param damage - Damage of the tower
	 * @param range - Range of the tower 
	 * @param speed - Speed of the tower
	 * @param numberShoot - Number of shoot from the tower. With this parameter the tower can deal splash damage on each round.
	 * @param hitrate - Hitrate of the tower. Hitrate is the change to deal a hit with max damage.
	 */
	public Tower(int damage, int range, int speed, int numberShoot, double hitrate) {
		this.damage = damage;
		this.range = range;
		this.speed = speed;
		this.numberShoot = numberShoot;
		this.hitrate = hitrate;
	}
		
	/**
	 * @return Returns the max damage that the tower can make
	 */
    public int getDamage() {
    	return this.damage;
    }
    
    /**
     * @param damage - Set the max damage that the tower can make
     * @return
     */
    public void setDamage(int damage) {
    	this.damage = damage;
    }
    
    /**
     * @return Returns the hitrate of the tower. Hitrate is the change to deal a hit with max damage.
     */
    public double getHitRate() {
    	return this.hitrate;
    }
    
    /**
     * @param hitrate - Set the hitrate of the tower. Hitrate is the change to deal a hit with max damage.
     */
    public void setHitRate(double hitrate) {
    	this.hitrate = hitrate;
    }
    
    /**
     * @return Returns the number of shoots. With this parameter the tower can deal splash damage on each round.
     */
    public int getNumberOfShoot() {
    	return this.numberShoot;
    }
    
    /**
     * @param numbershoot - Set the number of shoots of the tower. With this parameter the tower can deal splash damage on each round.
     */
    public void setNumberOfShoot(int numbershoot) {
    	this.numberShoot = numbershoot;
    }
    
    /**
     * @return Returns the shooting range of the tower
     */
    public int getRange() {
    	return this.range;
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
    	return this.speed;
    }
    
    /**
     * @param speed - Set the attacking speed of the tower
     */
    public void setSpeed(int speed) {
    	this.speed = speed;
    }
    
    /**
     * @return Returns a calculated damage from all parameters
     */
    public int calcDamage() {
    	//TODO(mh): implement me
    	return 0;
    }
}
