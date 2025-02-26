package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class HelloWebController {	
	@GetMapping("/demo1")
	public String hello() {
		return "HelloWorld";	
	}
	
	@GetMapping("/demo1/msg")
//	@ResponseBody  					// if u have to print something on webpage without using template u can simple use this annotation
	public String message(Model model) {
		model.addAttribute("messege","This is custom msg from bridgelabz");
		return "message";	
	}

}
