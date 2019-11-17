package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.pojos.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		/* use the session object to save Java object */
		
		// Create a transaction reference
		Transaction tx = null;

		try (Session session = sf.getCurrentSession()){ // create a session
			// create the student object
			System.out.println("Creating a new stuent object...");
			Student tempStudent = new Student("Vijaya Aditya", "Tadepalli", "vatadepalli@gmail.com");

			// begin a transaction
			tx = session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);

			// commit the transacton
			tx.commit();
			System.out.println("Done Transaction...");

		} catch (Exception e) {
			if (tx != null)
				tx.rollback(); // Rollback if something is fucked.
			e.printStackTrace(); // Print what's fucked up.
		}

	}

}
