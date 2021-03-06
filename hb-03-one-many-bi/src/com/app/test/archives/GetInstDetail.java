package com.app.test.archives;

import static com.app.utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.pojos.InstructorDetail;

public class GetInstDetail {

	public static void main(String[] args) {

		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session
			

			// begin a transaction
			tx = session.beginTransaction();

			// GET THE INSTRUCTOR DETAIL OBJ
			int id = 2;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, id);
			
			// PRINT THE INST. DETAIL
			System.out.println(tempInstructorDetail);
			
			// PRINT THE ASSOCIATED INSTRUCTOR
			System.out.println("The Associated Instructor: " + tempInstructorDetail.getInstructor());

			// commit the transacton
			tx.commit();
			System.out.println("Done Transaction...");

		} catch (Exception e) {
			if (tx != null)
				tx.rollback(); // Rollback if something is fucked.
			e.printStackTrace(); // Print what's fucked up.
		}finally {
			getSf().close(); // CLOSE THE SESSION FACTORY TO CLEAN UP THE CONNECTION POOL
		}

	}

}
