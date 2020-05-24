package com.hibernatedemo;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.model.Laptop;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		//Laptop l=new Laptop( "XYZ Model4", 135.22, "XYZ Laptops",new Date());
	//	Laptop l2=new Laptop( "XYZ Model5", 101.22, "XYZ Laptops", new Date());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
	//	System.out.println(session.save(l));
	//	System.out.println(session.save(l2));
		//session.update(l);
	//	Laptop l=(Laptop) session.get(Laptop.class, 1002);
	//	System.out.println(l);
		//Laptop l=new Laptop();
		//l.setId(1000);
		//session.delete(l);
		Query query=session.createQuery("from com.hibernatedemo.model.Laptop where cost>:cost order by cost desc");
		query.setDouble("cost", 125.22);
		List<Laptop> lapList=query.list();
		for(Laptop l:lapList) {
			System.out.println(l);
		}
		//try update and delete with query(HQL)
		transaction.commit();
		session.close();
		factory.close();

	}

}
