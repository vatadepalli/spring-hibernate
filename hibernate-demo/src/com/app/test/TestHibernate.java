package com.app.test;

import org.hibernate.SessionFactory;
import static com.app.utils.HibernateUtils.*;

public class TestHibernate {
	public static void main(String[] args) {

		try (SessionFactory sf = getSf()) {
			System.out.println("hib started....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
