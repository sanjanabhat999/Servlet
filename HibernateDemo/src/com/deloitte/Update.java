package com.deloitte;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory= config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		tx.begin();
		Laptop lt1=(Laptop)session.get(Laptop.class,1);
		lt1.setBrandname(lt1.getBrandname()+" Ind ");
		session.update(lt1);
		tx.commit();
		System.out.println("Successfully updated a row");

	}

}
