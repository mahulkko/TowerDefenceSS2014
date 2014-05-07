package de.htwg.towerdefence2014.database.hibernate;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TowerDefenceSS20141")
public class PersistentGame implements Serializable {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/

	private static final long serialVersionUID = -4568358959015268071L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private PersistentPlayingField pField;

	@OneToOne(cascade = {CascadeType.ALL})
	private PersistentPlayer player;	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentGame () {
	}
	
	
	/************************************************************
	 * Public methods
	 ***********************************************************/
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
