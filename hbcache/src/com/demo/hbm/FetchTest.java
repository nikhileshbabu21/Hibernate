package com.demo.hbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchTest {
public static void main(String[] args) {
Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();
	
	Session session1=factory.openSession();
	Employee emp1=(Employee)session1.load(Employee.class,1);
	System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());
	session1.close();
	
	Session session2=factory.openSession();
	Employee emp2=(Employee)session2.load(Employee.class,2);
	System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());
	session2.close();
	
	Session session3=factory.openSession();
	Employee emp3=(Employee)session3.load(Employee.class,1);
	System.out.println(emp3.getId()+" "+emp3.getName()+" "+emp3.getSalary());
	session3.close();
	
}
}
