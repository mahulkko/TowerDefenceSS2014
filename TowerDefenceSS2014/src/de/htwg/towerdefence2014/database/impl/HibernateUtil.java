package de.htwg.towerdefence2014.database.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;

	static {
		 final AnnotationConfiguration cfg = new
			      AnnotationConfiguration();
			      cfg.configure("/hibernate.cfg.xml");
			      sessionFactory = cfg.buildSessionFactory();
	}
	
	private HibernateUtil() {
	}
	
	public static SessionFactory getInstance() {
		return sessionFactory;
	}
}
