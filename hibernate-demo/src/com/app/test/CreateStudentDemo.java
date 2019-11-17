package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entities.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create a session
		Session session = sf.getCurrentSession();

		try {
			/* use the session object to save Java object */

			// create the student object
			System.out.println("Creating a new stuent object...");
			Student tempStudent = new Student("Banna", "Tadepalli", "banna@gmail.com");

			// bengin a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);
			
			// commit the transacton
			session.getTransaction().commit();
			System.out.println("Done Transaction...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sf.close();
		}

	}

}
