package de.htwg.towerdefence2014.gameSettings;

public class GameSettings {

	/************************************************************
	 * Player Values
	 ***********************************************************/
	
	/**
	 * Life of the player
	 */
	private static int playerLife = 10;
	
	/**
	 * Money of the player
	 */
	private static int playerMoney = 1000;
	
	/**
	 * Name of the player
	 */
	private static String playerName = "Player";
	
	
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
		return playerName;
	}
	
	/**
	 * @param name - Set the default of the player name
	 */
	public static void setPlayerName(String name) {
		playerName = name;
	}
	
	/**
	 * @return Returns the default life of the player
	 */
	public static int getPlayerLife() {
		return playerLife;
	}
	
	/**
	 * @param life - Set the default life of the player
	 */
	public static void setPlayerLife(int life) {
		playerLife = life;
	}
	
	/**
	 * @return Returns the default money of the player
	 */
	public static int getPlayerMoney() {
		return playerMoney;
	}
	
	/**
	 * @param Money - Set the default money of the player
	 */
	public static void setPlayerMoney(int Money) {
		playerMoney = Money;
	}
}
