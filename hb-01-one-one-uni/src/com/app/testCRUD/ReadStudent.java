package com.app.testCRUD;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.app.utils.HibernateUtils.getSf;

import com.app.pojos.Student;

public class ReadStudent {

	public static void main(String[] args) {

		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session
			// create the student object
			System.out.println("Creating a new stuent object...");
			Student tempStudent = new Student("Elephant", "Longtrunk", "elephantlt@gmail.com");

			// begin a transaction
			tx = session.beginTransaction();

			// save the student object
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);

			// commit the transacton
			tx.commit();
			System.out.println("Done Transaction...");
			
			// READING
			
			// findout that the student's primary id: primary key is.
			System.out.println("Saved student. Generated id: " + tempStudent.getId());
						
			// start a session & new transacion
			try (Session session2 = getSf().getCurrentSession()){
				tx = session2.beginTransaction();
				
				// retrive student based on id: primary key
				System.out.println("\nGetting student with id: " + tempStudent.getId());
				Student myStudent = session2.get(Student.class, tempStudent.getId());
				System.out.println("Got Student: " + myStudent);
				
				// commit tnx
				tx.commit();
				session2.close();
				System.out.println("Done Transaction...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (Exception e) {
			if (tx != null)
				tx.rollback(); // Rollback if something is fucked.
			e.printStackTrace(); // Print what's fucked up.
		}

	}

}
