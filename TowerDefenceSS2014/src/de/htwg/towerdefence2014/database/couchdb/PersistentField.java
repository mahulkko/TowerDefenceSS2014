package de.htwg.towerdefence2014.database.couchdb;

import java.util.List;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * <b>PersistentField class</b>
 * <br>
 * Create a PersistentField for the CoucheDB Database
 * @author chknetsc
 */
public class PersistentField extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/

	/** the UID for the serialization */
	private static final long serialVersionUID = 7510732657083022784L;

	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private long id;
	
	/** a PersistentPlayingField object */
	@SuppressWarnings("unused")
	private PersistentPlayingField pField;
	
	/** a PersistentTower object */
	private PersistentTower tower;
	
	/** a list of PersistentMob objects */
	private List<PersistentMob> mobs;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	/**
	 * Default Constructor
	 */
	public PersistentField () {
	}
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

	/**
	 * @return - the PersistentTower object
	 */
	public PersistentTower getTower() {
		return tower;
	}

	/**
	 * @param tower - set the PersistentTower object
	 */
	public void setTower(PersistentTower tower) {
		this.tower = tower;
	}


	/**
	 * @return - a list of PersistentMob objects
	 */
	public List<PersistentMob> getMobs() {
		return mobs;
	}

	/**
	 * @param mobs  - set a list of PersistentMob objects
	 */
	public void setMobs(List<PersistentMob> mobs) {
		this.mobs = mobs;
	}
}
