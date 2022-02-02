package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student Souvik = new Student(
                    "Souvik",
                    "souvikghata@gmail.com",
                    LocalDate.of(1998,SEPTEMBER,22)
            );
            Student Sam = new Student(
                    "Sam",
                    "sam@gmail.com",
                    LocalDate.of(1998,SEPTEMBER,12)
            );
            Student Souptik = new Student(
                    "Souptik",
                    "souptik@gmail.com",
                    LocalDate.of(2000,SEPTEMBER,13)
            );
            repository.saveAll(
                    List.of(Souvik,Sam,Souptik)
            );

        };

    }
}
