package com.app.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
	private static SessionFactory sf;
	static {
		try {
			System.out.println("in static init block");
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
			sf = new MetadataSources(reg).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSf() {
		return sf;
	}
}
