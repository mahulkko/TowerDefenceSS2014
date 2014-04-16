package de.htwg.towerdefence2014.database.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import de.htwg.towerdefence2014.database.IDataAccessObject;
import de.htwg.towerdefence2014.model.impl.Game;

public class HibernateDatabase implements IDataAccessObject {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Game> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Game game) {
//		Transaction tx = null;
//		Session session = null;
//
//		try {
//			session = HibernateUtil.getInstance().getCurrentSession();
//			tx = session.beginTransaction();
//			
//			PersistentGame pGame = createPersistentGame(game);
//			
//			session.saveOrUpdate(pgrid);
//			for (PersistentCell pcell : pgrid.getCells()) {
//				session.saveOrUpdate(pcell);
//			}
//
//			tx.commit();
//		} catch (HibernateException ex) {
//			if (tx != null)
//				tx.rollback();
//			throw new RuntimeException(ex.getMessage());
//		}
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}
	
//	private PersistentGame createPersistentGame(Game game) {
//		PersistentGame pGame;
//		if (null == game) {
//			return null;
//		}
//		
//	}
}
