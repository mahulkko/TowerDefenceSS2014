package de.htwg.towerdefence2014.database.couchdb;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.ViewQuery;
import org.ektorp.ViewResult;
import org.ektorp.ViewResult.Row;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import de.htwg.towerdefence2014.database.IDataAccessObject;
import de.htwg.towerdefence2014.model.IMob;
import de.htwg.towerdefence2014.model.ITower;
import de.htwg.towerdefence2014.model.impl.Game;
import de.htwg.towerdefence2014.model.impl.Mob;
import de.htwg.towerdefence2014.model.impl.Player;
import de.htwg.towerdefence2014.model.impl.PlayingField;
import de.htwg.towerdefence2014.model.impl.Tower;

public class CouchDatabase implements IDataAccessObject {
	
	private CouchDbConnector db = null;
	
	public CouchDatabase() {
		HttpClient client = null;
		try {
			client = new StdHttpClient.Builder().url("http://lenny2.in.htwg-konstanz.de:5984").build();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		CouchDbInstance dbInstance = new StdCouchDbInstance(client);
		db = dbInstance.createConnector("towerdefencess2014_db", true);
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public List<Game> read() {
		List<Game> lst = new ArrayList<Game>();
		ViewQuery query = new ViewQuery().allDocs();
		ViewResult vr = db.queryView(query);
		PersistentGame pGame;
		
		for (Row r : vr.getRows()) {
			pGame = db.find(PersistentGame.class, r.getId());
			if (pGame != null) {
				lst.add(copyToGame(pGame));
			}
		}
		return lst;
	}

	@Override
	public void update(Game game) {
		PersistentGame pGame = containsGameID(game);
		if (pGame != null) {
			db.update(pGame);
		} else {
			db.create(game.getId().toString(), copyToPersistentGame(game));
		}
		
	}

	@Override
	public void delete(Game game) {
		PersistentGame pGame = containsGameID(game);
		if (null != pGame) {
			db.delete(pGame);
		}
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
	}
	
	/************************************************************
	 * Private methods
	 ***********************************************************/
	
	private PersistentGame containsGameID(Game game) {
		PersistentGame pGame = db.find(PersistentGame.class, game.getId().toString());
		if (pGame == null) {
			return null;
		}
		return pGame;
	}
	
	private PersistentGame copyToPersistentGame(Game game) {
		if (null == game) {
			return null;
		}
		// Set Game
		PersistentGame pGame = new PersistentGame();
		pGame.setId(game.getId().toString());
		
		// Set Player
		PersistentPlayer pPlayer = new PersistentPlayer();
		pPlayer.setName(game.getPlayer().getName());
		pPlayer.setLife(game.getPlayer().getLife());
		pPlayer.setMoney(game.getPlayer().getMoney());
		
		// Set PlayingField
		PersistentPlayingField pPlayingField = new PersistentPlayingField();
		pPlayingField.setSizeX(game.getPlayingField().getSizeX());
		pPlayingField.setSizeY(game.getPlayingField().getSizeY());
		
		// Set Fields
		List<PersistentField> pFieldList = new ArrayList<PersistentField>();
		PersistentField pField;
		for (int x = 0; x < game.getPlayingField().getSizeX(); ++x) {
			for (int y = 0; y < game.getPlayingField().getSizeY(); ++y) {
				pField = new PersistentField();

				// Set Mobs and Tower
				List<PersistentMob> pMobList = new ArrayList<PersistentMob>();
				PersistentTower pTower = new PersistentTower();
				
				ITower tower = game.getPlayingField().getTower(x, y);
				List<IMob> tmpMobList = game.getPlayingField().getMobs(x, y);
				
				if (null != tower) {
					// Set Tower for Field
					pTower.setDamage(tower.getDamage());
					pTower.setHitrate(tower.getHitRate());
					pTower.setNumberShoot(tower.getNumberOfShoot());
					pField.setTower(pTower);
				} 
				else if (!tmpMobList.isEmpty()) {
					// Set Mobs for Field
					for(int i = 0; i < tmpMobList.size(); ++i) {
						PersistentMob pMob = new PersistentMob();
						pMob.setHealth(tmpMobList.get(i).getHealth());
						pMob.setSpeed(tmpMobList.get(i).getSpeed());
						pMobList.add(pMob);
					}
					pField.setMobs(pMobList);
				}
				pFieldList.add(pField);
			}
		}
		pPlayingField.setFields(pFieldList);
		
		// Set PersistentGame object
		pGame.setPlayer(pPlayer);
		pGame.setPlayingField(pPlayingField);
		
		return pGame;
	}
	
	private Game copyToGame(PersistentGame pGame) {
		if (null == pGame) {
			return null;
		}
		// Set Game
		Game game = new Game();
		game.setId(Integer.getInteger(pGame.getId()));
		
		// Set Player
		Player player = new Player();
		player.setName(pGame.getPlayer().getName());
		player.setLife(pGame.getPlayer().getLife());
		player.setMoney(pGame.getPlayer().getMoney());
		
		// Set PlayingField
		PlayingField playingField = new PlayingField(pGame.getPlayingField().getSizeX(), pGame.getPlayingField().getSizeY());
		
		// Set Fields
		List<PersistentField> pFieldFields = pGame.getPlayingField().getFields();
		int counter = 0;
		for (int x = 0; x < pGame.getPlayingField().getSizeX(); ++x) {
			for (int y = 0; y < pGame.getPlayingField().getSizeY(); ++y) {
				
				// Set Mobs and Tower for each Field
				List<PersistentMob> pMobList = pFieldFields.get(counter).getMobs();
				PersistentTower pTower = pFieldFields.get(counter).getTower();
				
				if (null != pMobList) {
					List<IMob> mobs = new ArrayList<IMob>();
					IMob mob;
					for(int i = 0; i < pMobList.size(); ++i) {
						mob = new Mob();
						mob.setHealth(pMobList.get(i).getHealth());
						mob.setSpeed(pMobList.get(i).getSpeed());
						mobs.add(mob);
					}
					playingField.setListMob(x, y, mobs);
				}
				else if (null != pTower) {
					ITower tower = new Tower();
					tower.setDamage(pTower.getDamage());
					tower.setHitRate(pTower.getHitrate());
					tower.setNumberOfShoot(pTower.getNumberShoot());
					playingField.setTower(x, y, tower);
				}
				counter++;
			}
		}
		
		// Set PersistentGame object
		game.setPlayer(player);
		game.setPlayingField(playingField);
		
		return game;
	}
}
