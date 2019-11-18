package com.app.testCRUD;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.app.utils.HibernateUtils.getSf;

import java.util.List;

import com.app.pojos.Student;

public class QueryStudentHQL {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Create a null transaction reference
		Transaction tx = null;

		try (Session session = getSf().getCurrentSession()) { // create a session

			// begin a transaction
			tx = session.beginTransaction();

			// query the students ******************
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			printStudents(theStudents);

			// query the students ****** lastName = 'Tadepalli'
			theStudents = session.createQuery("from Student s where s.lastName='Tadepalli'").getResultList();
			printStudents(theStudents);

			// query the students ****** lastName = 'Tadepalli' or 'firstName =
			// 'ELephant'
			theStudents = session.createQuery("from Student s where s.lastName='Tadepalli' OR s.firstName='Elephant'")
					.getResultList();
			printStudents(theStudents);

			// query the students ****** email ends with 'gmail.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			printStudents(theStudents);

			// commit the transacton
			tx.commit();
			System.out.println("Done Transaction...");

		} catch (Exception e) {
			if (tx != null)
				tx.rollback(); // Rollback if something is fucked.
			e.printStackTrace(); // Print what's fucked up.
		}

	}

	private static void printStudents(List<Student> theStudents) {
		for (Student s : theStudents) {
			System.out.println(s);
		}
	}

}
