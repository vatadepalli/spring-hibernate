package com.app.testCRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";

		try {
			System.out.println("Connecting to Database...");
			
			Connection cnx = DriverManager.getConnection(jdbcUrl, user, pass);
			cnx.close();
			
			System.out.println("Succesful Connection...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
