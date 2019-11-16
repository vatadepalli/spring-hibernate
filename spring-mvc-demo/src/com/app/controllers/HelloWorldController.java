package com.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// Controller method to read form data
	// and data to the model
	
	@RequestMapping("/showFormVersionTwo")
	public String showFormVersionTwo() {
		return "helloworld-form-2";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// create the message 
		String result = "Yo! " + theName.toUpperCase();;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}
