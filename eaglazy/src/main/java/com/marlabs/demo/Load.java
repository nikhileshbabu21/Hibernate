/**
 * 
 */
package com.marlabs.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Nanda
 *
 */
public class Load {

	private static final SessionFactory concreteSessionFactory;
	static {
		try {
			concreteSessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() throws HibernateException {
		return concreteSessionFactory.openSession();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.beginTransaction();
		Country con = (Country) session.get(Country.class, new Integer(1));
		// access collection
		// System.out.println(con.getStates().size());
		session.clear();
	}

}
