package com.main;

import com.main.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorld2Application {
    
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld2Application.class);

    public static void main(String[] args) {
        logger.info("Starting the Spring Boot application...");
        
        ApplicationContext context = SpringApplication.run(HelloWorld2Application.class, args);

        logger.info("Spring Boot application started successfully!");

        // Fetching the bean
        DemoBean demo = context.getBean(DemoBean.class);
        logger.info("Bean Retrieved: {}", demo.toString());
    }
}
