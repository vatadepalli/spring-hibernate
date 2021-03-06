package com.app.testCRUD;

import static com.app.utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteStudent {

	public static void main(String[] args) {


		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session

			// begin a transaction
			tx = session.beginTransaction();

			// APPROACH 1
			// retrieve student with id: 1
//			System.out.println("\nGetting student with id: " + 1);
//			Student myStudent = session.get(Student.class, 1);
//			System.out.println("Retrieved: " + myStudent);
//			
			// delete the student
//			System.out.println("Now deleting it");
//			session.delete(myStudent);

			// APPROACH 2
			session.createQuery("delete from Student where id=2").executeUpdate();
			
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
