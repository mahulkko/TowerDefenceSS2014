package de.htwg.towerdefence2014.database;

public interface IDataAccessObject {
	
	/**
	 * Create a new Object Database with the default Filename
	 */
	void create();
	
	/**
	 * Read a Object from the Database and check if the Parameter are valid
	 * @return the Object if the Parameter are valid
	 */
	Object read();
	
	/**
	 * Save or change a existing Object in the Database
	 * @param object 
	 */
	void update(Object object);
	
	/**
	 * Delete a existing Object from the Database
	 * @param object
	 */
	void delete(Object object);
}
