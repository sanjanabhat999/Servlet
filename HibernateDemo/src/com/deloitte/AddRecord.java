package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddRecord {

	public static void main(String[] args) {
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf= config.buildSessionFactory();
		Session session= sf.openSession();
		Laptop l1= new Laptop();
		l1.setId(3);
		l1.setBrandname("ASUS");
		l1.setPrice(256.22);
		
		Transaction tx= session.beginTransaction();
		tx.begin();
		//operation on any object will be synchronized with table
		session.save(l1);
		tx.commit();
		System.out.println("Successfully inserted one row into the table");
		
	}

}
