package com.deloitte;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory= config.buildSessionFactory();
		Session session=factory.openSession();
		
		Passport pp= new Passport();
		pp.setPpid(1);
		pp.setPpname("India");
		
		Person p= new Person();
		p.setName("Joey");
		p.setPid(1);
		p.setPp(pp);
		
		Transaction tx= session.beginTransaction();
        session.save(pp);
        session.save(p);
        tx.commit();
        System.out.println("Done");
		

	}

}
