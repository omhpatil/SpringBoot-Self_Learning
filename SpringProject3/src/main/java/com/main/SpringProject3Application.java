package com.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProject3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myClass().printName("Om Patil");
	}

	@Bean
	public MyClass myClass() {
		return new MyClass();
	}
}
