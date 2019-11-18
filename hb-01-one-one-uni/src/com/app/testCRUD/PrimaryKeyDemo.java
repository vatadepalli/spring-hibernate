package com.app.testCRUD;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.app.utils.HibernateUtils.getSf;


import com.app.pojos.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {

		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session
			// create the student object
			System.out.println("Creating a new stuent object...");
			Student tempStudent1 = new Student("Vijaya Aditya", "Tadepalli", "vatadepalli@gmail.com");
			Student tempStudent2 = new Student("Kapil Anirudh", "Tadepalli", "katadepalli@gmail.com");
			Student tempStudent3 = new Student("Abishek", "Tamma", "abishek@gmail.com");
			Student tempStudent4 = new Student("Venkat", "Ransing", "venkat@gmail.com");
			Student tempStudent5 = new Student("Tanmay", "Bindal", "tanmay@gmail.com");

			// begin a transaction
			tx = session.beginTransaction();

			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.save(tempStudent4);
			session.save(tempStudent5);

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
