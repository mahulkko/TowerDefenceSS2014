package de.htwg.towerdefence2014.database;

import java.util.List;

import de.htwg.towerdefence2014.model.impl.Game;

/**
 * <b>IDataAccessObject class</b>
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public interface IDataAccessObject {
	
	/**
	 * Create a new Object Database with the default Filename
	 */
	void create();
	
	/**
	 * Read a Object from the Database and check if the Parameter are valid
	 * @return the Object if the Parameter are valid
	 */
	List<Game> read();
	
	/**
	 * Save or change a existing Object in the Database
	 * @param object 
	 */
	void update(Game game);
	
	/**
	 * Delete a existing Object from the Database
	 * @param object
	 */
	void delete(Game game);

	/**
	 * Delete all existing Objects from the Database
	 */
	void deleteAll();
}
