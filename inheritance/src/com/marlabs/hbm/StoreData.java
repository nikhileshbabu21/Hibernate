package com.marlabs.hbm;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class StoreData {
public static void main(String[] args) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();
	
	Employee e1=new Employee();
	e1.setName("Nanda");
	
	Regular_Employee e2=new Regular_Employee();
	e2.setName("Cheng");
	e2.setSalary(50000);
	e2.setBonus(5);
	
	Contract_Employee e3=new Contract_Employee();
	e3.setName("Rui");
	e3.setPay_per_hour(1000);
	e3.setContract_duration("15 hours");
	
	session.persist(e1);
	session.persist(e2);
	session.persist(e3);
	
	t.commit();
	session.close();
	System.out.println("success");
}
}
