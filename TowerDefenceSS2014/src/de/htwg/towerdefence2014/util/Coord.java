package de.htwg.towerdefence2014.util;

/**
* <b>Class Coord</b>
* @author Christoph Knetschke and Martin Hulkkonen
*/
public class Coord {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	/** X - Coordinate */
    private int x;
    
    /** Y - Coordinate */
    private int y;
    
    
    /************************************************************
	 * Public constructor
	 ***********************************************************/
    
    /**
     * Default constructor of the coord
     */
	public Coord(){
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor of the coord
	 * @param x - X Coordinate
	 * @param y - Y Coordinate
	 */
	public Coord(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	/************************************************************
	 * Public methods
	 ***********************************************************/
	
	/**
	 * <b>Get the X-Coordinate</b>
	 * @return Returns the x coordinate
	 */
	public int getX() {
		return this.x;
	}
	 
	/**
	 * <b>Set the X-Coordinate</b>
	 * @param x - X Coordinate
	 * @return Returns <b>true</b> when the coordinate can be set, otherwise <b>false</b> 
	 */
	public boolean setX(int x) {
		if (x >= 0) {
			this.x = x;
			return true;
		}
		return false;
	}
	 
	/**
	 * <b>Get the Y-Coordinate</b>
	 * @return Returns the y coordinate
	 */
	public int getY() {
		return this.y;
	}
	     
	/**
	 * <b>Set the Y-Coordinate</b>
	 * @param y - Y Coordinate
	 * @return Returns <b>true</b> when the coordinate can be set, otherwise <b>false</b> 
	 */
	public boolean setY(int y) {
		if (y >= 0) {
			this.y = y;
			return true;
		}
		return false;
	}
}
