package com.example.university_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UniversityJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityJpaApplication.class, args);
    }

}
