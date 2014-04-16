package de.htwg.towerdefence2014.database.impl;

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
import javax.persistence.Table;

import de.htwg.towerdefence2014.model.impl.PlayingField;

@Entity
@Table(name = "TDField")
public class PersistentField implements Serializable {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/

	private static final long serialVersionUID = 7510732657083022784L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name = "Tower")
	private PersistentTower tower;
	
	@OneToMany
	@Column(name = "Mobs")
	private List<PersistentMob> mobs;
	
	@ManyToOne
	@JoinColumn(name = "PlayingFieldID")
	private PlayingField pField;
	
	
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
