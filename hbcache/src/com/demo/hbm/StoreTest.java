package com.demo.hbm;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class StoreTest {
public static void main(String[] args) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
	Transaction tx=session.beginTransaction();
	
	session.persist(new Employee("Rahul",50000));
	session.persist(new Employee("Ajay",70000));
	
	tx.commit();
	session.close();
}
}
