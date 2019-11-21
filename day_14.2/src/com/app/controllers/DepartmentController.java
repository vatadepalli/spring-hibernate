package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entities.Department;
import com.app.services.IDepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	// Inject the DAO here
	@Autowired
	private IDepartmentService departmentService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		
		// Get Customer from the Service
		List<Department> theDepartments = departmentService.getDepartments();
		
		// Add Customer to the Model
		model.addAttribute("departments", theDepartments);
		
		return "dept-list";
	}
	
	@GetMapping("/addDept")
	public String addDept(Model model) {
		// create model attribute to bind form data
		Department theDept = new Department();
		
		model.addAttribute("department", theDept);
		
		return "dept-form";
	}
	
	@PostMapping("/addDept")
	public String saveAddedDept(@ModelAttribute("department") Department department){
		
		// save customer using our service
		departmentService.saveDepartment(department);
		
		return "redirect:/department/list";
	}
	

}
