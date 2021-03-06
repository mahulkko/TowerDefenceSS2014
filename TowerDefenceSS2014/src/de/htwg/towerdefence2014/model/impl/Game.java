package de.htwg.towerdefence2014.model.impl;

import java.io.Serializable;

/**
 * <b>Game class</b>
 * @author Christoph Knetschke and Martin Hulkkonen
 */
public class Game {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	private Integer id;
	
	private PlayingField playingField;
	
	private Player player;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	public Game() {
		
	}

	public Game(PlayingField playingField, Player player) {
		this.playingField = playingField;
		this.player = player;
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
	
	public PlayingField getPlayingField() {
		return playingField;
	}

	public void setPlayingField(PlayingField playingField) {
		this.playingField = playingField;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
