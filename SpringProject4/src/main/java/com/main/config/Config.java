package com.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.main.beans.Student;

@Configuration
public class Config {

	@Bean
	public CommandLineRunner cmdRunner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				student1().Display();
				System.out.println("-------");
				student2().Display();
			}
		};
	}

	@Bean
	public Student student1() {
		return new Student("Om", 111, 99.99f);
	}

	@Bean
	public Student student2() {
		return new Student("Jay", 222, 89.99f);
	}

}
