package com.main.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/hello")
public class HelloRestController {
	@RequestMapping(value= {"" , "/" , "/home" })
	public String sayHello() {
		return "Hello From BridgeLabz";
	}
}
