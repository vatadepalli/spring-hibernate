package com.app.testCRUD;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.app.utils.HibernateUtils.getSf;


import com.app.pojos.Student;

public class UpdateStudent {

	public static void main(String[] args) {


		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session

			// begin a transaction
			tx = session.beginTransaction();

			// retrieve student with id: 1
			System.out.println("\nGetting student with id: " + 1);
			Student myStudent = session.get(Student.class, 1);
			System.out.println("Retrieved: " + myStudent);
			
			// updating the object
			System.out.println("Now updating it");
			myStudent.setFirstName("Rutherford");

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
