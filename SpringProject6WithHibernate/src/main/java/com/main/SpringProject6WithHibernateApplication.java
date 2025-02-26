package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entities.User;

@SpringBootApplication
public class SpringProject6WithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject6WithHibernateApplication.class, args);
		
		Configuration cfg = new Configuration();
		cfg.configure("com/main/config/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user = session.get(User.class, 1L);
		System.out.println("Name: "+user.getName());	
		System.out.println("Email: "+user.getEmail());
		System.out.println("Password: "+user.getPassword());
		System.out.println("Gender: "+user.getGender());
		System.out.println("City: "+user.getCity());
	}

}
