package com.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.dao.UserDAO;
import com.main.entity.User;

@SpringBootApplication
public class SpringProjectJdbcCrudApplication implements CommandLineRunner {

    @Autowired
    private UserDAO userDAO;

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectJdbcCrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        User user = new User(name, email, gender, city);
        boolean status = userDAO.insertUser(user);

        if (status) {
            System.out.println("User Inserted Successfully");
        } else {
            System.out.println("User Insertion Failed");
        }

        scanner.close();
    }
}
