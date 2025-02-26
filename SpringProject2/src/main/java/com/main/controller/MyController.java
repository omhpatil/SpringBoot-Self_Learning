package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping("/")
	@ResponseBody
	public String helloOm() {
		return "Hello Om";
	}

}

// Check the output on the port: localhost:8080 (On chrome)