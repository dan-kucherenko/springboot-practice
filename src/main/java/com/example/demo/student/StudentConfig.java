package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(1L, "Mariam", "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5), 21);
            Student alex = new Student( "Alex", "alex@gmail.com",
                    LocalDate.of(2003, JANUARY, 5), 21);
            studentRepository.saveAll(List.of(mariam, alex));
        };
    }
}
