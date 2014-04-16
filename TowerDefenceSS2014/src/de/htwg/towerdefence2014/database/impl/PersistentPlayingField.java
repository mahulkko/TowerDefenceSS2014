package de.htwg.towerdefence2014.database.impl;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@OneToMany(mappedBy = "TDPlayingField")
	@Column(name = "Field")
	private List<PersistentField> fields;
	
	@Column(name = "SizeX")
	private int sizeX;
	
	@Column(name = "SizeY")
	private int sizeY;
	
	
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
}
