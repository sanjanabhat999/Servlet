package com.deloitte;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class DeleteaRow {

	public static void main(String[] args) {
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory= config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		tx.begin();
		
		Laptop lt1=(Laptop)session.get(Laptop.class,1);
		session.delete(lt1);
		tx.commit();
		System.out.println("Successfully deleted a row");
	}

}
