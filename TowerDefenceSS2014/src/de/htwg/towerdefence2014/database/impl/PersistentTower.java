package de.htwg.towerdefence2014.database.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TDTower")
public class PersistentTower implements Serializable {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	private static final long serialVersionUID = -8802270163038398649L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name = "Damage")
	private int damage;

	@Column(name = "Range")
	private int range;

	@Column(name = "Speed")
	private int speed;

	@Column(name = "NumberShoot")
	private int numberShoot;

	@Column(name = "Hitrate")
	private double hitrate; 
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentTower () {
	}

	/************************************************************
	 * Public methods
	 ***********************************************************/

	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getNumberShoot() {
		return numberShoot;
	}


	public void setNumberShoot(int numberShoot) {
		this.numberShoot = numberShoot;
	}


	public double getHitrate() {
		return hitrate;
	}


	public void setHitrate(double hitrate) {
		this.hitrate = hitrate;
	}
}
