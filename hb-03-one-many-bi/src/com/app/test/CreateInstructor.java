package com.app.test;

import static com.app.utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.pojos.Instructor;
import com.app.pojos.InstructorDetail;

public class CreateInstructor {

	public static void main(String[] args) {

		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session
			// create the objects
			Instructor tempInstructor = new Instructor("Praphul", "Kolte", "pk@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.pk.com", "Coding");

			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			

			// begin a transaction
			tx = session.beginTransaction();

			// save the instructor
			session.save(tempInstructor);
			
			/*
			 * Note: This will also save the details of the instructor details object
			 * because of CascadeType.ALL
			 */

			// commit the transacton
			
			System.out.println("Saving Inst: " + tempInstructor);
			
			tx.commit();
			System.out.println("Done Transaction...");

		} catch (Exception e) {
			if (tx != null)
				tx.rollback(); // Rollback if something is fucked.
			e.printStackTrace(); // Print what's fucked up.
		}finally {
			getSf().close();
		}

	}

}
