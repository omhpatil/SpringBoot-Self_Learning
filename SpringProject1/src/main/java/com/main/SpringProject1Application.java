package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProject1Application {

	public static void main(String[] args) {
		
		System.out.print("Application Started");
		
		SpringApplication.run(SpringProject1Application.class, args);
		
		System.out.print("Application Finished");
	}

}
