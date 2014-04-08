package de.htwg.towerdefence2014.model.impl;

import java.util.List;

import org.apache.log4j.Logger;

import de.htwg.towerdefence2014.model.IMob;
import de.htwg.towerdefence2014.model.IPlayingField;
import de.htwg.towerdefence2014.model.ITower;
import de.htwg.towerdefence2014.util.enums.FieldType;

/**
 * <b>PlayingField Class</b>
 * * <br>
 * Implements IPlayingField Interface
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public class PlayingField implements IPlayingField {
	
	/**
     * Logger for log4j connection
     */
    private static Logger log = Logger.getLogger("TowerDefence.Model.PlayingField");
    
	/**
	 * <b>Initialize the playing field</b>
	 * @param sizeX - Size of the playing field on x
	 * @param sizeY - Size of the playing field on y
	 */
    public void initPlayingField(int sizeX, int sizeY) {
    	log.info("Initialize the playing field");
    }
    
    /**
     * <b>Set a new tower on the playing field</b>
     * @param x - X coordinate of the tower
     * @param y - Y coordinate of the tower
     * @param tower - Tower where to set
     * @return Returns <b>true</b> when the tower is set or <b>false</b> when the tower can't be set
     */
	public boolean setTower(int x, int y, ITower tower) {
		return false;
	}
	
	/**
	 * <b>Returns the tower on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns the tower instance or null pointer
	 */
	public ITower getTower(int x, int y) {
		return null;
	}
	
	/**
	 * <b>Delete the tower on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns the tower instance or null pointer
	 */
	public ITower deleteTower(int x, int y) {
		return null;
	}
	
	/**
	 * <b>Checks if there is set a tower in the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns true when there is set a tower otherwise false 
	 */
	public boolean isSetTower(int x, int y) {
		return false;
	}
	
	/**
	 * <b>Set a mob on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @param mob - Instance of the mob where to set
	 * @return Returns true when the mob is set on the playing field otherwise false
	 */
	public boolean setMob(int x, int y, IMob mob) {
		return false;
	}
	
	/**
	 * <b>Set a list of mobs on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @param mobs - List of mob instances where to set
	 * @return Returns true when the list of mob can be set on the playing field otherwise false
	 */
	public boolean setListMob(int x, int y, List<IMob> mobs) {
		return false;
	}
	
	/**
	 * <b>Returns a list of all mobs where are on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns a list of mobs
	 */
	public List<IMob> getMobs(int x, int y) {
		return null;
	}
	
	/**
	 * <b>Returns the number of mobs on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns the number of mobs
	 */
	public int getNumberOfMobs(int x, int y) {
		return 0;
	}
	
	/**
	 * <b>Deletes all mobs on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns true when there was something to delete otherwise false
	 */
	public boolean deleteAllMobs(int x, int y) {
		return false;
	}
	
	/**
	 * <b>Deletes all dead mobs on the selected playing field</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns true when there was something to delete otherwise false
	 */
	public boolean deleteDeadMobs(int x, int y) {
		return false;
	}
	
	/**
	 * <b>Returns the type of the selected playing field.</b>
	 * @param x - X coordinate of the selected playing field
	 * @param y - Y coordinate of the selected playing field
	 * @return Returns the type of the field and what's standing on it.
	 */
	public FieldType getTypeOf(int x, int y) {
		return FieldType.NONE;
	}
	
	/**
	 * @return Returns the x size of the initialized playing field
	 */
	public int getSizeX() {
		return 0;
	}
	
	/**
	 * @return Returns the y size of the initialized playing field
	 */
	public int getSizeY() {
		return 0;
	}
}
