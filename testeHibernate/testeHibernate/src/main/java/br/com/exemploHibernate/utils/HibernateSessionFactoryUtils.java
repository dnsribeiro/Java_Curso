package br.com.exemploHibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtils {

	public static SessionFactory getSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}
}
