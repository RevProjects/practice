package com.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "file:practice/.env")
public class PracticeApplicationTests {

	@Test
	void contextLoads() {
		// This will load the environment from .env
	}
}