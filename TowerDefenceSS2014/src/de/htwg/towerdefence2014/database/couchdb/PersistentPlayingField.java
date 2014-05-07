package de.htwg.towerdefence2014.database.couchdb;

import java.util.List;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;


public class PersistentPlayingField extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	private static final long serialVersionUID = -1221187500228103205L;
	

	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private long playingFieldID;
	
	private int sizeX;
	
	private int sizeY;
	
	private List<PersistentField> fields;
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentPlayingField () {
	}
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

	public int getSizeX() {
		return sizeX;
	}


	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}


	public int getSizeY() {
		return sizeY;
	}


	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}


	public List<PersistentField> getFields() {
		return fields;
	}


	public void setFields(List<PersistentField> field) {
		this.fields = field;
	}
}
