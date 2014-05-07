package de.htwg.towerdefence2014.database.couchdb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TDPlayingField")
public class PersistentPlayingField implements Serializable {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	private static final long serialVersionUID = -1221187500228103205L;
	
	@Id
	@GeneratedValue
	@Column(name = "playingFieldID")
	private long playingFieldID;
	
	@Column(name = "SizeX")
	private int sizeX;
	
	@Column(name = "SizeY")
	private int sizeY;
	
	@OneToMany(mappedBy = "pField")
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


//	public PersistentField[][] getFields() {
//		return fields;
//	}
//
//
	public void setFields(List<PersistentField> field) {
		this.fields = field;
	}
}
