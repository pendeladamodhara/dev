package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

	public static void main(String[] args) {
		 Configuration  conf=new  Configuration();
		 conf.configure("hibernate.cfg.xml");
		 ServiceRegistry  registry=new  StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		 SessionFactory  factory = conf.buildSessionFactory(registry);
		 SessionBuilder   builder = factory.withOptions();
		 builder.interceptor(new MyInter());
		Session session=builder.openSession();
		Student s=new Student();
		s.setSid(101);
		s.setSname("damu");
		s.setMarks1("100");
		s.setMarks2("100");
		s.setMarks3("100");
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		factory.close();

	}

}
