package de.htwg.towerdefence2014.database.couchdb;




public class PersistentGame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3087770570299602788L;

	/************************************************************
	 * Private variables
	 ***********************************************************/

	private Integer id;
	
	private PersistentPlayingField pField;

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
