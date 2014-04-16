package de.htwg.towerdefence2014.database.impl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import de.htwg.towerdefence2014.model.impl.Player;

@Entity
@Table(name = "TDGame")
public class PersistentGame implements Serializable {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/

	private static final long serialVersionUID = -4568358959015268071L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name = "PlayingField")
	private PersistentField pField;
	
	@Column(name = "Player")
	private Player player;
	
	private String playerName;
	private int life;
	private int money;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public PersistentGame () {
	}
	
	
	/************************************************************
	 * Public methods
	 ***********************************************************/
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public PersistentField getpField() {
		return pField;
	}
	
	public void setpField(PersistentField pField) {
		this.pField = pField;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getLife() {
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}
