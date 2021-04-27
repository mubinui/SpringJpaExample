package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner command (StudentRipository studentRipository) {
		return args -> {
			Student mubin = new Student(
					"Mubin",
					01,
					"uic.mubin@gmail.com",
					LocalDate.parse("1998-10-03"),
					"CSE"
			);
			studentRipository.save(mubin);

		};

	}

}
