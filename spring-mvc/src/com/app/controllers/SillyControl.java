package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sillyController")
public class SillyControl {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}

}
