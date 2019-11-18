package com.app.test;

import static com.app.utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.pojos.Course;
import com.app.pojos.Instructor;

public class GetInstCourses {

	public static void main(String[] args) {

		/* use the session object to save Java object */

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session

			// begin a transaction
			tx = session.beginTransaction();

			// GET THE INSTRUCTOR FORM DB
			int id = 1;
			Instructor tempInstructor = session.get(Instructor.class, id);
			
			
			
			// ADD COURSES TO INSTRUCTOR
			tempInstructor.add(tempCourse);
			tempInstructor.add(tempCourse2);
			
			// SAVE THOSE COURSES
			session.save(tempCourse);
			session.save(tempCourse2);

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
