package de.htwg.towerdefence2014.database.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TDPlayer")
public class PersistentPlayer implements Serializable {

	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	private static final long serialVersionUID = -5550626038474233529L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Money")
	private int money;
	
	@Column(name = "Life")
	private int life;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentPlayer () {
	}


	/************************************************************
	 * Public methods
	 ***********************************************************/

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}
}
