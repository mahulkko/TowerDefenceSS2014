package de.htwg.towerdefence2014.database.impl;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.towerdefence2014.database.IDataAccessObject;

/**
 * <b>Db4oDatabase Class</b>
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public class Db4oDatabase implements IDataAccessObject {
	
	/** ObjectContainer for Data  */
	private ObjectContainer db;
	
	/** Default Name of the Output File */
	private String fileName = "SaveGame.data";
	
	/**
	 * Default constructor
	 */
	public Db4oDatabase() {
	}

	@Override
	/**
	 * Create a new Object Database with the default Filename
	 */
	public void create() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), fileName);
	}

	@Override
	/**
	 * Read a Object from the Database and check if the Parameter are valid
	 * @return the Object if the Parameter are valid
	 */
	public Object read() {
		return db.query(new Predicate<Object>() {
			@Override
			public boolean match(Object object) {
				return true;
			}
		});
	}

	@Override
	/**
	 * Save or change a existing Object in the Database
	 * @param object
	 */
	public void update(Object object) {
		db.store(object);
	}
	
	
	@Override
	/**
	 * Delete a existing Object from the Database
	 * @param object
	 */
	public void delete(Object object) {
		db.delete(object);
	}
}
