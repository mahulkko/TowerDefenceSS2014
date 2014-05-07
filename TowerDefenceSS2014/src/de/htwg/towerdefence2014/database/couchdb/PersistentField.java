package de.htwg.towerdefence2014.database.couchdb;

import java.util.List;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;


public class PersistentField extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/

	private static final long serialVersionUID = 7510732657083022784L;
	

	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private long id;
	
	private PersistentPlayingField pField;
	
	private PersistentTower tower;
	
	private List<PersistentMob> mobs;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentField () {
	}
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

	public PersistentTower getTower() {
		return tower;
	}


	public void setTower(PersistentTower tower) {
		this.tower = tower;
	}


	public List<PersistentMob> getMobs() {
		return mobs;
	}


	public void setMobs(List<PersistentMob> mobs) {
		this.mobs = mobs;
	}
}
