package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entities.Customer;
import com.app.services.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// Inject the DAO here
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		
		// Get Customer from the Service
		List<Customer> theCustomers = customerService.getCustomers();
		
		// Add Customer to the Model
		model.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

}
