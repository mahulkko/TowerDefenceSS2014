package de.htwg.towerdefence2014.TowerDefence;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

import de.htwg.towerdefence2014.controller.IGameController;
import de.htwg.towerdefence2014.controller.impl.GameController;
import de.htwg.towerdefence2014.database.IDataAccessObject;
import de.htwg.towerdefence2014.database.couchdb.CouchDatabase;
import de.htwg.towerdefence2014.database.db4o.Db4oDatabase;
import de.htwg.towerdefence2014.database.hibernate.HibernateDatabase;

public class TowerDefenceModul extends AbstractModule {

	@Override
	protected void configure() {
		bind(IGameController.class).to(GameController.class);
		Multibinder<IDataAccessObject> plugins = Multibinder.newSetBinder(binder(), IDataAccessObject.class);
		plugins.addBinding().to(Db4oDatabase.class);
		plugins.addBinding().to(HibernateDatabase.class);
		plugins.addBinding().to(CouchDatabase.class);
	}
}
