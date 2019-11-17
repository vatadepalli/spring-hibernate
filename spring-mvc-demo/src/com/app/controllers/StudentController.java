package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create a new student object
		Student theStudent = new Student();

		// add student object to the model attribute
		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		// log in the input data

		System.out.println("FirstName: " + theStudent.getFirstName() + "\n" + "LastName: " + theStudent.getLastName());
		System.out.println("Country: " + theStudent.getCountry());
		System.out.println("Favourite Language: " + theStudent.getFavouriteLanguage());
	

		return "student-confirmation";
	}
}
