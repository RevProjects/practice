package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestPracticeApplication {

	public static void main(String[] args) {
		// SpringApplication to bootstrap the main app, but loading .env configuration
		SpringApplication.from(PracticeApplication::main)
				.with(TestcontainersConfiguration.class) // Add Testcontainers config
				.run(args);
	}
}

