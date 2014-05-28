package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * <b>PersistentGame class</b>
 * <br>
 * Create a PeristentGame Object for the CoucheDB Database
 * @author chknetsc
 */
public class PersistentGame extends CouchDbDocument {

	/************************************************************
	 * Private variables
	 ***********************************************************/

	/** the UID for the serialization */
	private static final long serialVersionUID = 3087770570299602788L;
	
	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private String id;
	
	/** PeristentPlayingField object for save on database */
	private PersistentPlayingField pField;

	/** PeristentPlayer object for save on database */
	private PersistentPlayer player;	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	/**
	 * Default Constructor
	 */
	public PersistentGame () {
	}
	
	
	/************************************************************
	 * Public methods
	 ***********************************************************/
	
	/**
	 * @return - Returns the if of the object
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param - Set the id of the object
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return - the PersistentPlayingField object
	 */
	public PersistentPlayingField getPlayingField() {
		return pField;
	}
	
	/**
	 * @param pField - set the PersistentPlayingField object
	 */
	public void setPlayingField(PersistentPlayingField pField) {
		this.pField = pField;
	}
	
	/**
	 * @return - the PersistentPlayer object
	 */
	public PersistentPlayer getPlayer() {
		return player;
	}
	
	/**
	 * @param pPlayer - set the PersistentPlayer object
	 */
	public void setPlayer(PersistentPlayer pPlayer) {
		this.player = pPlayer;
	}
}
