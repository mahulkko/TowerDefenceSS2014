package de.htwg.towerdefence2014.database.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TDMob")
public class PersistentMob implements Serializable {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	private static final long serialVersionUID = -1908272019895680801L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name = "Health")
	private int health;	
	
	@Column(name = "Speed")
	private int speed;
	
	@ManyToOne
	@JoinColumn(name = "FildID")
	public PersistentField fild;
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentMob () {
	}
	

	/************************************************************
	 * Public methods
	 ***********************************************************/

	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public PersistentField getFild() {
		return fild;
	}


	public void setFild(PersistentField fild) {
		this.fild = fild;
	}
}
