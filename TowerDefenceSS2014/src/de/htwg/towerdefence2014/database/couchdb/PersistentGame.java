package de.htwg.towerdefence2014.database.couchdb;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;


public class PersistentGame extends CouchDbDocument {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3087770570299602788L;

	/************************************************************
	 * Private variables
	 ***********************************************************/

	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private String id;
	
	private PersistentPlayingField pField;

	private PersistentPlayer player;	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentGame () {
	}
	
	
	/************************************************************
	 * Public methods
	 ***********************************************************/
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public PersistentPlayingField getPlayingField() {
		return pField;
	}
	
	public void setPlayingField(PersistentPlayingField pField) {
		this.pField = pField;
	}
	
	public PersistentPlayer getPlayer() {
		return player;
	}
	
	public void setPlayer(PersistentPlayer pPlayer) {
		this.player = pPlayer;
	}
}
