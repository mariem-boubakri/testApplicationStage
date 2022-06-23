package com.example.applicationtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class ApplicationTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTestApplication.class, args);
    }

}
