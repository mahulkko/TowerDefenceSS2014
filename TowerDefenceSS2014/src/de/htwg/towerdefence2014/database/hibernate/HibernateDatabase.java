package de.htwg.towerdefence2014.database.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import de.htwg.towerdefence2014.database.IDataAccessObject;
import de.htwg.towerdefence2014.model.IMob;
import de.htwg.towerdefence2014.model.ITower;
import de.htwg.towerdefence2014.model.impl.Game;
import de.htwg.towerdefence2014.model.impl.Mob;
import de.htwg.towerdefence2014.model.impl.Player;
import de.htwg.towerdefence2014.model.impl.PlayingField;
import de.htwg.towerdefence2014.model.impl.Tower;

public class HibernateDatabase implements IDataAccessObject {
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

	@Override
	public void create() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Game> read() {
		Session session = HibernateUtil.getInstance().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(PersistentGame.class);
		
		@SuppressWarnings("unchecked")
		List<PersistentGame> results = criteria.list();

		List<Game> games = new ArrayList<Game>();
		for (PersistentGame pGame : results) {
			Game game = copyToGame(pGame);
			games.add(game);
		}
		return games;
	}

	@Override
	public void update(Game game) {
		Transaction tx = null;
		Session session = null;

		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
			
			PersistentGame pGame = copyToPersistentGame(game);
			
			session.saveOrUpdate(pGame);
			
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			throw new RuntimeException(ex.getMessage());
		}
	}

	@Override
	public void delete(Game game) {
		Transaction tx = null;
		Session session = null;
		if (0 != game.getId()) {
			try {
				session = HibernateUtil.getInstance().getCurrentSession();
				tx = session.beginTransaction();
				PersistentGame pGame = (PersistentGame) session.get(PersistentGame.class, game.getId());
				
				session.delete(pGame);
				tx.commit();
			} catch (HibernateException ex) {
				if (tx != null)
					tx.rollback();
				throw new RuntimeException(ex.getMessage());
			}
		}
	}
	
	@Override
	public void deleteAll() {
		Transaction tx = null;
		Session session = null;
		
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(PersistentGame.class);
			
			@SuppressWarnings("unchecked")
			List<PersistentGame> results = criteria.list();

			for (PersistentGame pGame : results) {
				session.delete(pGame);
			}
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			throw new RuntimeException(ex.getMessage());
		} 
	}

	/************************************************************
	 * Private methods
	 ***********************************************************/
	
	private PersistentGame copyToPersistentGame(Game game) {
		if (null == game) {
			return null;
		}
		
		// Set Game
		PersistentGame pGame = new PersistentGame();
		pGame.setId(game.getId());
		
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
		game.setId(pGame.getId());
		
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
