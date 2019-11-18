package com.app.test.archives;

import static com.app.utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.pojos.Instructor;

public class Delete {

	public static void main(String[] args) {

		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session
			

			// begin a transaction
			tx = session.beginTransaction();

			// DETETE BY ID
			int id = 1;
			Instructor tempInstructor = session.get(Instructor.class, id);
			
			System.out.println("Found Instructor: " + tempInstructor);
			
			if(tempInstructor != null) {
				System.out.println("Deleting: " + tempInstructor);
				session.delete(tempInstructor);
			}
			/*
			 * This will also delete the instructor details object due to cacade.
			 * */
		

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
