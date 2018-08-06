package com.deloitte;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;



public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory= config.buildSessionFactory();
		Session session=factory.openSession();
		//select on condition
		Criteria c=session.createCriteria(Laptop.class);
		c.add(Restrictions.gt("price", 250.0));
		//c.add(Restrictions.lt("price", 300.0));multiple condition
		
		//select all rows
//		Query query= session.createQuery("from com.deloitte.Laptop");
		
		List li= c.list();
		Iterator it= li.iterator();
		while(it.hasNext())
		{
			Laptop lt= (Laptop)it.next();
			System.out.println(lt.getId()+" "+lt.getBrandname()+" "+lt.getPrice());
		}
		

	}

}
