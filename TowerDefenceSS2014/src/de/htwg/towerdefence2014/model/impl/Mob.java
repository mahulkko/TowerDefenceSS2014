package de.htwg.towerdefence2014.model.impl;

import org.apache.log4j.Logger;
import de.htwg.towerdefence2014.gameSettings.GameSettings;
import de.htwg.towerdefence2014.model.IMob;

/**
 * <b>Mob Class</b>
 * <br>
 * Implements IMob Interface
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public class Mob implements IMob {
	
	/**
     * Logger for log4j connection
     */
    private static Logger log = Logger.getLogger("TowerDefence.Model.Tower");
    
    /**
     * Current health of the mob
     */
	private int health;	
	
	/**
	 * Speed of the mob
	 */
	private int speed;
	
	/**
	 * Default constructor - initialize a mob with the default values
	 */
	public Mob() {
		this.speed = GameSettings.getMobSpeed();
		this.health = GameSettings.getMobHealth();
		log.info("Added new mob with default values from GameSettings");
	}
	
	/**
	 * <b>Mob constructor - initialize a mob with the given values</b>
	 * @param health - Health of the mob
	 * @param speed - speed of the mob
	 */
	public Mob(int health, int speed) {
		this.health = health;
		this.speed = speed;
		log.info("Added new mob with health: " + this.health + " | Speed: " + this.speed);
	}
	
	@Override
	/**
	 * @return Returns the current health state of the mob
	 */
	public int getHealth() {
		return this.health;
	}
	
	@Override
	/**
	 * @param health - Set the health of the mob
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	/**
	 * @return Returns the speed of the mob
	 */
	public int getSpeed() {
		return this.speed;
	}
	
	@Override
	/**
	 * @param speed - Set the speed of the mob
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	/**
	 * @return Returns true when the mob is dead
	 */
	public boolean isDead() {
		if (this.health <= 0) {
			return true;
		}
		return false;					
	}
}
