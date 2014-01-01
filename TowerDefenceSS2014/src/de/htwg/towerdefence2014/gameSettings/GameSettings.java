package de.htwg.towerdefence2014.gameSettings;

public class GameSettings {

	/************************************************************
	 * Player Values
	 ***********************************************************/
	
	/**
	 * Life of the player
	 */
	private static final int PLAYERLIFE = 10;
	
	/**
	 * Money of the player
	 */
	private static final int PLAYERMONEY = 1000;
	
	/**
	 * Name of the player
	 */
	private static final String PLAYERNAME = "Player";
	
	
	/************************************************************
	 * Getter and setter of the player values
	 ***********************************************************/
	
	/**
	 * Private constructor - so there can't be an instance of it
	 */
	private GameSettings() { }
	
	/**
	 * @return Returns the default of the player name
	 */
	public static String getPlayerName() {
		return PLAYERNAME;
	}
	
	/**
	 * @return Returns the default life of the player
	 */
	public static int getPlayerLife() {
		return PLAYERLIFE;
	}
	
	/**
	 * @return Returns the default money of the player
	 */
	public static int getPlayerMoney() {
		return PLAYERMONEY;
	}
}
