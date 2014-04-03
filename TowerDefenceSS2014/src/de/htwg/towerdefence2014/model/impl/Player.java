package de.htwg.towerdefence2014.model.impl;

import de.htwg.towerdefence2014.model.IPlayer;

/**
 * <b>Player Class</b>
 * * <br>
 * Implements IPlayer Interface
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public class Player implements IPlayer {

	/**
	 * Name of the player
	 */
	private String name;
	
	/**
	 * Money of the player
	 */
	private int money;
	
	/**
	 * Life of the player
	 */
	private int life;
	
	//TODO(mh): place this files to a general place for editing
	private static final int setLive = 10;
	private static final int setMoney = 1000;
	
	public Player() {
		//TODO(mh): place this files to a general place for editing
		this.name = "Player1";
		this.life = setLive;
		this.money = setMoney;
	}
	
	@Override
	/**
	 * @return Returns the name of the player
	 */
	public String getName() {
		return this.name;
	}
	
	@Override
	/**
	 * @param name - Set the name of the player
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	/**
	 * @return Returns the money of the player
	 */
	public int getMoney() {
		return this.money;
	}
	
	@Override
	/**
	 * @param money - Set the money of the player
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	/**
	 * @return Returns the current life of the player
	 */
	public int getLife() {
		return this.life;
	}
	
	@Override
	/**
	 * @param life - Set the life of the player
	 */
	public void setLife(int life) {
		this.life = life;
	}
}
