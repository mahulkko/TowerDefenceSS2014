package de.htwg.towerdefence2014.database.couchdb;

import java.util.List;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

/**
 * <b>PersistentPlayingField class</b>
 * <br>
 * Create a PersistentPlayingField for the CoucheDB Database
 * @author chknetsc
 */
public class PersistentPlayingField extends CouchDbDocument {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	/** the UID for the serialization */
	private static final long serialVersionUID = -1221187500228103205L;
	
	/**
	 * @TypeDiscriminator is used to mark properties that makes this class's
	 *                    documents unique in the database.
	 */
	@TypeDiscriminator
	private long playingFieldID;
	
	/** the x size of the PlayingField */
	private int sizeX;
	
	/** the y size of the PlayingField */
	private int sizeY;
	
	/** a list of field objects */
	private List<PersistentField> fields;
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	/**
	 * Default Constructor
	 */
	public PersistentPlayingField () {
	}
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

	/**
	 * @return - the x size of the PeristentPlayingField
	 */
	public int getSizeX() {
		return sizeX;
	}

	/**
	 * @param sizeX - set the x size of the PeristentPlayingField
	 */
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	/**
	 * @return - the y size of the PeristentPlayingField
	 */
	public int getSizeY() {
		return sizeY;
	}

	/**
	 * @param sizeY - set the y size of the PeristentPlayingField
	 */
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	/**
	 * @return - the list of PersistentField objects
	 */
	public List<PersistentField> getFields() {
		return fields;
	}

	/**
	 * @param field - set a list of PersistentField objects
	 */
	public void setFields(List<PersistentField> field) {
		this.fields = field;
	}
}
