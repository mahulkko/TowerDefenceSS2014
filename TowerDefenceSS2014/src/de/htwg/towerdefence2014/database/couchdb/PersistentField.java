package de.htwg.towerdefence2014.database.couchdb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TDField")
public class PersistentField implements Serializable {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/

	private static final long serialVersionUID = 7510732657083022784L;
	
	@Id
	@GeneratedValue
	@Column(name = "pFieldID")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "PlayingFieldID")
	private PersistentPlayingField pField;
	
//	@OneToOne
//	private PersistentTower tower;
//	
//	@OneToMany
//	private List<PersistentMob> mobs;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentField () {
	}
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

//	public PersistentTower getTower() {
//		return tower;
//	}
//
//
//	public void setTower(PersistentTower tower) {
//		this.tower = tower;
//	}
//
//
//	public List<PersistentMob> getMobs() {
//		return mobs;
//	}
//
//
//	public void setMobs(List<PersistentMob> mobs) {
//		this.mobs = mobs;
//	}
}
