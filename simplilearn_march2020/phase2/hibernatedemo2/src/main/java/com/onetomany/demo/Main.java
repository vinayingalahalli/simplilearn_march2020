package com.onetomany.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.onetomany.demo.model.Item;
import com.onetomany.demo.model.Orders;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
//		Item i1=new Item("Cookies", 10.22);
//		Item i2=new Item("Cake", 2.22);
//		Item i3=new Item("Soda", 11.22);
//		
//		Orders o=new Orders();
//		o.getItemList().add(i1);
//		o.getItemList().add(i2);
//		
//		Orders o2=new Orders();
//		o2.getItemList().add(i3);
//		
//		session.save(i1);
//		session.save(i2);
//		session.save(i3);
//		
//		session.save(o);
//		session.save(o2);
//		
//		
		Query query=session.createQuery("from com.onetomany.demo.model.Orders");
		List<Orders>orderList=query.list();
		
		for(Orders o:orderList) {
			System.out.println("Oid = "+o.getOid());
			List<Item> iList=o.getItemList();
			for(Item i:iList) {
				System.out.println(i.getName());
			}
		}
		transaction.commit();
		session.close();
		factory.close();

	}

}
