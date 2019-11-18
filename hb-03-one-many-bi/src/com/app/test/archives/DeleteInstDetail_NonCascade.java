package com.app.test.archives;

import static com.app.utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.pojos.InstructorDetail;

public class DeleteInstDetail_NonCascade {

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
			
			// DELETE INST DETAIL
			System.out.println("Deleting tempInst: " + tempInstructorDetail);
			
			// REMOVE THE ASSOCIATED OBJECT REFERENCE
			// BREAK THE Bi-DIRECTIONAL LINK
			/* Need to set to null - the Instructor refered to in the InstructorDetail Class.
			 * Before deleting
			 * */
			// Set instructor in instructorDetail object to null.
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
			// delete
			session.delete(tempInstructorDetail);
			
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
