package de.htwg.towerdefence2014.database.db4o;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.towerdefence2014.database.IDataAccessObject;
import de.htwg.towerdefence2014.model.impl.Game;

/**
 * <b>Db4oDatabase class</b>
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public class Db4oDatabase implements IDataAccessObject {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	/** ObjectContainer for Data  */
	private ObjectContainer db;
	
	/** Default Name of the Output File */
	private String fileName = "SaveGame.data";
	

	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	/**
	 * Default constructor
	 */
	public Db4oDatabase() {
	}

	
	/************************************************************
	 * Public methods
	 ***********************************************************/
	
	@Override
	/**
	 * Create a new Object Database with the default Filename
	 */
	public void create() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), fileName);
	}

	@SuppressWarnings("serial")
	@Override
	/**
	 * Read a Object from the Database and check if the Parameter are valid
	 * @return the Object if the Parameter are valid
	 */
	public List<Game> read() {
		return db.query(new Predicate<Game>() {
			@Override
			public boolean match(Game game) {
				return game.getPlayer() != null;
			}
		});
	}

	@Override
	/**
	 * Save or change a existing Object in the Database
	 * @param object
	 */
	public void update(Game game) {
		db.store(game);
	}
	
	
	@Override
	/**
	 * Delete a existing Object from the Database
	 * @param object
	 */
	public void delete(Game game) {
		db.delete(game);
	}
	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
