package com.hibernatedemo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.model.Customer;
import com.hibernatedemo.model.Laptop;

public class HasARelationshipMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
	//	Laptop l=new Laptop( "XYZ Model4", 135.22, "XYZ Laptops",new Date());
	//	Laptop l2=new Laptop( "XYZ Model5", 101.22, "XYZ Laptops", new Date());
	//	Customer c=new Customer("simplilearn", 20, 1231231234, l);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
	//	session.save(l);
	//	session.save(l2);
	//	session.save(c);
		Customer c=(Customer) session.get(Customer.class, 1);
		System.out.println(c.getName());
		System.out.println(c.getLaptop());
		transaction.commit();
		session.close();
		factory.close();
	}

}
